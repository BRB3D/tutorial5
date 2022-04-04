package tutorial24.World;

public class Field {
    Plant plant = new Plant();

//   Size is protected and field is in the same package as plant
    public Field() {
        System.out.println(plant.size);
    }
}
