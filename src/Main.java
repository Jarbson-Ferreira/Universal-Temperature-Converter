import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        DecimalFormat df = new DecimalFormat("0.##");
        DecimalFormat df2 = new DecimalFormat("0.##");

        System.out.println("Seja bem vindo ao Conversor de Temperatura\nDesenvolvido por: Jarbson Ferreira");
        System.out.println("Selecione a conversão que deseja abaixo");
        System.out.println("1: Celsius --> Fahrenheit");
        System.out.println("2: Celsius --> Kelvin");
        System.out.println("3: Fahrenheit --> Celsius");
        System.out.println("4: Fahrenheit --> Kelvin");
        System.out.println("5: Kelvin --> Celsius");
        System.out.println("6: Kelvin --> Fahrenheit");
        System.out.print("Selecione um número de 1 a 6: ");
        int selecaoDeConversao = sc.nextInt();

        switch (selecaoDeConversao) {
            case 1:
                conversionFunctions.CelsiusParaFarenheitFunction.converterCelsiusParaFahrenheit(sc, df, df2);
                break;
            case 2:
                conversionFunctions.CelsiusParaKelvinFunction.converterCelsiusParaKelvin(sc, df, df2);
                break;
            case 3:
                conversionFunctions.FahrenheitParaCelsiusFunction.converterFahrenheitParaCelsius(sc, df, df2);
                break;
            case 4:
                conversionFunctions.FahrenheitParaKelvinFunction.converterFahrenheitParaKelvin(sc, df, df2);
                break;
            case 5:
                conversionFunctions.KelvinParaCelsiusFunction.converterKelvinParaCelsius(sc, df, df2);
                break;
            case 6:
                conversionFunctions.KelvinParaFahrenheitFunction.converterKelvinParaFahrenheit(sc, df, df2);
                break;
            default:
                System.out.println("Opção inválida. Por favor, selecione um número entre 1 e 6.");
        }
    }
}