import java.util.HashMap;
import java.util.ArrayList;

public class ControleAcademico {
	private HashMap<String,Aluno> mapaMatriculas = new HashMap<>(); 
	private HashMap<String, Grupo> listaGrupos = new HashMap<>();	
	private ArrayList<Aluno> alunosQueResponderam = new ArrayList<Aluno>();
	
	/**
	 * Cadastra aluno e lanca mensagem de erro caso haja a tentativa de castrar o mesmo aluno
	 * 
	 * @param matricula
	 * @param nome
	 * @param curso
	 * @return
	 */
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
	
	/**
	 * Consulta aluno no sistema
	 * 
	 * @param matricula
	 * @return
	 */
	
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
		
		return "Aluno nao cadastrado.";
	}
	
	/**
	 * Cadastra o grupo pelo tema, se houver grupo cadastrado com o mesmo tema, retorna mensagem de erro.
	 * 
	 * @param nomeGrupo
	 * @return
	 */
	
	public String cadastrarGrupo(String nomeGrupo){
		
		if(nomeGrupo == null){
			throw new NullPointerException();
		}
		
		if(nomeGrupo.trim().equals("")){
			throw new IllegalArgumentException();
		}
		
		Grupo grupo = new Grupo(nomeGrupo);
				
		if(!listaGrupos.containsKey(nomeGrupo)){
			listaGrupos.put(nomeGrupo, grupo);
			return "CADASTRO REALIZADO!";
		}
		return "GRUPO JA CADASTRADO!";		
	}
	
	/**
	 * 
	 * @return
	 */
	public String getObj(String matricula, String nomeGrupo){
		
		if(!mapaMatriculas.containsKey(matricula)){
			return "Aluno nao cadastrado";
		}
		
		if(!listaGrupos.containsKey(nomeGrupo)){
			return "Grupo nao cadastrado";
		}
		
		Aluno aluno = mapaMatriculas.get(matricula);
		Grupo grupo = listaGrupos.get(nomeGrupo);
		String msg = grupo.alocar(aluno);
		return msg;
	}
	
	public String respondemQuestoes(String matricula){
		if(!mapaMatriculas.containsKey(matricula)){
			return "Aluno nao cadastrado";
		}			
		alunosQueResponderam.add(mapaMatriculas.get(matricula));
		return "ALUNO REGISTRADO!";
	}
	
	public String listaResponderam(){
		String lista = "";
		for(int i = 0; i <alunosQueResponderam.size(); i++){
			lista += i+1 + ". " + alunosQueResponderam.get(i).toString();
		}
		return lista;
	}
	
	public String imprimirGrupo(String nomeGrupo){
		if(!listaGrupos.containsKey(nomeGrupo)){
			return "Grupo nao cadastrado";
		}		
		
		
		return listaGrupos.get(nomeGrupo).imprimirGrupo(nomeGrupo);
	}
}

