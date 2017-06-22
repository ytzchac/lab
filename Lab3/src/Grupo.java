import java.util.ArrayList;


public class Grupo {
	ArrayList<Aluno> grupoDeAluno = new ArrayList<Aluno>();
	String tema;
	
	public Grupo(String tema, Aluno aluno){
		this.tema = tema;
		grupoDeAluno.add(aluno);
	}
}
