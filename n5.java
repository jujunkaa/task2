import java.util.Arrays;
import java.util.Scanner;

public class n5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        String[] parts = input.split("],");
        
        String arrayPart = parts[0].replace("[", "").replace("]", "").trim();
        int[] allInt;
        
        if (arrayPart.isEmpty()) {
            allInt = new int[0];
        } else {
            String[] allN = arrayPart.split(",");
            allInt = new int[allN.length];
            for (int i = 0; i < allN.length; i++) {
                allInt[i] = Integer.parseInt(allN[i].trim());
            }
        }
        
        String shift = parts[1].replace(",", "").trim();
        int b = Integer.parseInt(shift);
        
        System.out.print(Arrays.toString(rotateRight(allInt, b)));
    }

    public static int[] rotateRight(int[] a, int b) {
        if (a.length == 0) {return new int[0];}
        int shift = b % a.length;
        if (shift == 0) {return a.clone();}
        int[] result = new int[a.length];
        System.arraycopy(a, a.length - shift, result, 0, shift);
        System.arraycopy(a, 0, result, shift, a.length - shift);
        return result;
    }
}