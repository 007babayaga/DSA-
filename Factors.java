public class Factors {
    public static void main(String[] args) {
        // for(int i=1;i<=6;i++){
        //     if(n%i==0){
        //         System.out.println(i);
        //     }
        // }
        // we can little optimise it >>> the factors after N/2 will the number N itself
        // n=6; 1 2 3 .... 6
         // for(int i=1;i<=3;i++){
        //     if(n%i==0){
        //         System.out.println(i);
        //     }
        // }
        // System.out.println(i);
        // Most optimized approach>> The factors of a number are symmetrical about the sqrt of the number
        int n =20;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(i*i==n){
                    System.out.println(i);
                }
                else{
                    System.out.println(i);
                    System.out.println(n/i);
                }
            }
        }
    }
}
