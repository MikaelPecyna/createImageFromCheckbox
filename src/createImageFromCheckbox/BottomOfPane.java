package createImageFromCheckbox;
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
 
public class BottomOfPane extends HBox {
	
	GridPaneWithCheckbox grid; 

	
	public BottomOfPane(GridPaneWithCheckbox grid) {
		
		super();
		this.grid = grid; 
		Label text = new Label("Nom du fichier");
	    TextField input = new TextField();
	    Button save = new Button("Enregistrer");
	        
	
	    Region ressort = new Region();
	    HBox.setHgrow(ressort, Priority.ALWAYS);
	        
	    this.getChildren().addAll(text, input, ressort, save);
	        
	    
	    save.setOnAction(e -> {
	    	Save(input.getText());
	    });

	}    
	
	public void Save(String filename) {
		GetImageFromMatrix.genImage(grid.getMatrix(), filename);
	}
	
	
        
}
