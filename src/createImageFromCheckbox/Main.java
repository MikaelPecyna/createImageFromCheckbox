package createImageFromCheckbox;
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        
    	
        Button valid = new Button("Enregistrer");
    	valid.setAlignment(Pos.CENTER_RIGHT);
    	
    	
        
        
        GridPaneWithCheckbox grid= new GridPaneWithCheckbox(7, 7);
        
        BorderPane root = new BorderPane(); 
        root.setCenter(grid);
//        
        
        valid.setOnAction(e->{
        	GetImageFromMatrix.genImage(grid.getMatrix(), "test.png");
    	});
        
        BottomOfPane bot = new BottomOfPane(grid);
        
        root.setBottom(bot);
        
        
        
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.setTitle("Hello World!");
        primaryStage.show();
    }

	
}