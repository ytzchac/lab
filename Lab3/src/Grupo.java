import java.util.HashMap;

public class Grupo {
	HashMap<String, Aluno> listaAlunos = new HashMap<>();
	String tema;
	
	public Grupo(String tema){
		this.tema = tema;		
	}
	
	/**
	 * Aloca alunos atraves da matricula e do nome do grupo
	 * Metodo incompleto
	 * 
	 * @param matricula
	 * @param nomeGrupo
	 * @return
	 */
	public String alocar(Aluno aluno){
		listaAlunos.put(aluno.getMatricula(), aluno);
		return "ALUNO REGISTRADO!";		
	}
	
	/**
	 * Retorna lista de alunos referente ao grupo escolhido
	 * @param nomeGrupo
	 */
	
	public String imprimirGrupo(String nomeGrupo){
		String lista = "";
		
		for (String matricula : listaAlunos.keySet()) {
			Aluno alunoHash = listaAlunos.get(matricula);
			lista += alunoHash + System.lineSeparator();
	    }
		
		return lista;
	} 

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tema == null) ? 0 : tema.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Grupo other = (Grupo) obj;
		if (tema == null) {
			if (other.tema != null)
				return false;
		} else if (!tema.equals(other.tema))
			return false;
		return true;
	}
		
}
