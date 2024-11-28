package conversionFunctions;

import java.text.DecimalFormat;
import java.util.Scanner;

public class KelvinParaFahrenheitFunction {

    // Função Conversor de: Kelvin --> Fahrenheit
    public static void converterKelvinParaFahrenheit(Scanner sc, DecimalFormat df, DecimalFormat df2) {
        System.out.println("\nVocê Selecionou a conversão:  Fahrenheit");
        System.out.print("\nDigite o valor de graus Kelvin para a conversão: ");
        double valorFahrenheit = sc.nextDouble();
        double calculo = valorFahrenheit * 1.8;
        double resultado = calculo - 459.67;
        System.out.println("O valor de " + df2.format(valorFahrenheit) + "º graus Kelvin, em graus Fahrenheit são: " + df.format(resultado) + "ºF");
    }
}
