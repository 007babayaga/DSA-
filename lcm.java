import java.util.*;
public class lcm {
    public static void main(String[] args) {
        // max(a,b)<=lcm(a,b)<=a*b
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // int ans =0;
        // for(int i= Math.max(a, b);i<=a*b;i++){
        //     if(i%a==0&&i%b==0){
        //         ans=i;
        //         break;
        //     }
        // }
        // System.out.println(ans);
        // hcf*lcm = pdt of two numbers
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        int gcd=1;
        int pdt = a*b;
        while (max%min!=0) {
            int tmp = min;
            min=max%min;
            max=tmp;
        }
        gcd=min;
        System.out.println(pdt/gcd);
    }
}
