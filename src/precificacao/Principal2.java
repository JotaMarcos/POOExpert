package precificacao;

import java.util.Scanner;

public class Principal2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

//        System.out.print("Digite o custo da embalagem por produto: R$ ");
//        Produto.custoEmbalagem = scanner.nextDouble();

        Produto.alterarCustoEmbalagem(12);

        Produto.imprimirCustoEmbalagem();

        scanner.close();
    }

}
