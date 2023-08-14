package folhapagamento;

public class Holerite {

    Funcionario funcionario = new Funcionario();
    double valorTotalHorasNormais;
    double valorTotalHorasExtras;
    double valorAdicionalPorFilhos;


    double valorTotalDoSalarioAPagar () {
        return valorTotalHorasNormais + valorTotalHorasExtras + valorAdicionalPorFilhos;
    }

    void imprimir() {

        System.out.println("=====================================  H O L E R I T E  ======================================");
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.printf("Nome do funcionário: %s%n", funcionario.nome);
        System.out.printf("Cargo: %s%n", funcionario.cargo);
        System.out.printf("Quantidade de filhos: %d%n", funcionario.quantidadeDeFilhos);
        System.out.printf("Valor total das horas normais: %.2f%n", valorTotalHorasNormais);
        System.out.printf("Valor total das horas extras: %.2f%n", valorTotalHorasExtras);
        System.out.printf("Valor total do salário a pagar: RS %.2f%n", valorTotalDoSalarioAPagar());
        System.out.println("----------------------------------------------------------------------------------------------");

    }



}
