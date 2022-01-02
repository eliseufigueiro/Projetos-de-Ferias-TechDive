package servicos;

import aplicacao.Aplicacao;
import entidades.Funcionario;

import java.util.Scanner;

public class DemitirFuncionario {

    Scanner sc = new Scanner(System.in);

    public void demitirFuncionario() {

        Aplicacao app = null;

        System.out.println("\n3. Demitir funcionário");

        System.out.print("Digite o ID do Funcionário: ");
        Integer id = sc.nextInt();

        if (id <= app.list.size()) {
            for (Funcionario funcionario : app.list) {
                if (id == funcionario.getIdFuncionario()) {
                    funcionario.setFgAtivo(0);
                    System.out.println(funcionario);
                    System.out.println("\nFuncionário demitido com sucesso: ");
                }
            }
        } else {
            System.out.println("\nID não existe!");
        }
    }
}
