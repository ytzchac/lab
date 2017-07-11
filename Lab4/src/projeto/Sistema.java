package projeto;
import java.util.ArrayList;

public class Sistema {
	private int caixa;
	private double taxa;
	private int totalRateio;
	
	ArrayList<Cenario> cenarios = new ArrayList<Cenario>();
	ArrayList<Aposta> apostas = new ArrayList<Aposta>();
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
	
	/**
	 * Cadastrar a aposta com nome do apostador, quantia apostada e previsao em um cen�rio atrav�s do n�mero do cen�rio.
	 * @param cenario
	 * @param apostador
	 * @param valor
	 * @param previsao
	 */
	public void cadastrarAposta(int cenario, String apostador, int valor, String previsao){
		Aposta aposta = new Aposta(cenario, apostador, valor, previsao);
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
			if(apostas.get(i).getCenario() == cenario){
				valorTotal += apostas.get(i).getValorDaAposta();
			}
		}
		
		return valorTotal;
	}
	
	/**
	 * Retornar o n�mero de apostas feitas em um cen�rio.
	 * @param cenario
	 * @return
	 */
	public int totalDeApostas(int cenario){
		int total = 0;
		for(int i = 0; i < apostas.size(); i++){
			if(apostas.get(i).getCenario() == cenario){
				total ++;
			}
		}
		
		return total;
	}

	/**
	 * Encerrar um cen�rio (indicando se ocorreu ou n�o).
	 * @param cenario
	 * @param ocorreu
	 */
	
	public void fecharAposta(int cenario, boolean ocorreu){
		cenarios.get(cenario).mudaEstado(ocorreu);		
	}
	
	/**
	 * Retornar o valor total de um cenário encerrado que será destinado ao caixa
	 * @param cenario
	 * @return
	 */
	
	public int getCaixaCenario(int cenario){
		for(int i)
	}



	public int getCaixa() {
		return caixa;
	}

	public void setCaixa(int caixa) {
		this.caixa = caixa;
	}
	
	
	
}
