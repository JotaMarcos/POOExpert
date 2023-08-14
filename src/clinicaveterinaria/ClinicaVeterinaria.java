package clinicaveterinaria;

public class ClinicaVeterinaria {

    public static void main(String[] args) {


        Cachorro cachorro1 = new Cachorro();
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Nome: " + (cachorro1.nome = "Lucky"));
        System.out.println("Raça: " + (cachorro1.raca = "Yorkshire"));
        System.out.println("Cor: " + (cachorro1.cor = "Preto com Marrom"));
        System.out.println("Tamanho do Pelo: " + (cachorro1.tamanhoPelo = "Médio"));
        System.out.println("Porte: " + (cachorro1.porte = "Pequeno"));
        System.out.println("Peso: " + (cachorro1.peso = 5.535));
        System.out.println("Idade: " + (cachorro1.idade = 4));
        System.out.println("Dono(a): " + (cachorro1.dono = "Poliane"));
        System.out.println("Moradia: " + (cachorro1.moradia = "Caminha quentinha e no ar condicionado"));
        System.out.println("Observações: " + (cachorro1.observacoes = "Alérgico a perfumes e cheiros de produtos fortes"));
        System.out.println("---------------------------------------------------------------------------");

        System.out.println();

        Cachorro cachorro2= new Cachorro();
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Nome: " + (cachorro2.nome = "Wandinha"));
        System.out.println("Raça: " + (cachorro2.raca = "Yorkshire"));
        System.out.println("Cor: " + (cachorro2.cor = "Preto com Branco e Marrom"));
        System.out.println("Tamanho do Pelo: " + (cachorro2.tamanhoPelo = "Médio"));
        System.out.println("Porte: " + (cachorro2.porte = "Pequeno"));
        System.out.println("Peso: " + (cachorro2.peso = 3.455));
        System.out.println("Idade: " + (cachorro2.idade = 2));
        System.out.println("Dono(a): " + (cachorro2.dono = "Ellen"));
        System.out.println("Moradia: " + (cachorro2.moradia = "Caminha, ar condicionado e bastante água com gelo"));
        System.out.println("Observações: " + (cachorro2.observacoes = "Come de tudo"));
        System.out.println("---------------------------------------------------------------------------");


    }
}
