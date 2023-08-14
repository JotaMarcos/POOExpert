package concessionaria;

import java.sql.SQLOutput;

public class TesteInicializacao {

    public static void main(String[] args) {

       /* Carro meuCarro = new Carro();

        meuCarro.fabricante = "Honda";
        meuCarro.anoFabricacao = 2021;
        meuCarro.proprietario.nome = "Poliane";

        Pessoa propritearioAntigo = meuCarro.proprietario;


        meuCarro.proprietario = new Pessoa();


        System.out.println("Fabricante: " + meuCarro.fabricante);
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano de fabricação: " + meuCarro.anoFabricacao);
        System.out.println("Proprietário: " +  meuCarro.proprietario.nome);*/

//        meuCarro.proprietario.nome = "Poliane";
//        System.out.println("Nome: " + pessoa1.nome);

//        pessoa1.nome = "Poliane";
//        System.out.println(pessoa1.nome);

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João";

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Poliane";


        Carro meuCarro = new Carro();
        meuCarro.modelo = "HR-V";

        Carro seuCarro = new Carro();
        seuCarro.modelo = "X6";

        meuCarro.proprietario = pessoa1;
        seuCarro.proprietario = pessoa1;

        meuCarro.proprietario.nome = "Juquinha";


        System.out.println(meuCarro.proprietario.nome);
        System.out.println(seuCarro.proprietario.nome);




    }
}
