import java.util.Scanner;

public class n8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String f = scanner.nextLine().trim();
        f = f.substring(1, f.length() - 1);

        String[] f1 = f.split("\\],\\s*\\[");
        int[][] a = new int[f1.length][];
        for (int i = 0; i < f1.length; i++) {
            String b = f1[i].replace("[", "").replace("]", "");
            String[] c = b.split(",");
            
            a[i] = new int[c.length];
            for (int k = 0; k < c.length; k++) {
                a[i][k] = Integer.parseInt(c[k].trim());
            }
        }

        System.out.println(diagonalSum(a));
    }

    public static int diagonalSum(int[][] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i][i];
        }
        return sum;
    }
}