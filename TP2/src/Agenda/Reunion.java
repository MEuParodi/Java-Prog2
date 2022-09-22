package Agenda;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Reunion {
	private String tema;
	private String lugar;
	private LocalDateTime inicio;
	private LocalDateTime fin;
	private ArrayList<Usuario> asistentes; // creo el array sin tamaño

	public Reunion(String tema, String lugar, LocalDateTime inicio, LocalDateTime fin, ArrayList<Usuario> asistentes) {
		// public Reunion(String tema, String lugar, ArrayList<Usuario> asistentes){

		setTema(tema);
		setLugar(lugar);
		setInicio(inicio);
		setFin(fin);
		this.asistentes = new ArrayList<Usuario>(); // le doy tamaño al array
		setAsistentes(asistentes); // lleno el array
	}

	// setters

	public void setTema(String tema) {
		this.tema = tema;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public void setInicio(LocalDateTime inicio) {
		if (inicio != null)
			this.inicio = inicio;
	}

	public void setFin(LocalDateTime fin) {
		if ((fin != null) && (fin.isAfter(this.inicio)))
			this.fin = fin;
		else
			this.fin = inicio;
	}

	public void setAsistentes(ArrayList<Usuario> asistentes) {
		if ((asistentes != null) && (asistentes.size() > 0)) {
			for (int i = 0; i < asistentes.size(); i++) {
				this.asistentes.add(asistentes.get(i));
			}
		}
	}

	// getters

	public ArrayList<Usuario> getAsistentes() {
		return this.asistentes;
	}

	public LocalDateTime getInicio() {
		return this.inicio;
	}

	public LocalDateTime getFin() {
		return this.fin;
	}

	public String getLugar() {
		return this.lugar;
	}

	public String getTema() {
		return this.tema;
	}

	public String getDuracion() {
		int anios, meses, dias, horas, minutos;
		LocalDateTime inicio;
		LocalDateTime fin;
		if ((this.getInicio() != null) && (this.getFin() != null)) {
			inicio = getInicio();
			fin = getFin();
			anios = Math.abs(inicio.getYear() - fin.getYear());
			meses = Math.abs(inicio.getMonthValue() - fin.getMonthValue());
			dias = Math.abs(inicio.getDayOfMonth() - fin.getDayOfMonth());
			horas = Math.abs(inicio.getHour() - fin.getHour());
			minutos = Math.abs(inicio.getMinute() - fin.getMinute());
			return "La reunion dura " + anios + " anios, " + meses + " meses, " + dias + " dias, " + horas + " horas y "
					+ minutos + " minutos.";
		}
		System.out.println("Error al calcular el tiempo de duracion.");
		return null;
	}
}
