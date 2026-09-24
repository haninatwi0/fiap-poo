package br.com.fiap.main;

import br.com.fiap.model.MeuCarro;
import br.com.fiap.model.Motor;
import br.com.fiap.model.CarroEsportivo;
import br.com.fiap.model.CarroEletrico;

public class SistemaPrincipalHanin {

    public static void main(String[] args) {

        System.out.println("--- SISTEMA CARRO ---\n");

        Motor motor1 = new Motor("Flex", 150);
        Motor motor2 = new Motor("Elétrico", 204);
        Motor motor3 = new Motor("Turbo", 300);

        MeuCarro carro1 = new MeuCarro("Preto","Toyota",2024,motor1);

        MeuCarro carro2 = new MeuCarro("Branco","BYD",2026,motor2);

        CarroEsportivo esportivo = new CarroEsportivo("Vermelho","Ferrari",2025,motor3,120);

        CarroEletrico eletrico = new CarroEletrico("Azul","Tesla",2026,motor2,500);

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


        System.out.println("\n--- Carro Esportivo ---");

        System.out.println(
            "Marca: "
            + esportivo.getMarca()
        );

        System.out.println(
            "Modelo: "
            + esportivo.getCor()
        );

        System.out.println(
            "Ano: "
            + esportivo.getAno()
        );

        System.out.println(
            "Potência Turbo: "
            + esportivo.getPotenciaTurbo()
            + " cv"
        );

        esportivo.ligar();

        esportivo.acelerar(50);

        System.out.println("\n--- Carro Elétrico ---");

        System.out.println(
            "Marca: "
            + eletrico.getMarca()
        );

        System.out.println(
            "Cor: "
            + eletrico.getCor()
        );

        System.out.println(
            "Ano: "
            + eletrico.getAno()
        );

        System.out.println(
            "Autonomia: "
            + eletrico.getAutonomia()
            + " km"
        );

        eletrico.ligar();

        eletrico.acelerar(30);

        System.out.println("\n--- Dados dos Motores ---");

        System.out.println(
            "Motor do Carro 1: "
            + carro1.getMotor().getTipo()
            + " | Potência: "
            + carro1.getMotor().getPotencia()
            + " cv"
        );

        System.out.println(
            "Motor do Esportivo: "
            + esportivo.getMotor().getTipo()
            + " | Potência: "
            + esportivo.getMotor().getPotencia()
            + " cv"
        );

        System.out.println(
            "Motor do Elétrico: "
            + eletrico.getMotor().getTipo()
            + " | Potência: "
            + eletrico.getMotor().getPotencia()
            + " cv"
        );

        System.out.println("\n--- Teste de Herança ---");

        System.out.println(
            "Carro esportivo é um meuCarro: "
            + (esportivo instanceof MeuCarro)
        );

        System.out.println(
            "Carro elétrico é um meuCarro: "
            + (eletrico instanceof MeuCarro)
        );
    }
}