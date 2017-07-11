package projeto;

public enum EstadoCenario {
	
	FINALIZADO_OCORREU("Finalizado (ocorreu)"), FINALIZADO_N_OCORREU("Finalizado (n ocorreu)"), N_FINALIZADO("Não finalizado");
		
	private String estado;
	
	private EstadoCenario(String estado){
		this.estado = estado;
	}
	
	public String getEstadoCenario(){
		return estado;
	}
	
}
