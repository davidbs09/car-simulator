import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option;

        System.out.println("Digite o modelo do carro:");
        String modelo = scan.nextLine();
        System.out.println("Digite a cor do carro:");
        String cor = scan.nextLine();
        System.out.println("Digite o ano do carro:");
        int ano = scan.nextInt();

        Carro carro = new Carro(modelo, cor, ano);

        System.out.println("\nParabéns pela escolha do " + carro.getModelo()
                + " de cor " + carro.getCor() + " de ano " + carro.getAno() + "!\n");
        System.out.println("---------------------------------------------------\n");

        System.out.println("O seu carro já está disponível para uso. Fique a vontade para aproveitá-lo!\n");

        boolean sair = false;
        while (!sair) {
            System.out.println("Funções do carro: \n");
            System.out.println("1. Acelerar");
            System.out.println("2. Frear");
            System.out.println("3. Trocar marcha");
            System.out.println("4. Virar para a direita");
            System.out.println("5. Virar para a esquerda");
            System.out.println("6. Sair do programa\n");
            option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.println("O carro está acelerando!");
                    break;
                case 2:
                    System.out.println("O carro está freando!");
                    break;
                case 3:
                    System.out.println("Você trocou a marcha do carro!");
                    break;
                case 4:
                    System.out.println("Você virou o carro para a direita!");
                    break;
                case 5:
                    System.out.println("Você virou o carro para a esquerda!");
                    break;
                case 6:
                    System.out.println("Saindo do programa...");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }

            /*
             * if (option == 3) {
             * System.out.println("\n Painel de Marchas: \n");
             * System.out.println("1. NEUTRO");
             * System.out.println("2. PRIMEIRA");
             * System.out.println("3. SEGUNDA");
             * System.out.println("4. TERCEIRA");
             * System.out.println("5. QUARTA");
             * System.out.println("6. QUINTA");
             * System.out.println("7. SEXTA");
             * System.out.println("8. RE");
             * System.out.println("9 . Voltar ao menu principal\n");
             * int marchaEscolhida = scan.nextInt();
             * Carro.marchas[] marchaSelecionada = Carro.marchas.values();
             * if (marchaEscolhida >= 0 && marchaEscolhida < marchaSelecionada.length) {
             * System.out.println("Você escolheu a marcha: " +
             * marchaSelecionada[marchaEscolhida - 1]);
             * } else if (marchaEscolhida == 9) {
             * System.out.println("Voltando ao menu principal.");
             * } else {
             * System.out.println("Marcha inválida. Por favor, escolha uma marcha válida.");
             * }
             * }
             * }
             */
        }
        scan.close();
    }
}
