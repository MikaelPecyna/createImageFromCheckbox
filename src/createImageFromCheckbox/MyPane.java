package createImageFromCheckbox;
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class MyPane extends  BorderPane {

    	public MyPane(int x, int y, Stage stage) {
    		super();
	        Button valid = new Button("Enregistrer");
	    	valid.setAlignment(Pos.CENTER_RIGHT);
	    	
	    	this.setTop(new BackToAcceuil(stage));
	        
	        
	        GridPaneWithCheckbox grid= new GridPaneWithCheckbox(x, y);
	        
	        ScrollPane sc = new ScrollPane(); 
	        sc.setContent(grid);
	        
	       
	        this.setCenter(sc);   
	        
	        
	        valid.setOnAction(e->{
	        	GetImageFromMatrix.genImage(grid.getMatrix(), "test.png");
	    	});
	        
	        BottomOfPane bot = new BottomOfPane(grid);
	        
	        this.setBottom(bot);

    }
    	
    	

	
}