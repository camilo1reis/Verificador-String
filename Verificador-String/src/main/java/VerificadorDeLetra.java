public class VerificadorDeLetra {
    public static void main(String[] args) {
        LeitorString leitor = new LeitorString();

        String texto = leitor.lerString();

        ContadorLetraA contador = new ContadorLetraA(texto);
        int ocorrencias = contador.contarOcorrencias();

        contador.exibirResultado(ocorrencias);
    }
}
