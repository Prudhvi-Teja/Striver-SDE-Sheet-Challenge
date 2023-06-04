
import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here

        int p0=0, p1=0, p2=arr.length-1;

        while(p2>=p1){
            
            if(arr[p1]==0){
                int temp = arr[p1];
                arr[p1] = arr[p0];
                arr[p0] = temp;
                p0++;
                p1++;
            }
            else if(arr[p1]==1){
                p1++;
            }
            else{
                int temp = arr[p2];
                arr[p2] = arr[p1];
                arr[p1] = temp;
                p2--;
            }

        }


    }
}
