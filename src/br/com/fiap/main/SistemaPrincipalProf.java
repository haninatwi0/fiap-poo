package br.com.fiap.main;

import br.com.fiap.model.Carro;
import br.com.fiap.model.Moto;
import br.com.fiap.model.Passageiro;
import br.com.fiap.model.Veiculo;
import br.com.fiap.model.Viagem;

public class SistemaPrincipalProf {

    public static void main(String[] args) {
        
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
        
        Passageiro ana = new Passageiro("Ana Silva", "222.222.222-22");
        Veiculo carroDoJoao = new Veiculo("ABC-1234", "Toyota Corolla");
            
        Viagem viagemDaAna = new Viagem("Avenida Paulista, 1000", ana, carroDoJoao);
        
        viagemDaAna.exibirResumo();
        
        ana.adicionarSaldo(50.0);

        System.out.println("Saldo da Ana consultado ATRAVÉS da Viagem: R$ " + viagemDaAna.getSolicitante().getSaldo());
    
        System.out.println("--- FIAPRIDE: Teste de Frota ---");
        
        // 1. Instanciando os objetos específicos   
        int quantidadePassageiro = 4;     
        Carro uberX = new Carro("ABC-1234", "Chevrolet Onix", quantidadePassageiro);
        Moto mottu = new Moto("ABC-9999", "Caloi City", true);
        
        // 2. O TESTE: Um Carro consegue acessar getPlaca() da mãe?        
        // Sim! Note que nós não escrevemos getPlaca() dentro da classe Carro. Ele herdou!        
        System.out.println("Carro modelo: " + uberX.getModelo() + " | Placa: " + uberX.getPlaca());
        System.out.println("Vagas para passageiros: " + uberX.getCapacidadePassageiros());
        
        System.out.println("\nMoto modelo: " + mottu.getModelo() + " | Placa: " + mottu.getPlaca());
        
        // Se a moto é elétrica, ela avisa:        
        if (mottu.isEletrica()) {
            System.out.println("Atenção: Esta moto é elétrica e atinge maiores velocidades!");
        }
    }
}   