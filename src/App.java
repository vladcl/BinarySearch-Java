import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] vetor = new int[1000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 2;
        }

        System.out.println("Qual o numero desejado?");
        Scanner scanner = new Scanner(System.in);
        int searchNumber = scanner.nextInt();

        int count = 0;
        boolean findIt = false;
        int start = 0;
        int end = vetor.length - 1;
        int mid;

        while (start <= end) {
            mid = (int) ((start + end) / 2);
            count++;

            if (vetor[mid] == searchNumber) {
                findIt = true;
                break;
            } else if (vetor[mid] < searchNumber) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println("Para este vetor foram feitos: " + count + " testes.");
        if (findIt == true) {
            System.out.println("Achei! :)");
        } else {
            System.out.println("Nao achei! :(");
        }
    }
}
