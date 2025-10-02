public class Filme {
    // Atributos
    String nome;
    String genero;
    int ano;
    int duracao; // em minutos
    int somaNotas = 0;
    int qtdAvaliacoes = 0;

    // Método para exibir detalhes do filme
    public void exibirDetalhes() {
        System.out.println("\n===== DETALHES DO FILME =====");
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano: " + ano);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("================================");
    }

    // Método para avaliar o filme
    public void avaliar(int nota) {
        if (nota >= 0 && nota <= 10) {
            somaNotas += nota;
            qtdAvaliacoes++;
            System.out.println("Avaliação registrada com sucesso!");
        } else {
            System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
        }
    }

    // Método para calcular média
    public double calcularMediaAvaliacoes() {
        if (qtdAvaliacoes == 0) {
            return 0.0;
        }
        return (double) somaNotas / qtdAvaliacoes;
    }
}
