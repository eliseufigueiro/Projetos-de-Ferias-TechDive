package entidades;

public class LiderTecnico extends Funcionario {

    private Integer metaVendasUnidades;

    public LiderTecnico(String nome, String cpf, String numeroTelefone, String logradouro, Double salarioBase, Integer metaVendasUnidades) {
        super(nome, cpf, numeroTelefone, logradouro, salarioBase);
        this.metaVendasUnidades = metaVendasUnidades;
    }

    public Integer getMetaVendasUnidades() {
        return metaVendasUnidades;
    }

    public void setMetaVendasUnidades(Integer metaProducaoUnidades) {
        this.metaVendasUnidades = metaProducaoUnidades;
    }

    @Override
    public String toString() {

        return "\n____________________________________________\n" +
                "                LIDER TECNICO                   " +
                "\n____________________________________________\n" +
                " * ID           : " + getIdFuncionario() + "\n" +
                " * NOME         : " + getNome() + "\n" +
                " * CPF          : " + getCpf() + "\n" +
                " * TELEFONE     : " + getNumeroTelefone() + "\n" +
                " * LOGRADOURO   : " + getLogradouro() + "\n" +
                " * META VENDAS  : " + getMetaVendasUnidades() + " UN" + "\n" +
                " * SALARIO BASE : + " + String.format("%.2f", getSalarioBase()) + "\n" +
                " * IMPOSTOS     : - " + String.format("%.2f", getImpostos()) + "%" + "\n" +
                " * SALARIO      : = " + String.format("%.2f", calcularSalario()) + "\n" +
                "____________________________________________\n"
                ;
    }
}
