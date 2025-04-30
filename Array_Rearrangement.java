
import java.util.Arrays;
// import java.util.Scanner;
public class Array_Rearrangement {
    public static void main(String[] args) {
        // Your code here
        int[] arr = {2,0,1,4,5,3};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                int idx = arr[i],val=i;
                while(idx!=i){
                    int temp = arr[idx];
                    arr[idx]=-(val+1);
                    val=idx;
                    idx=temp;
                }
                arr[idx]=-(val+1);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=-1*arr[i]-1;
        }
        System.out.println(Arrays.toString(arr));
    
    }
}
