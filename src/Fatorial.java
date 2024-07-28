import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fatorial = 1;
        System.out.println("Digite um número inteiro para saber seu fatorial:");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println(fatorial);
    }
}
