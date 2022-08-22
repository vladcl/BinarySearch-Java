import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] vector = new int[1000];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = i * 2;
        }

        System.out.println("Qual o numero desejado?");
        Scanner scanner = new Scanner(System.in);
        int searchNumber = scanner.nextInt();

        int count = 0;
        boolean findIt = false;
        int start = 0;
        int end = vector.length - 1;
        int mid;

        while (start <= end) {
            mid = (int) ((start + end) / 2);
            count++;

            if (vector[mid] == searchNumber) {
                findIt = true;
                break;
            } else if (vector[mid] < searchNumber) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println("Para este número eu fiz: " + count + " testes.");
        if (findIt == true) {
            System.out.println("Achei! :)");
        } else {
            System.out.println("Nao achei! :(");
        }
    }
}
