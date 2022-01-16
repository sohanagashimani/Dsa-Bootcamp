import java.util.Scanner;

public class football {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int team1 = 0, team2 = 0;
            String name2 = new String();
            sc.nextLine();
            String[] log = new String[n];
            for (int i = 0; i < n; i++) {
                log[i] = sc.nextLine();
                if (log[i].equals(log[0]))
                    team1++;
                else {
                    team2++;
                    name2 = log[i];
                }
            }
            if (team1 > team2)
                System.out.println(log[0]);
            else if (team1 < team2)
                System.out.println(name2);
            else
                System.out.println("Draw");
        }
    }
}
