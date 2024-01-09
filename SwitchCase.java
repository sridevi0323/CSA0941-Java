import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner Var = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = Var.nextLine(); // Use nextLine() to read a line of text

        switch (s) {
            case "mon":
                System.out.println("Monday");
                break;
            case "tues":
                System.out.println("Tuesday");
                break;
            case "wed":
                System.out.println("Wednesday");
                break;
            case "thurs":
                System.out.println("Thursday");
                break;
            case "fri":
                System.out.println("Friday");
                break;
            case "sat":
                System.out.println("Saturday");
                break;
            case "sun":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Week day ");
                break;
        }

        Var.close(); // Don't forget to close the Scanner to avoid resource leaks
    }
}
