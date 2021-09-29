import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        do {
            mostrarMenuPrincipal();
        } while (true);
    }

    public static void montarSanduiches() {
        Sanduiche sanduiche = new Sanduiche();
        String [] ing = new String[10];
        do {
            System.out.println("---------------------------");
            System.out.println("\nMenu de Sanduíches \n");
            System.out.println("Escolha seus ingredientes ");
            System.out.println("1 -> Queijo");
            System.out.println("2 -> Hamburger");
            System.out.println("3 -> Bacon");
            System.out.println("4 -> Alface");
            System.out.println("5 -> Maionese");
            System.out.println("6 -> Ovo");
            System.out.println("7 -> Tomate");
            System.out.println("8 -> Molho especial");
            System.out.println("9 -> Montar Lanche");
            System.out.println("0 -> Voltar");
            System.out.println("Opção: ");
            //Leitura da opção

            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();
            //Tratando a opção
            switch (opcao) {
                case 1 -> sanduiche.adicionarIngrediente("Queijo");
                case 2 -> sanduiche.adicionarIngrediente("Hamburger ");
                case 3 -> sanduiche.adicionarIngrediente("Bacon ");
                case 4 -> sanduiche.adicionarIngrediente("Alface ");
                case 5 -> sanduiche.adicionarIngrediente("Maionese ");
                case 6 -> sanduiche.adicionarIngrediente("Ovo ");
                case 7 -> sanduiche.adicionarIngrediente("Tomate ");
                case 8 -> sanduiche.adicionarIngrediente("Molho especial");
                case 9 -> mostrarLanche(sanduiche);
                default -> System.out.println("Opção inválida! Selecione uma das opções informadas");
            }
        } while (true);
    }

    public static void mostrarLanche(Sanduiche sanduiche) {
        System.out.println("Ingredientes adicionados ao seu sanduíche: ");
        System.out.println(sanduiche.toString());
    }

    public static void mostrarMenuMassas() {}

    public static void mostrarMenuBolos() {}

    private static void mostrarMenuPrincipal() {
        System.out.println("\nMenu Principal\n");
        System.out.println("1 -> Sanduíches");
        System.out.println("2 -> Massas");
        System.out.println("3 -> Bolos");
        System.out.println("0 -> SAIR");
        System.out.println("\nDigite a sua opção: ");

        // Configurar Scanner
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        System.out.println("Opção digitada: " + opcao);
        String msg = "Opção escolhida: ";
        switch (opcao) {
            case 1 -> {
                System.out.println(msg + "Sanduíche");
                montarSanduiches();
            }
            case 2 -> System.out.println(msg + "Massas");
            case 3 -> System.out.println(msg + "Bolos");
            case 4 -> {
                System.out.println(msg + "Sair do sistema");
                System.exit(0);
            }
            default -> System.out.println("Opção inválida! Selecione outra opção. ");
        }
    }
}

