public class ContaBancaria {
    // Atributos
    int numeroConta;
    String titular;
    double saldo;

    // Construtor
    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0; // saldo inicial zero
    }

    // Consultar saldo
    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    // Depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    // Sacar
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    // Transferir
    public void transferir(ContaBancaria destino, double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            destino.saldo += valor;
            System.out.println("Transferência de R$ " + valor + " para " + destino.titular + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para transferência.");
        }
    }
}