package servicos;

import aplicacao.Aplicacao;
import entidades.*;

import java.util.Scanner;

public class AdicionarFuncionario {

    Scanner sc = new Scanner(System.in);

    public void addFuncionario() {

        Aplicacao app = new Aplicacao();

        System.out.println("\n1. Adicionar funcionário\n");

        System.out.print("Nome completo : ");
        String nome = sc.nextLine();

        System.out.print("CPF           : ");
        String cpf = sc.nextLine();

        System.out.print("Telefone      : ");
        String fone = sc.nextLine();

        System.out.print("Endereço      : ");
        String endereco = sc.nextLine();

        System.out.print("Salário Base  : ");
        Double salario = sc.nextDouble();

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
                    Colaborador colaborador = new Colaborador(nome, cpf, fone, endereco, salario);
                    app.list.add(colaborador);
                    System.out.println("\n" + colaborador);
                    System.out.println("Cadastro criado com sucesso!");
                    break;
                case 2:
                    System.out.print("\nMeta vendas Un: ");
                    Integer metaUn = sc.nextInt();
                    LiderTecnico liderTecnico = new LiderTecnico(nome, cpf, fone, endereco, salario, metaUn);
                    app.list.add(liderTecnico);
                    System.out.println(liderTecnico);
                    System.out.println("Cadastro criado com sucesso!");
                    break;
                case 3:
                    GerenteDeDepartamento gerenteDeDepartamento = new GerenteDeDepartamento(nome, cpf, fone, endereco, salario);
                    app.list.add(gerenteDeDepartamento);
                    System.out.println("\n" + gerenteDeDepartamento);
                    System.out.println("Cadastro criado com sucesso!");
                    break;
                case 4:
                    System.out.print("\nAjuda de custo: ");
                    Double gratificacao = sc.nextDouble();
                    GerenteGeral gerenteGeral = new GerenteGeral(nome, cpf, fone, endereco, salario, gratificacao);
                    app.list.add(gerenteGeral);
                    System.out.println(gerenteGeral);
                    System.out.println("Cadastro criado com sucesso!");
                    break;
                default:
                    System.out.print("\nOpção inválida! Escolha novamente: ");
            }

        } while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4);
    }
}
