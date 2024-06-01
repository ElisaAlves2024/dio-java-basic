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
        super.imprimirInfosComuns();
		System.out.println("=== Extrato Conta Corrente ===");
		
	}


	
}

    
