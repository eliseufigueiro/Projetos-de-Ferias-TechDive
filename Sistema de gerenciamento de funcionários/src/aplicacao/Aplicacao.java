package aplicacao;

import entidades.*;
import servicos.*;

import java.io.IOException;
import java.util.*;

public class Aplicacao {

    public static List<Funcionario> list = new ArrayList<>();//Banco de dados da aplicao
    static Scanner sc = new Scanner(System.in);

    private void debug() {
        Funcionario funcionario1 = new GerenteDeDepartamento("Eliseu", "008964558789", "48991821983", "Zure Roberto da Silva 210", 6000.0);
        list.add(funcionario1);

        Funcionario funcionario2 = new Colaborador("Selbach", "008964558001", "48991821500", "Roberto da Silva 220", 3200.0);
        list.add(funcionario2);

        Funcionario funcionario3 = new Colaborador("Selbach", "008964558001", "48991821500", "Roberto da Silva 220", 3200.0);
        list.add(funcionario3);

        Funcionario funcionario4 = new LiderTecnico("Figueiro", "008964558001", "48991821500", "Roberto da Silva 220", 3200.0, 12000);
        list.add(funcionario4);

        Funcionario funcionario5 = new GerenteDeDepartamento("Figueiro", "008964558001", "48991821500", "Roberto da Silva 220", 3200.0);
        list.add(funcionario5);

        Funcionario funcionario6 = new GerenteGeral("Figueiro", "008964558001", "48991821500", "Roberto da Silva 220", 3200.0, 1200.0);
        list.add(funcionario6);

    } //Populando para testes

    private void menu() {
        System.out.println("\n===================================================");
        System.out.println("       SISTEMA GERENCIAMENTO DE FUNCIONARIOS       ");
        System.out.println("===================================================\n");
        System.out.println("  | 1. Adicionar funcionário");
        System.out.println("  | 2. Ver detalhes de um funcionário");
        System.out.println("  | 3. Demitir funcionário");
        System.out.println("  | 4. Atualizar informações de um funcionário");
        System.out.println("  | 5. Listar todos os funcionários");
        System.out.println("  | 6. Listar somente os funcionários trabalhando");
        System.out.println("  | 7. Listar somente os funcionários demitidos");
        System.out.println("  | 0. Sair\n");
        System.out.print("Escolha um opção: ");
    }

    public static void main(String[] args) throws IOException {
        //System.out.println("Olá, Mundo!");

        Locale.setDefault(Locale.US);
        Aplicacao aplicacao = new Aplicacao();
        //aplicacao.debug();

        int opcao = 0;
        do {
            aplicacao.menu();
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    AdicionarFuncionario adF = new AdicionarFuncionario();
                    adF.addFuncionario();
                    System.out.print("\nPressione Enter para continuar!");
                    System.in.read();
                    break;
                case 2:
                    DetalhesFuncionario dtF = new DetalhesFuncionario();
                    dtF.detalhesFuncionario();
                    System.out.print("\nPressione Enter para continuar!");
                    System.in.read();
                    break;
                case 3:
                    DemitirFuncionario dmF = new DemitirFuncionario();
                    dmF.demitirFuncionario();
                    System.out.print("\nPressione Enter para continuar!");
                    System.in.read();
                    break;
                case 4:
                    AtualizarInformacoesFuncionario aF = new AtualizarInformacoesFuncionario();
                    aF.AtualizarFuncionario();
                    System.out.print("\nPressione Enter para continuar!");
                    System.in.read();
                    break;
                case 5:
                    ListarTodosFuncionario lF = new ListarTodosFuncionario();
                    lF.listarTodosFuncionarios();
                    System.out.print("\nPressione Enter para continuar!");
                    System.in.read();
                    break;
                case 6:
                    ListarFuncionarioTrabalhando fT = new ListarFuncionarioTrabalhando();
                    fT.listarFuncionarioTrabalhando();
                    System.out.print("\nPressione Enter para continuar!");
                    System.in.read();
                    break;
                case 7:
                    ListarFuncionarioDemitidos fD = new ListarFuncionarioDemitidos();
                    fD.listarFuncionarioDemitidos();
                    System.out.print("\nPressione Enter para continuar!");
                    System.in.read();
                    break;
                case 0:
                    System.out.println("\nFinalizando Sistema!");
                    break;
                default:
                    System.out.println("\nOpção inválida, Pressione Enter para continuar!");
                    System.in.read();
            }
        } while (opcao != 0);
    }
}
