package aplicacao;

import entidades.Colaborador;
import entidades.Funcionario;

import java.util.*;

public class aplicacao {

    public static void main(String[] args) {
        //System.out.println("Olá, Mundo!");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        //Populando para testes
        Funcionario funcionario1 = new Funcionario("Eliseu", "008964558789", "48991821983", "Zure Roberto da Silva 210", 6000.0);
        list.add(funcionario1);

        Funcionario funcionario2 = new Funcionario("Selbach", "008964558001", "48991821500", "Roberto da Silva 220", 3200.0);
        list.add(funcionario2);

        Colaborador funcionario3 = new Colaborador("Selbach", "008964558001", "48991821500", "Roberto da Silva 220", 3200.0);
        list.add(funcionario3);

        for (Funcionario x : list) {
            if (x instanceof Funcionario) {
                System.out.println(x);
            }
        }

    }
}
