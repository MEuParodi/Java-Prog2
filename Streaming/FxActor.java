package Streaming;

public class FxActor extends Filtro {
	private String actorBuscado;

	public FxActor(String actorBuscado) {
		this.actorBuscado = actorBuscado;
	}
	
	@Override
	public boolean cumple(Pelicula p) {
		return p.tineActor(actorBuscado);
	}

}
