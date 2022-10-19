package Streaming;

public class FiltroAnd extends Filtro {
	private Filtro f1;
	private Filtro f2;
	
	
	public FiltroAnd(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public boolean cumple(Pelicula p) {
		return (this.f1.cumple(p) && this.f2.cumple(p));  //en el enunciado es uno si y el otro NO, lo niego aca?? 
	}

}
