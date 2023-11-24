import java.text.DecimalFormat;


public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        String descricaoAnoDeLancamento = "Ano de lançamento: ";
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double media = (9.8+6.1+9.0) /3;
        DecimalFormat formato = new DecimalFormat("#.##");
        String mediaFormatada = formato.format(media);

        System.out.println(descricaoAnoDeLancamento + anoDeLancamento);
        System.out.println(mediaFormatada);

        String sinopse;
        sinopse = """
                Filme Top Gun         
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento      
                """ + anoDeLancamento;
        System.out.println(sinopse);

       int classificacao= (int) (media /2);
        System.out.println(classificacao);
    }
}

