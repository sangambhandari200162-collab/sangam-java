class Bird {

    void fly() {
        System.out.println("Bird is flying");
    }
}
class Sparrow extends Bird {

    @Override
    void fly() {
        System.out.println("Sparrow is flying");
    }
}
public class LSPEExample {
    public static void main(String[] args) {
        Bird bird = new Sparrow();
        bird.fly();
    }
}
