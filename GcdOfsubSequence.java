public class GcdOfsubSequence {
    public static void main(String[] args) {
        // >>>Idea>>
        // if the gcd of the entire Array is 1 then For sure there must exist a subsequence whose gcd will be one
        // ex gcd(a,b,c,d,e)>> GCD(gcd(a,c,e),b,d)>>>GCD(1,b,d)>>>==1;
        int[] arr = {1,2,3,4,5,6};
        int gcd = GCD(arr[0],arr[1]);
        for(int i=2;i<arr.length;i++){
            gcd = GCD(gcd,arr[i]);
        }
        if(gcd==1) System.out.println("true");
        else System.out.println("false");
    }
    public static int GCD(int a,int b){
        int max = Math.max(a, b);
        int min = Math.min(max, b);
        while (max%min!=0) {
            int temp = min;
            min = max%min;
            max=temp;
        }
        return min;
    }
}