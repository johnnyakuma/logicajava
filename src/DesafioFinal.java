import java.util.Scanner;

public class DesafioFinal {
    public static void main(String[] args) {
    String nome = "Johnny Barbosa Macedo";
    String tipoConta = "Corrente";
    double saldo = 2500.0;
    int opcao = 0;

        System.out.println("*********************");
        System.out.println("\nNome do Cliente: "+nome);
        System.out.println("Tipo de Conta: "+ tipoConta);
        System.out.println("Saldo atual: "+ saldo);
        System.out.println("\n*********************");

        String menu = """
                **Digite sua opção**
                
                1 - Consultar saldo 
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                
                Digite uma opção:
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();
            if(opcao == 1){
                System.out.println("Seu saldo: "+saldo+"\n");
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir? ");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Não há saldo para realizar transferencia!");
                }else {
                    saldo -= valor;
                    System.out.println("Novo saldo: "+ saldo);
                }
            } else if (opcao == 3) {
                System.out.println("valor recebido");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: "+ saldo);
            } else if (opcao != 4) {
                System.out.println("opção invalida");
            }
        }
        System.out.println("Operação finalizada :) ");

    }
}