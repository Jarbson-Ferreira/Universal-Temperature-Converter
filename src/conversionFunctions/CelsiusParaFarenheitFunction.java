package conversionFunctions;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CelsiusParaFarenheitFunction {
    // Função Conversor de: Celsius --> Fahrenheit
    public static void converterCelsiusParaFahrenheit(Scanner sc, DecimalFormat df, DecimalFormat df2) {
        System.out.println("\nVocê Selecionou a conversão: Celsius --> Fahrenheit");
        System.out.print("\nDigite o valor de graus Celsius para a conversão: ");
        double valorCelsius = sc.nextDouble();
        double resultado = valorCelsius * 1.8 + 32;
        System.out.println("O valor de " + df2.format(valorCelsius) + "º graus Celsius, em graus Fahrenheit são: " + df.format(resultado) + "ºF");
    }
}
