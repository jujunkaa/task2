import java.util.Arrays;
import java.util.Scanner;

public class n9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String f = scanner.nextLine().trim();
        String[] f1 = f.split("\\],\\s*\\[");
        
        String m1 = f1[0].replace("[", "").replace("]", "").trim();
        int[] a;
        if (m1.isEmpty()) {
            a = new int[0];
        } else {
            String[] el1 = m1.split(",");
            a = new int[el1.length];
            for (int i = 0; i < el1.length; i++) {
                a[i] = Integer.parseInt(el1[i].trim());
            }
        }

        String m2 = f1[1].replace("[", "").replace("]", "").trim();
        int[] b;
        if (m2.isEmpty()) {
            b = new int[0];
        } else {
            String[] el2 = m2.split(",");
            b = new int[el2.length];
            for (int i = 0; i < el2.length; i++) {
                b[i] = Integer.parseInt(el2[i].trim());
            }
        }
        
        System.out.println(Arrays.toString(mergeUniqueSorted(a, b)).replace(" ", ""));
    }

    public static int[] mergeUniqueSorted (int[] a, int[] b) {
        int[] merge = new int[a.length + b.length];

        System.arraycopy(a, 0, merge, 0, a.length);
        System.arraycopy(b, 0, merge, a.length, b.length);
        Arrays.sort(merge);

        int unique = 0;
        if (merge.length > 0) {
            unique = 1;
            for (int i = 1; i < merge.length; i++) {
                if (merge[i] != merge[i - 1]) {
                    unique++;
                }
            }
        }

        int[] mergeAB = new int[unique];
        if (merge.length > 0) {
            mergeAB[0] = merge[0];
            int index = 1;
            
            for (int i = 1; i < merge.length; i++) {
                if (merge[i] != merge[i - 1]) {
                    mergeAB[index] = merge[i];
                    index++;
                }
            }
        }
        
        return mergeAB;
    }
}