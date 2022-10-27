package sitioWebNoticias;

import java.util.ArrayList;

import sitioWebNoticias.Filtros.Filtro_PalabraClave;

public class Main {


	public static void main(String[] args) {

		Noticia not1= new Noticia("Noticia1", "intro1", "texto1", "autor1", "link1");
		Noticia not2= new Noticia("Noticia2", "intro2", "texto2", "autor2", "link2");
		Noticia not3= new Noticia("Noticia3", "intro3", "texto3", "autor3", "link3");
		
		not1.addPClave("bomberos");
		not2.addPClave("bomberos");
		
		Compuesto subseccion = new Compuesto("subseccion", "subseccion", "subseccion");
		Compuesto seccion1 = new Compuesto("seccion1", "descr_seccion1", "imagen_seccion1");
		Compuesto seccion2 = new Compuesto("seccion2", "descr_seccion2", "imagen_seccion2");
		
		Compuesto categ1 = new Compuesto("categ1", "descr_categ1", "imagen_categ1");
		
		subseccion.addElemento(not1);
		seccion1.addElemento(subseccion);
		seccion1.addElemento(not2);
		seccion2.addElemento(not3);
		categ1.addElemento(seccion1);
		categ1.addElemento(seccion2);
		
		Admin admin = new Admin();
		admin.addElemento(categ1);
		
		ArrayList<String> links = categ1.mapaDeSitio();
		for (String link: links) {
			System.out.println(link);
		}
		
	//	System.out.println(categ1.copiar().mapaDeSitio());

		Filtro_PalabraClave f = new Filtro_PalabraClave ("bomberos");
		System.out.println(categ1.copiar(f).mapaDeSitio());
	
	}

}
