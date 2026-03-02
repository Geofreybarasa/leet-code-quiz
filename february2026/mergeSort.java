package february2026;

public class mergeSort {
    public static void main(String[] args){
        int[] data = new int[]{-5,20,10,3,2,0};
        mergeSort(data, 0, data.length - 1);
        System.out.println("stop");
        

    }

    public static void mergeSort(int[] data, int start, int end){
        if(start < end){
            int mid = (start + end )/ 2;

            mergeSort(data ,start ,mid );
            mergeSort(data ,mid + 1 ,end);
            merge(data, start, mid, end);
        }
    }

    public static void merge(int[] data, int start, int mid, int end){

        //build temporary array to avoid modifying the original contents
        int[] temp = new int[end - start +1];

        int i = start , j = mid+1, k = 0;

        //while both subarray has values try and merge themin sorted order
        while(i <=mid && j <= end ){
            if(data[i] <= data[j]){
                temp[k++] = data[i++];

            }else{
                temp[k++] = data[j++];

            }

        }
        //add the rest of the values from the left subarray into the result
        while(i <= mid){
            temp[k] = data[i];
            k++;
            i++;
        } 

                //add the rest of the values from the right subarray into the result
        while(j <= end){
            temp[k] = data[j];
            k++;
            j++;
        } 
        for(i =start; i<=end; i++){
            data[i] = temp[i-start];
        }

    }
    
}
