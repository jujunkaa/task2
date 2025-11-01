import java.util.Scanner;

public class n6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] allN = scanner.nextLine().split(",");
        int value = Integer.parseInt(allN[0].trim());
        int min = Integer.parseInt(allN[1].trim());
        int max = Integer.parseInt(allN[2].trim());
        System.out.println(clamp(value, min, max));
    }

    public static int clamp (int value, int min, int max) {
        if (value < min) {
            return min;
        } else if (value > max) {
            return max;
        } else {
            return value;
        }
    } 
}