package february2026;
// Given the binary representation of an integer as a string s,
//  return the number of steps to reduce it to 1 under the following rules:
// If the current number is even, you have to divide it by 2.
// If the current number is odd, you have to add 1 to it.
// It is guaranteed that you can always reach one for all test cases.
// Example 1:
// Input: s = "1101"
// Output: 6
// Explanation: "1101" corressponds to number 13 in their decimal representation.
// Step 1) 13 is odd, add 1 and obtain 14. 
// Step 2) 14 is even, divide by 2 and obtain 7.
// Step 3) 7 is odd, add 1 and obtain 8.
// Step 4) 8 is even, divide by 2 and obtain 4.  
// Step 5) 4 is even, divide by 2 and obtain 2. 
// Step 6) 2 is even, divide by 2 and obtain 1


public class reduceBinary {

    public static int numSteps(String s) {
        // Base case
        if (s.equals("1")) {
            return 0;
        }

        // If even (last bit is 0)
        if (s.charAt(s.length() - 1) == '0') {
            // divide by 2 → remove last bit
            return 1 + numSteps(s.substring(0, s.length() - 1));
        } 
        else {
            // odd → add 1
            return 1 + numSteps(addOne(s));
        }
    }

    // Helper method to add 1 in binary
    private static String addOne(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = sb.length() - 1;

        while (i >= 0 && sb.charAt(i) == '1') {
            sb.setCharAt(i, '0');
            i--;
        }

        if (i >= 0) {
            sb.setCharAt(i, '1');
        } else {
            sb.insert(0, '1');
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(numSteps("1101")); // Output: 6
    }
}