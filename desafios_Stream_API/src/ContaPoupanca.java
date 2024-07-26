class ContaPoupanca extends ContaBancaria {
    
    double taxaJuros;

    public ContaPoupanca(double taxaJuros, int numero, String titular, double saldo) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Taxa de juros: " + taxaJuros + "%");
    }
}
