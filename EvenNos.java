public class EvenNos {
    public static void main(String[] args) {
        System.out.println("Printing Even numbers from 1 to 25:");
        for (int i = 1; i <= 25; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}