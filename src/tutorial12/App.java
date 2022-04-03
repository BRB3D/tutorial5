package tutorial12;

public class App {
    public static void main(String[] args) {
//        Multi dimensional arrays have arrays within arrays.

        int[] values = {3, 5, 243};
        System.out.println(values[2]);

//        Example of 2 dimensional array

        int[][] grid = {
                {3, 5, 243},
                {2,4},
                {1, 2, 3, 4}
        };

        System.out.println(grid[1][1]);
        System.out.println(grid[0][2]);

        String[][] texts= new String[2][3];

        System.out.println(texts[0][1]);


        texts[0][1] = "Hello there";
        System.out.println(texts[0][1]);



    }
}
