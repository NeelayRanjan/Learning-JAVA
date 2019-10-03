package com.Classes;

public class Car {
    private String Doors;
    private String Wheels;
    private String Model;
    private String Engine;
    private String Color;
    private String Type;

    public void setDoors(String doors) {
        this.Doors = doors;
    }

    public void setWheels(String wheels) {
        this.Wheels = wheels;
    }

    public void setModel(String model) {
        this.Model = model;
    }

    public void setEngine(String engine) {
        this.Engine = engine;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public void setType(String type) {
        this.Type = type;
    }


    public String  getDoors() {
        return this.Doors;
    }

    public String getWheels() {
        return this.Wheels;
    }

    public String getModel() {
        return this.Model;
    }

    public String getEngine() {
        return this.Engine;
    }

    public String getColor() {
        return this.Color;
    }

    public String getType() {
        return this.Type;
    }
}
