public class sumnaturalNumbers {

    public static void main(String[] args){
        int inputNumber = 10;
        System.out.println(recurssiveSummation(inputNumber));


    }

    public static int recurssiveSummation(int inputNumber){
        if(inputNumber <= 1){
            return inputNumber;

        }

        return inputNumber + recurssiveSummation(inputNumber -1);
    }
    
}
