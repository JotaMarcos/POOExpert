package folhapagamento;

import java.util.Scanner;

public class PagamentoPrincipal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        FolhaPagamento pagamento = new FolhaPagamento();
        Funcionario funcionario = new Funcionario();
        Holerite holerite = new Holerite();
        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.funcionario = funcionario;

        System.out.println("==============================================================================");
        System.out.print("Digite o nome do Funcionário: ");
        funcionario.nome= scanner.nextLine();
        System.out.print("Digite o cargo do funcionário: ");
        funcionario.cargo = scanner.nextLine();
        System.out.print("Digite a quantidade de filhos: ");
        funcionario.quantidadeDeFilhos = scanner.nextInt();
        System.out.print("Digite a quantidade de horas normais trabalhadas: ");
        int quantidadeDeHorasNormaisTrabalhadas = scanner.nextInt();
        System.out.print("Digite a quantidade de horas extras trabalhadas: ");
        int quantidadeDeHorasExtrasTrabalhadas = scanner.nextInt();
        System.out.print("Digite o valor da hora normal: R$ ");
        contratoTrabalho.valorDaHoraNormal = scanner.nextDouble();
        System.out.print("Digite o valor da hora extra: R$ ");
        contratoTrabalho.valorDaHoraExtra = scanner.nextDouble();
        System.out.println("==============================================================================");

        Holerite salarioDevido = pagamento.calcularSalario(quantidadeDeHorasNormaisTrabalhadas, quantidadeDeHorasExtrasTrabalhadas, contratoTrabalho);
        salarioDevido.imprimir();

        /*System.out.println("----------------------------------------------------------------------------------------------");
        System.out.printf("O funcionario %s%n com o cargo de %s%n possui a quantidade de %d filhos%ne possui a quantidade de horas normais " +
                        "trabalhadas: " +
                        "%d%n" +
                        "e a quantidade de horas extras trabalhadas: %d%ne o valor da hora normal: R$ %.2f%n" +
                        "e o valor da hora extra: R$ %.2f%ncom o valor do Salário devido de R$ %.2f%n",
                    nome, cargo, funcionario.quantidadeDeFilhos, funcionario.quantidadeDeHorasNormaisTrabalhadas,
                funcionario.quantidadeDeHorasExtrasTrabalhadas, contratoTrabalho.valorDaHoraNormal,
                contratoTrabalho.valorDaHoraExtra, salarioDevido);
        System.out.println("----------------------------------------------------------------------------------------------");*/

        scanner.close();

    }

}
