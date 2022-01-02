package servicos;

import aplicacao.Aplicacao;
import entidades.Funcionario;

import java.util.Scanner;

public class DetalhesFuncionario {

    Scanner sc = new Scanner(System.in);

    public void detalhesFuncionario() {

        Aplicacao app = null;

        System.out.println("\n2. Ver detalhes de um funcionário");

        System.out.print("Digite o ID do Funcionário: ");
        Integer id = sc.nextInt();

        if (id <= app.list.size()) {
            for (Funcionario funcionario : app.list) {
                if (id == funcionario.getIdFuncionario())
                    System.out.println(funcionario);
            }
        } else {
            System.out.println("\nID não existe!");
        }
    }
}
