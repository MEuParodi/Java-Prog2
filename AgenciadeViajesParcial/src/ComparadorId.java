import java.util.Comparator;

public class ComparadorId implements Comparator<Elemento> {

	@Override
	public int compare(Elemento v1, Elemento v2) {
			return v1.getId() - v2.getId();
	}

}
