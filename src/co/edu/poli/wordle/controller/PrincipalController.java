package co.edu.poli.wordle.controller;

import java.sql.SQLException;

import co.edu.poli.wordle.DAO.CRUD;
import co.edu.poli.wordle.model.Cronometro;
import co.edu.poli.wordle.model.Estadisticas;
import co.edu.poli.wordle.model.Letra;
import co.edu.poli.wordle.model.Palabra;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class PrincipalController {

	@FXML
	private TextField textAA;
	@FXML
	private TextField textAB;
	@FXML
	private TextField textAC;
	@FXML
	private TextField textAD;
	@FXML
	private TextField textAE;
	@FXML
	private TextField textBA;
	@FXML
	private TextField textBB;
	@FXML
	private TextField textBC;
	@FXML
	private TextField textBD;
	@FXML
	private TextField textBE;
	@FXML
	private TextField textCA;
	@FXML
	private TextField textCB;
	@FXML
	private TextField textCC;
	@FXML
	private TextField textCD;
	@FXML
	private TextField textCE;
	@FXML
	private TextField textDA;
	@FXML
	private TextField textDB;
	@FXML
	private TextField textDC;
	@FXML
	private TextField textDD;
	@FXML
	private TextField textDE;
	@FXML
	private TextField textEA;
	@FXML
	private TextField textEB;
	@FXML
	private TextField textEC;
	@FXML
	private TextField textED;
	@FXML
	private TextField textEE;
	@FXML
	private TextField textFA;
	@FXML
	private TextField textFB;
	@FXML
	private TextField textFC;
	@FXML
	private TextField textFD;
	@FXML
	private TextField textFE;
	@FXML
	private TextField textAA1;
	@FXML
	private TextField textAB1;
	@FXML
	private TextField textAC1;
	@FXML
	private TextField textAD1;
	@FXML
	private TextField textAE1;
	@FXML
	private TextField textBA1;
	@FXML
	private TextField textBB1;
	@FXML
	private TextField textBC1;
	@FXML
	private TextField textBD1;
	@FXML
	private TextField textBE1;
	@FXML
	private TextField textCA1;
	@FXML
	private TextField textCB1;
	@FXML
	private TextField textCC1;
	@FXML
	private TextField textCD1;
	@FXML
	private TextField textCE1;
	@FXML
	private TextField textDA1;
	@FXML
	private TextField textDB1;
	@FXML
	private TextField textDC1;
	@FXML
	private TextField textDD1;
	@FXML
	private TextField textDE1;
	@FXML
	private TextField textEA1;
	@FXML
	private TextField textEB1;
	@FXML
	private TextField textEC1;
	@FXML
	private TextField textED1;
	@FXML
	private TextField textEE1;
	@FXML
	private TextField textFA1;
	@FXML
	private TextField textFB1;
	@FXML
	private TextField textFC1;
	@FXML
	private TextField textFD1;
	@FXML
	private TextField textFE1;
	@FXML
	private TabPane tp;	
	@FXML
	private Tab tab2;	
	@FXML
	private Label victorias;
	@FXML
	private Label derrotas;
	@FXML
	private Label procentajes;
	@FXML
	private Label lab1;
	@FXML
	private Label lab2;
	@FXML
	private Label lab3;
	@FXML
	private Label lab4;
	@FXML
	private Label lab5;
	@FXML
	private Label lab6;	
	@FXML
	private Label tiempo;
	@FXML
	private Label crono;

	int intento = 0;
	int cont = 0;
	int win = 0;
	int loser = 0;
	int avance;
	String objetivo;

	Letra l1 = new Letra(cont, intento, "");
	Letra l2 = new Letra(cont, intento, "");
	Letra l3 = new Letra(cont, intento, "");
	Letra l4 = new Letra(cont, intento, "");
	Letra l5 = new Letra(cont, intento, "");
	TextField[][] matriz;
	TextField[][] matriz2;
	Label[] list;
	Cronometro miCronometro;
	
	BackgroundFill Amarillo = new BackgroundFill(Color.valueOf("#FFF700"), new CornerRadii(0), new Insets(0));
	Background yellow = new Background(Amarillo); 
	BackgroundFill Gris = new BackgroundFill(Color.valueOf("#90928F"), new CornerRadii(0), new Insets(0));
	Background grey = new Background(Gris); 
	BackgroundFill Verde = new BackgroundFill(Color.valueOf("#46FF00"), new CornerRadii(0), new Insets(0));
	Background green = new Background(Verde); 

	public static int centesima_segundo = 0;
	public static int segundos = 0;
	public static int minutos = 0;
	public static boolean iniciaHilo = true;
	boolean corriendo = false;
	
	public void inicioMatriz() {
		
		matriz = new TextField[6][5];
		matriz2 = new TextField[6][5];
		list = new Label[6];
		
		list [0]=lab1;
		list [1]=lab2;
		list [2]=lab3;
		list [3]=lab4;
		list [4]=lab5;
		list [5]=lab6;
		
		
		matriz [0][0]=textAA;
		matriz [0][1]=textAB;
		matriz [0][2]=textAC;
		matriz [0][3]=textAD;
		matriz [0][4]=textAE;
		matriz [1][0]=textBA;		
		matriz [1][1]=textBB;
		matriz [1][2]=textBC;
		matriz [1][3]=textBD;
		matriz [1][4]=textBE;		
		matriz [2][0]=textCA;
		matriz [2][1]=textCB;
		matriz [2][2]=textCC;
		matriz [2][3]=textCD;
		matriz [2][4]=textCE;		
		matriz [3][0]=textDA;
		matriz [3][1]=textDB;
		matriz [3][2]=textDC;
		matriz [3][3]=textDD;
		matriz [3][4]=textDE;		
		matriz [4][0]=textEA;
		matriz [4][1]=textEB;
		matriz [4][2]=textEC;
		matriz [4][3]=textED;
		matriz [4][4]=textEE;		
		matriz [5][0]=textFA;
		matriz [5][1]=textFB;
		matriz [5][2]=textFC;
		matriz [5][3]=textFD;
		matriz [5][4]=textFE;
		
		matriz2 [0][0]=textAA1;
		matriz2 [0][1]=textAB1;
		matriz2 [0][2]=textAC1;
		matriz2 [0][3]=textAD1;
		matriz2 [0][4]=textAE1;
		matriz2 [1][0]=textBA1;		
		matriz2 [1][1]=textBB1;
		matriz2 [1][2]=textBC1;
		matriz2 [1][3]=textBD1;
		matriz2 [1][4]=textBE1;		
		matriz2 [2][0]=textCA1;
		matriz2 [2][1]=textCB1;
		matriz2 [2][2]=textCC1;
		matriz2 [2][3]=textCD1;
		matriz2 [2][4]=textCE1;		
		matriz2 [3][0]=textDA1;
		matriz2 [3][1]=textDB1;
		matriz2 [3][2]=textDC1;
		matriz2 [3][3]=textDD1;
		matriz2 [3][4]=textDE1;		
		matriz2 [4][0]=textEA1;
		matriz2 [4][1]=textEB1;
		matriz2 [4][2]=textEC1;
		matriz2 [4][3]=textED1;
		matriz2 [4][4]=textEE1;		
		matriz2 [5][0]=textFA1;
		matriz2 [5][1]=textFB1;
		matriz2 [5][2]=textFC1;
		matriz2 [5][3]=textFD1;
		matriz2 [5][4]=textFE1;
	}

	public void start() {
		inicioMatriz();		
		CRUD pa = new CRUD();
		try {
			objetivo = pa.palabra();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if (corriendo == false) {
			iniciaHilo = true;
			corriendo = true;
			iniciaHiloCronometro();
		}
		
	}

	private void iniciaHiloCronometro() {
		if (iniciaHilo == true) {
			System.out.println("Inicia el Hilo");
			miCronometro= new Cronometro();
			miCronometro.start();
		}
	}
	
	@SuppressWarnings("deprecation")
	private void detenerHiloCronometro() {
		if (corriendo == true) {
			iniciaHilo = false;
			corriendo = false;
			System.out.println("Detener Hilo");
			tiempo.setText(miCronometro.valor());
			miCronometro.stop();
		}
	}

	@FXML
	public void addLetter(ActionEvent event) {
		switch (cont) {
		case 0: {
			l1.setColumna(cont);
			l1.setFila(intento);
			l1.setValor(((Button) event.getSource()).getText());
			matriz[intento][cont].setText(l1.getValor());
			cont++;
			break;
		}
		case 1: {
			l2.setColumna(cont);
			l2.setFila(intento);
			l2.setValor(((Button) event.getSource()).getText());
			matriz[intento][cont].setText(l2.getValor());
			cont++;
			break;
		}
		case 2: {
			l3.setColumna(cont);
			l3.setFila(intento);
			l3.setValor(((Button) event.getSource()).getText());
			matriz[intento][cont].setText(l3.getValor());
			cont++;
			break;
		}
		case 3: {
			l4.setColumna(cont);
			l4.setFila(intento);
			l4.setValor(((Button) event.getSource()).getText());
			matriz[intento][cont].setText(l4.getValor());
			cont++;
			break;
		}
		case 4: {
			l5.setColumna(cont);
			l5.setFila(intento);
			l5.setValor(((Button) event.getSource()).getText());
			matriz[intento][cont].setText(l5.getValor());
			cont++;
			break;
		}

		}

	}

	public void borrar() {
		if (cont > 0) {
			cont--;
			matriz[intento][cont].setText("");
		}
		switch (cont) {
		case 0: {
			l1.setValor("");
			break;
		}
		case 1: {
			l2.setValor("");
			break;
		}
		case 2: {
			l3.setValor("");
			break;
		}
		case 3: {
			l4.setValor("");
			break;
		}
		case 4: {
			l5.setValor("");
			break;
		}
		}
	}

	public void enviar(){
		Palabra pa1 = new Palabra(l1, l2, l3, l4, l5);
		avance=0;
		System.out.println(objetivo);
		String color[];
		System.out.println(pa1.getValor());

		if (!pa1.size(pa1)) {
			System.out.println("Palabra incompleta");
		} else if (pa1.va1(pa1, objetivo)) {
			System.out.println("Mostrar ventana de victoria");
			tp.getSelectionModel().select(tab2);
			detenerHiloCronometro();
			for (int i = 0; i < 5; i++) {
				matriz[intento][i].setBackground(green);
				matriz2[intento][i].setBackground(green);
				matriz2[intento][i].setText("V");
			}
			win++;
			estadistica();
			list[intento].setText("100%");
		} else {
			color = pa1.va2(pa1, objetivo);
			colores(color, pa1);
			eliminar();
			list[intento].setText(avance+"%");
			intento++;
			cont = 0;
			System.out.println("Intento: "+intento);
		}
		if (intento > 5) {
			loser++;
			estadistica();
			detenerHiloCronometro();
			tp.getSelectionModel().select(tab2);
		}

	}

	public void colores(String color[], Palabra pa1) {	
		
		for (int i = 0; i < color.length; i++) {
			switch (color[i]) {
			case "g": {
				matriz[intento][i].setBackground(grey);
				matriz2[intento][i].setBackground(grey);
				matriz2[intento][i].setText("G");
				avance=avance+5;
				break;
			}
			case "a": {
				matriz[intento][i].setBackground(yellow);
				matriz2[intento][i].setBackground(yellow);
				matriz2[intento][i].setText("A");
				avance=avance+10;
				break;
			}
			case "v": {
				matriz[intento][i].setBackground(green);
				matriz2[intento][i].setBackground(green);
				matriz2[intento][i].setText("V");
				avance=avance+20;
				break;
			}
			}
		}
	}
	
	public void eliminar() {
		l1.setValor("");
		l2.setValor("");
		l3.setValor("");
		l4.setValor("");
		l5.setValor("");
	}

	public void reinicio() {
		detenerHiloCronometro();
		limpiar();
		eliminar();
		intento = 0;
		cont = 0;
	}
	
	public void limpiar() {
		BackgroundFill Blanco = new BackgroundFill(Color.valueOf("#FAFAFA"), new CornerRadii(0), new Insets(0));
		Background white = new Background(Blanco);
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j].setText("");
				matriz[i][j].setBackground(white);
				matriz2[i][j].setText("");
				matriz2[i][j].setBackground(white);
			}
		}
	}

	public void estadistica() {
		Estadisticas est = new Estadisticas(win, loser);
		victorias.setText("" + est.getWin());
		derrotas.setText("" + est.getLoser());
		procentajes.setText((int) est.procentaje(est) + "%");
	}

}