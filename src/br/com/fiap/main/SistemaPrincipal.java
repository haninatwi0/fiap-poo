package br.com.fiap.main;

import br.com.fiap.model.Carro;
import br.com.fiap.model.Passageiro;

public class SistemaPrincipal {

	public static void main(String[] args) {
		
		Passageiro passageiro1 = new Passageiro();
		passageiro1.nome = "Ana Silva";
		passageiro1.saldo = 50.0;
		
		Passageiro passageiro2 = new Passageiro();
		passageiro2.nome = "Carlos Souza";
		passageiro2.saldo = 12.50;
		
		System.out.println("--- Sistema FiapRide ---");
		System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
		System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);
		
		
		
		Carro carro1 = new Carro();
		carro1.cor = "Preto";
		carro1.marca = "Toyota";
		carro1.ano = 2020;

		Carro carro2 = new Carro();
		carro2.cor = "Branco";
		carro2.marca = "BYD";
		carro2.ano = 2026;

		Carro carro3 = new Carro();
		carro3.cor = "Azul";
		carro3.marca = "Honda";
		carro3.ano = 2024;

		System.out.println();
		System.out.println("Carro 1: " + carro1.cor + " | " + carro1.marca + " | " + carro1.ano);
		System.out.println("Carro 2: " + carro2.cor + " | " + carro2.marca + " | " + carro2.ano);
		System.out.println("Carro 3: " + carro3.cor + " | " + carro3.marca + " | " + carro3.ano);

	}

}
