import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Filme filme = new Filme();
        int opcao;

        do {
            System.out.println("\n===== MENU STREAMING =====");
            System.out.println("1 - Cadastrar título");
            System.out.println("2 - Exibir detalhes do título");
            System.out.println("3 - Avaliar título");
            System.out.println("4 - Exibir média das avaliações");
            System.out.println("5 - Encerrar");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do filme: ");
                    filme.nome = sc.nextLine();
                    System.out.print("Digite o gênero: ");
                    filme.genero = sc.nextLine();
                    System.out.print("Digite o ano de lançamento: ");
                    filme.ano = sc.nextInt();
                    System.out.print("Digite a duração (em minutos): ");
                    filme.duracao = sc.nextInt();
                    System.out.println("Filme cadastrado com sucesso!");
                    break;

                case 2:
                    filme.exibirDetalhes();
                    break;

                case 3:
                    System.out.print("Digite uma nota (0 a 10): ");
                    int nota = sc.nextInt();
                    filme.avaliar(nota);
                    break;

                case 4:
                    double media = filme.calcularMediaAvaliacoes();
                    if (media == 0.0) {
                        System.out.println("Ainda não há avaliações.");
                    } else {
                        System.out.println("Média das avaliações: " + media);
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);

        sc.close();
    }
}
