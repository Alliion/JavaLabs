package lab5;
import java.util.Scanner;

public class Task3 {
    public static int Rec(int a, int b){
        if (a > b){
            System.out.print(a + " ");
            Rec(a - 1, b);
        }
        else if (a < b){
            System.out.print(a + " ");
            Rec(a + 1, b);
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(Rec(a, b));
    }
}
