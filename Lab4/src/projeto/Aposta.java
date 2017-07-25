package projeto;

public class Aposta {
	private String nomeDoApostador;
	private int valorDaAposta;
	private boolean acontece;	
	
	// lancar uma exception
	
	public Aposta(String nomeDoApostados, int valorDaAposta, String previsao){
		this.nomeDoApostador = nomeDoApostados;
		this.valorDaAposta = valorDaAposta;
		if(previsao.equals("VAI ACONTECER")){
			acontece = true;
		}else{
			acontece  = false;
		}
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

	public void setValorDaAposta(int valorDaAposta) {
		this.valorDaAposta = valorDaAposta;
	}

	public boolean getPrevisao() {
		return acontece;
	}

	public void setPrevisao(boolean previsao) {
		this.acontece = previsao;
	}			
}
