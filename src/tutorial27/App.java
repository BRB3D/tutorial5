package tutorial27;

public class App {
    public static void main(String[] args) {
        int intValue = 888;
        short shortValue = 55;
        byte byteValue = 20;
        long longValue = 2345;
        float floatValue = 8834.8f;// include the f at the end.
        double doubleValue = 32.43;

        System.out.println(Byte.MAX_VALUE);

//        Store a numerical value ina variable of a different type we can sue cast example:
        intValue = (int)longValue;
        System.out.println(intValue);


        doubleValue = intValue;
        System.out.println(doubleValue);

        intValue = (int)floatValue;
        System.out.println(intValue);

        byteValue = (byte)128;
        System.out.println(byteValue);// this gives a negative value because the max value of byte is 127.
    }
}
