package br.com.fiap.model;

public class Carro {

    private String cor;
    private String marca;
    private int ano;
    private boolean ligado;
    private int velocidade;
<<<<<<< HEAD

    public Carro(String cor, String marca, int ano) {
=======
    private Motor motor;

    public Carro(String cor, String marca, int ano,Motor motor) {
>>>>>>> 9074eb8 (feat: implementa associacao entre Viagem, Passageiro e Veiculo)

        this.setCor(cor);
        this.marca = marca;
        this.ano = ano;
        this.setLigado(false);
        this.setVelocidade(0);
<<<<<<< HEAD
=======
        this.motor = motor;
>>>>>>> 9074eb8 (feat: implementa associacao entre Viagem, Passageiro e Veiculo)
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

<<<<<<< HEAD
    public boolean isLigado() {
=======
    public Motor getMotor() {
		return this.motor;
	}

	public boolean isLigado() {
>>>>>>> 9074eb8 (feat: implementa associacao entre Viagem, Passageiro e Veiculo)
        return this.ligado;
    }

    public int getVelocidade() {
        return this.velocidade;
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
            System.out.println(
                "Erro de Segurança: A velocidade não pode ser negativa!"
            );
        }
    }

<<<<<<< HEAD
    // Métodos de comportamento

=======
>>>>>>> 9074eb8 (feat: implementa associacao entre Viagem, Passageiro e Veiculo)
    public void ligar() {

        if (!this.ligado) {

            this.setLigado(true);

            System.out.println("O carro foi ligado.");

        } else {

            System.out.println("O carro já está ligado.");
        }
    }

    public void acelerar(int valor) {

        if (!this.ligado) {

            System.out.println("Não é possível acelerar. O carro está desligado.");
            return;
        }

        if (valor <= 0) {

            System.out.println("Erro: O valor da aceleração deve ser maior que zero.");
            return;
        }

        this.setVelocidade(this.velocidade + valor);

        System.out.println(
            "O carro acelerou. Velocidade atual: "
            + this.getVelocidade()
            + " km/h"
        );
    }
}