import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class M1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Я тестую чудово. Що ще потрібно?");
        String string1 = scan.next("Я");
        String string2 = scan.next("тестую");
        String string3 = scan.next("чудово.");
        String string4 = scan.next(" Що ще потрібно?");
        System.out.println(string1 + string2 + string3 + string4);
    }

}