package tutorial28;
class Machine {
    public void start() {
        System.out.println("Machine started");
    }
}


class Camera  extends Machine{
    public void start() {
        System.out.println("Camera started");
    }

    public void snap() {
        System.out.println("Photo Taken");
    }
}


public class App {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
        Camera camera1 = new Camera();

        machine1.start();
        camera1.start();
        camera1.snap();

//        Upcasting
        Machine machine2 = camera1;
        machine2.start();
//        error: machine2.snap() because the class machine doesnt have the class snap it cant be used.
//        Downcasting inherently unsfae but possible.

        Machine machine3 = new Camera();
        Camera camera2 = (Camera)machine3;
        camera2.snap();
        camera2.start();

    }
}
