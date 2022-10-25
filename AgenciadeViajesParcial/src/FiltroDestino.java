
public class FiltroDestino extends Filtro {

	private String destBuscado;
 
 	public FiltroDestino(String destBuscado) {
		this.destBuscado = destBuscado;
 	}



	@Override
	public boolean cumple(Elemento v) {
		return (v.getDestino().equals(this.destBuscado));
	}

}
