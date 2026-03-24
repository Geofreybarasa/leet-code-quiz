import java.util.HashSet;

public class hashSets {
    public static void main(String[] args) {
        int[] arr = {1,3,6,4,1,2};
        Solution sol = new Solution();
        int product = sol.solution(arr);
        System.out.println(product);
    }
    
}


class Solution {
    public int solution(int[] A) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : A){
            if(num > 0){
                set.add(num);
            }
        }

        int smallest = 1;

        while(set.contains(smallest)){
            smallest++;
        }

        return smallest;
    }
}
