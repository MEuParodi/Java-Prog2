package Streaming;

public class RentableTipo1 extends Rentable {
	private int maxDuracion;
	private String generoExcluido;
	

	public RentableTipo1(int maxDuracion, String generoExcluido) {
		this.maxDuracion = maxDuracion;
		this.generoExcluido = generoExcluido;
	}


	@Override
	public boolean EsRentable(Pelicula p) {
		return (p.getDuracion() < maxDuracion && !p.tineGenero(generoExcluido));
	}


}

