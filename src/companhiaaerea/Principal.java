package companhiaaerea;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aeronave aviaoGol = new Aeronave();

        System.out.println("=======================================================");
        System.out.print("Digite o total de assentos na aeronave: ");
        aviaoGol.totalAssentos = scanner.nextInt();

        // aviaoGol.ativo = false;
        // aviaoGol.desativar();
        aviaoGol.ativar();

        aviaoGol.reservarAssentos(10);

        System.out.println("-------------------------------------------------------");
        System.out.printf("Gol (%s): %d assentos disponíveis.%n",
                          aviaoGol.ativo ? "Ativo" : "Inativo",
                          aviaoGol.calcularAssentosDisponiveis());

        System.out.println("-------------------------------------------------------");
        Aeronave aviaoLatam = new Aeronave();
        System.out.print("Digite o total de assentos na aeronave: ");
        aviaoLatam.totalAssentos = scanner.nextInt();

        aviaoLatam.ativar();

        aviaoLatam.reservarAssentos(5);

        System.out.println("-------------------------------------------------------");
        System.out.printf("LATAM (%s): %d assentos disponíveis.%n",
                aviaoLatam.ativo ? "Ativo" : "Inativo",
                aviaoLatam.calcularAssentosDisponiveis());

        System.out.println("=======================================================");
        scanner.close();
    }

}
