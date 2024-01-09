public class ArrayTwo
{
    public static void main(String arg[])
    {
        int c[][]={{1,2,3},{4,5,6},{6,7,8}};
        for (int i=0;i<c[i].length;i++)
        {
            for (int j=0;j<c[i].length;j++)
            {
                System.out.print(c[i][j] + " ");
            }

            System.out.println();
        }
    }
}
