
public class FiltroCostoMayorA extends Filtro {

 private double costo;
 
 
	public FiltroCostoMayorA(double costo) {
		this.costo = costo;
}


	@Override
	public boolean cumple(Elemento v) {
		return (v.getPrecio()>this.costo);
	}

}
