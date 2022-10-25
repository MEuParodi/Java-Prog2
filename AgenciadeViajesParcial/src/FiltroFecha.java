import java.time.LocalDate;

public class FiltroFecha extends Filtro {

	private LocalDate fechaBuscada;
 
 	public FiltroFecha(LocalDate fechaBuscada) {
 		this.fechaBuscada = fechaBuscada;
 	}



	@Override
	public boolean cumple(Elemento v) {
		return (v.getFechaPago().equals(fechaBuscada));
	}

}
