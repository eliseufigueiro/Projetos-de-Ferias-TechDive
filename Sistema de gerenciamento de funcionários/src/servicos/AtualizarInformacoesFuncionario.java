package servicos;

import aplicacao.Aplicacao;
import entidades.Funcionario;

import java.util.Scanner;

public class AtualizarInformacoesFuncionario {

    Scanner sc = new Scanner(System.in);

    public void AtualizarFuncionario() {

        Aplicacao app = new Aplicacao();
        Funcionario funcionario = null;

        System.out.println("\n4. Atualizar informações de um funcionário\n");

        System.out.print("Digite o ID do Funcionário: ");
        Integer id = sc.nextInt();

        if (id <= app.list.size()) {
            for (Funcionario f : app.list) {

                if (id == f.getIdFuncionario()) {

                    System.out.print("Nome completo : ");
                    String nome = sc.nextLine();
                    funcionario.setNome(nome);

                    System.out.print("CPF           : ");
                    String cpf = sc.nextLine();
                    funcionario.setCpf(cpf);

                    System.out.print("Telefone      : ");
                    String fone = sc.nextLine();
                    funcionario.setNumeroTelefone(fone);

                    System.out.print("Endereço      : ");
                    String endereco = sc.nextLine();
                    funcionario.setLogradouro(endereco);

                    System.out.print("Salário Base  : ");
                    Double salario = sc.nextDouble();
                    funcionario.setSalarioBase(salario);

                    System.out.print("\nESCOLHA O CARGO: " +
                            "1. COLABORADOR  |  " +
                            "2. LIDER TECNICO  |  " +
                            "3. GERENTE DE DEPARTAMENTO  |  " +
                            "4. GERENTE GERAL\n" +
                            "Escolha o cargo do funcionário: ");

                    int opcao;
                    do {
                        opcao = sc.nextInt();

                        switch (opcao) {

                            case 1:
                                System.out.println("\n" + colaborador);
                                System.out.println("Cadastro atualizado com sucesso!");
                                break;
                            case 2:
                                System.out.print("\nMeta vendas Un: ");
                                Integer metaUn = sc.nextInt();

                                System.out.println(liderTecnico);
                                System.out.println("Cadastro atualizado com sucesso!");
                                break;
                            case 3:

                                System.out.println("\n" + gerenteDeDepartamento);
                                System.out.println("Cadastro atualizado com sucesso!");
                                break;
                            case 4:
                                System.out.print("\nAjuda de custo: ");
                                Double gratificacao = sc.nextDouble();

                                System.out.println(gerenteGeral);
                                System.out.println("Cadastro atualizado com sucesso!");
                                break;
                            default:
                                System.out.print("\nOpção inválida! Escolha novamente: ");
                        }

                    } while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4);
                }
            }
        } else {
            System.out.println("\nID não existe!");
        }
    }
}
