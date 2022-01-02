package entidades;

public class Colaborador extends Funcionario {

    public Colaborador(String nome, String cpf, String numeroTelefone, String logradouro, Double salarioBase) {
        super(nome, cpf, numeroTelefone, logradouro, salarioBase);
    }

    @Override
    public String toString() {

        return  "\n____________________________________________\n" +
                "                COLABORADOR               " +
                "\n____________________________________________\n" +
                " * ID           : " + getIdFuncionario() + "\n" +
                " * NOME         : " + getNome() + "\n" +
                " * CPF          : " + getCpf() + "\n" +
                " * TELEFONE     : " + getNumeroTelefone() + "\n" +
                " * LOGRADOURO   : " + getLogradouro() + "\n" +
                " * SALARIO BASE : + " + String.format("%.2f", getSalarioBase()) + "\n" +
                " * IMPOSTOS     : - " + String.format("%.2f", getImpostos()) + "%" + "\n" +
                " * SALARIO      : = " + String.format("%.2f", calcularSalario()) + "\n" +
                "____________________________________________\n"
                ;
    }
}
