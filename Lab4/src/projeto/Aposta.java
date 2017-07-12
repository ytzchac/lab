package projeto;

public class Aposta {
	private String nomeDoApostador;
	private double valorDaAposta;
	private String previsao;	
	
	public Aposta(String nomeDoApostados, double valorDaAposta, String previsao){
		this.nomeDoApostador = nomeDoApostados;
		this.valorDaAposta = valorDaAposta;
		this.previsao = previsao;
	}

	public String getNomeDoApostador() {
		return nomeDoApostador;
	}

	public void setNomeDoApostador(String nomeDoApostador) {
		this.nomeDoApostador = nomeDoApostador;
	}

	public double getValorDaAposta() {
		return valorDaAposta;
	}

	public void setValorDaAposta(double valorDaAposta) {
		this.valorDaAposta = valorDaAposta;
	}

	public String getPrevisao() {
		return previsao;
	}

	public void setPrevisao(String previsao) {
		this.previsao = previsao;
	}			
}
