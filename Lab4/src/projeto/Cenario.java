package projeto;

import java.util.ArrayList;

public class Cenario {
	private String descricao;
	EstadoCenario estado;
	ArrayList<Aposta> apostas = new ArrayList<Aposta>();
	
	public Cenario(String descricao){
		this.descricao = descricao;
		estado = EstadoCenario.N_FINALIZADO;
	}
	
	public String toString(){
		return descricao + " - " + estado.getEstadoCenario();
	}
	
	public void mudaEstado(boolean ocorreu){
		if(ocorreu){
			estado = EstadoCenario.FINALIZADO_OCORREU;
		}else{
			estado = EstadoCenario.FINALIZADO_N_OCORREU;
		}		
	}
	
	/**
	 * Cadastrar a aposta com nome do apostador, quantia apostada e previsao em um cen�rio atrav�s do n�mero do cen�rio.
	 * @param cenario
	 * @param apostador
	 * @param valor
	 * @param previsao
	 */
	public void cadastrarAposta(String apostador, int valor, String previsao){
		Aposta aposta = new Aposta(apostador, valor, previsao);
		apostas.add(aposta);
	}
	
	
	/**
	 * Retornar o valor total das apostas feitas em um cen�rio.
	 * @param cenario
	 * @return
	 */
	
	public int valorTotalDeApostas(int cenario){
		int valorTotal = 0;
		
		for(int i = 0; i < apostas.size(); i++){
			valorTotal += apostas.get(i).getValorDaAposta();			
		}
		
		return valorTotal;
	}
	
	/**
	 * Retornar o numero de apostas feitas em um cenario.
	 * @param cenario
	 * @return
	 */
	public int totalDeApostas(){
		int total = 0;
		
		for(int i = 0; i < apostas.size(); i++){
			total ++;
		}
		
		return total;
	}

	/**
	 * Encerrar um cenario (indicando se ocorreu ou nao).
	 * @param cenario
	 * @param ocorreu
	 */
	
	public void fecharAposta(int cenario, boolean ocorreu){
		mudaEstado(ocorreu);		
	}

	public void setEstado(EstadoCenario estado) {
		this.estado = estado;
	}
	
}
