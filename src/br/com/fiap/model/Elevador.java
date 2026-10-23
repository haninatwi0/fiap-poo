package br.com.fiap.model;

public class Elevador implements Inspecionavel {

    private int idElevador;
    private int viagensRealizadas;

    public Elevador(int idElevador, int viagensRealizadas) {
        this.idElevador = idElevador;
        this.viagensRealizadas = viagensRealizadas;
    }

    public int getIdElevador() {
        return idElevador;
    }

    @Override
    public void executarDiagnostico() {
        System.out.println("Testando freios de emergência e cabos de aço do Elevador #" + this.idElevador + "...");
    }

    @Override
    public boolean precisaDeManutencao() {
        // Precisa de manutenção se tiver realizado mais de 5000 viagens
        return this.viagensRealizadas > 5000;
    }
}