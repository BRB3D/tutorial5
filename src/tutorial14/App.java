package tutorial14;

class Person{
    String name;
    int age;

    void speak() {
        System.out.println("My name is " + name + ", and I am " + age + " years old!!");
    }

    void greetingsHuman() {
        System.out.println("Greetings Human I come from Melmac");
    }
}

public class App {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Joe Bloggs";
        person1.age = 37;

        Person person2 = new Person();
        person2.name = "Sam Haz";
        person2.age = 25;

        person1.speak();
        person1.greetingsHuman();
    }
}
