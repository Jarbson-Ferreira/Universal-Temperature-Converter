package conversionFunctions;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FahrenheitParaKelvinFunction {

    // Função Conversor de: Fahrenheit --> Kelvin
    public static void converterFahrenheitParaKelvin(Scanner sc, DecimalFormat df, DecimalFormat df2) {
        System.out.println("\nVocê Selecionou a conversão:  Celsius --> Kelvin");
        System.out.print("\nDigite o valor de graus Fahrenheit para a conversão: ");
        double valorFahrenheit = sc.nextDouble();
        double calculo = valorFahrenheit - 32;
        double calculo2 = calculo / 1.8;
        double resultado = calculo2 + 273.15;
        System.out.println("O valor de " + df2.format(valorFahrenheit) + "º graus Fahrenheit, em graus Kelvin são: " + df.format(resultado) + "ºK");
    }
}
