import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int number = leitor.nextInt();

        if (number > 0) {
            System.out.println(number + " é um número positivo!");
        } else {
            System.out.println(number + " é um número negativo!");
        }


        System.out.print("Digite o primeiro número: ");
        int numero1 = leitor.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = leitor.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os números são iguais");
        } else if (numero1 > numero2) {
            System.out.println("O primeiro número é maior");
        } else {
            System.out.println("O segundo número é maior");
        }


        int escolha = 0;

        while (escolha != 3) {
            System.out.println("-----Menu-----");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = leitor.nextInt();

            if (escolha == 1) {
                System.out.print("Digite o lado do quadrado: ");
                double lado = leitor.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaQuadrado);
            } else if (escolha == 2) {
                System.out.print("Digite o raio do círculo: ");
                double raio = leitor.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("Área do círculo: " + areaCirculo);
            } else if (escolha == 3) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }


        System.out.print("Digite um número: ");
        int numero = leitor.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }


        System.out.print("Digite um número inteiro: ");
        int numeroInt = leitor.nextInt();

        if (numeroInt % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }


        System.out.print("Digite um número: ");
        int numeroFator = leitor.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numeroFator; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numeroFator + " é: " + fatorial);
    }
}
