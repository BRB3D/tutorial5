package tutorial29;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

//        Ol way before Java 5     ////////
        ArrayList list = new ArrayList();

        list.add("apple");
        list.add("banana");
        list.add("orange");

        String fruit = (String)list.get(1);
        System.out.println(fruit);
//        Modern way of doing things

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("cat");
        strings.add("dog");
        strings.add("parrot");

        String animal = strings.get(1);

        System.out.println(animal);


    }
}
