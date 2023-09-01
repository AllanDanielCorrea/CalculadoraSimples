import java.util.Scanner;

class CalculadoraSimples {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Coloque Numero1: ");
        int number1 = scanner.nextInt();

        System.out.print("Coloque Numero2: ");
        int number2 = scanner.nextInt();

            System.out.println("Escolha entre! ");
            System.out.println("1 - add! ");
            System.out.println("2 - subtract! ");
            System.out.println("3 - divide! ");
            System.out.println("4 - multiple! ");

        System.out.print("Escolha a operação! ");
        int choice = scanner.nextInt();

            System.out.println("Suas escolhas! ");
            System.out.println("Numero1! " + number1);
            System.out.println("Numero2! " + number2);
            System.out.println("Operação! " + choice);

            performOperationUsingNestedSwitch(choice, number1, number2);
    }

    private static void performOperationUsingNestedSwitch(int choice, int number1, int number2) {
        switch (choice) {
            case 1 -> System.out.println("O resultado é! " + (number1 + number2));
            case 2 -> System.out.println("O resultado é! " + (number1 - number2));
            case 3 -> System.out.println("O resultado é! " + (number1 / number2));
            case 4 -> System.out.println("O resultado é! " + (number1 * number2));
            default -> System.out.println("Operação invalida!");
        }

    }

}
