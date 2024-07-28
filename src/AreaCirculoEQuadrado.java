import java.util.Scanner;

public class AreaCirculoEQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menu = """
                Digite o número da opção que deseja:
                
                1. Calcular área do quadrado
                2. Calcular área do círculo
                """;
        System.out.println(menu);
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("Informe o comprimento do lado do quadrado:");
            int lado = scanner.nextInt();
            int area = lado * lado;
            System.out.println("A área do quadrado é " + area);
        } else if (opcao == 2) {
            System.out.println("Informe o comprimento do raio do círculo:");
            int raio = scanner.nextInt();
            double area = 3.14 * raio * raio;
            System.out.println("A área do círculo é " + area);
        } else {
            System.out.println("Opção inválida.");
        }
    }
}
