package projeto;
import java.util.ArrayList;

public class Sistema {
	private int caixa;
	private double taxa;
	private int totalRateio;
	
	ArrayList<Cenario> cenarios = new ArrayList<Cenario>();
	
	/**
	 * O valor da taxa nao sera alterado ao longo do programa.  
	 * @param caixa
	 * @param taxa
	 */
	public Sistema(){
		
	}
	
	/**
	 * Inicializar o sistema com um valor e taxa (exemplo: 100000 e 0.01).
	 * Deve-se receber um valor indicando a quantidade atual de dinheiro (em centavos) que o sistema possui 
	 * e a porcentagem que deve ser retirada de cada aposta perdedora para ir ao caixa do sistema (o resto do valor � usado para premiar as apostas vencedoras).
	 * @param caixa
	 * @param taxa
	 */
	public void iniacializa(int caixa, double taxa){
		this.caixa = caixa;
		this.taxa = taxa;
	}
	
	/**
	 * Cadastrar cenarios e retornar a numeracao do cenario cadastrado
	 * @return
	 */
	public int cadastrarCenario(String descricao){
		Cenario cenario = new Cenario(descricao);
		cenarios.add(cenario);
		
		return cenarios.indexOf(cenario);
	}
	

	/**
	 * Retornar a representa��o textual de um cen�rio (a partir da numera��o)
	 * @param cenario
	 * @return
	 */
	public String exibirCenario(int cenario){
		return cenarios.get(cenario).toString();
	}
	
	
	/**
	 * Retornar a representa��o textual de todos os cen�rios cadastrados no sistema (um por linha, em ordem de cadastro
	 * @return
	 */
	public String exibirCenarios(){
		String strCenarios = "";
		String quebraLinha = System.getProperty("line.separator");
		for(int i = 0; i < cenarios.size(); i++){
			if(i < cenarios.size() - 1){
				strCenarios += i + " - " + cenarios.get(i).toString() + quebraLinha;
			}
			strCenarios += i + " - " + cenarios.get(i).toString();
		}
		return strCenarios;
	}	
	
	
	
	public void cadastrarAposta(int cenario, String apostador, int valor, String previsao){
		cenarios.get(cenario).cadastrarAposta(apostador, valor, previsao);
	}	
	
	
	/**
	 * Retornar o valor total de um cenário encerrado que será destinado ao caixa
	 * @param cenario
	 * @return
	 */
	
	public int getCaixaCenario(int cenario){
		
	}



	public int getCaixa() {
		return caixa;
	}

	public void setCaixa(int caixa) {
		this.caixa = caixa;
	}
	
	
	
}
