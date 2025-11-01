import java.util.Scanner;

public class n7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] b = countEvenOddDigits(a);
        System.out.println(b[0] + ", " + b[1]);
    }

    public static int[] countEvenOddDigits (int a) {
    int n = Math.abs(a);
    int even = 0;
    int odd = 0;
    
    if (n == 0) {
        even +=1;
    }
    
    while (n > 0) {
        int b = n % 10;
        if (b % 2 == 0) {
            even++;
        } else {
            odd++;
        }
        n = n / 10;
    }
    return new int[]{even, odd};
    }
}