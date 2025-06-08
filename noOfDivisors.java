import java.util.Scanner;

public class noOfDivisors {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
        int val = (int)Math.sqrt(n);
        if(val*val==n){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
    }
}
