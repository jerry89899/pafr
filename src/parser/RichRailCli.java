package parser;

import Application.TrainService;
import Application.TrainServiceInterface;
import DataRepresentation.RollingComponent;
import DataRepresentation.RollingComponentType;
import DataRepresentation.Train;
import main.antlr4.RichRailBaseListener;
import main.antlr4.RichRailParser;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class RichRailCli extends RichRailBaseListener implements Observer {

    private TrainServiceInterface ts;
    private ArrayList<Train> trains;
    private ArrayList<RollingComponent> rollingComponents;

    public RichRailCli(TrainService ts){
        this.ts = ts;
        this.trains = ts.getTrains();
        this.rollingComponents = ts.getRollingComponents();
    }

//    @Override
//    public void enterCommand(RichRailParser.CommandContext ctx) {
//        System.out.println("Command entered " + ctx.getText());
//    }


    @Override
    public void enterNewtraincommand(RichRailParser.NewtraincommandContext ctx)  {
        String trainid = ctx.ID(0).getText();
        String locomotiefid = ctx.ID(1).getText();
        if (ts.newTrain(getRollingComponentByID(locomotiefid),trainid) == true) {
            System.out.println("new train " + ctx.ID(0).getText() + " created with locomotive" + ctx.ID(1).getText());
        }else {
            System.out.println("this train allready exists or you tried to create a train without a locomotive");
        }

    }

    @Override
    public void enterNewwagoncommand(RichRailParser.NewwagoncommandContext ctx) {
        RollingComponentType type = null;
        switch (ctx.type().getText()){
            case "locomotive": type = RollingComponentType.Locomotive;
                break;
            case "firstclasswagon": type = RollingComponentType.FirstClassWagon ;
                break;
            case "secondclasswagon": type = RollingComponentType.SecondClassWagon;
                break;
            case "cargowagon": type = RollingComponentType.CargoWagon;
                break;
        }

        if(ctx.NUMBER() == null){
            if (ts.newRollingComponent(type, ctx.ID().getText()) == true){
                System.out.println("new " + ctx.type().getText() + " " + ctx.ID().getText()+ " created");
            }else {
                System.out.println("a rolling component allready exists with this id");
            }
        }else{
            if (ts.newRollingComponent(type, ctx.ID().getText(), Integer.parseInt(ctx.NUMBER().toString())) == true){
            System.out.println("new " + ctx.type().getText() + " " + ctx.ID().getText()+ " with " + ctx.NUMBER().toString() + " seats is created");
            }else {
                System.out.println("a rolling component allready exists with this id");
            }
        }

    }


    @Override
    public void enterAddcommand(RichRailParser.AddcommandContext ctx) {
        String trainid = ctx.ID(1).getText();
        String rollingcomponentid = ctx.ID(0).getText();
        if(ts.addRollingComponentToTrain(getTrainByID(trainid),getRollingComponentByID(rollingcomponentid)) == true){
            System.out.println("wagon " + ctx.ID(0).getText() + " added to train " + ctx.ID(1).getText());
        }else{
            System.out.println("a train can only have one locomotive please add a different type of wagon");
        }
    }

    @Override public void enterDelcommand(RichRailParser.DelcommandContext ctx) {
        ctx.deletetype().getText();
        if (ctx.deletetype().getText().equals("train")) {
            ts.deleteTrain(getTrainByID(ctx.ID().getText()));
            System.out.println("train " + ctx.ID().getText() + " deleted");
        }else{
            if(ts.deleteRollingComponent(getRollingComponentByID(ctx.ID().getText())) == true) {
                System.out.println("wagon " + ctx.ID().getText() + " deleted");
            }else{
                System.out.println("this rolling component is used by one or more trains so it cant be deleted");
            }
        }
    }

    @Override
    public void enterGetcommand(RichRailParser.GetcommandContext ctx) {
        if (ctx.deletetype().getText().equals("train")) {
            System.out.println("total seats of train " + ctx.id.getText() + " is " + getTrainByID(ctx.id.getText()).getTotalSeats());
        }else{
            System.out.println("RollingComponent " + ctx.id.getText() + " has " + getRollingComponentByID(ctx.id.getText()).getSeats() + " seats");
        }
    }

    @Override
    public void enterRemcommand(RichRailParser.RemcommandContext ctx) {
        String trainid = ctx.ID(1).getText();
        String rollingcomponentid = ctx.ID(0).getText();
        if(ts.deleteRollingComponentFromTrain(getTrainByID(trainid),getRollingComponentByID(rollingcomponentid)) == true){
            System.out.println("wagon "+ctx.ID(0).getText() +" deleted from train "+ctx.ID(1).getText());
        }else{
        System.out.println("you tried to remove a locomotive or a wagon that this train does not have");
        }
    }

    private RollingComponent getRollingComponentByID(String id){
        RollingComponent out = null;
        for(RollingComponent rc: rollingComponents){
            if(rc.getId().equals(id)){
                out = rc;
                break;
            }
        }
        return out;
    }

    private Train getTrainByID(String id){
        Train out = null;
        for(Train t: trains){
            if(t.getId().equals(id)){
                out = t;
                break;
            }
        }
        return out;

    }

    @Override
    public void update(Observable observable, Object arg){
        trains = ts.getTrains();
        rollingComponents = ts.getRollingComponents();
        System.out.println("updated");
    }

}
