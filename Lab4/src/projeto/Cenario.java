package projeto;

public class Cenario {
	private String descricao;
	EstadoCenario estado;
	
	public Cenario(String descricao){
		this.descricao = descricao;
		estado = EstadoCenario.N_FINALIZADO;
	}
	
	public String toString(){
		return descricao + " - " + estado.getEstadoCenario();
	}
	
	public void mudaEstado(boolean ocorreu){
		if(ocorreu){
			estado = EstadoCenario.FINALIZADO_OCORREU;
		}else{
			estado = EstadoCenario.FINALIZADO_N_OCORREU;
		}		
	}

	public void setEstado(EstadoCenario estado) {
		this.estado = estado;
	}
	
}
