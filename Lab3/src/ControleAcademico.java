import java.util.HashMap;


public class ControleAcademico {
	private HashMap<String,Aluno> mapaMatriculas = new HashMap<>(); 
	private HashMap<String, Grupo> mapaGrupos = new HashMap<>();
	
	public String cadastrarAluno(String matricula, String nome, String curso){
		
		if(matricula == null){
			throw new NullPointerException();
		}
		
		if(matricula.trim().equals("")){
			throw new IllegalArgumentException();
		}
		
		if(nome == null){
			throw new NullPointerException();
		};
		
		if(nome.trim().equals("")){
			throw new IllegalArgumentException();
		}
		
		if(curso  == null){
			throw new NullPointerException();
		};
		
		if(curso.trim().equals("")){
			throw new IllegalArgumentException();
		}		
		
		Aluno aluno = new Aluno(matricula, nome, curso);
		
		if(!mapaMatriculas.containsKey(matricula)){
			mapaMatriculas.put(matricula, aluno);
			return "CADASTRO REALIZADO!";
		}
		
		return "MATRICULA JA CADASTRADA!";
		
	}
	
	public String consultarAluno(String matricula){
		
		if(matricula == null){
			throw new NullPointerException();
		}
		
		if(matricula.trim().equals("")){
			throw new IllegalArgumentException();
		}				
		
		if(mapaMatriculas.containsKey(matricula)){
				return mapaMatriculas.get(matricula).toString();
		}
		
		return "Aluno não cadastrado.";
	}
	
	public String cadastrarGrupo(String nomeGrupo){
		
		if(nomeGrupo == null){
			throw new NullPointerException();
		}
		
		if(nomeGrupo.trim().equals("")){
			throw new IllegalArgumentException();
		}
		//concluir aqui
		Grupo grupo = new Grupo(nomeGrupo);
		
		if(!mapaGrupos.containsKey(nomeGrupo)){
			mapaGrupos.put(nomeGrupo, grupo);
			return "CADASTRO REALIZADO!";
		}
		return "GRUPO JÁ CADASTRADO!";		
	}
}
