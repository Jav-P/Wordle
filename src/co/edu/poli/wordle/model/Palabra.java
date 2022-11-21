package co.edu.poli.wordle.model;

public class Palabra {
	
	private String valor;

	public Palabra(Letra l1, Letra l2, Letra l3, Letra l4, Letra l5) {
		this.valor=l1.getValor()+l2.getValor()+l3.getValor()+l4.getValor()+l5.getValor();
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	

	
	public boolean size(Palabra pa1) {
		if (pa1.getValor().length()==5)return true;
		return false;
	}
	
	public boolean va1(Palabra pa1, String obj) {
		if(pa1.getValor().equalsIgnoreCase(obj))return true;
		return false;
	}
	
	public String[] va2(Palabra pa1, String obj) {
		String[] color = new String[5];
		Boolean aux=false;
		for (int i = 0; i < 5; i++) {
			aux=false;
			for (int j = 0; j < 5; j++) {
				if(pa1.getValor().substring(i, i+1).equalsIgnoreCase(obj.substring(j, j+1))) {
					aux=true;
					if(i==j) {
						color[i]="v";
					}else {
						color[i]="a";
					}
				}
			}
			if(aux.equals(false)) {
				color[i]="g";
			}
		}
		return color;		
	}

}
