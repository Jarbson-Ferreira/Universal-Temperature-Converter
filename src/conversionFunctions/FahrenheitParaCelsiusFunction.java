package conversionFunctions;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FahrenheitParaCelsiusFunction {

    // Função Conversor de: Fahrenheit --> Celsius
    public static void converterFahrenheitParaCelsius(Scanner sc, DecimalFormat df, DecimalFormat df2) {
        System.out.println("\nVocê Selecionou a conversão:  Celsius --> Kelvin");
        System.out.print("\nDigite o valor de graus Fahrenheit para a conversão: ");
        double valorFahrenheit = sc.nextDouble();
        double calculo = valorFahrenheit - 32;
        double resultado = calculo / 1.8;
        System.out.println("O valor de " + df2.format(valorFahrenheit) + "º graus Fahrenheit, em graus Celsius são: " + df.format(resultado) + "ºC");
    }
}
