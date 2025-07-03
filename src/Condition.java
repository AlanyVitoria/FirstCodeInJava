public class Condition {
    public static void main(String[] args) {
        int anoDeLancamento = 2014;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 7.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2023) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano/*== true*/ && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado!");
        } else {
            System.out.println("É preciso assinar o plus para assistir à esse filme");
        }
    }
}
