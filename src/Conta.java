import java.util.Scanner;

public class Conta {
    private String nome;
    private long numero;
    private double saldo;
    private double chequeEspecial;

    Scanner scanner = new Scanner(System.in);

    public Conta(String nome, long numero, double saldo, double chequeEspecial) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
    }

    public void exibirResumo() {
        System.out.println("\n--- Conta Criada com Sucesso ---");
        System.out.println("Nome: " + nome);
        System.out.println("Número da Conta: " + numero);
        System.out.println("Saldo Inicial: R$" + saldo);
        System.out.println("Cheque Especial: R$" + chequeEspecial);
        System.out.println("-".repeat(40));
    }

    public void consultarSaldo() {
        System.out.println("Saldo disponível: R$" + saldo);
    }

    public void consultarChequeEspecial() {
        System.out.println("Limite de cheque especial: R$" + chequeEspecial);
    }

    public void depositar() {
        System.out.println("Digite o valor para depósito:");
        double valor = scanner.nextDouble();
        saldo += valor;
        System.out.println("Depósito realizado. Saldo atual: R$" + saldo);
    }

    public void sacar() {
        System.out.println("Digite o valor do saque:");
        double valor = scanner.nextDouble();

        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado. Novo saldo: R$" + saldo);
        } else if (valor <= saldo + chequeEspecial) {
            double usoCheque = valor - saldo;
            double taxa = usoCheque * 0.20;
            saldo = 0;
            chequeEspecial -= usoCheque;
            System.out.println("Saque com cheque especial.");
            System.out.println("Valor usado do cheque: R$" + usoCheque);
            System.out.println("Taxa aplicada: R$" + taxa);
        } else {
            System.out.println("Saque negado. Limite insuficiente.");
        }
    }

    public void pagarBoleto() {
        System.out.println("Digite o valor do boleto:");
        double valor = scanner.nextDouble();

        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Boleto pago com saldo.");
        } else if (valor <= saldo + chequeEspecial) {
            double usoCheque = valor - saldo;
            double taxa = usoCheque * 0.20;
            saldo = 0;
            chequeEspecial -= usoCheque;
            System.out.println("Boleto pago com cheque especial.");
            System.out.println("Valor usado do cheque: R$" + usoCheque);
            System.out.println("Taxa aplicada: R$" + taxa);
        } else {
            System.out.println("Pagamento negado. Limite insuficiente.");
        }
    }

    public void verificarChequeEspecial() {
        if (chequeEspecial <= 0) {
            System.out.println("Cheque especial esgotado.");
        } else {
            System.out.println("Cheque especial disponível: R$" + chequeEspecial);
        }
    }
}
