public class Overriding
{
    void disp(int i)
    {
        System.out.println("Hello empty world");
    }
    static class Derived extends Overriding
    {
        void disp(int i)
        {
            System.out.println("Overriding base method");
        }
    }
    public static void main(String[] args)
    {
        Derived d = new Derived();
        d.disp(1);
    }
}
