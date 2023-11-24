import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura =new Scanner(System.in);
        System.out.println("Qual seu filme favorito? ");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento? ");
        int lancamento = leitura.nextInt();

        System.out.println("Qual a avaliação do filme?");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(lancamento);
        System.out.println(avaliacao);
    }
}
