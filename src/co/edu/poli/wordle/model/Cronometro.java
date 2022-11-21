package co.edu.poli.wordle.model;

import co.edu.poli.wordle.controller.PrincipalController;

public class Cronometro extends Thread{
	
	String reloj="00:00:00";
	PrincipalController lo;
	
	public void run () {
		lo = new PrincipalController();
		try {
			int x=0;
			while (PrincipalController.iniciaHilo) {
				Thread.sleep(1000);	
				ejecutarHiloCronometro(x);
				x++;
			}			
		} catch (Exception e) {
			System.out.println("Exception en el hilo: "+e.getMessage());
		}
	}
	
	public String valor() {
		return reloj;
	}

	private void ejecutarHiloCronometro(int x) {		
		PrincipalController.centesima_segundo++;		
		if(PrincipalController.centesima_segundo>99) {
			PrincipalController.centesima_segundo=0;
			PrincipalController.segundos++;
		}		
		if(PrincipalController.segundos>59) {
			PrincipalController.segundos=0;
			PrincipalController.minutos++;
		}
		
		String textdeci="00", textSeg="00", textMin="00";
		if(PrincipalController.centesima_segundo<10) {
			textdeci="0"+PrincipalController.centesima_segundo;
		}else {
			textdeci=PrincipalController.centesima_segundo+"";
		}
		if(PrincipalController.segundos<10) {
			textSeg="0"+PrincipalController.segundos;
		}else {
			textSeg=PrincipalController.segundos+"";
		}
		if(PrincipalController.minutos<10) {
			textMin="0"+PrincipalController.minutos;
		}else {
			textMin=PrincipalController.minutos+"";
		}
		reloj = textMin+":"+textSeg+":"+textdeci;
		System.out.println(reloj);
	}
}
