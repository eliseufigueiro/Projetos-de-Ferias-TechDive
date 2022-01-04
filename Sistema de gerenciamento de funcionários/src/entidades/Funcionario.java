package entidades;

public class Funcionario extends Pessoa {

    private static Integer addIdFuncionario = 0; //Contador para geracao do numero unico do funcionario
    private Integer idFuncionario; //Recebe o numero do contador a cada instancia do objeto
    private Double salarioBase;
    private Double impostos;
    private Integer fgAtivo;

    //Construtor
    public Funcionario() {
        super();
    }

    public Funcionario(String nome, String cpf, String numeroTelefone, String logradouro, Double salarioBase) {

        super(nome, cpf, numeroTelefone, logradouro);
        idFuncionario();
        this.salarioBase = salarioBase;
        calculoImpostos();
        funcionarioTrabalhando();
    }

    //Getters e Setters
    public Integer getIdFuncionario() {

        return idFuncionario;
    }

    public Double getSalarioBase() {

        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {

        this.salarioBase = salarioBase;
    }

    public Double getImpostos() {

        return impostos;
    }

    public Integer getFgAtivo() {
        return fgAtivo;
    }

    public void setFgAtivo(Integer fgAtivo) {
        this.fgAtivo = fgAtivo;
    }

    //Metodos auxiliares:
    public Integer idFuncionario() {

        return this.idFuncionario = ++addIdFuncionario;
    }

    public void calculoImpostos() {

        if (getSalarioBase() <= 1100) {

            this.impostos = 7.5;

        } else if (getSalarioBase() <= 2203.48) {

            this.impostos = 9.0;

        } else if (getSalarioBase() <= 3305.22) {

            this.impostos = 12.0;

        } else {

            this.impostos = 14.0;

        }
    }

    public Double calcularSalario() {

        return getSalarioBase() - ((getImpostos() / 100) * getSalarioBase());
    }

    public void funcionarioTrabalhando() {

        setFgAtivo(1);
    }

    public void funcionarioDemitido() {

        setFgAtivo(0);
    }

    @Override
    public String toString() {

        return "____________________________________________\n" +
                "                FUNCIONARIO                \n" +
                "____________________________________________\n" +
                " * ID           : " + idFuncionario + "\n" +
                " * NOME         : " + getNome() + "\n" +
                " * CPF          : " + getCpf() + "\n" +
                " * TELEFONE     : " + getNumeroTelefone() + "\n" +
                " * LOGRADOURO   : " + getLogradouro() + "\n" +
                " * SALARIO BASE : + " + String.format("%.2f", salarioBase) + "\n" +
                " * IMPOSTOS     : - " + String.format("%.2f", impostos) + "%" + "\n" +
                " * SALARIO      : = " + String.format("%.2f", calcularSalario()) + "\n" +
                "____________________________________________"
                ;
    }
}
