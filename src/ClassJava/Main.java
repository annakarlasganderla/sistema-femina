package ClassJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int op;

        do {
            do {
                System.out.println("-------------------------------------------");
                System.out.println("|  0 - Sair                               |");
                System.out.println("|  1 - Cadastrar produto                  |");
                System.out.println("|  2 - Visualizar produtos cadastrados    |");
                System.out.println("|  3 - Editar produto                     |");
                System.out.println("|  4 - Deletar produto                    |");
                System.out.println("-------------------------------------------");
                System.out.println("|        Digite aqui sua opção:           |");
                op = leitor.nextInt();
            } while (op == 5);

            switch (op) {
                case 0:
                    break;

                case 1:
                    System.out.println("Função cadastrar em andamento");
                    System.out.println("5 - Voltar");
                    op = leitor.nextInt();
                    break;

                case 2:
                    System.out.println("Função visualizar em andamento");
                    System.out.println("5 - Voltar");
                    op = leitor.nextInt();
                    break;

                case 3:
                    System.out.println("Função editar em andamento");
                    System.out.println("5 - Voltar");
                    op = leitor.nextInt();
                    break;

                case 4:
                    System.out.println("Função deletar em andamento");
                    System.out.println("5 - Voltar");
                    op = leitor.nextInt();
                    break;

                default:
                    System.out.println("Opção inválida");
                    System.out.println("5 - Voltar");
                    op = leitor.nextInt();
                    break;
            }
        } while (op != 0);
    }
}