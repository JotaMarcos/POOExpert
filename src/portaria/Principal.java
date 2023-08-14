package portaria;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        var novovisitante = new Visitante();
        System.out.print("Digite o nome do visitante: ");
        novovisitante.nome = scanner.nextLine();
        System.out.print("Digite a idade do visitante: ");
        novovisitante.idade = scanner.nextInt();
        System.out.print("Digite o tempo de acesso: ");
        int tempoAcesso = scanner.nextInt();

        System.out.println("--------------------------------------------------");

        novovisitante.acessoLiberado();

        var cadastroPortaria = new CadastroPortaria();
//        cadastroPortaria.cadastrar(novovisitante, tempoAcesso);
        int resultado = cadastroPortaria.cadastrar(novovisitante, tempoAcesso);


        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        scanner.close();

    }

}
