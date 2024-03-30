import java.util.Scanner;


public class M4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть число: ");

        int number = scanner.nextInt();
        String result;

        if (number == 1) {
            result = "Понеділок";
        } else if (number == 2) {
            result = "Вівторок";
        } else if (number == 3) {
            result = "Середа";
        } else if (number == 4) {
            result = "Четвер";
        } else if (number == 5) {
            result = "П'ятниця";
        } else if (number == 6) {
            result = "Субота";
        } else if (number == 7) {
            result = "Неділя";
        } else {
            result = "Краще б сьогодні була п'ятниця";
        }
        System.out.println("Результат: " + result);

        scanner.close();

    }
}