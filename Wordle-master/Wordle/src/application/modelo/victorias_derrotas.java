package application.modelo;

public class victorias_derrotas {

	private int win = 0;
	private int loser = 0;
	private int suma;
	private int porcentaje;

	victorias_derrotas(int win, int loser, int suma, int porcentaje) {
		this.win = win;
		this.loser = loser;
		this.suma = suma;
		this.porcentaje = porcentaje;
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int getLoser() {
		return loser;
	}

	public void setLoser(int loser) {
		this.loser = loser;
	}

	public int procentaje(int win, int loser) {
		suma = win + loser;
		return ((win / suma) * 100);

	}

}
