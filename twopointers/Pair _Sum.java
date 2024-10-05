package DSA.twopointers;
import java.util.* ;
import java.io.*;
import java.lang.*;
public class Solution {
    public static int pairSum(int arr[], int n, int target) {
        // Write your code here.
        Arrays.sort(arr);
        int left = 0;
        int right = n-1;
        int k =0;
        while(left<right){
            if (arr[left]+arr[right]==target){
                k++;
                left++;
                right--;
            }
        
            else if (arr[left]+arr[right]>target){
                right--;
            }
            else{
                left++;
            }
        }
        if(k>0){
            return k;
        }
        else{
            return -1;
        }
    }
}
