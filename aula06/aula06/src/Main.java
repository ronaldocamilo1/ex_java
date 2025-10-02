import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario f = new Funcionario();

        // Entrada de dados
        System.out.print("Digite a matrícula: ");
        f.matricula = sc.nextInt();
        sc.nextLine(); // consumir quebra de linha

        System.out.print("Digite o nome: ");
        f.nome = sc.nextLine();

        System.out.print("Digite o salário bruto: ");
        f.salarioBruto = sc.nextDouble();

        // Exibir contracheque
        f.exibirContracheque();

        sc.close();
    }
}