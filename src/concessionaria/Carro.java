package concessionaria;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Carro {

    Date date = new Date();

    // LocalDate localDate = LocalDate.now();
    LocalDate localDate = date.toInstant()
            .atZone(ZoneId.systemDefault())
            .toLocalDate();

    final int ANO_ATUAL = localDate.getYear();
    static final int VIDA_UTIL_DO_CARRO_EM_ANOS = 20;
    static final double PERCENTUAL_DO_IPVA = 0.04;

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra;
    Pessoa proprietario;



    void imprimirResumoDepreciacaCarro() {

        double valorRevendaVeiculo = calcularValorRevenda();
        int tempoDeUsoCarro = calcularTempoDeUsoEmAnos();
        double valorIPVA = calcularIPVA();

        if (precoCompra <= 0) {
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("Carro com preço de compra zerado. " +
                    "Não foi possível imprimir resumo de depreciação.");
            System.out.println("-----------------------------------------------------------------------------------");
            return;
        }

        System.out.println("---------------------------------------------------");
        System.out.printf("Tempo de uso (anos): %d anos.%n", tempoDeUsoCarro);
        System.out.printf("Valor de revenda: R$ %.2f%n", valorRevendaVeiculo);
        System.out.printf("Valor do IPVA: R$ %.2f%n", valorIPVA);
        System.out.println("---------------------------------------------------");

    }

    double calcularIPVA() {

        int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();

        if(tempoDeUsoEmAnos >= 10) {
            return 0;
        }

        return calcularValorRevenda() * PERCENTUAL_DO_IPVA;
    }

    int calcularTempoDeUsoEmAnos() {

        return ANO_ATUAL - anoFabricacao;
    }

    double calcularValorRevenda() {
    int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();


        double valorRevenda = (precoCompra / VIDA_UTIL_DO_CARRO_EM_ANOS)
                        * (VIDA_UTIL_DO_CARRO_EM_ANOS - tempoDeUsoEmAnos);

        if(valorRevenda < 0){
            valorRevenda = 0;
        }

        return valorRevenda;
    }


}
