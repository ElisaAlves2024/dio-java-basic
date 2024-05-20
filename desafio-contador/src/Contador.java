import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main (String[] args) throws ParametrosInvalidosException {
       
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    int primeiroParametro;
    int segundoParametro;

    System.out.println("Digite o primeiro parâmetro (número inteiro)");
    primeiroParametro = scanner.nextInt();
    
    
    System.out.println("Digite o segundo parâmetro (número inteiro). Atenção, este precisa ser maior que o primeiro!");
    segundoParametro = scanner.nextInt();
    
    int ocorrencias = segundoParametro - primeiroParametro;
   
    try {
        if (ocorrencias <= 0)
        throw new ParametrosInvalidosException("O segundo parametro precisa ser maior do que o primeiro parametro.");

        System.out.println("Parametros registrados corretamente.");
        int numeroImpressao = 1;
        
        while (ocorrencias > 0) {
        System.out.println("Imprimindo o número " + numeroImpressao);
        ocorrencias--;
        numeroImpressao++;
         }
   
        }
   
   catch(ParametrosInvalidosException e) {
       System.out.println("Atenção, o segundo parametro precisa ser maior que o primeiro!");
       System.out.println(e.getMessage());
        }

    

    scanner.close();
    }
}


