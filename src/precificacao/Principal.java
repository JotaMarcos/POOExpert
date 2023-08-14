package precificacao;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Produto novoProduto = new Produto();

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.print("Digite o custo de embalagem: R$ ");
        Produto.custoEmbalagem = scanner.nextDouble();
        System.out.print("Digite o preço de custo: R$ ");
        novoProduto.alterarPrecoCusto(scanner.nextDouble());
//        System.out.print("Digite o valor do preço de custo: R$ ");
//        novoProduto.precoCusto = scanner.nextDouble();
        System.out.print("Digite o percentual da margem de lucro: ");
        double percentualLucro = scanner.nextDouble();

        System.out.println("------------------------------------------------------");
        ServicoDePreficacao servicoDePreficacao = new ServicoDePreficacao();
        servicoDePreficacao.definirPrecoVenda(novoProduto, percentualLucro);

        System.out.printf("Preço de Custo: R$ %.2f%n", novoProduto.precoCusto);
        System.out.printf("Preço de venda: R$ %.2f%n", novoProduto.precoVenda);

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        scanner.close();

    }

}
