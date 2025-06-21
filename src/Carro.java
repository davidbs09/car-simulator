public class Carro {

    private String modelo;
    private String cor;
    private int ano;
    private boolean ligado = false;
    private int velocidade = 0;
    private marchas marchaAtual = marchas.NEUTRO;

    public enum marchas {
        NEUTRO, PRIMEIRA, SEGUNDA, TERCEIRA, QUARTA, QUINTA, SEXTA, RE
    }

    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public void ligar() {
        if (ligado) {
            System.out.println("\nO carro já está ligado.");
        } else {
            ligado = true;
            System.out.println("\nCarro ligado.");
        }
    }

    public void desligar() {
        if (!ligado) {
            System.out.println("\nO carro já está desligado.");
        } else if (marchaAtual == marchas.NEUTRO && velocidade == 0) {
            ligado = false;
            System.out.println("\nCarro desligado.");
        } else {
            System.out.println("\nSó é possível desligar em ponto morto e velocidade 0.");
        }
    }

    public void trocarMarcha(marchas novaMarcha) {
        if (!ligado) {
            System.out.println("\nO carro está desligado. Ligue-o primeiro.");
            return;
        }
        int atual = marchaAtual.ordinal();
        int nova = novaMarcha.ordinal();
        int diff = Math.abs(nova - atual);

        // Não pode pular marchas (exceto para NEUTRO e RE)
        if (novaMarcha != marchas.NEUTRO && novaMarcha != marchas.RE && diff > 1) {
            System.out.println("\nNão é permitido pular marchas.");
            return;
        }

        // Limites de velocidade por marcha
        int[] min = {0, 0, 20, 40, 60, 80, 100, 0};
        int[] max = {0, 20, 40, 60, 80, 100, 120, 20};
        if (velocidade < min[nova] || velocidade > max[nova]) {
            System.out.println("\nVelocidade incompatível com a marcha.");
            return;
        }

        marchaAtual = novaMarcha;
        System.out.println("\nMarcha atual: " + marchaAtual);
    }

    public void acelerar() {
        if (!ligado) {
            System.out.println("\nO carro está desligado.");
            return;
        }
        int[] max = {0, 20, 40, 60, 80, 100, 120, 20};
        if (marchaAtual == marchas.NEUTRO) {
            System.out.println("\nNão é possível acelerar em ponto morto.");
            return;
        }
        if (velocidade >= max[marchaAtual.ordinal()]) {
            System.out.println("\nVelocidade máxima atingida para esta marcha.");
            return;
        }
        velocidade++;
        System.out.println("\nVelocidade atual: " + velocidade + " km/h");
    }

    public void frear() {
        if (!ligado) {
            System.out.println("\nO carro está desligado.");
            return;
        }
        if (velocidade == 0) {
            System.out.println("\nO carro já está parado.");
            return;
        }
        velocidade--;
        System.out.println("\nVelocidade atual: " + velocidade + " km/h");
    }

    public void virar(String direcao) {
        if (!ligado) {
            System.out.println("\nO carro está desligado.");
            return;
        }
        if (velocidade < 1 || velocidade > 40) {
            System.out.println("\nSó pode virar entre 1km/h e 40km/h.");
            return;
        }
        System.out.println("\nVirando para a " + direcao + "!");
    }

    public int getVelocidade() {
        return velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }
}