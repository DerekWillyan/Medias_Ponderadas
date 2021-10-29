package gui_class;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
	
	@FXML
	private TextField num1;
	@FXML
	private TextField num2;
	@FXML
	private TextField num3;
	@FXML
	private Button gerar;
	@FXML
	private Label resul;
	
	@FXML
	public void onbtnGerar() {
		
		double num1 = Double.parseDouble(this.num1.getText());
		double num2 = Double.parseDouble(this.num2.getText());
		double num3 = Double.parseDouble(this.num3.getText());
		
		double media = (num1*2 + num2*3 + num3*5)/(2+3+5);
		
		this.resul.setText(String.format("%.2f", media));
		
	}

}
