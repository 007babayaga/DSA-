public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int flag =-1;
        int targt = 7;
        int i=0;
        int j = arr.length-1;
        while (i<=j) {
            if(arr[i]+arr[j]>targt){
                j--;
            }
            else if(arr[i]+arr[j]<targt){
                i++;
            }
            else{
                System.out.println("found");
                flag=0;
                break;
            }
        }
        if(flag==-1){
            System.out.println("Not found");
        }
    
    }
}
// I am just trying to see how does a pull request works
// just n
