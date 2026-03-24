public class numbPyramid {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1;i<=n;i++){

            //lets print the left space first
            for(int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            
                for(int k=1; k<=i;k++){
                    
                    System.out.print(k);
                }
                for(int k=i-1; k>=1;k--){
                    
                    System.out.print(k);
                }

            
            System.out.println();
        }
    }
    /*
            1
           121
          12321
         1234321
    
    
    */
    
}
