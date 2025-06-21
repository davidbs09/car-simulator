import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

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

        boolean sair = false;
        while (!sair) {
            System.out.println("Funções do carro:");
            System.out.println("1. Ligar o Carro");
            System.out.println("2. Desligar Carro");
            System.out.println("3. Trocar marcha");
            System.out.println("4. Acelerar");
            System.out.println("5. Frear");
            System.out.println("6. Verificar a velocidade");
            System.out.println("7. Virar para a direita");
            System.out.println("8. Virar para a esquerda");
            System.out.println("9. Sair do programa\n");
            int option = scan.nextInt();

            switch (option) {
                case 1:
                    carro.ligar();
                    break;
                case 2:
                    carro.desligar();
                    break;
                case 3:
                    boolean sairMarcha = false;
                    while (!sairMarcha) {
                        System.out.println("\nPainel de Marchas:");
                        System.out.println("1. NEUTRO");
                        System.out.println("2. PRIMEIRA");
                        System.out.println("3. SEGUNDA");
                        System.out.println("4. TERCEIRA");
                        System.out.println("5. QUARTA");
                        System.out.println("6. QUINTA");
                        System.out.println("7. SEXTA");
                        System.out.println("8. RE");
                        System.out.println("9. Voltar ao menu principal\n");
                        int opcaoMarcha = scan.nextInt();

                        switch (opcaoMarcha) {
                            case 1:
                                carro.trocarMarcha(Carro.marchas.NEUTRO);
                                break;
                            case 2:
                                carro.trocarMarcha(Carro.marchas.PRIMEIRA);
                                break;
                            case 3:
                                carro.trocarMarcha(Carro.marchas.SEGUNDA);
                                break;
                            case 4:
                                carro.trocarMarcha(Carro.marchas.TERCEIRA);
                                break;
                            case 5:
                                carro.trocarMarcha(Carro.marchas.QUARTA);
                                break;
                            case 6:
                                carro.trocarMarcha(Carro.marchas.QUINTA);
                                break;
                            case 7:
                                carro.trocarMarcha(Carro.marchas.SEXTA);
                                break;
                            case 8:
                                carro.trocarMarcha(Carro.marchas.RE);
                                break;
                            case 9:
                                sairMarcha = true;
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                        }
                    }
                    break;
                case 4:
                    carro.acelerar();
                    break;
                case 5:
                    carro.frear();
                    break;
                case 6:
                    System.out.println("Velocidade atual: " + carro.getVelocidade() + " km/h\n");
                    break;
                case 7:
                    carro.virar("direita");
                    break;
                case 8:
                    carro.virar("esquerda");
                    break;
                case 9:
                    System.out.println("Saindo do programa...");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scan.close();
    }
}