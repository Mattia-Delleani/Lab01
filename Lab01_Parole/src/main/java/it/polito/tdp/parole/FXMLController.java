package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.*;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;
    
    @FXML
    private Button btnCancella;
    
    @FXML
    private TextArea txtTemp;
    

    @FXML
    void doInsert(ActionEvent event) {
    	// TODO
    	long tempInizio =System.nanoTime();
    	long tempFine;
    	String ts = "";
    	
    	ts = txtParola.getText();
    	
    	elenco.addParola(ts);
    	
    	txtParola.clear();
    	txtResult.setText(elenco.toString());
    	tempFine = System.nanoTime();
    	txtTemp.appendText("Tempo di esecuzione: "+ (tempFine-tempInizio)/1e9 +"\n");    	
    }

    @FXML
    void doReset(ActionEvent event) {
    	// TODO
    	long tempInizio =System.nanoTime();
    	long tempFine;
    	
    	txtResult.clear();
    	elenco.reset();
    	tempFine = System.nanoTime();
    	txtTemp.appendText("Tempo di esecuzione: "+ (tempFine-tempInizio)/1e9 +"\n");
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }
    
    @FXML
    void doDelete(ActionEvent event) {
    	
    	long tempInizio =System.nanoTime();
    	long tempFine;
    	String daCancellare = txtResult.getSelectedText();
    	
    	elenco.delete(daCancellare);
    	
    	txtResult.setText(elenco.toString());
    	tempFine = System.nanoTime();
    	txtTemp.appendText("Tempo di esecuzione: "+ (tempFine-tempInizio)/1e9 +"\n");

    	
    }
    
}
