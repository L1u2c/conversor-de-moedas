import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultarMoeda consulta = new ConsultarMoeda();

        int opcao=0;
        while (opcao != 7){

            System.out.println("****************************************");
            System.out.println("Seja bem vindo/a ao Conversor de Moeda: ");
            System.out.println("\n1) Real para Dólar");
            System.out.println("2) Dólar para Real");
            System.out.println("3) Real para Euro");
            System.out.println("4) Euro para Real");
            System.out.println("5) Real para Libra Esterlina");
            System.out.println("6) Libra Esterlina para Real");
            System.out.println("7) Sair");
            System.out.println("Escolha uma opção válida: ");
            System.out.println("****************************************");
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    ConverterMoeda.converter("BRL", "USD", consulta, leitura);
                    break;
                case 2:
                    ConverterMoeda.converter("USD", "BRL", consulta, leitura);
                    break;
                case 3:
                    ConverterMoeda.converter("BRL", "EUR", consulta, leitura);
                    break;
                case 4:
                    ConverterMoeda.converter("EUR", "BRL", consulta, leitura);
                    break;
                case 5:
                    ConverterMoeda.converter("BRL", "GBP", consulta, leitura);
                    break;
                case 6:
                    ConverterMoeda.converter("GBP", "BRL", consulta, leitura);
                    break;
                case 7:
                    System.out.println("Sair...");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }


}
