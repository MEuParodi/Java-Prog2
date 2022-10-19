package Navidad;

public class Main {

	public static void main(String[] args) {
		
		
		Nene nene1 = new Nene(100, "nene1");
		Nene nene2 = new Nene(200, "nene2");
		Nene nene3 = new Nene(300, "nene3");
		
		Carta carta1 = new Carta(nene1); //avion, autito
		Carta carta2 = new Carta(nene2); //avion, chocolate, pelota
		Carta carta3 = new Carta(nene3); //tren
		
		
		carta1.addRegalo("avion");
		carta1.addRegalo("autito");
		carta2.addRegalo("avion");
		carta2.addRegalo("chocolate");
		carta2.addRegalo("pelota");
		carta3.addRegalo("tren");
		
		Buzon buzon1 = new Buzon(); //buenos: nene1 nene2
		buzon1.addBueno(nene1);
		buzon1.addBueno(nene2); 
		buzon1.addBueno(nene1); //no lo agrega poorque ya esta---ok
		buzon1.addCarta(carta1); 
		buzon1.addCarta(carta3); 
		buzon1.addCarta(carta3);
		
		
		Buzon buzon2 = new Buzon(); //buenos: nene3 
		buzon2.addBueno(nene1);
		buzon2.addCarta(carta1);
		buzon2.addCarta(carta2); 
		buzon2.addCarta(carta2); 
		
		Zona zona1 = new Zona();
		zona1.addElemento(buzon1);
		zona1.addElemento(buzon2);
		
		
	//	System.out.println(carta1);
	//	System.out.println(buzon1.contarCartasConRegalo("avion"));	
		System.out.println(buzon1.contarCartas());
		System.out.println(buzon1.calcularPorcentaje("avion"));
		
		System.out.println(zona1.contarCartasNenesMalos());
		
		System.out.println(zona1.contarCartas());
				
	}

}
