public class Carro {

    private String modelo;
    private String cor;
    private int ano;

    public enum marchas {
        NEUTRO, PRIMEIRA, SEGUNDA, TERCEIRA, QUARTA, QUINTA, SEXTA, RE
    }

    public boolean verificarLigado(boolean ligado) {
        ligado = false;
        if(ligado == true) {
            System.out.println("O carro está ligado.\n");
        } else if(ligado == false){
            System.out.println("O carro está desligado.\n");
        } else {
            System.out.println("Algo de errado.");
        }
        return ligado;
    }

    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
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