package lab5;
import java.util.Scanner;

public class Task2 {
    public static void Rec(int n){
        if (n != 1)
            Rec(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        Rec(x);
    }
}
