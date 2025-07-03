import java.util.Random;
import java.util.Scanner;

public class AdivinhacaoGame {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(101);
        int palpite = 0;
        int tentativas = 0;

        while (tentativas != 5) {
            System.out.println("Digite um número entre 0 e 100: ");
            palpite = leitura.nextInt();
            tentativas++;

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                break;
            } else if (palpite < numeroAleatorio) {
                System.out.println("O número digitado é menor que o número gerado.");
            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }
        }

        if (tentativas == 5 && palpite != numeroAleatorio) {
            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroAleatorio);
        }
    }
}
