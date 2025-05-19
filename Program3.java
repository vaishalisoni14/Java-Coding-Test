import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        for (int i = 1; i <= 2 * a; i += 2) {
            if (i <= a) {
                System.out.print(i);
                if (i + 2 <= a) System.out.print(", ");
            }
        }
    }
}
