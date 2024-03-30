import java.util.Scanner;

public class M5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введіть символ (+, -, *, /, %) ");
        String symbol = scanner.next();

        int result = symbol.equals("+") ? num1 + num2 :
                symbol.equals("-") ? num1 - num2 :
                        symbol.equals("*") ? num1 * num2 :
                                symbol.equals("/") ? (num2 != 0 ? num1 / num2 : 0) :
                                        symbol.equals("%") ? (num2 != 0 ? num1 % num2 : 0) :
                                                0;

        System.out.println("Результат: " + result);

        scanner.close();
    }
}
