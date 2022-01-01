package entidades;

public class Pessoa {

    private String nome;
    private String cpf;
    private String numeroTelefone;
    private String logradouro;

    //Construtor
    public Pessoa(String nome, String cpf, String numeroTelefone, String logradouro) {

        this.nome = nome;
        this.cpf = cpf;
        this.numeroTelefone = numeroTelefone;
        this.logradouro = logradouro;
    }

    //Getters e Setters
    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getCpf() {

        return cpf;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }

    public String getNumeroTelefone() {

        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {

        this.numeroTelefone = numeroTelefone;
    }

    public String getLogradouro() {

        return logradouro;
    }

    public void setLogradouro(String logradouro) {

        this.logradouro = logradouro;
    }

    @Override
    public String toString() {

        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", numeroTelefone='" + numeroTelefone + '\'' +
                ", logradouro='" + logradouro + '\'' +
                '}';
    }
}
