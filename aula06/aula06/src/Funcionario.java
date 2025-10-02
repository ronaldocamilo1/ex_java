public class Funcionario {
    // Atributos
    int matricula;
    String nome;
    double salarioBruto;

    // Método para calcular desconto do INSS (15%)
    double calcularInss() {
        return salarioBruto * 0.15;
    }

    // Método para calcular salário líquido
    double calcularSalarioLiquido() {
        return salarioBruto - calcularInss();
    }

    // Método para exibir contracheque
    void exibirContracheque() {
        System.out.println("========== CONTRACHEQUE ==========");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Desconto INSS (15%): R$ " + calcularInss());
        System.out.println("Salário Líquido: R$ " + calcularSalarioLiquido());
        System.out.println("==================================");
    }
}