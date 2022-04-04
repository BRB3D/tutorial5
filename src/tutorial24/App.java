package tutorial24;

import tutorial24.World.Plant;

public class App {
    public static void main(String[] args) {
        Plant plant = new Plant();

        System.out.println(plant.name);
        System.out.println(plant.ID);

//        System.out.println(plant.type); because its private we cant access it.
//        System.out.println(plant.size); size is protected and App is not in the same package as plant so it wont work.
    }
}
