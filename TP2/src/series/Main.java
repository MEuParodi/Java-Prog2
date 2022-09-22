package series;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Episodio episodio1 = new Episodio("No entiendo un c...", "descripcion del E1");
		Episodio episodio2 = new Episodio("Algo empiezo a entender", "descripcion del E2");
		Episodio episodio3 = new Episodio("Esto se esta poniendo bueno", "descripcion del E3");
		Episodio episodio4 = new Episodio("Soy una gan progammer ;) ?", "descripcion del E4");
		Episodio episodio5 = new Episodio("TituloEpisodio_5", "descripcion del E5");
		Episodio episodio6 = new Episodio("TituloEpisodio_6", "descripcion del E6");
		Episodio episodio7 = new Episodio("TituloEpisodio_7", "descripcion del E7");
		Episodio episodio8 = new Episodio("TituloEpisodio_8", "descripcion del E8");
		Episodio episodio9 = new Episodio("TituloEpisodio_9", "descripcion del E9");
		
		Temporada temporada_1 = new Temporada(episodio1, 1);
		temporada_1.setEpisodios(episodio2);
		temporada_1.setEpisodios(episodio3);
		
		Temporada temporada_2 = new Temporada(episodio1, 1);
		temporada_2.setEpisodios(episodio4);
		temporada_2.setEpisodios(episodio5);
		temporada_2.setEpisodios(episodio6);
		temporada_2.setEpisodios(episodio7);
		temporada_2.setEpisodios(episodio8);
		temporada_2.setEpisodios(episodio9);
		
		ArrayList<Temporada> dia_de_locura = new ArrayList<Temporada>();
		dia_de_locura.add(temporada_1);
		dia_de_locura.add(temporada_2);
		
		
		Serie mi_serie = new Serie("Dia de Locura", "Programando en Java...", "Euge", "terror", dia_de_locura);
	
		System.out.println("Serie:  " + mi_serie.getTitulo()+ " Descripción: " + mi_serie.getDescripcion() + " creada por " + mi_serie.getCreador());
		System.out.println("titulo del episodio 1: " +episodio1.getTitulo() + " calificacion: " +  episodio1.getCalificacion() + "    ");
		
		episodio2.setVisto(true);
		episodio4.setVisto(true);
		episodio6.setVisto(true);
		episodio1.setCalificacion(2); // no la toma porque no fue visto le deja -1
		episodio2.setCalificacion(4);
		//episodio3.setCalificacion(8);
		//System.out.println("di una calificacion incorrecta");
		System.out.println("episodio 4 fue visto?: " + episodio4.getFueVisto());
		System.out.println("total episodios vistos en temporada 1:  " +	temporada_1.cantEpisodiosVistos());	
		System.out.println("total episodios vistos en temporada 2:  " +	temporada_2.cantEpisodiosVistos());	

		System.out.println("Episodios de la temporada 1: \n");
		for (Episodio e: temporada_1.getEpisodios())
			System.out.println(e.getTitulo());
		System.out.println("Calif episodio 1:   " + episodio1.getCalificacion());
		System.out.println("Calif episodio 2:   " + episodio2.getCalificacion());
		System.out.println("Calif episodio 3:   " + episodio3.getCalificacion());
		System.out.println("Pomedio Calificaciones T1: " +  temporada_1.promCalificacionTemporada()); 
		System.out.println("");
		System.out.println("Pomedio Calificaciones Serie: " +  mi_serie.getPromedioCalificacionesSerie()); 
		System.out.println("");
		System.out.println("Cantidad de episodios vistos en la serie --> ");
		System.out.println(mi_serie.cantEpisodiosVistosSerie());
		System.out.println("calificacion E1 --> " + episodio1.getCalificacion());
	}

}
