import java.util.Scanner;

public class ConverterMoeda {

    public static void converter(String moedaBase, String moedaTarget, ConsultarMoeda consulta, Scanner leitura) {
        double quantidade;
        double quantidadeConvertida;

        Moedas moedas = consulta.buscarMoeda(moedaBase, moedaTarget);
        System.out.println("Taxa de conversão de hoje\n1 "+moedaBase+ " = "+moedas.conversion_rate()+" "+moedaTarget);
        System.out.println("Insira o valor de " + moedaBase);
        quantidade = Double.parseDouble(leitura.nextLine());
        quantidadeConvertida = quantidade * moedas.conversion_rate();
        System.out.println(quantidade+" "+moedaBase +" = " +quantidadeConvertida + " " + moedas.target_code());
    }
}