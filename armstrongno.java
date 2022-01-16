
import java.util.Scanner;

public class armstrongno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int original = n;
        int sum = 0;
        input.close();
        while(n>0){
            int rem = n%10;
            rem = (int) Math.pow(rem, 3);
            sum+= rem;
            n/=10;
        }
        if(sum == original){
            System.out.println("armstrong no");
        }else{
            System.out.println("not");
        }
    }
}
