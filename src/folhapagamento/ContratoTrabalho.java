package folhapagamento;

public class ContratoTrabalho {

    Funcionario funcionario;
    double valorDaHoraNormal;
    double valorDaHoraExtra;

    boolean possuiSalarioAdicionalPorFilhos() {
        return funcionario.possuiFilho();
    }

}
