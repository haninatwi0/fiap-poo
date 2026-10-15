package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.model.*;

public class SistemaPrincipalHanin {

    public static void main(String[] args) {

        System.out.println("===== SISTEMA DE CARROS =====\n");

        // ==========================================
        // TESTE 1: CLASSE ABSTRATA
        // ==========================================

        // Tentar criar um objeto de MeuCarro diretamente
        // vai gerar erro de compilação.
        //
        // Descomente para testar:
        //
        // MeuCarro carroTeste = new MeuCarro("Preto","Toyota",2024,new Motor("Flex", 150));
        //
        // ERRO: MeuCarro is abstract; cannot be instantiated


        // ==========================================
        // CRIANDO OS MOTORES
        // ==========================================

        Motor motor1 = new Motor("Flex", 150);
        Motor motor2 = new Motor("Elétrico", 204);
        Motor motor3 = new Motor("Turbo", 300);


        // ==========================================
        // CRIANDO OS CARROS
        // ==========================================

        // Agora usamos as classes concretas

        CarroEsportivo carro1 = new CarroEsportivo("Preto","Toyota",2024,motor1,100);

        CarroEletrico carro2 = new CarroEletrico("Branco","BYD",2026,motor2,450);

        CarroEsportivo esportivo = new CarroEsportivo("Vermelho","Ferrari",2025,motor3,120);

        CarroEletrico eletrico = new CarroEletrico("Azul","Tesla",2026,motor2,500);


        // ==========================================
        // DADOS DOS CARROS
        // ==========================================

        System.out.println("--- Dados dos Carros ---");

        System.out.println("Carro 1: " + carro1.getMarca() + " | Cor: " + carro1.getCor() + " | Ano: " + carro1.getAno());

        System.out.println("Carro 2: " + carro2.getMarca()  + " | Cor: " + carro2.getCor() + " | Ano: " + carro2.getAno());


        // ==========================================
        // DADOS DO CARRO ESPORTIVO
        // ==========================================

        System.out.println("\n--- Carro Esportivo ---");

        System.out.println("Marca: " + esportivo.getMarca());

        System.out.println("Cor: " + esportivo.getCor());

        System.out.println("Ano: " + esportivo.getAno());

        System.out.println("Potência do Turbo: " + esportivo.getPotenciaTurbo() + " cv");


        // ==========================================
        // DADOS DO CARRO ELÉTRICO
        // ==========================================

        System.out.println("\n--- Carro Elétrico ---");

        System.out.println("Marca: " + eletrico.getMarca());

        System.out.println("Cor: " + eletrico.getCor());

        System.out.println("Ano: " + eletrico.getAno());

        System.out.println("Autonomia: " + eletrico.getAutonomia() + " km");


        // ==========================================
        // DADOS DOS MOTORES
        // ==========================================

        System.out.println("\n--- Dados dos Motores ---");

        System.out.println("Motor do Carro 1: "+ carro1.getMotor().getTipo()+ " | Potência: "+ carro1.getMotor().getPotencia()+ " cv");

        System.out.println("Motor do Esportivo: "+ esportivo.getMotor().getTipo()+ " | Potência: "+ esportivo.getMotor().getPotencia()+ " cv");

        System.out.println("Motor do Elétrico: "+ eletrico.getMotor().getTipo()+ " | Potência: " + eletrico.getMotor().getPotencia()+ " cv");


        // ==========================================
        // LIGANDO OS CARROS
        // ==========================================

        System.out.println("\n--- Ligando os Carros ---");

        carro1.ligar();
        carro2.ligar();
        esportivo.ligar();
        eletrico.ligar();


        // ==========================================
        // TESTE DO MÉTODO ABSTRATO
        // ==========================================

        System.out.println("\n--- Tipos dos Carros ---");

        System.out.println(carro1.getMarca()+ ": "+ carro1.tipoDeCarro());

        System.out.println(carro2.getMarca()+ ": "+ carro2.tipoDeCarro());

        System.out.println(esportivo.getMarca()+ ": "+ esportivo.tipoDeCarro());

        System.out.println(eletrico.getMarca()+ ": "+ eletrico.tipoDeCarro());


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

            System.out.println("Tipo: " + carro.tipoDeCarro());

            carro.acelerar(50);
        }


        // ==========================================
        // POLIMORFISMO COM ARRAY
        // ==========================================

        System.out.println("\n--- Polimorfismo com Classe Abstrata ---");

        MeuCarro[] frota = new MeuCarro[] {
            new CarroEletrico("Branco","BYD",2026,motor2,450),
            new CarroEsportivo( "Preto","Porsche",2025, motor3,150),
            new CarroEletrico("Cinza", "Tesla",2026, motor2,500)
        };

        for (MeuCarro carro : frota) {
        	System.out.println("Marca: " + carro.getMarca());
        	System.out.println("Tipo: " + carro.tipoDeCarro());
            System.out.println("---");
        }
    }
}