package servicos;

import aplicacao.Aplicacao;
import entidades.*;

import java.util.Scanner;

public class AtualizarInformacoesFuncionario {

    Scanner sc = new Scanner(System.in);

    public void AtualizarFuncionario() {

        Aplicacao app = new Aplicacao();

        System.out.println("\n4. Atualizar informações de um funcionário\n");

        System.out.print("Digite o ID do Funcionário: ");
        Integer id = sc.nextInt();

        if (id <= app.list.size()) {
            for (Funcionario f : app.list) {

                if (id == f.getIdFuncionario()) {

                    System.out.print("Atualizar Nome: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    f.setNome(nome);

                    System.out.print("Corrigir CPF: ");
                    String cpf = sc.next();
                    f.setCpf(cpf);

                    System.out.print("Atualizar Telefone: ");
                    String fone = sc.next();
                    f.setNumeroTelefone(fone);

                    System.out.print("Atualizar Endereço: ");
                    String endereco = sc.next();
                    f.setLogradouro(endereco);

                    System.out.print("Atualizar Salário Base: ");
                    Double salario = sc.nextDouble();
                    f.setSalarioBase(salario);

                    System.out.println(f);

                }
            }
        }
    }
}
