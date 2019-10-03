package com.Classes;


public class Classes {

    public static void main(String[] args) {
	    Car Tesla = new Car();
	    Car Lexus = new Car();

	    Tesla.setColor("Metallic Grey");
        Tesla.setDoors("4");
        Tesla.setType("Electric");
        Tesla.setEngine("2 Tri-Phase 4 Pole AC induction motor");
        Tesla.setModel("S");
        Tesla.setWheels("4");

        Lexus.setColor("Metallic White");
        Lexus.setDoors("4");
        Lexus.setType("Gas");
        Lexus.setEngine("4.6L V8 Gas Engine");
        Lexus.setModel("GX460");
        Lexus.setWheels("4");

        System.out.println("My Tesla Stats:");
        System.out.println(Tesla.getColor());
        System.out.println(Tesla.getDoors()+" doors");
        System.out.println(Tesla.getEngine());
        System.out.println(Tesla.getModel() );
        System.out.println(Tesla.getType());
        System.out.println(Tesla.getWheels()+" wheels");
        System.out.println();
        System.out.println("My lexus Stats:");
        System.out.println(Lexus.getColor());
        System.out.println(Lexus.getDoors()+" doors");
        System.out.println(Lexus.getEngine());
        System.out.println(Lexus.getModel());
        System.out.println(Lexus.getType());
        System.out.println(Lexus.getWheels()+" wheels");
    }
}
