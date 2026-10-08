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

    @Override
    public void acelerar(int valor) {
        if (valor <= 0) {
            System.out.println("Erro: o valor da aceleração deve ser maior que zero.");
            return;
        }
        int aceleracaoTurbo = this.potenciaTurbo / 10;
        int aceleracaoTotal = valor + aceleracaoTurbo;
        System.out.println("Turbo ativado! Aceleração extra: " + aceleracaoTurbo + " km/h.");
        super.acelerar(aceleracaoTotal);
    }
}