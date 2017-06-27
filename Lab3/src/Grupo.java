import java.util.ArrayList;


public class Grupo {
	ArrayList<Aluno> grupoDeAluno = new ArrayList<Aluno>();
	String tema;
	
	public Grupo(String tema, Aluno aluno){
		this.tema = tema;
		grupoDeAluno.add(aluno);
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
