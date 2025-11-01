import java.util.Scanner;

public class n4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] allN = scanner.nextLine().split(",");
        int[] allInt = new int[allN.length];
        for (int i = 0; i < allN.length; i++) {
            allInt[i] = Integer.parseInt(allN[i].trim());
        }

        System.out.println(hasDuplicates(allInt));
        scanner.close();
    }

    public static boolean hasDuplicates (int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int k = i+1; k <a.length; k++) {
                if (a[i] == a[k]) {return true;}
            }
        }
        return false;
    }
}