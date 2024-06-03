public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
		super(cliente);
        if (saldo >= 1000) {
            limiteChequeEspecial = 1000.00;
        } else {
            limiteChequeEspecial = 500.00;
        }
    }
	
    @Override
	public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirExtrato();
	}

    @Override
    public void sacar(double valor) {
		if (valor <= (saldo+limiteChequeEspecial)) {
            if (valor > saldo){
                saldo -= valor;
                System.out.println("Saque realizado utilizando o Cheque Especial");
            } else {
                saldo -= valor;
                System.out.println("Saque realizado com sucesso! Saldo atual: " + saldo);
            }   
        } else {
            System.out.println("Saldo insuficiente. Operação cancelada.");
        }
	}	
}

    
