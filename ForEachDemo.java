public class ForEachDemo
{
    public static void main(String args[])
    { String names[] = {"Mumbai", "Pune", "Nagpur", "Aurangabad",  "Thane", "Nasik" };
        for (String x : names)
        {
            System.out.println("Name of the City in Maharashtra is: " + x);
        }
        System.out.println("~~~~Printing on City Names Done~~~~~");
    }
}
