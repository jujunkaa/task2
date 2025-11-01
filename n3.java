import java.util.Scanner;

public class n3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] allN = scanner.nextLine().split(",");
        int[] allInt = new int[allN.length];
        for (int i = 0; i < allN.length; i++) {
            allInt[i] = Integer.parseInt(allN[i].trim());
        }

        System.out.println(sumOfPositives(allInt));
        scanner.close();        
    }
    public static int sumOfPositives (int[] a){
        int n = 0;
        for (int i: a) {
            if (i>0) {n+=i;}
        }
        return n;
    }
}