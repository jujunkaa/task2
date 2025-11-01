import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] ab = scanner.nextLine().split(",");
        int a = Integer.parseInt(ab[0].trim());
        int b = Integer.parseInt(ab[1].trim());
        System.out.println(sumRange(a, b));
        scanner.close();
    }

    public static int sumRange (int a, int b) {
        int n = b - a + 1;
        return n*(a+b)/2;
    }
}