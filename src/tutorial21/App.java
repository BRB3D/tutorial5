package tutorial21;

class Frog {
    private int id;
    private String name;

    public Frog(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String toString() {
        return id + ": " + name;
    }
}
//The toString() method is really good for debugging your application
public class App {
    public static void main(String[] args) {
        Frog frog1 = new Frog(7, "Bob");
        Frog frog2 = new Frog(5, "Roger");

        System.out.println(frog1);
        System.out.println(frog2);
    }
}
