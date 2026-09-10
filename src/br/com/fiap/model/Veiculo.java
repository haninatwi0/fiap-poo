package br.com.fiap.model;

public class Veiculo {

	private String placa;

	private String modelo;

	
	public Veiculo(String placa, String modelo) {
		setPlaca(placa);
		this.modelo = modelo;
		System.out.println("🚗 Registro inicial: Um " + this.modelo + " nasceu com a placa " + this.placa);
    }


	public String getModelo() {
		return this.modelo;
	}


	public String getPlaca() {
		return this.placa;
	}


	public void atualizarPlaca(String novaPlaca) {
        System.out.println("🔄 Solicitada atualização de placa no Detran para o veículo " + this.modelo + "...");
        this.setPlaca(novaPlaca); 
    }
	
	private void setPlaca(String novaPlaca) {
        if (novaPlaca != null && !novaPlaca.trim().isEmpty()) {
            this.placa = novaPlaca;
            System.out.println("✅ Sucesso: A placa agora é " + this.placa);
        } else {
            System.out.println("❌ Erro de Validação: A placa informada é inválida!");
        }
    }

}