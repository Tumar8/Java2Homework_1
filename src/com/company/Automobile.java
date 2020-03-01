package com.company;

public class Automobile extends Car {
    private int year;
    private int speed;

    public Automobile(int volume, Color color, String maker, int year, int speed) {
        super(volume, color, maker);
        this.year = year;
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+" Year "+getYear()+"Speed "+getSpeed();
    }

    @Override
    public void Light() {
        System.out.println("New car");
    }

    public void makeSignal(int number){
        for (int i = 0; i <number ; i++) {
            System.out.println("beep-beep");

        }
    }

}
