import java.util.Comparator;

public class ComparadorFechaPago implements Comparator<Elemento> {

	@Override
	public int compare(Elemento v1, Elemento v2) {
			return (v1.getFechaPago().compareTo(v2.getFechaPago()));
	}

}
