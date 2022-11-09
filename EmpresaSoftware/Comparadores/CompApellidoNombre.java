package EmpresaSoftware.Comparadores;


import java.util.Comparator;

import EmpresaSoftware.Elem;
import EmpresaSoftware.Prog;

public class CompApellidoNombre implements Comparator<Elem> {

	@Override
	public int compare(Elem o1, Elem o2) {
		int res = o1.getApellido().compareTo(o2.getApellido());
		if (res == 0)
			return o1.getNombre().compareTo(o2.getNombre());
		else
			return res;
	}

	
}
