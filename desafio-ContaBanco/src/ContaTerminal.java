import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Vamos começar? Por favor, digite o seu nome completo:");
        String nomeCliente = scanner.next();
        
        System.out.println("Bem vindo(a)! Por favor, digite sua agencia.");
        String agencia = scanner.next();

        System.out.println("Agora, digite o número da sua conta.");
        int numeroConta = scanner.nextInt();
        
        System.out.println("E, por último, por favor nos informe o valor que você irá transferir para o seu saldo.");
        double saldo = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá "+ nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta " +numeroConta+ " e seu saldo " +saldo+ " já está disponível para saque.");
      
    }
}
