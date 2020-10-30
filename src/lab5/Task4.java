package lab5;
import java.util.Scanner;
import static java.lang.Math.pow;

public class Task4 {

    static int sum(int a) {
        if (a < 10) {
            return a;
        } else {
            return a % 10 + sum(a / 10);
        }
    }

    public static void main(String[] args) {
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int s = scanner.nextInt();
        for (int i = (int) pow(10, k - 1); i < (int) pow(10, k); i++) {
            if (sum(i) == s)
                a++;
        }
        System.out.println(a);
    }
}