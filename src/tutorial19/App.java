package tutorial19;

class Thing {
//    final means the static constant wont be able to be re-assigned later basically a constant in javascript.
    public final static int LUCKY_NUMBER = 7;

//    Instance variable gets its own copy
    public String name;

//    Static variable or class Variables only associated with the class.
    public static String description;

//non-static methods can access the static variables. but not the other way around
    public void showName() {
        System.out.println(description +  " " +name);

    }
//static methods can access static data becasue they belong to the class, but can not output instance variables.
    public static void showInfo() {
        System.out.println(description);
//    this wont work because its an instance variable    System.out.println(name);
    }
}

public class App {
    public static void main(String[] args) {
        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        Thing.description = "I am a thing";

        Thing.showInfo();

        thing1.name = "Bob";
        thing2.name = "Sue";

        System.out.println(thing1.name);
        System.out.println(thing2.name);

        thing1.showName();
        thing2.showName();

        System.out.println(Math.PI);

        System.out.println(Thing.LUCKY_NUMBER);
    }
}
