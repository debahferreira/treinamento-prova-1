public class Desconto {
    public static void main(String[] args) {
        double precoOriginal = 122.50;
        double percentualDesconto = 20;
        double valorDesconto = (percentualDesconto/100) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;
        System.out.println(novoPreco);
    }
}
