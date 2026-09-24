package br.com.fiap.model;

public class CarroEsportivo extends MeuCarro {

    private int potenciaTurbo;

    public CarroEsportivo(String cor,String marca,int ano,Motor motor,int potenciaTurbo) {
        super(cor, marca, ano, motor);
        this.potenciaTurbo = potenciaTurbo;
    }

    public int getPotenciaTurbo() {
        return this.potenciaTurbo;
    }
}