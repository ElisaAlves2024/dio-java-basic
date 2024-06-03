
public class App {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Venilton", 1234, "1998-03-06");

        ContaCorrente cc = new ContaCorrente(cliente1);
        ContaPoupança poupanca = new ContaPoupança(cliente1);

        cc.depositar(250);
        cc.transferir(100, poupanca);

        cc.sacar(50);
        System.out.println(cc.limiteChequeEspecial);
        cc.sacar(650);
    }
}
