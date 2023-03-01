package Acceuil;

import createImageFromCheckbox.MyPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AcceuilPane extends GridPane {
	private Stage stage;

	public AcceuilPane(Stage stage)  {
		super();
		this.stage = stage;
		
		
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(16));
        this.setHgap(16);
        this.setVgap(8);
        
        Label instruction = new Label("Entrer la taille de l'image que vous allez créer");
        
        TextField largeur = new TextField();
        Label larg = new Label("Largeur: (↓)(px)");
        HBox la = new HBox();
        la.getChildren().addAll(larg ,largeur);
        
        TextField longueur = new TextField();
        Label longu = new Label("Longueur: (→)(px)");
        HBox lo = new HBox();
        lo.getChildren().addAll(longu, longueur);
        
        
        Button lancer = new Button("Démarrer !");
        VBox box = new VBox();
        
        lancer.setOnAction(e->{
        	int x = Integer.parseInt(largeur.getText()); 
        	int y = Integer.parseInt(longueur.getText()); 
        	showMyPane(x, y);
        });
        
        this.setOnKeyPressed(e->{
        	if(e.getCode() == KeyCode.ENTER) {
        	int x = Integer.parseInt(largeur.getText()); 
        	int y = Integer.parseInt(longueur.getText()); 
        	showMyPane(x, y);
        	}});
        
        box.getChildren().addAll(instruction, la, lo, lancer);
        this.getChildren().add(box);
	}
	
	private void showMyPane(int x, int y) {
        MyPane programScreen = new MyPane(x, y, stage);
        Scene programScene = new Scene(programScreen, x*20 + 50, y*20+ 80);
        stage.setScene(programScene);
        stage.show();

	}
}
