package tutorial19;

class Thing {
//    Instance variable gets its own copy
    public String name;
//    Static variable or class Variables only associated with the class.
    public static String description;
}

public class App {
    public static void main(String[] args) {
        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        Thing.description = "I am a thing";
        System.out.println(Thing.description);

        thing1.name = "Bob";
        thing2.name = "Sue";

        System.out.println(thing1.name);
        System.out.println(thing2.name);
    }
}
