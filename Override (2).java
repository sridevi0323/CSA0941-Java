class Override {
    void  add (int a, float b)
    {
        System.out.println("The integer"+a);
        System.out.println("The Float"+b);
    }
}
class Derived extends Override {
    void add(int c, float d) {
        c = 20;
        d = 57.0f;
        System.out.println("The integer" + c);
        System.out.println("The Float" + d);
    }
    public static void main(String[] args)
    {
        Override b = new Override();
        b.add(50,10);
        Derived d = new Derived();
        d.add(25, 100);
    }
}