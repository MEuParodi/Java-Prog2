import java.util.Comparator;

public class ComparadorCosto implements Comparator<Elemento> {

	@Override
	public int compare(Elemento v1, Elemento v2) {
			return (int) (v1.getPrecio() - v2.getPrecio());
	}

}
