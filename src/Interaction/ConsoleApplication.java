package Interaction;

import DataRepresentation.RollingComponent;
import DataRepresentation.Train;

import java.util.ArrayList;

public class ConsoleApplication extends Observer {
    public ConsoleApplication(Data data){
        this.data = data;
        this.data.registerObserver(this);
    }

    @Override
    public void update(){
        //update in frontend
        System.out.println("consoleapp"+data.getTrains());
        System.out.println("consoleapp"+ data.getRollingComponents());
    }

}
