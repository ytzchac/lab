import static org.junit.Assert.*;

import org.junit.Test;

public class ControleAcademicoTeste {
	ControleAcademico controle = new ControleAcademico();
	@Test
	public void cadastrarAluno() {
		String msgCadastrar = controle.cadastrarAluno("123", "isaac", "CC");
		String msgCadastrar2 = controle.cadastrarAluno("123", "isaac", "CC");
				
		assertEquals("CADASTRO REALIZADO!", msgCadastrar);
		assertEquals("MATRICULA JA CADASTRADA!", msgCadastrar2);
		
	}
	
	@Test (expected = NullPointerException.class)
	public void cadastraMatriculaNula(){
		controle.cadastrarAluno(null, "Isaac", "CC");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void cadastraMatriculaVazia(){
		controle.cadastrarAluno("", "Isaac", "CC");
	}
	
	@Test (expected = NullPointerException.class)
	public void cadastraCursoNulo(){
		controle.cadastrarAluno("123", "Isaac", null);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void cadastraCursoVazio(){
		controle.cadastrarAluno("123", "Isaac", "");
	}
	
	@Test (expected = NullPointerException.class)
	public void cadastraAlunoNulo(){
		controle.cadastrarAluno("123", null, "CC");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void cadastraAlunoVazio(){
		controle.cadastrarAluno("123", "", "CC");
	}
		
	@Test
	public void cadastraGrupo(){
		controle.cadastrarGrupo("P2");
	}
	
	@Test
	public void consultarAluno(){
		controle.cadastrarAluno("123", "isaac", "CC");
		String msgConsultar = controle.consultarAluno("123");
		assertEquals("123 - isaac - CC", msgConsultar);
		String msgConsultar2 = controle.consultarAluno("321");
		assertEquals("Aluno nao cadastrado.", msgConsultar2);

	}
	
	

}
