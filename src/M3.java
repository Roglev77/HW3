import java.util.Scanner;

public class M3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть два числа");
        System.out.print("Число 1 - ");
        int num1 = scanner.nextInt();
        System.out.print("Число 2 - ");
        int num2 = scanner.nextInt();

        int result = (num1 > num2) ? (num1 - num2) : (num2 - num1);

        System.out.println("Результат: " + result);

        scanner.close();
    }
}