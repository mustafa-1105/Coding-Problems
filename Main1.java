class P {
    public void display() {
        System.out.println("n P");
    }
}
class C extends P {
    public void display() {
        System.out.println("n C");
    }
}
public class Main1 {
    public static void main(String[] args) {
        P p = new C();
        p.display();
    }
}
