package servicos;

import aplicacao.Aplicacao;
import entidades.Funcionario;

public class ListarFuncionarioDemitidos {

    public void listarFuncionarioDemitidos() {

        Aplicacao app = null;

        System.out.println("\n5. Listar todos os funcionários demitidos");

        for (Funcionario funcionario : app.list) {

            if (funcionario.getFgAtivo() == 0) {

                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println(" ID: " + funcionario.getIdFuncionario() +
                        ", NOME: " + funcionario.getNome() +
                        ", CPF: " + funcionario.getCpf() +
                        ", FONE: " + funcionario.getNumeroTelefone() +
                        ", LOGRADOURO: " + funcionario.getLogradouro() +
                        ", SALARIO BASE: " + String.format("%.2f", funcionario.getSalarioBase()) +
                        ", IMPOSTOS: " + String.format("%.2f", funcionario.getImpostos()));
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }
        }
    }
}
