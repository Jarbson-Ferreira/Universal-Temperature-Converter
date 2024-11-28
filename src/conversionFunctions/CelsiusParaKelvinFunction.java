package conversionFunctions;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CelsiusParaKelvinFunction {
    // Função Conversor de: Celsius --> Kelvin
    public static void converterCelsiusParaKelvin(Scanner sc, DecimalFormat df, DecimalFormat df2) {
        System.out.println("\nVocê Selecionou a conversão:  Celsius --> Kelvin");
        System.out.print("\nDigite o valor de graus Celsius para a conversão: ");
        double valorCelsius = sc.nextDouble();
        double resultado = valorCelsius + 273.15;
        System.out.println("O valor de " + df2.format(valorCelsius) + "º graus Celsius, em graus Kelvin são: " + df.format(resultado) + "ºK");
    }
}
