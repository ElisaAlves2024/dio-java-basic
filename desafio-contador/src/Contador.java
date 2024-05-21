import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main (String[] args) throws ParametrosInvalidosException {
       
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    int primeiroParametro;
    int segundoParametro;

    boolean validParametro = false;

    do {
        System.out.println("Vamos começar? Por favor digite o primeiro parâmetro. Atenção: este deve ser um número inteiro!");
        primeiroParametro = scanner.nextInt();
    
        System.out.println("Agora, por favor digite o segundo parâmetro. Atenção, este precisa ser um número inteiro e maior do que o primeiro!");
        segundoParametro = scanner.nextInt();
    
        int ocorrencias = segundoParametro - primeiroParametro;
   
        try {
            if (ocorrencias <= 0)
            throw new ParametrosInvalidosException("Atenção: o segundo parametro precisa ser maior do que o primeiro parametro.");
            
            validParametro = true;
            System.out.println("Parametros registrados corretamente.");
            int numeroImpressao = 1;
        
            while (ocorrencias > 0) {
            System.out.println("Imprimindo o número " + numeroImpressao);
            ocorrencias--;
            numeroImpressao++;
            }
   
            }
            catch(ParametrosInvalidosException e) {
                System.out.println(e.getMessage());
             }
    } while (validParametro == false);

            scanner.close();
    }
}


