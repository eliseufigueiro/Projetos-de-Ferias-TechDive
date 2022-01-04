package entidades;

public class GerenteGeral extends Funcionario {

    private final Double gratificacao = 10.0;//10% de gratificacao no salario
    private Double ajudaDeCusto;

    public GerenteGeral() {
        super();
    }

    public GerenteGeral(String nome, String cpf, String numeroTelefone, String logradouro, Double salarioBase, Double ajudaDeCusto) {
        super(nome, cpf, numeroTelefone, logradouro, salarioBase);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Double getGratificacao() {
        return gratificacao;
    }

    public Double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(Double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public Double calcularSalario() {
        Double salarioComGratificacao = getSalarioBase() + ((getGratificacao() / 100) * getSalarioBase());
        Double salarioFinal = salarioComGratificacao - ((getImpostos() / 100) * salarioComGratificacao);
        return salarioFinal + getAjudaDeCusto();
    }

    @Override
    public String toString() {

        return "____________________________________________\n" +
                "                GERENTE GERAL               \n" +
                "____________________________________________\n" +
                " * ID            : " + getIdFuncionario() + "\n" +
                " * NOME          : " + getNome() + "\n" +
                " * CPF           : " + getCpf() + "\n" +
                " * TELEFONE      : " + getNumeroTelefone() + "\n" +
                " * LOGRADOURO    : " + getLogradouro() + "\n" +
                " * SALARIO BASE  : + " + String.format("%.2f", getSalarioBase()) + "\n" +
                " * GRATIFICAÇÃO  : + " + String.format("%.2f", getGratificacao()) + "%" + "\n" +
                " * IMPOSTOS      : - " + String.format("%.2f", getImpostos()) + "%" + "\n" +
                " * AJUDA DE CUSTO: + " + String.format("%.2f", getAjudaDeCusto()) + "\n" +
                " * SALARIO       : = " + String.format("%.2f", calcularSalario()) + "\n" +
                "____________________________________________"
                ;
    }
}
