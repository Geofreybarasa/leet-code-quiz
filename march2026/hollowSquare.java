public class hollowSquare {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {

                // first or last row → all stars
                if(i == 1 || i == n) {
                    System.out.print("*");
                } 
                else { // middle rows
                    if(j == 1 || j == n) {
                        System.out.print("*"); // edges
                    } else {
                        System.out.print(" "); // hollow
                    }
                }

            }
            System.out.println(); // next row
        }
    }
}