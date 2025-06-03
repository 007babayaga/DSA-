import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {

        // GCD of two numbers can never be greater than the min of both numbers
        // 1<=GCD(a,b)<=min(a,b)
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // int ans =1;
        // for(int i=1;i<=Math.min(a, b);i++){
        //     if(a%i==0&&b%i==0){
        //         ans=i;
        //     }
        // }
        // System.out.println(ans);

        // Euclids Gcd theorem>>repetitive divsion till remiander goes zero
        int dividend = Math.max(a, b);
        int divisor = Math.min(a, b);
        if(Math.min(a, b)==0) {
            System.out.println(Math.max(a, b)); //To handle edge case if one of the number is zero
        }
        while(dividend%divisor!=0){
            int temp = divisor;
            divisor = dividend%divisor;
            dividend=temp;
        }
        System.out.println(divisor);
    }
    
}
