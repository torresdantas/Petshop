import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaquinaBanho maquina = new MaquinaBanho();
        Pet pet1 = new Pet("Buddy");

        int opcao;
        do {
            System.out.println("\n== Menu da Máquina de Banho ==");
            System.out.println("1 - Colocar Pet na Máquina");
            System.out.println("2 - Dar Banho no Pet");
            System.out.println("3 - Remover Pet da Máquina");
            System.out.println("4 - Limpar Máquina");
            System.out.println("5 - Abastecer Água");
            System.out.println("6 - Abastecer Shampoo");
            System.out.println("7 - Verificar Nível de Água");
            System.out.println("8 - Verificar Nível de Shampoo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> maquina.adicionarPet(pet1);
                case 2 -> maquina.darBanho();
                case 3 -> maquina.removerPet();
                case 4 -> maquina.limparMaquina();
                case 5 -> maquina.addAgua();
                case 6 -> maquina.addShampoo();
                case 7 -> System.out.println("Nível de água: " + maquina.getAgua() + " litros.");
                case 8 -> System.out.println("Nível de shampoo: " + maquina.getShampoo() + " litros.");
                case 0 -> System.out.println("Encerrando o programa.");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
