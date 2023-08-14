package matematicautil;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("#################################################");
        System.out.print("Digite a área do quadrado: ");
        double areaQuadrado = scanner.nextDouble();
        areaQuadrado = CalculadoraArea.calcularAreaQuadrado(areaQuadrado);
        System.out.print("Digite a área do círculo: ");
        double areaCirculo = scanner.nextDouble();
        areaCirculo = CalculadoraArea.calcularAreaCirculo(areaCirculo);

        System.out.printf("Área do quadrado: %.2f%n", areaQuadrado);
        System.out.printf("Área do círculo: %.2f%n", areaCirculo);


        System.out.println("#################################################");
        scanner.close();
    }


}
