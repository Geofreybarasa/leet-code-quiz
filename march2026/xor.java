public class xor {
    public static void main(String[] args) {
        int result = 0;
        int[] a = {1,2,3,1,3,2,4};
        for(int num : a){
            result = result ^ num;
        }
        System.out.println(result);
    }

}
