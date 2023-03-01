package createImageFromCheckbox;

import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class GridPaneWithCheckbox extends GridPane {
	private int largeur; 
	private int longueur; 
	private Label[][] cbMatrix; 
	private int[][] intMatrix; 
	private int xCoord; 
	private int yCoord;
	private int[][] colorMatrix; 

	public GridPaneWithCheckbox(int largeur, int longueur) {
		super();
		
		this.largeur = largeur; 
		this.longueur= longueur; 
		
		
		this.cbMatrix =  new Label[this.largeur+1][this.longueur+1];
		this.colorMatrix =  new int[this.largeur][this.longueur];
		
		for(int y = 0; y<largeur; y++) {
			for(int x = 0; x<longueur; x++) {
				this.xCoord = x; 
				this.yCoord = y;
				
				Label tmp = new Label(); 
				int tmpInt = 0; 
				tmp.setMinSize(10, 10);
				tmp.setMinSize(20, 20);
				tmp.setStyle("-fx-border-color: black;");
				
				tmp.setOnMouseEntered(e->{
					tmp.setStyle("-fx-background-color: grey");
				});
				tmp.setOnMouseExited(e-> {
					if(colorMatrix[GridPane.getRowIndex(tmp)][GridPane.getColumnIndex(tmp)] == 1) {
						tmp.setStyle("-fx-background-color: black");
					}else {
					tmp.setStyle("-fx-background-color: white; -fx-border-color: black; ");
					}
				});
				
				tmp.setOnMouseClicked(e-> {
					System.out.println(this.yCoord + ";" + this.xCoord);
					if(colorMatrix[GridPane.getRowIndex(tmp)][GridPane.getColumnIndex(tmp)] == 1) {
						tmp.setStyle("-fx-background-color: white");
						colorMatrix[GridPane.getRowIndex(tmp)][GridPane.getColumnIndex(tmp)] = 0;
					}else {
						colorMatrix[GridPane.getRowIndex(tmp)][GridPane.getColumnIndex(tmp)] = 1;
						tmp.setStyle("-fx-background-color: black");
					}
					
				});
				
				
				colorMatrix[y][x] = tmpInt;
				cbMatrix[y][x] = tmp;
				this.add(cbMatrix[y][x], x, y);
			}
		}
			
	}
	public int[][] getMatrix() {	
		for(int[] ligne : this.colorMatrix) {
			for(int val : ligne) {
				System.out.print(val);
			}
			System.out.println();
		}
		return this.colorMatrix;
	}

}
