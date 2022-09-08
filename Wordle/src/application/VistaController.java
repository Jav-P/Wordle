package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class VistaController {
	
	@FXML
    private Button buttonA;
    @FXML
    private Button buttonB;
    @FXML
    private Button buttonC;
    @FXML
    private Button buttonD;
    @FXML
    private Button buttonE;
    @FXML
    private Button buttonF;
    @FXML
    private Button buttonG;
    @FXML
    private Button buttonH;
    @FXML
    private Button buttonI;
    @FXML
    private Button buttonJ;
    @FXML
    private Button buttonK;
    @FXML
    private Button buttonL;
    @FXML
    private Button buttonM;
    @FXML
    private Button buttonN;
    @FXML
    private Button buttonÑ;
    @FXML
    private Button buttonO;
    @FXML
    private Button buttonP;
    @FXML
    private Button buttonQ;
    @FXML
    private Button buttonR;
    @FXML
    private Button buttonS;
    @FXML
    private Button buttonT;    
    @FXML
    private Button buttonU;    
    @FXML
    private Button buttonV;    
    @FXML
    private Button buttonW;    
    @FXML
    private Button buttonX;    
    @FXML
    private Button buttonY;    
    @FXML
    private Button buttonZ;
    
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
    private Button buttonReinicio;
    @FXML
    private Button buttonSend;
    @FXML
    private Button buttonStart;
    @FXML
    private Button buttondelet;
    
    int intento = 0;   
    int cont=0;
    static String objetivo = "manos";
    
    String Palabra ="MANOS";
    
    
    TextField matriz [][]= {
    		{textAA,textAB,textAC,textAD,textAE},
    		{textBA,textBB,textBC,textBD,textBE},
    		{textCA,textCB,textCC,textCD,textCE},
    		{textDA,textDB,textDC,textDD,textDE},
    		{textEA,textEB,textEC,textED,textEE},
    		{textFA,textFB,textFC,textFD,textFE}
    };
    
    @FXML
    void addLetter(ActionEvent event) {
    	TextField matriz [][]= {
        		{textAA,textAB,textAC,textAD,textAE},
        		{textBA,textBB,textBC,textBD,textBE},
        		{textCA,textCB,textCC,textCD,textCE},
        		{textDA,textDB,textDC,textDD,textDE},
        		{textEA,textEB,textEC,textED,textEE},
        		{textFA,textFB,textFC,textFD,textFE}
        };
    	System.out.println(((Button)event.getSource()).getText());
    	if(cont<5) {    		
    		matriz[intento][cont].setText(((Button)event.getSource()).getText());    
    		cont++;
    	}
    }
    
    
    public void unir () {
    	
		String a ="";
		for (int i = 0; i < matriz.length; i++) {
			a=a+matriz[intento][i];
		}
		System.out.println(a);
		if(tamaño(a))comparar(a);//hay que buscar la palabra en la base de datos
			
	}
	public static Boolean tamaño (String palabra) {
		if(palabra.length()!=5)return false;
		//Sigue la verificaci�n si es real la palabra
		return true;
	}	
	public static void comparar(String palabra) {
		palabra=palabra.toUpperCase();
		objetivo=objetivo.toUpperCase();
		Boolean aux=false;
		System.out.println(palabra+", "+objetivo);		
		if(palabra.equals(objetivo))System.out.println("Felicitaciones, adivino la palabra");//Termina el juego		
		for (int i = 0; i < 5; i++) {
			aux=false;
			for (int j = 0; j < 5; j++) {
				if(palabra.substring(i, i+1).equalsIgnoreCase(objetivo.substring(j, j+1))) {
					if(i==j) {
					System.out.println("La letra "+palabra.substring(i, i+1)+" es: llamar funcion verde");
					aux=true;
					}else {
					System.out.println("La letra "+palabra.substring(i, i+1)+" es: funcion Amarillo");
					aux=true;
					}
				}			
			}
			if(aux.equals(false))System.out.println("La letra "+palabra.substring(i, i+1)+" es: funcion Gris");
		}			
	}
    
    
    
    public void limpiar() {
    	TextField matriz [][]= {
        		{textAA,textAB,textAC,textAD,textAE},
        		{textBA,textBB,textBC,textBD,textBE},
        		{textCA,textCB,textCC,textCD,textCE},
        		{textDA,textDB,textDC,textDD,textDE},
        		{textEA,textEB,textEC,textED,textEE},
        		{textFA,textFB,textFC,textFD,textFE}
        };
    	for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j].setText("");
				//textAA.setText("S");
			}
		}  
    }
    
	public void start() {
		System.out.println("Start");
	}
	
	public void reinicio() {
		System.out.println("Reinicio");
		intento=0;
		cont=0;
		limpiar();
	}	
	
	public void enviar() {
		BackgroundFill Amarillo = new BackgroundFill(Color.valueOf("#FFF700"), new CornerRadii(0), new Insets(0));
		Background yellow = new Background(Amarillo); 
		BackgroundFill Gris = new BackgroundFill(Color.valueOf("#90928F"), new CornerRadii(0), new Insets(0));
		Background grey = new Background(Gris); 
		BackgroundFill Verde = new BackgroundFill(Color.valueOf("#46FF00"), new CornerRadii(0), new Insets(0));
		Background green = new Background(Verde); 
		
		TextField matriz [][]= {
        		{textAA,textAB,textAC,textAD,textAE},
        		{textBA,textBB,textBC,textBD,textBE},
        		{textCA,textCB,textCC,textCD,textCE},
        		{textDA,textDB,textDC,textDD,textDE},
        		{textEA,textEB,textEC,textED,textEE},
        		{textFA,textFB,textFC,textFD,textFE}
        };
		
		System.out.println("Enviar");
		if(intento<6){
			//unir();
			String palabra ="";
			for (int i = 0; i < 5; i++) {
				palabra=palabra+matriz[intento][i].getText();
			}
			System.out.println("La palabra es "+palabra);
			if(palabra.length()==5) {
				//comparar(a);
				palabra=palabra.toUpperCase();
				objetivo=objetivo.toUpperCase();
				Boolean aux=false;
				System.out.println(palabra+", "+objetivo);		
				if(palabra.equals(objetivo))System.out.println("Felicitaciones, adivino la palabra");//Termina el juego		
				for (int i = 0; i < 5; i++) {
					aux=false;
					for (int j = 0; j < 5; j++) {
						if(matriz[intento][i].getText().equalsIgnoreCase(objetivo.substring(j, j+1))) {
							if(i==j) {
							System.out.println("La letra "+palabra.substring(i, i+1)+" es: llamar funcion verde");
							matriz[intento][i].setBackground(green);
							aux=true;
							}else {
							System.out.println("La letra "+palabra.substring(i, i+1)+" es: funcion Amarillo");
							matriz[intento][i].setBackground(yellow);
							aux=true;
							}
						}			
					}
					if(aux.equals(false)) {
						System.out.println("La letra "+palabra.substring(i, i+1)+" es: funcion Gris");
						matriz[intento][i].setBackground(grey);
					}
				}
				intento++;
				cont=0;
			}			
		}
		System.out.println(intento);
	}
	
	public void borrar() {
		System.out.println("borrar");
		System.out.println(cont);
		TextField matriz [][]= {
        		{textAA,textAB,textAC,textAD,textAE},
        		{textBA,textBB,textBC,textBD,textBE},
        		{textCA,textCB,textCC,textCD,textCE},
        		{textDA,textDB,textDC,textDD,textDE},
        		{textEA,textEB,textEC,textED,textEE},
        		{textFA,textFB,textFC,textFD,textFE}
        };
		if(cont>0) {			
			cont--;
			matriz[intento][cont].setText("");
		}
	}
	
}
