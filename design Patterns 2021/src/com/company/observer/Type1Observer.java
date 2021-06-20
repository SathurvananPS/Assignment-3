package com.company.observer;

import java.net.SocketOption;

public class Type1Observer implements Observer{

    @Override
    public void notifyObserver(String news){
        System.out.println("Reading the news:"+ news);
    }


}
