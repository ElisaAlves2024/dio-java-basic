public class ContaPoupança extends Conta {
    
    public ContaPoupança(Cliente cliente) {
		super(cliente);
    }
	

	@Override
	public void imprimirExtrato() {
        super.imprimirInfosComuns();
		System.out.println("=== Extrato Conta Poupaça ===");
		
	}


	
}