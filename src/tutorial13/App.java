package tutorial13;


class Person {
//    Class can contain
//    1. Data instance variables (data or "state")
//    2.subroutines (methods)

    String name;
    int age;
}

public class App {
//    Main method works through  a subroutine of commands inside the public static void main
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Joe Bloggs";
        person1.age = 37;

        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 20;
    }
}
