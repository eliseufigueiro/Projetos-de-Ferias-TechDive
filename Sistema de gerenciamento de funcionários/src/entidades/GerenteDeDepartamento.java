package entidades;

public class GerenteDeDepartamento extends Funcionario {

    private final Double gratificacao = 5.0;//5% de gratificacao no salario

    public GerenteDeDepartamento(String nome, String cpf, String numeroTelefone, String logradouro, Double salarioBase) {
        super(nome, cpf, numeroTelefone, logradouro, salarioBase);
    }

    public Double getGratificacao() {
        return gratificacao;
    }

    @Override
    public Double calcularSalario() {
        Double salarioComGratificacao = getSalarioBase() + ((getGratificacao() / 100) * getSalarioBase());
        Double salarioFinal = salarioComGratificacao - ((getImpostos() / 100) * salarioComGratificacao);
        return salarioFinal;
    }

    @Override
    public String toString() {

        return "\n____________________________________________\n" +
                "                GERENTE DEPARTAMENTO           " +
                "\n____________________________________________\n" +
                " * ID           : " + getIdFuncionario() + "\n" +
                " * NOME         : " + getNome() + "\n" +
                " * CPF          : " + getCpf() + "\n" +
                " * TELEFONE     : " + getNumeroTelefone() + "\n" +
                " * LOGRADOURO   : " + getLogradouro() + "\n" +
                " * SALARIO BASE : + " + String.format("%.2f", getSalarioBase()) + "\n" +
                " * GRATIFICAÇÃO : + " + String.format("%.2f", getGratificacao()) + "%" + "\n" +
                " * IMPOSTOS     : - " + String.format("%.2f", getImpostos()) + "%" + "\n" +
                " * SALARIO      : = " + String.format("%.2f", calcularSalario()) + "\n" +
                "____________________________________________\n"
                ;
    }
}
