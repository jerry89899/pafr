package Interaction;

import DataRepresentation.RollingComponent;
import DataRepresentation.Train;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Data implements Observable{
    private List<Observer> observers;

    public Data(){
        observers = new ArrayList<Observer>();
    }

    private ArrayList<Train> trains;
    private ArrayList<RollingComponent> rollingComponents;

    public ArrayList<Train> getTrains() {
        return trains;
    }

    public ArrayList<RollingComponent> getRollingComponents() {
        return rollingComponents;
    }

    @Override
    public void registerObserver(Observer observer) {
        if (observer != null) {
            this.observers.add(observer);
        }
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> it = observers.iterator();
        while(it.hasNext()){
            Observer observer = it.next();
            observer.update(trains,rollingComponents);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observer != null){
            this.observers.remove(observer);
        }
    }

    public void updateTrains(ArrayList<Train> trains){
        this.trains = trains;
    }
    public void updateRollingComponents(ArrayList<RollingComponent> rollingComponents){
        this.rollingComponents = rollingComponents;
    }

}
