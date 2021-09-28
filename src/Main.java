import java.util.Scanner;

public class Main {

    public static void main (String [] args){

        do{
            System.out.println("\nMenu Principal\n");
            System.out.println("1 -> Sanduíches");
            System.out.println("2 -> Massas");
            System.out.println("3 -> Bolos");
            System.out.println("4 -> SAIR");
            System.out.println("\nDigite a sua opção: ");

            // Configurar Scanner
            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();

            //Limpar buffer do teclado (enter dado anteriormente)
            //scanner.nextInt();

//        System.out.println("Opção digitada: " + opcao);
            switch (opcao) {
                case 1:
                    System.out.println("Opção escolhida: Sanduíche");
                    break;
                case 2:
                    System.out.println("Opção escolhida: Massas");
                    break;
                case 3:
                    System.out.println("Opção escolhida: Bolos");
                    break;
                case 4:
                    System.out.println("Opção escolhida: Sair do sistema");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida! ");
            }
        }while(true);

    }
}
