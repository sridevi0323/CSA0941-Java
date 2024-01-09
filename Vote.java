import java.util.Scanner;
public class Vote
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age>=18)
        {
            System.out.println("you are eligible for voting");
        }
        else if (18>age)
        {
            int correctage= 18-age;
            System.out.println("you are eligible for vote after "+ correctage + " years");
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}
