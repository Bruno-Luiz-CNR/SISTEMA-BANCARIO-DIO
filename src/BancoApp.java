import java.util.Random;
import java.util.Scanner;

public class BancoApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja criar sua conta? (sim/não)");
        String opcao = scanner.next();

        while (opcao.equalsIgnoreCase("sim")) {
            System.out.println("Digite seu nome:");
            String nome = scanner.next();

            double saldo = 0;
            do {
                System.out.println("Digite o valor inicial (mínimo R$50):");
                saldo = scanner.nextDouble();
            } while (saldo < 50);

            long numeroConta = 1000000000L + new Random().nextLong(9000000000L);
            double chequeEspecial = (saldo <= 50) ? (10 * 100.0 / saldo) : (50 * 100.0 / saldo);

            Conta conta = new Conta(nome, numeroConta, saldo, chequeEspecial);
            conta.exibirResumo();
            menu(conta);

            System.out.println("Deseja criar outra conta? (sim/não)");
            opcao = scanner.next();
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }

    public static void menu(Conta conta) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu Banco DIO ---");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar uso do cheque especial");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> conta.consultarSaldo();
                case 2 -> conta.consultarChequeEspecial();
                case 3 -> conta.depositar();
                case 4 -> conta.sacar();
                case 5 -> conta.pagarBoleto();
                case 6 -> conta.verificarChequeEspecial();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}
