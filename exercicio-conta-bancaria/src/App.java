import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        
        while (continuar) {

      
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1: {
                    double deposito = scanner.nextDouble();
                    saldo = saldo + deposito;
                    System.out.println(saldo);
                    System.out.println("Saldo atual: " + saldo%1f);
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    break; 
                }
                case 2: {
                    double saque = scanner.nextDouble();
                    if (saque < saldo) {
                    saldo = saldo - saque;
                    System.out.println("Saldo atual: " + saldo%1f);
                    } else {
                    System.out.println("Saldo insuficiente");
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    }
                    break; 
                }
                case 3: {
                    System.out.println("Saldo atual: " + saldo%1f);
                    // TODO: Exibir o saldo atual da conta.
                    break; 
                  
                }
                case 0: {
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break; 
                  
                }
                default: {
                    System.out.println("Opção inválida. Tente novamente."); }
            }
        }
        scanner.close();
    }
}
