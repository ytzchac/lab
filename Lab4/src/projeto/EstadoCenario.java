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
	
	/**
	 * Retorna de o cenario está finalizado e ocorreu ou se está finalizado e nao ocorreu
	 * @return
	 */
	public boolean getStatusCenario(){
		if(estado.equals(FINALIZADO_OCORREU)){
			return true;
		}
		return false;
	}
}
