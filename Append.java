public class Append {
    public static void main(String[] args) {
        String s ="I am a good boy";
        char charToAppend='!';
        StringBuilder append=new StringBuilder(s);
        append.append(charToAppend);
        System.out.println("Appended String: "+append.toString());
    }
}
