package CompaniaDeEnvios;

public class Carta extends Elemento {
	
	private String destinatario;
	private String remitente;
	private double peso;
	
	public Carta(String tracking, String id, String destinatario, String remitente, double peso) {
		super(tracking, id);
		this.destinatario = destinatario;
		this.remitente = remitente;
		this.peso = peso;
	}
	
	@Override
	public String getDestinatario() {
		return this.destinatario;
	}

	@Override
	public String getRemitente() {
		return this.remitente;
	}

	@Override
	public double getPeso() {
		return this.peso;
	}

	public void setTracking(String tracking) {
		this.tracking = tracking;
		
	}
	


}
