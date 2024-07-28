import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println(numero + " é positivo!");
        } else if (numero < 0) {
            System.out.println(numero + " é negativo!");
        } else if (numero == 0) {
            System.out.println(numero + " não é positivo, nem negativo!");
        } else {
            System.out.println("Valor inválido.");
        }
    }
}
