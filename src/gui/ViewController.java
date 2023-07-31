package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class ViewController {
	
	@FXML
	private Button btTest;
	
	@FXML
	private Button btAlert;
	
	@FXML
	public void onBtTestAction(){
		System.out.println("Button Click");
	}
	
	@FXML
	public void onBtAlertAction(){
		Alerts.showAlert("Alert title", "Alert header", "Hello !!", AlertType.INFORMATION);
	}

}	
