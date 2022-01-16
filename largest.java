import java.util.Scanner;

public class largest {  
    static int large(int a,int b, int c){
        int max = a;
        if(b>max){
            max = b;
        }else if(c>max){
            max = c;
        }
        return max;
    }
    static int small(int a,int b, int c){
        int max = a;
        if(b<max){
            max = b;
        }else if(c<max){
            max = c;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        System.out.println(large(x, y, z));
        System.out.println(small(x, y, z));
    }
    
}
