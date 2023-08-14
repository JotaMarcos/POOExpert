package concessionaria;

public class Principal {

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);

        Carro meuCarro = new Carro();
        System.out.println(
                "-----------------------------------------------------------------------------------------------------");

        System.out.print("Digite o Modelo: ");
        meuCarro.modelo = scanner.nextLine();
        System.out.print("Digite o Ano: ");
        meuCarro.anoFabricacao = scanner.nextInt();
        System.out.print("Digite a cor: ");
        meuCarro.cor = scanner.nextLine();
        meuCarro.cor = scanner.nextLine();
        System.out.print("Digite o Fabricante: ");
        meuCarro.fabricante= scanner.nextLine();
        System.out.print("Digite o nome do proprietário do veículo: ");
        meuCarro.proprietario.nome = scanner.nextLine();

        System.out.printf("O concessionaria.Carro de João Marcos é do modelo %s, do ano %d, com cor %s e o fabricante %s%n",
                meuCarro.modelo, meuCarro.anoFabricacao, meuCarro.cor, meuCarro.fabricante);

        System.out.println("-----------------------------------------------------------------------------------------------------");

        Carro seuCarro = new Carro();

        System.out.print("Digite o Modelo: ");
        seuCarro.modelo =scanner.nextLine();
        System.out.print("Digite o Ano: ");
        seuCarro.anoFabricacao = scanner.nextInt();
        System.out.print("Digite a cor: ");
        seuCarro.cor = scanner.nextLine();
        seuCarro.cor = scanner.nextLine();
        System.out.print("Digite o Fabricante: ");
        seuCarro.fabricante= scanner.nextLine();

        System.out.printf("O concessionaria.Carro de Poliane é do modelo %s, do ano %d, com cor %s e o fabricante %s%n",
                seuCarro.modelo, seuCarro.anoFabricacao, seuCarro.cor, seuCarro.fabricante);

        System.out.println("-----------------------------------------------------------------------------------------------------");

        Carro teuCarro = new Carro();
        System.out.print("Digite o Modelo: ");
        teuCarro.modelo =scanner.nextLine();
        System.out.print("Digite o Ano: ");
        teuCarro.anoFabricacao = scanner.nextInt();
        System.out.print("Digite a cor: ");
        teuCarro.cor = scanner.nextLine();
        teuCarro.cor = scanner.nextLine();
        System.out.print("Digite o Fabricante: ");
        teuCarro.fabricante= scanner.nextLine();

        System.out.printf("O concessionaria.Carro de João Marcos é do modelo %s, do ano %d, com cor %s e o fabricante %s%n",
                teuCarro.modelo, teuCarro.anoFabricacao, teuCarro.cor, teuCarro.fabricante);

        System.out.println("-----------------------------------------------------------------------------------------------------");

        scanner.close();
        */


        Carro meuCarro = new Carro();
        Pessoa minhaPessoa1 = new Pessoa();
        minhaPessoa1.nome = "João Marcos";
        minhaPessoa1.cpf = "111.222.333-44";
        minhaPessoa1.anoNascimento = 1985;

        meuCarro.anoFabricacao = 2013;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HR-V";
        meuCarro.precoCompra = 0;
        meuCarro.proprietario = minhaPessoa1;

//        meuCarro.proprietario = new Pessoa();
//        meuCarro.proprietario.nome = "João Marcos";
//        meuCarro.proprietario.cpf = "111.222.333-44";
//        meuCarro.proprietario.anoNascimento = 1985;

        /*System.out.println("--------------------------------");
        System.out.println("------ Carro João Marcos -------");
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
        System.out.printf("Fabricante: %s%n", meuCarro.fabricante);
        System.out.printf("Cor: %s%n", meuCarro.cor);
        System.out.printf("Proprietário do veículo é %s, portador do CPF nº.: %s  e nascido no ano de %d.%n",
                meuCarro.proprietario.nome, meuCarro.proprietario.cpf,  meuCarro.proprietario.anoNascimento);
        System.out.println("---------------------------------");*/

        Carro seuCarro = new Carro();
        Pessoa minhaPesso2 = new Pessoa();
        minhaPesso2.nome = "Poliane";
        minhaPesso2.cpf = "321.654.987-11";
        minhaPesso2.anoNascimento = 1988;

        seuCarro.anoFabricacao = 2022;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";
        seuCarro.precoCompra = 980000;
        seuCarro.proprietario = minhaPesso2;


        meuCarro.imprimirResumoDepreciacaCarro();
        seuCarro.imprimirResumoDepreciacaCarro();



        /*double valorRevendaMeuVeiculo = meuCarro.calcularValorRevenda();
        double valorRevendaSeuVeiculo = seuCarro.calcularValorRevenda();
        int tempoDeUsoMeuCarro = meuCarro.calcularTempoDeUsoEmAnos();
        int tempoDeUsoSeuCarro = seuCarro.calcularTempoDeUsoEmAnos();

        System.out.println("---------------------------------------------------");
        System.out.printf("Tempo de uso (anos): %d anos.%n", tempoDeUsoMeuCarro);
        System.out.printf("Valor de revenda: R$ %.2f%n", valorRevendaMeuVeiculo);
        System.out.println("---------------------------------------------------");

        System.out.println("---------------------------------------------------");
        System.out.printf("Tempo de uso (anos): %d anos.%n", tempoDeUsoSeuCarro);
        System.out.printf("Valor de revenda: R$ %.2f%n", valorRevendaSeuVeiculo);
        System.out.println("---------------------------------------------------");*/

       /* System.out.println("---------------------------------------------------");
        System.out.printf("Tempo de uso (anos): %d anos.%n",meuCarro.ANO_ATUAL - meuCarro.anoFabricacao);
        System.out.printf("Valor de revenda: R$ %.2f%n", meuCarro.calcularValorRevenda());
        System.out.println("---------------------------------------------------");

        System.out.println("---------------------------------------------------");
        System.out.printf("Tempo de uso (anos): %d anos.%n",seuCarro.ANO_ATUAL - seuCarro.anoFabricacao);
        System.out.printf("Valor de revenda: R$ %.2f%n", seuCarro.calcularValorRevenda());
        System.out.println("---------------------------------------------------");*/



        //        seuCarro.proprietario = new Pessoa();
//        seuCarro.proprietario.nome = "Poliane";
//        seuCarro.proprietario.cpf = "321.654.987-11";
//        seuCarro.proprietario.anoNascimento = 1988;

      /* System.out.println("--------------------------------");
        System.out.println("------- Carro Poliane ----------");
        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
        System.out.printf("Fabricante: %s%n", seuCarro.fabricante);
        System.out.printf("Cor: %s%n", seuCarro.cor);
        System.out.printf("Proprietário do veículo é %s, portador do CPF nº.: %s  e nascido no ano de %d.%n",
                seuCarro.proprietario.nome, seuCarro.proprietario.cpf, seuCarro.proprietario.anoNascimento);
        System.out.println("---------------------------------");*/

        /*
        Carro teuCarro = new Carro();
        Pessoa minhaPessoa3 = new Pessoa();
        minhaPessoa3.nome = "Ellen";
        minhaPessoa3.cpf = "999.888.333-22";
        minhaPessoa3.anoNascimento = 2006;

        teuCarro.anoFabricacao = 2023;
        teuCarro.cor = "Vermelho";
        teuCarro.fabricante = "Ferrari";
        teuCarro.modelo = "Coupe 812";
        teuCarro.proprietario = minhaPessoa3;*/

//        teuCarro.proprietario = new Pessoa();
//        teuCarro.proprietario.nome = "Ellen";
//        teuCarro.proprietario.cpf = "951.753.856-22";
//        teuCarro.proprietario.anoNascimento = 2006;

/*
        System.out.println("--------------------------------");
        System.out.println("--------- Carro Ellen ----------");
        System.out.printf("Modelo: %s%n", teuCarro.modelo);
        System.out.printf("Ano: %d%n", teuCarro.anoFabricacao);
        System.out.printf("Fabricante: %s%n", teuCarro.fabricante);
        System.out.printf("Cor: %s%n", teuCarro.cor);
        System.out.printf("Proprietário do veículo é %s, portador do CPF nº.: %s  e nascido no ano de %d.%n",
                teuCarro.proprietario.nome, teuCarro.proprietario.cpf, teuCarro.proprietario.anoNascimento);
        System.out.println("---------------------------------");*/


    }

}
