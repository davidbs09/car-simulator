public class Carro {

    private String modelo;
    private String cor;
    private int ano;
    private marchas marchaAtual = marchas.NEUTRO;

    public enum marchas {
        NEUTRO, PRIMEIRA, SEGUNDA, TERCEIRA, QUARTA, QUINTA, SEXTA, RE
    }

    public void setMarchaAtual(marchas novaMarcha) {
        this.marchaAtual = novaMarcha;
    }
    
    public marchas getMarchaAtual() {
        return marchaAtual;
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