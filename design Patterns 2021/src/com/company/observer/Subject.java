package com.company.observer;

//newspaper agency

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List <Observer> observers = new ArrayList<>();
    List <Viewer> viewers = new ArrayList<>();

    //subscribe
    public void subscribe(Observer observer){

        //call  the database and run a sql query to insert this observer
        observers.add(observer);
    }
   //unsubscribe
    public void unsubscribe(Observer observer){
        //call  the database and run a sql query to delete this observer
        observers.remove(observers);

    }

    public void view(Viewer viewer){
        //call  the database and run a sql query to delete this observer
        viewers.remove(viewers);

    }


    public void notifyObservers(String news){

        for (Observer observer : observers) {
            observer.notifyObserver(news);
        }


    }

    public void viewerComment(String news2){
        for (Viewer viewer : viewers ) {
           viewer.viewerComment(news2);
        }
    }
}
