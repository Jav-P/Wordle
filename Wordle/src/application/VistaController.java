package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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
    private Button button—;
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
    
    String Palabra ="MANOS";
    
    @FXML
    void addLetter(ActionEvent event) {
    	System.out.println(((Button)event.getSource()).getText());
    }
	
	public void start() {
		System.out.println("Start");
	}
	
	public void reinicio() {
		System.out.println("Reinicio");
	}	
	
	public void enviar() {
		System.out.println("Enviar");
	}
	
	public void borrar() {
		System.out.println("borrar");
	}
	
}
