package com.company.observer;


public class Type1Viewer implements Viewer {

   @Override
    public void viewerComment(String news2){
        System.out.println("Viewing the news:"+ news2);
    }
}
