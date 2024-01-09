public class Printnos
{
    public static void main (String [] args)
    {
        System.out.println("Printing numbers from 1 to 15:");
        for (int i = 1; i <= 15; i++) {
            System.out.print(i + " ");

            System.out.println("\n\nPrinting numbers from 15 to 1:");
            for (int j = 15; j >= 1; j--) {
                System.out.print(j + " ");

                if (i == j) {
                    System.out.println("values met at" + i + j);
                }
            }
        }
    }
}


