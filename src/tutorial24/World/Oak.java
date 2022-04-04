package tutorial24.World;

public class Oak extends Plant{
    public Oak() {
//        type = "tree"; this won't work because type is private
//        this works because size is protected and within the same package
        this.size = "large";
    }
}
