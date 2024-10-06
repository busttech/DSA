package Dutch National Flag Algorithm;

public class sort123 {
    public void sortColors(int[] arr) {
        int low  = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid<=high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if (arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
                
            }
        }       
    }
}
// question link https://leetcode.com/problems/sort-colors/
