package folhapagamento;

public class FolhaPagamento {

    static final double PERCENTUAL_POR_QUANTIDADE_FILHOS = 0.10;

    Holerite calcularSalario(int quantidadeDeHorasNormaisTrabalhadas,
                             int quantidadeDeHorasExtrasTrabalhadas,
                             ContratoTrabalho contratoTrabalho) {

        Holerite holerite = new Holerite();
        holerite.funcionario = contratoTrabalho.funcionario;
        holerite.valorTotalHorasNormais = quantidadeDeHorasNormaisTrabalhadas
                                        * contratoTrabalho.valorDaHoraNormal;

        holerite.valorTotalHorasExtras =  quantidadeDeHorasExtrasTrabalhadas
                                        * contratoTrabalho.valorDaHoraExtra;

        double valorSubTotalDoSalarioAPagar = holerite.valorTotalHorasNormais
                                            + holerite.valorTotalHorasExtras;

        if(contratoTrabalho.possuiSalarioAdicionalPorFilhos()) {
            holerite.valorAdicionalPorFilhos = valorSubTotalDoSalarioAPagar
                                            * PERCENTUAL_POR_QUANTIDADE_FILHOS;
        }

        return holerite;
    }

}
