package Celular;

public class Prefijo{
	private String pref;
	private String ciudad;
	
	public Prefijo(String pref, String ciudad) {
		this.pref = pref;
		this.ciudad = ciudad;
	}

	public String getCiudad()	{
		return this.ciudad;
	}
	
	public String getPrefijo() {
		return this.pref;
	}

}