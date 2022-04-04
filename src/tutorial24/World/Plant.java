package tutorial24.World;

public class Plant {
//    Bad practice
    public String name;

    private String type;

    protected String size;

    int height; // this will be accesible through the whole package.

    public final static int ID = 8;

    public Plant() {
        this.name = "Gyum";
        this.type = "plant";


        this.size = "medium";
    }
}
