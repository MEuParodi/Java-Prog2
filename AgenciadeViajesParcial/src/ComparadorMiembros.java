import java.util.Comparator;

public class ComparadorMiembros implements Comparator<Elemento> {

	@Override
	public int compare(Elemento v1, Elemento v2) {
			return v1.getMiembros() - v2.getMiembros();
	}

}
