import java.util.*;

public class Solution {
    public static void mergeTwoSortedArraysWithoutExtraSpace(long []arr1, long []arr2){
        // Write your code here.
        // Declare 2 pointers:
        int left = arr1.length - 1;
        int right = 0;
        int m = arr2.length-1;

        // Swap the elements until arr1[left] is
        // smaller than arr2[right]:
        while (left >= 0 && right < m) {
            if (arr1[left] > arr2[right]) {
                long temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            } else {
                break;
            }
        }

        // Sort arr1[] and arr2[] individually:
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
    
}
