package createImageFromCheckbox;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class GetImageFromMatrix {

	
	
	public static void genImage(int[][] matrix, String filename) {
		int width = matrix[0].length;
	    int height = matrix.length;
	    BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	    Graphics g = image.getGraphics();

	    for (int y = 0; y < height; y++) {
	      for (int x = 0; x < width; x++) {
	        if (matrix[x][y] == 1) {
	          g.setColor(Color.BLACK);
	        } else {
	          g.setColor(Color.WHITE);
	        }
	        g.fillRect(x, y, 1, 1);
	      }
	    }
	    

	    g.dispose();
	    try {
	      ImageIO.write(image, "png", new File(filename));
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	  
	}

}
