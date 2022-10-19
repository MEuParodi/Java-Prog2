package Futbol5;

import java.time.LocalDate;
import java.util.Comparator;

import Futbol5.Comparadores.ComparadorApellidoNombre;
import Futbol5.Comparadores.ComparadorEdad;
import Futbol5.Comparadores.ComparadorTotalAlquileres;
import Futbol5.Filtros.AlquiloCancha;
import Futbol5.Filtros.FiltroEsMenor;
import Futbol5.Filtros.FiltroNot;
import Futbol5.Filtros.FiltroPagoAlDia;
import Futbol5.Filtros.FiltroPagoMasde;
import Futbol5.Filtros.Filtro;
import Futbol5.Filtros.FiltroAnd;

public class Main {


	public static void main(String[] args) {
		Administracion admin = new Administracion();
		Socio s1 = new Socio("Perez", "Juan", 30);
		Socio s2 = new Socio("Saenz", "Carlos", 10);
		Socio s3 = new Socio("Gomez", "Anibal", 20);
		Socio s4 = new Socio("Perez", "Ana", 40);
		
		admin.addSocio(s1);
		admin.addSocio(s2);
		admin.addSocio(s3);
		admin.addSocio(s4);
		
//		LocalDate hoy = LocalDate. now();
//		System.out.println(hoy);
		Registro alq1 = new Registro(LocalDate.of(2022, 10, 17) , 12, 300); //LocalDate fecha, int idCancha, double precio
		Registro alq2 = new Registro(LocalDate.of(2022, 10, 18) , 13, 600);
		Registro alq3 = new Registro(LocalDate.of(2022, 10, 19) , 13, 700);
		Registro alq4 = new Registro(LocalDate.of(2022, 10, 20) , 13, 600);
		
		s1.addAlquiler(alq1); //cancha 12
		s2.addAlquiler(alq2); //cancha 13
		s2.addAlquiler(alq3); //cancha 13
		s3.addAlquiler(alq4); //cancha 13
		s4.addAlquiler(alq3); //cancha 13
		s3.addAlquiler(alq1); //cancha 12
		
		
		//Todas los socios con cuota impaga, ordenados alfabéticamente (primero por
		//apellido, y si hay varios con el mismo apellido por nombre)
		FiltroPagoAlDia f5 = new FiltroPagoAlDia();
		FiltroNot f4 = new FiltroNot(f5);
		ComparadorApellidoNombre c2 = new ComparadorApellidoNombre();
		//System.out.println(admin.buscarOrdenado(f4, c2));
		
		//Todos los socios menores de edad (21), ordenados por edad
		FiltroEsMenor f1 = new FiltroEsMenor(21);
		ComparadorEdad c1 = new ComparadorEdad();
		//System.out.println(admin.buscarOrdenado(f1, c1));
				
		//Todos los socios que alquilaron la cancha 13
		AlquiloCancha f2 = new AlquiloCancha(13);
		//System.out.println(admin.buscar(f2));

		
		//Todos los socios que alquilaron la cancha 13 ordenados de nemor a mayor por cantidad de veces
		ComparadorTotalAlquileres c3 = new ComparadorTotalAlquileres(13);
		//System.out.println(admin.buscarOrdenado(f2, c3));
		
		
		//Todos los socios que pagaron más de $500 por algún alquiler de cancha listando
		// primero los con cuotas pagas, (alfabéticamente) y luego los morosos, también (alfabéticamente).
		FiltroPagoMasde f3 = new FiltroPagoMasde(500);
		FiltroAnd f6 = new FiltroAnd(f3, f5);
		FiltroAnd f7 = new FiltroAnd(f3, f4);
		System.out.println(admin.buscar(f3));
		s2.setPago();
		System.out.println("Al dia: " + admin.buscarOrdenado(f6, c3));
		System.out.println("Morosos: " + admin.buscarOrdenado(f7, c3));
	}

}
