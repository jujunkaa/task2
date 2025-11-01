import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(countDel(n));
        scanner.close();

    }

    public static int countDel (int n) {
        int a = 0;
        for (int i = 1; i<=n; i++) {
            if (n%i == 0) { a++;}
        }
        return a;
    }
}