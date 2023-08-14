package matematicautil;

public class CalculadoraArea {

    static final double PI = 3.14159265358979323846;

    public static double calcularAreaQuadrado(double ladoAreaQuadrado) {
        return  ladoAreaQuadrado * ladoAreaQuadrado;
    }

    public static double calcularAreaCirculo(double raio) {
        return (raio * raio) * CalculadoraArea.PI;
    }


}
