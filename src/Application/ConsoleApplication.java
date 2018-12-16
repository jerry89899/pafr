package Application;



public class ConsoleApplication implements Observer{
    private Observer target;

    public ConsoleApplication(Observer target){
       target.registerObserver(this);

       this.target = target;
    }

    @Override
    public void registerObserver(Observer obs) {

    }

    public void update(){
        //update in frontend
        System.out.println("consoleapp works" );
        System.out.println("consoleapp");
    }

}
