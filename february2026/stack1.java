package february2026;
public class stack1 {
    public static void main(String[] args) {
        String input = " madaraka";
        System.out.println(reveString(input));
    }

    public static String reveString(String input) {
        if (input.equals("")) {
            return "";
        }
        return reveString(input.substring(1)) + input.charAt(0);
    }
}