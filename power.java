import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        System.out.println("Enter a power: ");
        int p = in.nextInt();
        int power = 1;
        System.out.print(n+" to the power of "+p+" is = ");
        while(p!=0){
            power *= n;
            p--;
        }
        System.out.println(power);
        in.close();
    }
}
