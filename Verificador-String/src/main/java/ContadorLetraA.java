public class ContadorLetraA {
    private String texto;

    public ContadorLetraA(String texto) {
        this.texto = texto;
    }

    public int contarOcorrencias() {
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            if (caractere == 'a' || caractere == 'A') {
                contador++;
            }
        }

        return contador;
    }

    public void exibirResultado(int ocorrencias) {
        if (ocorrencias > 0) {
            System.out.println("A letra 'a' aparece " + ocorrencias + " vez(es) na palavra.");
        } else {
            System.out.println("A letra 'a' não aparece na palavra.");
        }
    }
}
