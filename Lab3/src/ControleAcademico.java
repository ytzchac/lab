import java.util.ArrayList;


public class ControleAcademico {
	ArrayList<Aluno> listaDeAlunos = new ArrayList<Aluno>();
	
	public String cadastrarAluno(String matricula, String nome, String curso){
		Aluno aluno = new Aluno(matricula, nome, curso);
		if(!listaDeAlunos.contains(aluno)){
			listaDeAlunos.add(aluno);
			return "CADASTRO REALIZADO!";
		}
		return "MATRICULA JA CADASTRADA!";				
	}
	
	public String consultarAluno(String matricula){
				
		for(Aluno aluno : listaDeAlunos){
			if(aluno.getMatricula().equals(matricula)){
				return aluno.toString();
			}
		}
		return "Aluno não cadastrado.";
	}
	
	
	
	
}
