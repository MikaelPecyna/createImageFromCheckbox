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
		
		this.cbMatrix =  new CheckBox[this.largeur+1][this.longueur+1];
		
		for(int y = 0; y<largeur; y++) {
			for(int x = 0; x<longueur; x++) {
				cbMatrix[y][x] = new CheckBox();
				this.add(cbMatrix[y][x], x, y);
			}
		}
			
	}
	public int[][] getMatrix() {
		this.intMatrix = new int[this.largeur][this.longueur]; 
		
		for(int y = 0; y<largeur; y++) {
			for(int x = 0; x<longueur; x++) {
				if(cbMatrix[y][x].isSelected()) {
					intMatrix[y][x] = 1; 
				}	
			}
		}
		
		return this.intMatrix;
	}

}
