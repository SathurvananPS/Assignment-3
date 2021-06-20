package com.company.observer;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //publisher->Subject
        //subscriber->Observer
        //types of observers->NewsReaders, FoodWrapper, Viewer


        Observer observer1 = new Type1Observer();
        Observer observer2 = new Type1Observer();
        Observer observer3 = new Type2Observer();
        Viewer viewer1 =new Type1Viewer();
        Viewer viewer2 =new Type1Viewer();
        Viewer viewer3 =new Type2Viewer();


        Subject subject =new Subject();
        subject.subscribe(observer1);
        subject.subscribe(observer2);
        subject.subscribe(observer3);
        subject.view(viewer1);
        subject.view(viewer2);
        subject.view(viewer3);


        subject.notifyObservers("Curfew will be imposed tdy!....");

        Thread.sleep(10000); //wait for 10s
        System.out.println("===========================");

        subject.notifyObservers("Reversed: Curfew will not be imposed tdy");


        Thread.sleep(5000);//wait for 5 s

        subject.unsubscribe(observer2);

        Thread.sleep(5000);// //wait for 5s
        System.out.println("===========================");

        subject.notifyObservers("Fuel prices gone up!.....");


        System.out.println("===========================");



        subject.viewerComment("Try to improve quality");


        subject.view(viewer2);
        Thread.sleep(5000);
        subject.viewerComment("Current: Now it is fine");




    }
}
