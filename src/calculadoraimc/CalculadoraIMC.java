package calculadoraimc;
public class CalculadoraIMC {

    IndiceMassaCorporal calcular(Paciente paciente) {
        var imc = new IndiceMassaCorporal();
        imc.resultado = paciente.peso / (paciente.altura * paciente.altura);
        imc.peso = paciente.peso;
        imc.altura = paciente.altura;

        return imc;
    }

}
