package february2026;
public class decimalToBinary {

    public static void main(String[] args){
        String binary = findBinary(233);
        System.out.println(binary);

    }

    public static String findBinary(int decimal){
        if(decimal == 0){
            return "";
        }

        
        return findBinary(decimal / 2) + decimal % 2;

    }

    
    
}
