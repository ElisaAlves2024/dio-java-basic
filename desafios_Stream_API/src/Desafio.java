import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String titular = scanner.next();
        int numeroConta = scanner.nextInt();
        double saldo = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();

        ContaBancaria contaPoupanca = new ContaPoupanca(taxaJuros, numeroConta, titular, saldo);

        contaPoupanca.exibirInformacoes();

        scanner.close();
    }
}
