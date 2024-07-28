import java.util.Scanner;

public class ComparacaoDoisNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num1 = scanner.nextInt();
        System.out.println("Digite outro número:");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Os números digitados são iguais!");
        } else {
            System.out.println("Os números são diferentes!");
            if (num1 > num2) {
                System.out.println("O primeiro número digitado é maior.");
            } else {
                System.out.println("O segundo número digitado é maior.");
            }
        }
    }
}
