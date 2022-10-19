package CompaniaDeEnvios;

import java.util.ArrayList;

public class Combo extends Elemento {
	ArrayList<Elemento> elementos;
	
	public Combo(String tracking, String id) {
		super(tracking, id);
		this.elementos = new ArrayList<>();
	}

	public void addElemento(Elemento e) {
		//cambiar el tracking de lo agergado (puede ser un combo) al this.tracking
		e.setTracking(this.tracking);
		this.elementos.add(e);
	}
	
	@Override
	public String getDestinatario() {
		if (elementos.isEmpty())
			return null;
		else
			return this.elementos.get(0).getDestinatario();
	}

	@Override
	public String getRemitente() {
		if (elementos.isEmpty())
			return null;
		else
			return this.elementos.get(0).getRemitente();
	}

	public String getTracking() {
		return this.tracking;
	}

	@Override
	public double getPeso() {
		double peso = 0;
		for (Elemento e: elementos)
			peso += e.getPeso();
		return peso;
	}

	@Override
	public void setTracking(String tracking) {
		for (Elemento hijo: elementos) {
			hijo.setTracking(tracking);
		}
	}



}
