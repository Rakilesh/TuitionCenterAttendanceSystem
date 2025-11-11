package sorting.com;

import java.util.Arrays;
import java.util.Scanner;

public class mergersort {
    public static void main(String[] args) {
         int[] arr = { 5,4,3,2,1};
         arr=merger(arr);
         System.out.println(Arrays.toString(arr));
    }
    static int[] merger(int arr[])
    {
        if(arr.length == 1 )
        {
            return arr;
        }
       // int s  = arr[0];
        //int e = arr.length;
        int mid = arr.length /2;
        int [] first = merger(Arrays.copyOfRange(arr,0,mid));
        int []  second = merger(Arrays.copyOfRange(arr,mid,arr.length));

        return mergers(first,second);
        //Scanner input = new Scanner(System.in);
    }
    public static int [] mergers(int [] f ,int [] l)

    {
        int [] ans =  new int[f.length + l.length];
        int i = 0 ;
        int j = 0 ;
        int k = 0 ;

        while (i < f.length && j< l.length) {
            if (f[i] < l[j]) {
                ans[k] = f[i];
                k++;
                i++;
            } else {
                ans[k] = l[j];
                k++;
                j++;
            }
        }
            while (i < f.length )
            {
                ans[k] = f[i];
                k++;
                i++;
            }
            while (j< l.length)
            {
                ans[k] = l[j];
                k++;
                j++;
            }
        
        return ans;
    }
}
