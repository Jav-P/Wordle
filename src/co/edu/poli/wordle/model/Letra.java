package co.edu.poli.wordle.model;

public class Letra {
	
	private int columna;
	private int fila;
	private String valor;
	public Letra(int columna, int fila, String valor) {
		super();
		this.columna = columna;
		this.fila = fila;
		this.valor = valor;
	}
	public int getColumna() {
		return columna;
	}
	public void setColumna(int columna) {
		this.columna = columna;
	}
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	

}
