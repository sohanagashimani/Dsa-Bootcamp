import java.util.*;

public class pru {

    public static boolean isKaprekar(int number) {

        int square = 0;
        int temp = 0;
        int countDigits = 0;
        int firstPart = 0;
        int secondPart = 0;
        int sum = 0;

        square = number * number;

        temp = square;
        while (temp != 0) {
            countDigits++;
            temp /= 10;
        }

        for (int i = countDigits - 1; i > 0; i--) {

            firstPart = square / (int) Math.pow(10, i);

            secondPart = square % (int) Math.pow(10, i);

            if (firstPart == 0 || secondPart == 0)
                continue;

            sum = firstPart + secondPart;

            if (sum == number)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (isKaprekar(n)) {
            System.out.println("Kaprekar Number");
        } else {
            System.out.println("Not a Kaprekar Number");
        }

    }
}
