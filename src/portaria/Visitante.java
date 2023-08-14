package portaria;

public class Visitante {

    static final int IDADE_MINIMA_ACESSO_IRRESTRITO = 18;

    String nome;
    int idade;

    void acessoLiberado() {
        if(idade < IDADE_MINIMA_ACESSO_IRRESTRITO) {
            System.out.printf("Visitante %s com %d anos.%n", nome, idade);
            System.out.println("Acesso não permitido para menores de 18 anos.");
        } else {
            System.out.printf("Visitante %s com %d anos.%n", nome, idade);
            System.out.println("Acesso liberado!");
        }
    }


}
