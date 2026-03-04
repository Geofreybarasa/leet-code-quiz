public class hollowPyramid {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++) {

            // left spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars and middle spaces
            for(int k = 1; k <= 2*i - 1; k++) {
                if(i == n) {
                    // last row → all stars
                    System.out.print("*");
                } else {
                    // edges of middle rows
                    if(k == 1 || k == 2*i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }
}