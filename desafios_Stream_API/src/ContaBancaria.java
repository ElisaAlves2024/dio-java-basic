class ContaBancaria {
    public int numero;
    public String titular;
    public double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        System.out.println(titular);
        System.out.println(numero);
        System.out.println("Saldo: R$ " + saldo);
    }
}