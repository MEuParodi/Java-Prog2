package sitioWebNoticias;

import java.util.ArrayList;

import sitioWebNoticias.Filtros.Filtro;

public class Noticia extends Elemento{
	private String titulo;
	private ArrayList <String> PClaves;
	private String intro;
	private String texto;
	private String autor;
	private String link;
	

	public Noticia(String titulo, String intro, String texto, String autor, String link) {
		this.titulo = titulo;
		this.intro = intro;
		this.texto = texto;
		this.autor = autor;
		this.link = link;
		this.PClaves = new ArrayList<>();
	}

	
	public void addPClave(String palabra) {
		this.PClaves.add(palabra);
	}
	
	public boolean tienePClave(String palabra) {
		return (this.PClaves.contains(palabra));
	}
	
	public void setTitulo(String titulo) {this.titulo = titulo;	}
	public void setIntro(String intro) {this.intro = intro;	}
	public void setTexto(String texto) {this.texto = texto;	}
	public void setAutor(String autor) {this.autor = autor;	}
	public void setLink(String link) {this.link = link;	}
	
	public String getTitulo() {return titulo;	}
	public String getIntro() {return intro;	}
	public String getTexto() {return texto;	}
	public String getAutor() {return autor;	}
	public String getLink() {return link;	}

	@Override
	public String toString() {
	return this.getLink()+ "    ";	
	}


	@Override
	public int getCantNoticias() {
		return 1;
	}


	@Override
	public ArrayList<Elemento> buscar(Filtro f) {
		ArrayList<Elemento> respuesta = new ArrayList<>();
		if (f.cumple(this))
			respuesta.add(this);
		return respuesta;
	}


	@Override
	public Elemento copiar() {
		return new Noticia(this.getTitulo(), this.getIntro(), this.getTexto(), this.getAutor(), this.getLink());
	}
	
	@Override
	public Elemento copiar(Filtro f) {
		if (f.cumple(this)) {
			Elemento copia = new Noticia(this.getTitulo(), this.getIntro(), this.getTexto(), this.getAutor(), this.getLink());
			return copia;
			
		}
		else
			return null;
			
	}


	@Override
	public ArrayList<String> mapaDeSitio() {
		ArrayList<String> respuesta = new ArrayList<>();
		respuesta.add(this.getLink());
		return respuesta;
	}





	


}
