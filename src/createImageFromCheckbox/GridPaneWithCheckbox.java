package createImageFromCheckbox;

import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;

public class GridPaneWithCheckbox extends GridPane {
	private int largeur; 
	private int longueur; 
	private CheckBox[][] cbMatrix; 
	private int[][] intMatrix; 

	public GridPaneWithCheckbox(int largeur, int longueur) {
		super();
		
		this.largeur = largeur; 
		this.longueur= longueur; 
		
		this.cbMatrix =  new CheckBox[largeur][longueur];
		
		for(int y = 0; y<largeur; y++) {
			for(int x = 0; x<largeur; x++) {
				cbMatrix[x][y] = new CheckBox();
				this.add(cbMatrix[x][y], x, y);
			}
		}
			
	}
	public int[][] getMatrix() {
		this.intMatrix = new int[this.largeur][this.longueur]; 
		
		for(int y = 0; y<largeur; y++) {
			for(int x = 0; x<largeur; x++) {
				if(cbMatrix[x][y].isSelected()) {
					intMatrix[x][y] = 1; 
				}	
			}
		}
		
		return this.intMatrix;
	}

}
