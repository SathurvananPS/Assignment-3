package com.company.observer;


public class Type2Viewer implements Viewer {

   @Override
    public void viewerComment(String news2){
        System.out.println("Viewing the news for the improvement:"+ news2);
    }
}
