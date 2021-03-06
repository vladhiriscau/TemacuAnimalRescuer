package org.fasttrackit;


/**
 * Hello world!
 *
 */
public class App
{

    // one line comment

    public static void main( String[] args )
    {
        System.out.println( "Welcome to the AnimalRescuer!" );

        Animal animalReference = new Animal();
        animalReference.name = "Azorel";
        animalReference.age = 7;
        animalReference.health = 5;
        animalReference.hungry = 6;
        animalReference.mood = 7;
        animalReference.favoriteFood = "pedigree";
        animalReference.favoriteActivity = "run";

        Car car2 = new Car();
        car2.name = "BMW";
        car2.mileage = 14;
        // concatenation
        System.out.println(carReference);
        System.out.println("First car name: " + carReference.name);
        System.out.println(carReference.color);
        System.out.println(carReference.mileage);
        System.out.println(carReference.fuelLevel);
        System.out.println(carReference.maxSpeed);
        System.out.println(carReference.running);
        System.out.println(carReference.doorCount);

        System.out.println("Second car name: " + car2.name);
        System.out.println(car2.color);
        System.out.println(car2.mileage);
        System.out.println(car2.fuelLevel);
        System.out.println(car2.maxSpeed);
        System.out.println(car2.running);
        System.out.println(car2.doorCount);

        car2.name = "VW";
        System.out.println(car2.name);

        Car car3 = car2;
        car3.name = "Audi";
        System.out.println("Car2 name: " + car2.name);
        System.out.println("Car3 name: " + car3.name);
    }
}