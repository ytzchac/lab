package projeto;
import static org.junit.Assert.*;

import org.junit.Test;

public class SistemaTeste {
	Sistema sistema = new Sistema();
	@Test
	public void test() {
		// testa cadastrar cenario
		int indiceCadastrado = sistema.cadastrarCenario("Ganhar na loteria");
		assertEquals(0, indiceCadastrado);
		
		//testa cenarios cadastrados
		String cenariosCadastrados = sistema.exibirCenarios();
		assertEquals("0 - Ganhar na loteria - N_FINALIZADO", cenariosCadastrados);
		
		//testa cadastramento de aposta, numero de apostas cadastradas e valores totais das respectivas apostas
		sistema.cadastrarAposta(indiceCadastrado, "Jose", 15, "VAI ACONTECER");
		sistema.cadastrarAposta(indiceCadastrado, "Isaac", 10, "NAO VAI ACONTECER");
		
		int numeroApostas = sistema.totalDeApostas(indiceCadastrado);
		int valorTotalApostado = sistema.valorTotalDeApostas(indiceCadastrado);
		
		assertEquals(25, valorTotalApostado);
		assertEquals(2, numeroApostas);
		
		
		
	}

}
