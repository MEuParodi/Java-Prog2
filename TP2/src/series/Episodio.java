package series;

public class Episodio {
	private String titulo;
	private String descripcion;
	private boolean visto;
	private int calificacion;
	private final static int MIN_CALIFICACION = 1;
	private final static int MAX_CALIFICACION = 5;
	private final static int NO_VISTO_CALIFICACION = -1;

	
//constructor	
	public Episodio(String titulo, String desc) {
		setTitulo(titulo);
		setDescripcion(desc);
		setVisto(false);
		this.calificacion = NO_VISTO_CALIFICACION;
	}
//getters y setters
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setDescripcion(String desc) {
		this.descripcion = desc;
	}

	public void setVisto(boolean visto) {
		this.visto = visto;
	}
	
	public void setCalificacion(int calificacion) {
		if (getFueVisto()) {
			
			if((calificacion <= MAX_CALIFICACION) && (calificacion >= MIN_CALIFICACION))
				this.calificacion = calificacion;
			else {
				this.calificacion = NO_VISTO_CALIFICACION;
			}
		
		} else {
				System.out.println("La calificacion debe ser de 1 a 5");
		}
		
	}
	
	public String getTitulo() {
		return this.titulo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}
	
	public boolean getFueVisto() {
		return this.visto;
	}

	public int getCalificacion() {
		return this.calificacion;
	}


	
}
	

