package br.com.fiap.model;

public class CarroEletrico extends MeuCarro {

    private int autonomia;

    public CarroEletrico(String cor,String marca,int ano,Motor motor,int autonomia) {
        super(cor, marca, ano, motor);
        this.autonomia = autonomia;
    }

    public int getAutonomia() {
        return this.autonomia;
    }
}