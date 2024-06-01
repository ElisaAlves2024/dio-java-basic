import java.time.LocalDate;

public class Cliente {
    
	private static int SEQUENCIAL = 1;

    private String nome;
    private int cpf;
    private LocalDate dataNascimento;
    private int idCliente;


    Cliente (String nome, int CPF, LocalDate dataNascimento, int idCliente) {
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

    public LocalDate getDataNasc() {
        return dataNascimento;
    }

    public int getId() {
        return idCliente;
    }
}
