import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        Boolean transacoes = true;

    
        for (int i = 1; transacoes; i++) {
          
            double valorSaque = scanner.nextDouble();
            
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                transacoes = false;
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                transacoes = false;
            } else {
                limiteDiario = limiteDiario - valorSaque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            }
        }

        scanner.close();
    }
}
