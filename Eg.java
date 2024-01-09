public class Eg {
    String f_name = "micheal;";
    String l_name = "pichai";

    void name(String f_name, String l_name) {
        this.f_name = "micheal;";
        this.l_name = "pichai";
        System.out.println(f_name + " " + l_name);
    }

    public static void main(String []args) {
        Eg e1 = new Eg();
        e1.name("pichai", "micheal");

        Eg e2 = new Eg();
        e2.name("micheal", "pichai");
    }
}
