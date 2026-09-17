package br.com.fiap.main;

import br.com.fiap.model.Carro;
<<<<<<< HEAD
=======
import br.com.fiap.model.Motor;
>>>>>>> 9074eb8 (feat: implementa associacao entre Viagem, Passageiro e Veiculo)

public class SistemaPrincipalCarro {

    public static void main(String[] args) {

        System.out.println("--- Sistema Carro ---\n");

<<<<<<< HEAD
        Carro carro1 = new Carro("Preto", "Toyota", 2024);

        Carro carro2 = new Carro("Branco", "BYD", 2026);
=======
        Motor motor1 = new Motor("Flex", 150);
        Motor motor2 = new Motor("Elétrico", 204); 
        
        Carro carro1 = new Carro("Preto", "Toyota", 2024,motor1);

        Carro carro2 = new Carro("Branco", "BYD", 2026,motor2);
>>>>>>> 9074eb8 (feat: implementa associacao entre Viagem, Passageiro e Veiculo)

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
<<<<<<< HEAD
=======
        
        System.out.println("\n--- Dados dos Motores ---");

        System.out.println(
            "Motor do Carro 1: "
            + carro1.getMotor().getTipo()
            + " | Potência: "
            + carro1.getMotor().getPotencia()
            + " cv"
        );

        System.out.println(
            "Motor do Carro 2: "
            + carro2.getMotor().getTipo()
            + " | Potência: "
            + carro2.getMotor().getPotencia()
            + " cv"
        );
>>>>>>> 9074eb8 (feat: implementa associacao entre Viagem, Passageiro e Veiculo)
    }
}