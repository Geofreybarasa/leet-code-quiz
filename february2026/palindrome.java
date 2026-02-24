package february2026;
public class palindrome {
    public static void main(String[] args) {
        String input = "madam";
        System.out.println(isPalindrome(input)); 
    }

    public static boolean isPalindrome(String input){
        //base class
        if(input.length() == 0 || input.length() == 1){
            return true;
        }

        if(input.charAt(0) == input.charAt(input.length() -1)){

            return isPalindrome(input.substring(1, input.length() -1));
        }
        return false;
    }


    
}
