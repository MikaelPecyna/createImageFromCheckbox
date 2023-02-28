package Acceuil;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class AcceuilPane extends GridPane {

	public AcceuilPane()  {
		super();
		
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(16));
        this.setHgap(16);
        this.setVgap(8);
        
        Label instruction = new Label("Entrer la taille de l'image que vous allez créer");
        
        TextField largeur = new TextField();
        Label larg = new Label("Largeur: (px)");
        HBox la = new HBox();
        la.getChildren().addAll(larg ,largeur);
        
        TextField longueur = new TextField();
        Label longu = new Label("Longueur: (px)");
        HBox lo = new HBox();
        lo.getChildren().addAll(longu, longueur);
        
        VBox box = new VBox();
        
        
        
        box.getChildren().addAll(instruction, la, lo);
        this.getChildren().add(box);
	}

}
