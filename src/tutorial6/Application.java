package tutorial6;

public class Application {
    public static void main(String[] args) {
        boolean cond = 1 < 6;
        boolean notEqual = 1 != 3;


        System.out.println(cond);
        System.out.println(notEqual);

        if(4 == 4) {
            System.out.println("Yes, it's true");
        }

        if(5 != 5) {
            System.out.println("not equal");
        }

        int myInt = 15;
        if(myInt < 10) {
            System.out.println("Yes, it's true " + myInt + " is smaller than 10" );
        } else {
            System.out.println("No, it's false " + myInt + " is bigger than 10 ");
        }

        if (myInt < 10) {
            System.out.println("Yes, it's true!");
        } else if(myInt > 20) {
            System.out.println("No, it's false");
        } else {
            System.out.println("because " + myInt + " is between 10 and 20 it skips the above if and else if");
        }

//        While loop with a break
        int loop = 0;

        while(true) {
            System.out.println("looping: " + loop);

            if(loop == 5){
                break;
            }
            loop++;
            System.out.println("running");
        }

    }
}
