public abstract class Conta {

    private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected double limiteChequeEspecial;
    protected Cliente cliente;

    public Conta (Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;        
    }

    
	public int getAgencia() {
		return agencia;
	}

	public int getConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

    public void sacar(double valor) {
		if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso! [CONTA] Saldo atual: " + saldo);   
        } else {
            System.out.println("Saldo insuficiente. Operação cancelada [CONTA].");
        }
	}

    public void depositar(double valor) {
		saldo += valor;
	}

    //Esse método chama dos métodos 'sacar' e 'depositar', logo o comando de imprimir mensagem destes outros métodos precisa ser ajustado.
	public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
		contaDestino.depositar(valor);
	}


	protected void imprimirExtrato() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numeroConta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

}
