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

    @Override
    public void acelerar(int valor) {
        if (valor <= 0) {
            System.out.println("Erro: o valor da aceleração deve ser maior que zero.");
            return;
        }
        int aceleracaoEficiente = valor + (valor / 5);
        System.out.println("Modo elétrico eficiente ativado.");
        super.acelerar(aceleracaoEficiente);
    }
}