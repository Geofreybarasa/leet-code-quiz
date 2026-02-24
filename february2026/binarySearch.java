package february2026;

public class binarySearch {

    public static int binaryDepthSearch(int[] A, int left, int right, int x) {

        if (left > right) {
            return -1;  // base case
        }

        int mid = left + (right - left) / 2;

        if (x == A[mid]) {
            return mid;  // found
        }

        if (x < A[mid]) {
            return binaryDepthSearch(A, left, mid - 1, x);
        }

        return binaryDepthSearch(A, mid + 1, right, x);
    }

    public static void main(String[] args) {

        int[] numbers = {1, 3, 5, 7, 9, 11, 13};

        int result = binaryDepthSearch(numbers, 0, numbers.length - 1, 7);

        System.out.println("Index: " + result);
    }
}