import java.util.Scanner;

public class LeitorString {
    public String lerString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma Palavra ou uma Frase: ");
        String texto = scanner.nextLine();
        scanner.close();
        return texto;
    }
}
