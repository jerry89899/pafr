package Presentation;


public class InputController{// implements Initializable {
//    private ArrayList<Output> outputs = new ArrayList<>();
//   // private VehicleController controller;
//    @FXML LogOutput logOutput;
//    @FXML TreintjesOutput treinOutput;
//    @FXML private HBox traincontainer; // to put the trainoutput back.
//    @FXML private TextField commandoInput;
//    @FXML private TextFlow inputfield;
//    @FXML
//    private void onRunClick(ActionEvent actionEvent) {
//
//        String command = this.commandoInput.getText();
//        CharStream charStream = CharStreams.fromString(command);
//
//        RichRailLexer lexer = new RichRailLexer(charStream);
//        // lexer.removeErrorListeners();
//        // lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
//
//        TokenStream tokens = new CommonTokenStream(lexer);
//
//        RichRailParser parser = new RichRailParser(tokens);
//        RichRailBaseListener base = new Listener();
//        ParseTree tree = parser.command();
//        ParseTreeWalker.DEFAULT.walk(base, tree);
//        //controller.createVehicle("train", 4, "#33333", "tr1");
//        //logOutput.showErrorMessage("test");
//        if (!"".equals(command)){handleSubmitButtonAction();}
//    }
//
//    @Override
//    public void initialize(URL location, ResourceBundle resources) {
//        outputs.add(logOutput);
////        outputs.add(treinOutput);
//        //zoutputs.add(treinOutputTest);
//        //controller = new VehicleController(outputs);
//    }
//
//    class Listener extends RichRailBaseListener {
//        @Override
//        public void exitNewcommand(RichRailParser.NewcommandContext ctx) {
//            String type = ctx.TYPE().getText();
//            String id = ctx.ID().getText();
//            //controller.createVehicle(type, 4, id);
//        }
//        @Override
//        public void exitAddcommand(RichRailParser.AddcommandContext ctx){
//            String wg = ctx.ID(0).getText();
//            String tr = ctx.ID(1).getText();
//           // controller.addVehicleToMotor(tr, wg); // add wagon to motor (train or whatever).
//        }
//
//        @Override
//        public void exitRemcommand(RichRailParser.RemcommandContext ctx){
//            String wg = ctx.ID(0).getText();
//            String tr = ctx.ID(1).getText();
//            //controller.removeVehicleFromMotor(tr, wg); // add wagon to motor (train or whatever).*/
//            System.out.println(tr);
//        }
//
//        @Override
//        public void exitDelcommand(RichRailParser.DelcommandContext ctx){
//            String id = ctx.ID().getText();
////            controller.removeVehicle(id);
//        }
//
//        @Override
//        public void exitGetcommand(RichRailParser.GetcommandContext ctx){
//            String id = ctx.ID().getText();
////            controller.getNumSeats(id);
//        }
//    }
//
//    @FXML protected void handleSubmitButtonAction() {
//        Text text = new Text(commandoInput.getText() + "\n");
//        inputfield.getChildren().addAll(text);
//        commandoInput.setText("");
//
//
//    }
//
//    @FXML
//    private void openTrain (final ActionEvent event) throws Exception{
//            Parent root = FXMLLoader.load(getClass().getResource("../Presentation/dock.fxml"));
//            Stage secondaryStage = new Stage();
//
//            secondaryStage.setTitle("Trains");
//            secondaryStage.setScene(new Scene(root, 450, 450));
//            HBox trainbox = (HBox) root.lookup("#traindocker");
//            outputs.remove(treinOutput);
//            trainbox.getChildren().add(treinOutput);
//            //outputs.add(treinOutput);
//            secondaryStage.show();
//            secondaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
//                @Override
//                public void handle(WindowEvent event) {
//                    outputs.remove(treinOutput);
////                    trainbox.getChildren().remove(treinOutput);
//                  //  outputs.add(treinOutput);
//                  //  controller = new VehicleController(outputs);
//                    traincontainer.getChildren().add(treinOutput); // readd train
//                }
//            });
//
//    }

}
