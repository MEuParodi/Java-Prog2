package fileSystem;

//import java.util.Comparator;

public class Main {

	public static void main(String[] args) {

		Carpeta raiz1 = new Carpeta("raiz1");
		Carpeta carp1 = new Carpeta("carp1");
			
		Archivo hola = new Archivo("hola","txt",50);
		Archivo chau = new Archivo("chau","txt",70);

		raiz1.addElemento(carp1);
		raiz1.addElemento(chau);
		carp1.addElemento(hola);
		
		System.out.println(raiz1.CantElementos());
		
//		Filtro filtro = new FiltroNombre("a");
		
//		Comparator<Archivo> comparadorT = new ComparadorPorTamanio();
//		Comparator<Archivo> comparadorN = new ComparadorPorNombre();
//		Comparator<Archivo> comparador = new ComparadorAnd(comparadorT,comparadorN);
		
//		System.out.println(raiz1.buscar(filtro));
//		System.out.println(raiz.buscarArchivosOrdenados(filtro, new ComparadorNot(comparadorT)));
		
		//carp1.addElemento(chau);
		
		System.out.println(raiz1);
		Carpeta raiz = new Carpeta("raiz");
		
		Carpeta pacman = new Carpeta("pacman");
		Carpeta tudai = new Carpeta("tudai");
		Carpeta fotos = new Carpeta("fotos");
		
		Carpeta primer = new Carpeta("primer anio");
		Carpeta segundo = new Carpeta("segundo anio");
		Carpeta prog2 = new Carpeta("prog2");
		
		raiz.addElemento(pacman);
		raiz.addElemento(tudai);
		raiz.addElemento(fotos);
		
		tudai.addElemento(primer);
		tudai.addElemento(segundo);
		
		primer.addElemento(prog2);
		
		Archivo calendario = new Archivo("calendario","pdf",50);
		
		tudai.addElemento(calendario);
		
		Archivo parcial = new Archivo("parcial","pdf",50);
		Archivo recu = new Archivo("recu","doc",50);
		Archivo prefi = new Archivo("prefi","txt",100);
		
		prog2.addElemento(parcial);
		prog2.addElemento(recu);
		prog2.addElemento(prefi);
		
		int cantTotal = raiz.CantElementos();
		System.out.println(cantTotal);
		
	}

}
