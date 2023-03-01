package createImageFromCheckbox;

import Acceuil.AcceuilPane;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class BackToAcceuil extends Pane {
	private Stage stage;
	public BackToAcceuil(Stage stage) {
		super();
		this.stage = stage; 
		Button back = new Button("Back");
		
		back.setOnAction(e->{
			showMyAcceuil();
		});
		
		this.getChildren().add(back);
	}

	
	private void showMyAcceuil() {
        AcceuilPane acceuilScreen = new AcceuilPane(stage);
        Scene acceuilScene = new Scene(acceuilScreen, 300, 250);
        stage.setScene(acceuilScene);
        stage.show();

	}
}
