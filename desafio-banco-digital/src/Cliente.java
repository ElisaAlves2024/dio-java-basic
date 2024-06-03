public class Cliente {
    
	private static int SEQUENCIAL = 1;

    private String nome;
    private int cpf;
    private String dataNascimento;
    private int idCliente;


    public Cliente (String nome, int cpf, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.idCliente = SEQUENCIAL++;
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public String getDataNasc() {
        return dataNascimento;
    }

    public int getId() {
        return idCliente;
    }
}
