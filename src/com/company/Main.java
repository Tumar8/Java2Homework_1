package com.company;

public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus(20,Color.RED ," China",2019 ,60 ," Chery");
        System.out.println(bus1.getInfo());
        bus1.Light();

        Automobile automobile1 = new Automobile(30,Color.WHITE," Japan",2018,70);
        System.out.println(automobile1.getInfo());
        automobile1.Light();

        Automobile automobile2 = new Automobile(20,Color.BLACK,"Germany",2019,90);
        System.out.println(automobile2.getInfo());
        automobile2.Light();
    }

}
