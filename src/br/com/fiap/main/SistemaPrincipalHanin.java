package br.com.fiap.main;

import br.com.fiap.model.*;

public class SistemaPrincipalHanin {

    public static void main(String[] args) {

        System.out.println("=== TESTES DA TRILHA DE POO - FIAP ===");
        System.out.println();

        // ================================================================
        // Aula 1 - Fundamentos de OO - Classes e Objetos
        // ================================================================
        System.out.println("-> [Aula 1] Testando criação de classes e objetos:");
        Motor motorBasico = new Motor("1.6 Turbo", 150);
        System.out.println("Motor criado com sucesso: " + motorBasico.getTipo());
        
        /* 
         * OBS DA AULA 1: Antigamente dava pra fazer "new MeuCarro(...)".
         * Mas como a classe MeuCarro virou abstrata na Aula 8, agora a gente 
         * só instancia as classes filhas dela! Deixei anotado aqui.
         */
        System.out.println();

        // ================================================================
        // Aula 2 - Métodos e Comportamentos
        // ================================================================
        System.out.println("-> [Aula 2] Testando métodos e comportamentos:");
        Motor motorV8 = new Motor("V8", 500);
        MeuCarroEsportivo minhaFerrari = new MeuCarroEsportivo("Vermelho", "Ferrari", 2022, motorV8, 60);
        
        // Chamando os métodos que fazem o carro agir
        minhaFerrari.ligar();
        minhaFerrari.acelerar(40);
        System.out.println();

        // ================================================================
        // Aula 3 - Protegendo o Sistema - Encapsulamento (Getters e Setters)
        // ================================================================
        System.out.println("-> [Aula 3] Testando encapsulamento (Getters e Setters):");
        System.out.println("Cor atual (pegando com o get): " + minhaFerrari.getCor());
        
        // Mudando a cor usando o set com segurança
        minhaFerrari.setCor("Preto Fosco");
        System.out.println("Cor nova (depois do set): " + minhaFerrari.getCor());
        
        // Tentando colocar velocidade negativa (a regra do set barra isso)
        minhaFerrari.acelerar(-20);
        System.out.println();

        // ================================================================
        // Aula 4 - Construtores
        // ================================================================
        System.out.println("-> [Aula 4] Testando construtores:");
        // O construtor obriga a gente a passar os dados principais logo na criação
        Motor motorPorsche = new Motor("Boxster", 450);
        MeuCarroEsportivo porsche = new MeuCarroEsportivo("Prata", "Porsche", 2023, motorPorsche, 50);
        System.out.println("Porsche criada com o construtor! Ano: " + porsche.getAno());
        System.out.println();

        // ================================================================
        // Aula 5 - Quando os Objetos Conversam - Relacionamentos (Associação)
        // ================================================================
        System.out.println("-> [Aula 5] Testando relacionamentos (Associação):");
        // O carro tem um objeto Motor guardado dentro dele
        System.out.println("A " + porsche.getMarca() + " usa um motor: " 
                + porsche.getMotor().getTipo() + " (" + porsche.getMotor().getPotencia() + " HP)");
        System.out.println();

        // ================================================================
        // Aula 6 - A Árvore Genealógica - Herança (Generalização)
        // ================================================================
        System.out.println("-> [Aula 6] Testando herança:");
        Motor motorEletrico = new Motor("Elétrico Puro", 400);
        MeuCarroEletrico tesla = new MeuCarroEletrico("Branco", "Tesla", 2024, motorEletrico, 500);

        // O Tesla herdou a marca e o método ligar da classe MeuCarro
        tesla.ligar();
        System.out.println("Marca herdada: " + tesla.getMarca());
        System.out.println("Atributo próprio do elétrico (autonomia): " + tesla.getAutonomia() + " km");
        System.out.println();

        // ================================================================
        // Aula 7 - Muitas Formas - Polimorfismo de Sobrescrita
        // ================================================================
        System.out.println("-> [Aula 7] Testando polimorfismo de sobrescrita (@Override):");
        System.out.println("Acelerando a Ferrari (método com turbo sobrescrito):");
        minhaFerrari.ligar();
        minhaFerrari.acelerar(30);

        System.out.println("\nAcelerando o Tesla (método com eficiência elétrica sobrescrito):");
        tesla.acelerar(30);
        System.out.println();

        // ================================================================
        // Aula 8 - O Molde Invisível - Classes Abstratas
        // ================================================================
        System.out.println("-> [Aula 8] Testando classes abstratas e polimorfismo em array:");
        // MeuCarro é abstrata, mas posso criar um array dela e colocar os filhos dentro
        MeuCarro[] minhaGaragem = { minhaFerrari, porsche, tesla };

        for (MeuCarro c : minhaGaragem) {
            // Chamando o método abstrato que cada classe filha teve que implementar do seu jeito
            System.out.println("Carro: " + c.getMarca() + " | Tipo: " + c.tipoDeCarro());
        }
        System.out.println();

        // ================================================================
        // Aula 9 - O Contrato de Comportamento - Interfaces
        // ================================================================
        System.out.println("-> [Aula 9] Testando interfaces (contrato de comportamento):");
        Elevador predio = new Elevador(42, 6000);
        ServidorCloud aws = new ServidorCloud("10.0.1.15", 89.5);

        // Juntando carros, elevador e servidor numa interface só! Nada a ver, mas funciona hehe
        Inspecionavel[] listaParaInspecao = { minhaFerrari, tesla, predio, aws };

        for (Inspecionavel item : listaParaInspecao) {
            System.out.println("----------------------------------------");
            item.executarDiagnostico();
            
            if (item.precisaDeManutencao()) {
                System.out.println("Status: Precisa de manutenção!");
            } else {
                System.out.println("Status: Tudo ok por aqui.");
            }
        }

        System.out.println("\n=== FIM DOS TESTES - TUDO RODANDO CERTINHO! ===");
    }
}