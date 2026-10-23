package br.com.fiap.model;

public class ServidorCloud implements Inspecionavel {

    private String ipServidor;
    private double usoCpuPorcentagem;

    public ServidorCloud(String ipServidor, double usoCpuPorcentagem) {
        this.ipServidor = ipServidor;
        this.usoCpuPorcentagem = usoCpuPorcentagem;
    }

    public String getIpServidor() {
        return ipServidor;
    }

    @Override
    public void executarDiagnostico() {
        System.out.println("Analisando uso de memória, discos e temperatura da CPU no Servidor [" + this.ipServidor + "]...");
    }

    @Override
    public boolean precisaDeManutencao() {
        // Precisa de manutenção se a CPU estiver com uso acima de 85%
        return this.usoCpuPorcentagem > 85.0;
    }
}