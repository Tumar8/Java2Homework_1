package com.company;

public class Car {
    private int volume;
    private Color color;
    private String maker;

    public String getMaker() {
        return maker;
    }

    public int getVolume() {
        return volume;
    }

    public Color getColor() {
        return color;
    }

    public Car(int volume, Color color, String maker) {
        this.volume = volume;
        this.color = color;
        this.maker = maker;
    }

    public String getInfo(){
        return (getMaker() +"Volume "+getVolume()+ " Color " +getColor());

    }
    public void Light(){
        System.out.println("Lights headlights");}
}
