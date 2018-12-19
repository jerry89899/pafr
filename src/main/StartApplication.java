package main;

import Application.TrainService;
import Application.TrainServiceInterface;
import parser.RichRailCli;

import java.util.Observer;

public class StartApplication  {

    public static void main(String[] args){


    }

    public StartApplication(){
        TrainService ts = new TrainService();
        RichRailCli observer = new RichRailCli(ts);// moet de front end opstarten
        ts.addObserver(observer);

    }

}
