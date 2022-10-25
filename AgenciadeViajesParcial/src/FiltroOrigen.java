
public class FiltroOrigen extends Filtro {

 private String origenBuscado;
 
 
	public FiltroOrigen(String origenBuscado) {
		this.origenBuscado = origenBuscado;
	}


	@Override
	public boolean cumple(Elemento v) {
		return (v.getOrigen().equals(this.origenBuscado));
	}

}
