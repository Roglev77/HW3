import java.util.Scanner;

public class M6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Оберіть програму ");
        System.out.println("IntelliJ IDEA");
        System.out.println("Git");
        System.out.println("Java");
        String programChoice = scanner.next();

        System.out.println("Оберіть ОС ");
        System.out.println("Linux");
        System.out.println("MacOS");
        System.out.println("Windows");
        String osChoice = scanner.next();

        String program = "";
        String link = "";

        switch (programChoice) {
            case "IntelliJ IDEA":
                program = "IntelliJ IDEA";
                switch (osChoice) {
                    case "Linux":
                        link = "https://www.jetbrains.com/idea/download/#linux";
                        break;
                    case "MacOS":
                        link = "https://www.jetbrains.com/idea/download/#macos";
                        break;
                    case "Windows":
                        link = "https://www.jetbrains.com/idea/download/#windows";
                        break;
                    default:
                        System.out.println("Така ОС не існує");
                        return;
                }
                break;
            case "Git":
                program = "Git";
                switch (osChoice) {
                    case "Linux":
                        link = "https://git-scm.com/download/linux";
                        break;
                    case "MacOS":
                        link = "https://git-scm.com/download/mac";
                        break;
                    case "Windows":
                        link = "https://git-scm.com/download/win";
                        break;
                    default:
                        System.out.println("Така ОС не існує");
                        return;
                }
                break;
            case "Java":
                program = "Java";
                switch (osChoice) {
                    case "Linux":
                        link = "https://www.oracle.com/java/technologies/downloads/#jdk22-linux";
                        break;
                    case "MacOS":
                        link = "https://www.oracle.com/java/technologies/downloads/#jdk22-mac";
                        break;
                    case "Windows":
                        link = "https://www.oracle.com/java/technologies/downloads/#jdk22-windows";
                        break;
                    default:
                        System.out.println("Така ОС не існує");
                        return;
                }
                break;
            default:
                System.out.println("Така програма не існує");
                return;
        }

        System.out.println("Ви можете завантажити " + program + " для вашої ОС за посиланням: " + link);

        scanner.close();
    }
}