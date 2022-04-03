package tutorial20;

public class App {
    public static void main(String[] args) {
//      Inefficient because the string is not changing, in fact each += creates a new string and assigns it to info
        String info = "";
        info += "My name is Bob.";

        info += " ";

        info += "I am a builder.";

        System.out.println(info);
//    More efficient: In this way string builder is actually modifying the contents and therefore its more efficient.
        StringBuilder sb = new StringBuilder("");

        sb.append("My name is Sue.");
        sb.append(" ");
        sb.append("I am a lion Tamer.");
        System.out.println(sb.toString());


        StringBuilder s = new StringBuilder();
        s.append("My name is Roger")
                .append(" ")
                .append("I am a sky diver");
//      StringBuffer a threa safe version of string builder if you have used a multithread.
//        StringBuffer


        System.out.println("Here is some text. \t That was a tab \nThat was a new line");
//the number in between %d which represents a number, is basically a format adding space. positive means aling at end negative align start.
        System.out.printf("Total cost %-10d; quantity is %10d\n", 5, 120);

        for(int i=0; i<20; i++) {
            System.out.printf("%2d: some text here\n", i);
        }
//formatting floating point value the "." means how many decimal places you are going to add in this case it is 2, and it rounds the value.
        System.out.printf("Total value: %.2f\n", 5.6874);
//        the value before the "." is the width or space before the formatting.
        System.out.printf("Total value: %-6.1f\n", 5.6874);



    }
}
