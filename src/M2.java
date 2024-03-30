import java.util.Scanner;

public class M2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть довжини сторін трикутника");

        System.out.print("Перша: ");
        int side1 = scanner.nextInt();

        System.out.print("Друга: ");
        int side2 = scanner.nextInt();

        System.out.print("Третя: ");
        int side3 = scanner.nextInt();

        boolean isTriangle = isTriangle(side1, side2, side3);

        if (isTriangle) {
            System.out.println("Трикутник можливо побудувати");
        } else {
            System.out.println("Неможливо побудувати трикутник");
        }

        scanner.close();
    }
    public static boolean isTriangle(int side1, int side2, int side3) {

        return (side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2);
    }
}
