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

        scan.close();
        System.out.println("Parabéns pela escolha do " + carro.getModelo()
        + " de cor " + carro.getCor() + " ano " + carro.getAno() + "!");
    }
}
