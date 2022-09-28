package Farmacia;

public class FiltroPorLab extends Filtro {
	private String labBuscado;
	
	public FiltroPorLab(String labBuscado) {
		this.labBuscado = labBuscado;
	}

	@Override
	public boolean cumple(Medicamento medicamento) {
		return medicamento.getLaboratorio().equals(this.labBuscado);
	}
	
	
	

}
