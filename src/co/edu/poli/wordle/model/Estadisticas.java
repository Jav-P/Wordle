package co.edu.poli.wordle.model;

public class Estadisticas {

	private int win;
    private int loser;
    
    public Estadisticas(int win, int loser) {
        this.win = win;
        this.loser = loser;
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
   
   public double procentaje(Estadisticas est) {
        double suma = est.getWin() + est.getLoser();
        System.out.println(suma);
        return (est.getWin()/suma) * 100;
    }

}
