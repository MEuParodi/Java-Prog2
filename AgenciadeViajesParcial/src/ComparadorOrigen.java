import java.util.Comparator;

public class ComparadorOrigen implements Comparator<Elemento> {

	@Override
	public int compare(Elemento v1, Elemento v2) {
			return (v1.getOrigen().compareTo(v2.getOrigen()));
	}

}
