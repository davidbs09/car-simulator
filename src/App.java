import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option;
        String marchas = "";

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
            System.out.println("1. Ligar o Carro");
            System.out.println("2. Desligar Carro");
            System.out.println("3. Trocar marcha");
            System.out.println("4. Acelerar");
            System.out.println("5. Frear");
            System.out.println("6. Verificar a velocidade");
            System.out.println("7. Virar para a direita");
            System.out.println("8. Virar para a esquerda");
            System.out.println("9. Sair do programa\n");
            option = scan.nextInt();

            switch (option) {
                case 1:
                    if (carro.verificarLigado(true)) {
                        System.out.println("\nO carro já está ligado.\n");
                    } else {
                        System.out.println("\nCarro agora está ligado.");
                        break;
                    }
                case 2:
                    if (carro.verificarLigado(false)) {
                        System.out.println("\nO carro já está desligado.\n");
                    } else {
                        System.out.println("\nCarro agora está desligado");
                        break;
                    }
                case 3:
                    System.out.println("\nPainel de Marchas: \n");
                    System.out.println("1. NEUTRO");
                    System.out.println("2. PRIMEIRA");
                    System.out.println("3. SEGUNDA");
                    System.out.println("4. TERCEIRA");
                    System.out.println("5. QUARTA");
                    System.out.println("6. QUINTA");
                    System.out.println("7. SEXTA");
                    System.out.println("8. RE");
                    System.out.println("9 . Voltar ao menu principal\n");
                    marchas = scan.next().toUpperCase();
                    if (marchas == "RE") {
                        System.out.println("Marcha ré engatada");
                    } else if (marchas == "NEUTRO") {
                        System.out.println("Ponto morto engatado");
                    } else if (marchas.equals("PRIMEIRA")) {
                        System.out.println("Marcha " + marchas + " engatada. Pode acelerar se quiser :)");
                    } else {
                        System.out.println("\nMarcha inválida. Por favor, selecione uma marcha válida para acelerar.");
                    }
                    break;
                case 4:
                    if (marchas.equals("PRIMEIRA")) {
                        
                    }
                case 5:
                    System.out.println("\nVocê virou o carro para a esquerda!");
                    break;
                case 6:
                    System.out.println("\nSaindo do programa...");
                    sair = true;
                    break;
            }
        }
        scan.close();
    }
}
// guardando método para depois
// if (marchas == "NEUTRO" || carro.verificarLigado(false)) {}
