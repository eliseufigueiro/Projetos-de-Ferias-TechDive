package aplicacao;

import entidades.*;

import java.util.*;

public class aplicacao {

    public static void main(String[] args) {
        //System.out.println("Olá, Mundo!");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        /*
        //Populando para testes
        Funcionario funcionario1 = new Funcionario("Eliseu", "008964558789", "48991821983", "Zure Roberto da Silva 210", 6000.0);
        list.add(funcionario1);

        Funcionario funcionario2 = new Funcionario("Selbach", "008964558001", "48991821500", "Roberto da Silva 220", 3200.0);
        list.add(funcionario2);

        Colaborador funcionario3 = new Colaborador("Selbach", "008964558001", "48991821500", "Roberto da Silva 220", 3200.0);
        list.add(funcionario3);

        LiderTecnico funcionario4 = new LiderTecnico("Figueiro", "008964558001", "48991821500", "Roberto da Silva 220",3200.0, 12000);
        list.add(funcionario4);

        GerenteDeDepartamento funcionario5 = new GerenteDeDepartamento("Figueiro", "008964558001", "48991821500", "Roberto da Silva 220",3200.0);
        list.add(funcionario5);

        GerenteGeral funcionario6 = new GerenteGeral("Figueiro", "008964558001", "48991821500", "Roberto da Silva 220",3200.0,1200.0);
        list.add(funcionario6);

        System.out.println(list);*/

        int optMenuPrincipal = 0;
        do {
            System.out.println("===================================================");
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
            optMenuPrincipal = sc.nextInt();

        }while (optMenuPrincipal != 0);
    }
}
