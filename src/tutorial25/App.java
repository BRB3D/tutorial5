package tutorial25;

public class App {
    public static void main(String[] args) {
        Plant plant1 = new Plant();
        Tree tree = new Tree();

        Plant plant2 = tree;

        plant2.grow();
        tree.shedLeaves();
//        plant2.shedLeaves(); since the reference is from plant it does have the method in plant and tree.
//        but since there is no method shed leaves in plant it wont be able to use it.
        doGrow(tree);
    }
    public static void doGrow(Plant plant) {
        plant.grow();
    }
}
