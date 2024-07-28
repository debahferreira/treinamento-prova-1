import java.util.Scanner;

public class Estudos {
    public static void main(String[] args) {
        System.out.println("Esta é a classe para fazer anotações de estudos.\n");

        //O operador de pré-incremento (++variavel) aumenta o valor da variável em 1 antes de usar a variável em uma expressão:
        int num1 = 5;
        int resultado1 = ++num1; //num é incrementado para 6 e depois atribuído a resultado
        System.out.println(num1); // imprime 6
        System.out.println(resultado1); // imprime 6

        //Já o operador de pós-incremento (variavel++) aumenta o valor da variável em 1 depois de usar a variável em uma expressão:
        int num2 = 5;
        int resultado2 = num2++; //num é atribuído primeiramente à variável resultado e depois incrementado para 6
        System.out.println(num2); // imprime 6
        System.out.println(resultado2); // imprime 5

        //Nomes de constantes devem ser totalmente em letras maiúsculas, separadas por underline: MINHA_CONSTANTE;

        //equals para comparar strings (não ==):
        String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }

        //format:
        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

        int aulas = 4;
        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome, aulas);
        System.out.println(mensagem);

        //switch case:
        int dia = 3;
        String nomeDia;
        switch (dia) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda-feira";
                break;
            case 3:
                nomeDia = "terça-feira";
                break;
            case 4:
                nomeDia = "quarta-feira";
                break;
            case 5:
                nomeDia = "quinta-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }
        System.out.println("O dia " + dia + " é " + nomeDia);

        //Scanner (botar antes: import java.util.Scanner;):
        Scanner scanner = new Scanner(System.in);
        System.out.println("A palavra é:");
        String palavra = scanner.nextLine();

        //sinal == para variaveis
        Filme filme1 = new Filme("Avatar", 2009);
        Filme filme2 = new Filme("Avatar", 2009);

        if (filme1 == filme2) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }
        //a saída no console será: "Diferentes". Embora os dois objetos tenham as mesmas informações na memória, a comparação com == verifica se as referências são iguais, ou seja, se apontam para o mesmo objeto na memória
    }
}
