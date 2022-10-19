package CompaniaDeEnvios;

public abstract class Elemento {
	protected String tracking;
	private String id;
	
	public Elemento(String tracking, String id) {
		this.tracking = tracking;
		this.id = id;
	}
	
	
	public abstract void setTracking(String tracking);
	
	public abstract String getDestinatario();

	public abstract String getRemitente();
	
	public abstract double getPeso();
	
	public String getId() {
		return this.id;
	}
	
	public String getTracking() {
		return this.tracking;
	}
	
		public String toString() {
		return (this.getId()+"  ");
	}




}
