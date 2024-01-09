public class ThisEg {
    ThisEg() {
        this(111);
        System.out.println("Default Constructor Called …..");
    }

    ThisEg(int a) {
        System.out.println("Parameterized Constructor Called with " + a);
    }

    public static void main(String[] args) {
        ThisEg obj = new ThisEg();
    }
}
