package projeto;

public class Facade {
	Sistema sistema = new Sistema();
	/**
	 * Inicializar o sistema com um valor e taxa (exemplo: 100000 e 0.01)
	 * @param caixa
	 * @param taxa
	 */
	public void inicializa(int caixa, double taxa){
		sistema.iniacializa(caixa, taxa);
	}
	
	/**
	 * Recuperar o valor em caixa do sistema (em centavos).
	 * @return
	 */
	public int getCaixa(){
		return sistema.getCaixa();
	}
	
	public int cadastrarCenario(String descricao){
		return sistema.cadastrarCenario(descricao);
	}
	
	
	public String exibirCenario(int cenario){
		return sistema.exibirCenario(cenario);
	}
	
	
	
	public String exibirCenarios(){
		return sistema.exibirCenarios();
	}
		
	
	public void cadastrarAposta(int cenario, String apostador, int valor, String previsao){
		
	}
	
		
	public int valorTotalDeApostas(int cenario){
		return 0;
	}
	
	
	public int totalDeApostas(int cenario){
		return 0;
	}
	
	/**
	 * Gerar a representa��o textual das apostas de um cen�rio (uma aposta por linha).
	 * @param cenario
	 * @return
	 */
	public String exibeApostas(int cenario){
		return "";
	}
	
	
	
	public void fecharAposta(int cenario, boolean ocorreu){
		
	}
	
	
	/**
	 * Retornar o valor total de um cen�rio encerrado que ser� destinado ao caixa
	 * @param cenario
	 * @return
	 */
	public int getCaixaCenario(int cenario){
		return 0;
	}
	
	
	/**
	 * Retornar o valor total de um cen�rio encerrado que ser� destinado a distribui��o entre as apostas vencedoras
	 * @param cenario
	 * @return
	 */
	public int getTotalRateioCenario(int cenario){
		return 0;
	}
 






}
