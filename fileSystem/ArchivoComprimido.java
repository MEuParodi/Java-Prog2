package fileSystem;

public class ArchivoComprimido extends Carpeta{
	private int compresion;
	
	public ArchivoComprimido(String nombre, int compresion) {
		super(nombre);
		this.compresion = compresion;

	}

	@Override
	public int getTamanio() {
		return (super.getTamanio() * this.compresion);
	}

}
