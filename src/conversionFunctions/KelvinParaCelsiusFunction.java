package conversionFunctions;

import java.text.DecimalFormat;
import java.util.Scanner;

public class KelvinParaCelsiusFunction {

    // Função Conversor de: Kelvin --> Celsius
    public static void converterKelvinParaCelsius(Scanner sc, DecimalFormat df, DecimalFormat df2) {
        System.out.println("\nVocê Selecionou a conversão:  Kelvin --> Celsius");
        System.out.print("\nDigite o valor de graus Kelvin para a conversão: ");
        double valorKelvin = sc.nextDouble();
        double resultado = valorKelvin - 273.15;
        System.out.println("O valor de " + df2.format(valorKelvin) + "º graus Kelvin, em graus Celsius são: " + df.format(resultado) + "ºC");
    }
}
