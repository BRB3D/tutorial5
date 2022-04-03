package tutorial11;

public class App {
    public static void main(String[] args) {
        String[] words = new String[3];

        words[0] = "Hello";
        words[1] = "to";
        words[2] = "you";

        System.out.println(words[1]);

        String[] fruits = {"apple" , "strawberry", "blueberry"};

        for(String fruit: fruits) {
            System.out.println(fruit);
        }
//      Allocates memory for a number
        int value = 123;

//        Only is a reference doesnt really allocate memory becasue its not primitive
        String text = null;

        System.out.println(text);

        String[] texts = new String[2];

        System.out.println(texts[0]);

        texts[0] = "one";

        for(String text2: texts) {
            System.out.println(text2);
        }

    }
}
