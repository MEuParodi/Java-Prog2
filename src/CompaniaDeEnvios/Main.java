package CompaniaDeEnvios;

public class Main {


	public static void main(String[] args) {
		Carta carta1 = new Carta("TRCarta1", "carta1", "Destinatario 1", "Remitente 1", 10);
		Carta carta2 = new Carta("TRCarta2", "carta2", "Destinatario 2", "Remitente 2", 20);
		Carta carta3 = new Carta("TRCarta3", "carta3", "Destinatario 3", "Remitente 3", 30);
		
		Combo combo1 = new Combo("TRCombo1", "combo1");
		combo1.addElemento(carta1);
		combo1.addElemento(carta2);
		
		Combo combo2 = new Combo("TRCombo2", "combo2");
		combo2.addElemento(carta3);
	//	combo2.addElemento(combo1);
		
		System.out.println(combo2.getRemitente());
		System.out.println(combo2.getTracking());
		System.out.println(carta2.getTracking());
		System.out.println(combo1.getPeso());

	}

}
