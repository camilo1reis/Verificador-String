import java.util.Scanner;

public class LeitorString {
    public String lerString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma Palavra: ");
        String texto = scanner.nextLine();
        scanner.close();
        return texto;
    }
}
