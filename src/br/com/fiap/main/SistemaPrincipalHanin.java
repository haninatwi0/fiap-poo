package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.model.*;

public class SistemaPrincipalHanin {

    public static void main(String[] args) {

        System.out.println("===== SISTEMA DE CARROS =====\n");

        // Criando os motores
        Motor motor1 = new Motor("Flex", 150);
        Motor motor2 = new Motor("Elétrico", 204);
        Motor motor3 = new Motor("Turbo", 300);

        // Criando os carros
        MeuCarro carro1 = new MeuCarro("Preto","Toyota",2024,motor1);

        MeuCarro carro2 = new MeuCarro("Branco","BYD",2026,motor2);

        CarroEsportivo esportivo = new CarroEsportivo("Vermelho","Ferrari",2025,motor3,120);

        CarroEletrico eletrico = new CarroEletrico("Azul","Tesla",2026,motor2,500);

        // Dados dos carros
        System.out.println("--- Dados dos Carros ---");
        
        System.out.println("Carro 1: " + carro1.getMarca() + " | Cor: " + carro1.getCor() + " | Ano: " + carro1.getAno());

        System.out.println("Carro 2: " + carro2.getMarca() + " | Cor: " + carro2.getCor() + " | Ano: " + carro2.getAno() );

        // Dados do carro esportivo
        System.out.println("\n--- Carro Esportivo ---");

        System.out.println("Marca: " + esportivo.getMarca());

        System.out.println("Cor: " + esportivo.getCor());

        System.out.println("Ano: " + esportivo.getAno());

        System.out.println("Potência do Turbo: " + esportivo.getPotenciaTurbo() + " cv");

        // Dados do carro elétrico
        System.out.println("\n--- Carro Elétrico ---");

        System.out.println("Marca: " + eletrico.getMarca());

        System.out.println("Cor: " + eletrico.getCor());

        System.out.println("Ano: " + eletrico.getAno());

        System.out.println("Autonomia: " + eletrico.getAutonomia() + " km");

        // Dados dos motores
        System.out.println("\n--- Dados dos Motores ---");

        System.out.println("Motor do Carro 1: " + carro1.getMotor().getTipo() + " | Potência: " + carro1.getMotor().getPotencia() + " cv");

        System.out.println("Motor do Esportivo: " + esportivo.getMotor().getTipo() + " | Potência: " + esportivo.getMotor().getPotencia() + " cv");

        System.out.println("Motor do Elétrico: " + eletrico.getMotor().getTipo() + " | Potência: " + eletrico.getMotor().getPotencia() + " cv");

        
        // Ligando os carros
        carro1.ligar();
        carro2.ligar();
        esportivo.ligar();
        eletrico.ligar();
        
	     // ==========================================
	     // TESTE DE POLIMORFISMO
	     // ==========================================
	
	     System.out.println("\n--- Teste de Polimorfismo ---");
	
	     List<MeuCarro> carros = new ArrayList<>();
	
	     carros.add(carro1);
	     carros.add(carro2);
	     carros.add(esportivo);
	     carros.add(eletrico);
	
	     for (MeuCarro carro : carros) {
	         System.out.println("\nCarro: " + carro.getMarca());
	         carro.acelerar(50);
	     }
    }
}