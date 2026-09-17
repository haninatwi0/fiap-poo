package br.com.fiap.main;


import br.com.fiap.model.Passageiro;
<<<<<<< HEAD
=======
import br.com.fiap.model.Veiculo;
import br.com.fiap.model.Viagem;
>>>>>>> 9074eb8 (feat: implementa associacao entre Viagem, Passageiro e Veiculo)

public class SistemaPrincipalPassageiro {

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
       
<<<<<<< HEAD
=======
        
        Passageiro ana = new Passageiro("Ana Silva", "222.222.222-22");
        Veiculo carroDoJoao = new Veiculo("ABC-1234", "Toyota Corolla");
            
        Viagem viagemDaAna = new Viagem("Avenida Paulista, 1000", ana, carroDoJoao);
        
        viagemDaAna.exibirResumo();
        
        ana.adicionarSaldo(50.0);

        System.out.println("Saldo da Ana consultado ATRAVÉS da Viagem: R$ " + viagemDaAna.getSolicitante().getSaldo());
>>>>>>> 9074eb8 (feat: implementa associacao entre Viagem, Passageiro e Veiculo)
    }
}