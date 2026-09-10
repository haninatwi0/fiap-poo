package br.com.fiap.main;

import br.com.fiap.model.Carro;

public class SistemaPrincipalCarro {

    public static void main(String[] args) {

        System.out.println("--- Sistema Carro ---\n");

        Carro carro1 = new Carro("Preto", "Toyota", 2024);

        Carro carro2 = new Carro("Branco", "BYD", 2026);

        System.out.println("--- Dados dos Carros ---");

        System.out.println(
            "Carro 1: "
            + carro1.getCor()
            + " | Marca: "
            + carro1.getMarca()
            + " | Ano: "
            + carro1.getAno()
        );

        System.out.println(
            "Carro 2: "
            + carro2.getCor()
            + " | Marca: "
            + carro2.getMarca()
            + " | Ano: "
            + carro2.getAno()
        );

        System.out.println("\n--- Testando ligar() ---");

        carro1.ligar();

        // Tentando ligar novamente
        carro1.ligar();

        System.out.println("\n--- Testando acelerar() ---");

        // Valor válido
        carro1.acelerar(20);

        // Valor inválido
        carro1.acelerar(-10);

        System.out.println("\n--- Testando Encapsulamento ---");



        System.out.println(
            "Velocidade atual: "
            + carro1.getVelocidade()
            + " km/h"
        );

        System.out.println("\n--- Estado Final ---");

        System.out.println("Ligado: " + carro1.isLigado());

        System.out.println(
            "Velocidade: "
            + carro1.getVelocidade()
            + " km/h"
        );
    }
}