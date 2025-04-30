import java.util.Arrays;

public class Array_Rearrange_alternate {
    public static void main(String[] args) {
        // In this approach we are tranforming the number in such a way so that it can give us the 
        // original number which is to be placed on a paricular index
        int[] arr = {2,0,1,4,5,3};
        int n = arr.length;
        for(int i=0;i<n;i++){
            int old_val = arr[i]%n;
            arr[old_val]=n*i+arr[old_val];
        }
        for(int i=0;i<n;i++){
            arr[i]=arr[i]/n;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int add(int a,int b){
        return(a+b);
    }

}
