package calculadoraimc;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var calculadoraIMC = new CalculadoraIMC();
        var cliente = new Paciente();

        System.out.println("-------------------------------------------------------------");
        System.out.printf("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("-----------------------------");
        System.out.printf("Digite o seu peso: ");
//        calculadoraIMC.peso = scanner.nextDouble();
        cliente.peso = scanner.nextDouble();
        System.out.printf("Digite a sua altura: ");
//        calculadoraIMC.altura = scanner.nextDouble();
        cliente.altura = scanner.nextDouble();


        var imc = calculadoraIMC.calcular(cliente);

        System.out.println("-----------------------------");
        if (imc.estaComObesidade()) {
            System.out.println("----------------------------------------------------");
            System.out.printf("Paciente %s%ncom peso de %.2fkg %ne altura de %.2fm %ne com o IMC: %.2f está com obesidade.%n", nome, imc.peso,
                    imc.altura, imc.resultado);
            System.out.println("----------------------------------------------------");
        } else if (imc.estaAbaixoDoPesoIdeal()) {
            System.out.println("----------------------------------------------------");
            System.out.printf("Paciente %s%ncom peso de %.2fkg %ne altura de %.2fm %ne com o IMC: %.2f está com obesidade.%n", nome, imc.peso,
                    imc.altura, imc.resultado);
            System.out.println("----------------------------------------------------");
        }


        scanner.close();
    }

}
