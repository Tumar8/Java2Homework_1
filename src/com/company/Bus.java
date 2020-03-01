package com.company;

public final class Bus extends Automobile {

    private String mark;

    public Bus(int volume, Color color, String maker, int year, int speed, String mark) {
        super(volume, color, maker, year, speed);
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }
    @Override
    public String getInfo() {
        return (super.getInfo() + "Mark " + getMark());
    }

    @Override
    public void Light() {
        System.out.println("Fast bus");
    }
}

