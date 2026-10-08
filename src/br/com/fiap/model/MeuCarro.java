package br.com.fiap.model;

public class MeuCarro {

    private String cor;
    private String marca;
    private int ano;
    private boolean ligado;
    private int velocidade;
    private Motor motor;

    public MeuCarro(String cor, String marca, int ano, Motor motor) {
        this.setCor(cor);
        this.marca = marca;
        this.ano = ano;
        this.ligado = false;
        this.velocidade = 0;
        this.motor = motor;
    }

    public String getCor() {
        return this.cor;
    }

    public String getMarca() {
        return this.marca;
    }

    public int getAno() {
        return this.ano;
    }

    public boolean isLigado() {
        return this.ligado;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public Motor getMotor() {
        return this.motor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private void setVelocidade(int velocidade) {
        if (velocidade >= 0) {
            this.velocidade = velocidade;
        } else {
            System.out.println("Erro de segurança: a velocidade não pode ser negativa.");
        }
    }

    public void ligar() {
        if (!this.ligado) {
            this.setLigado(true);
            System.out.println(this.marca + " foi ligado.");
        } else {
            System.out.println(this.marca + " já está ligado.");
        }
    }

    public void acelerar(int valor) {
        if (!this.ligado) {
            System.out.println("Não é possível acelerar. " + this.marca + " está desligado.");
            return;
        }
        if (valor <= 0) {
            System.out.println("Erro: o valor da aceleração deve ser maior que zero.");
            return;
        }
        this.setVelocidade(this.velocidade + valor);
        System.out.println(this.marca+ " acelerou " + valor + " km/h. Velocidade atual: " + this.velocidade + " km/h.");
    }
}