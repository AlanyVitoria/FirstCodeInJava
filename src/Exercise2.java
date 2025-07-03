public class Exercise2 {
    public static void main (String[] args) {
        double celsius = 28;
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println(fahrenheit);

        int fahrenInt = (int) fahrenheit;
        System.out.println(fahrenInt);

        double neusaNote = 7.1;
        double alanyNote = 9.7;
        double averageNote = (neusaNote + alanyNote)/ 2;
        System.out.println(averageNote);

        int roundNote = (int) averageNote;
        System.out.println(roundNote);

        String message = "A inicial do meu nome é ";
        char letter = 'A';
        System.out.println(message+letter);

        double productPrice = 7.50;
        int quantity = 2;
        System.out.println(productPrice * quantity);

        double valorInDollars = 5.23;
        System.out.println("O valor em reais é de R$" + (valorInDollars * 4.94));

        double originPrice = 5.20;
        double percentageDiscount = 10;
        double discountValor = originPrice * (percentageDiscount/ 100);
        double valorWithDiscount = originPrice - discountValor;
        System.out.println(valorWithDiscount);
    }
}
