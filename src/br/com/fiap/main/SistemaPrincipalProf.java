package br.com.fiap.main;

import br.com.fiap.model.*;
import java.util.ArrayList;
import java.util.List;

public class SistemaPrincipalProf {
    public static void main(String[] args) {
        
        // --- Snippet 1 ---
    	/*{
            Passageiro passageiro1 = new Passageiro();
            passageiro1.nome = "Ana Silva";
            passageiro1.saldo = 50.0;

            Passageiro passageiro2 = new Passageiro();
            passageiro2.nome = "Carlos Souza";
            passageiro2.saldo = 12.50;

            System.out.println("--- Sistema FiapRide ---");
            System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
            System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);
        }

        // --- Snippet 2 ---
        {
            Passageiro passageiro1 = new Passageiro("Ana Silva", "222");
            System.out.println("Regarga passageiro 1");
            passageiro1.adicionarSaldo(50.0);

            Passageiro passageiro2 = new Passageiro("Carlos Souza", "333");
            System.out.println("Regarga passageiro 2");
            passageiro2.adicionarSaldo(12.5);

            System.out.println("--- Sistema FiapRide ---");
            System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$ " + passageiro1.saldo + " | CPF: " + passageiro1.cpf);
            System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$ " + passageiro2.saldo + " | CPF: " + passageiro2.cpf);
            
            System.out.println("Pagando viagem do passageiro 1");
            passageiro1.pagarViagem(20);
            System.out.println("Pagando viagem do passageiro 2");
            passageiro2.pagarViagem(20);
        }*/

        // --- Snippet 3 ---
        {
            System.out.println("--- Iniciando o Sistema FiapRide --- \n");
            
            Passageiro passageiro1 = new Passageiro("Ana Silva", "222.222.222-22");
            System.out.println(">>> Recarga Passageiro 1:");
            passageiro1.adicionarSaldo(50.0);

            Passageiro passageiro2 = new Passageiro("Carlos Souza", "333.333.333-33");
            System.out.println(">>> Recarga Passageiro 2:");
            passageiro2.adicionarSaldo(12.5);

            System.out.println("\n--- Status dos Passageiros ---");
            System.out.println("Passageiro: " + passageiro1.getNome() + " | Saldo: R$ " + passageiro1.getSaldo() + " | CPF: " + passageiro1.getCpf());
            System.out.println("Passageiro: " + passageiro2.getNome() + " | Saldo: R$ " + passageiro2.getSaldo() + " | CPF: " + passageiro2.getCpf());
            
            System.out.println("\n--- Realizando Viagens ---");
            System.out.println("Pagando viagem do passageiro 1 (Ana)...");
            passageiro1.pagarViagem(20.0);
            
            System.out.println("\nPagando viagem do passageiro 2 (Carlos)...");
            passageiro2.pagarViagem(20.0);
        }

        // --- Snippet 4 ---
       /* {
            Veiculo meuCarro = new Veiculo("ABC-1234", "Toyota Corolla");
        }

        // --- Snippet 5 ---
        {
            System.out.println("--- FIAPRIDE: Inicializando Sistema ---");
            
            Passageiro ana = new Passageiro("Ana Silva", "222.222.222-22");
            Veiculo carroDoJoao = new Veiculo("ABC-1234", "Toyota Corolla");
            
            Viagem viagemDaAna = new Viagem("Avenida Paulista, 1000", ana, carroDoJoao);
            
            viagemDaAna.exibirResumo();
            
            ana.adicionarSaldo(50.0);

            System.out.println("Saldo da Ana consultado ATRAVÉS da Viagem: R$ " + viagemDaAna.getSolicitante().getSaldo());
        }

        // --- Snippet 6 ---
        {
            System.out.println("--- FIAPRIDE: Teste de Frota ---");
            
            int quantidadePassageiro = 4;     
            Carro uberX = new Carro("ABC-1234", "Chevrolet Onix", quantidadePassageiro);
            Moto mottu = new Moto("ABC-9999", "Caloi City", true);
            
            System.out.println("Carro modelo: " + uberX.getModelo() + " | Placa: " + uberX.getPlaca());
            System.out.println("Vagas para passageiros: " + uberX.getCapacidadePassageiros());
            
            System.out.println("\nMoto modelo: " + mottu.getModelo() + " | Placa: " + mottu.getPlaca());
            
            if (mottu.isEletrica()) {
                System.out.println("Atenção: Esta moto é elétrica e atinge maiores velocidades!");
            }
        }*/

        // --- Snippet 7 ---
        {
            List<Veiculo> frota = new ArrayList<>();
            frota.add(new Carro("ABC-1234", "Honda Civic"));
            frota.add(new Moto("DEF-5678", "Honda CG 160"));
            System.out.println("--- ⛽ RELATÓRIO DE AUTONOMIA DA FROTA ---");
            for (Veiculo veiculo : frota) {
                System.out.println("Veículo: " + veiculo.getModelo());
                veiculo.abaster(50);
                System.out.println(veiculo.calcularAutonomia()); 
                System.out.println("---------------------------------------");
            }
        }

        // --- Snippet 8 ---
        {
            System.out.println("=== FIAPRIDE: Teste de Interfaces ===");
            System.out.println();
            
            CarroEletrico tesla = new CarroEletrico("TES-9999", "Tesla Model 3");
            Celular iphone = new Celular("iPhone 15");
            
            Recarregavel[] recarregaveis = new Recarregavel[] {
                tesla,
                iphone
            };
            
            System.out.println("=== Recarregando Tudo ===");
            for (Recarregavel r : recarregaveis) {
                r.recarregar(85);
                System.out.println("---");
            }
            
            System.out.println();
            System.out.println("=== Múltiplos Tipos ===");
            
            System.out.println("Tesla é um Veiculo? " + (tesla instanceof Veiculo));
            System.out.println("Tesla é Recarregavel? " + (tesla instanceof Recarregavel));
            
            System.out.println("Celular é um Veiculo? " + (Veiculo.class.isInstance(iphone)));
            System.out.println("Celular é Recarregavel? " + (iphone instanceof Recarregavel));
            
            System.out.println();
            System.out.println("=== Autonomia do Carro Elétrico ===");
            System.out.println(tesla.calcularAutonomia());
            
            System.out.println();
            System.out.println("=== Bateria do Celular ===");
            System.out.println(iphone.getNivelBateria());
        }

    }
}