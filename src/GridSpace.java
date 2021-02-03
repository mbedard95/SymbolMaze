import enums.Color;
import enums.Shape;

public class GridSpace {
	
	public int row, col;
	public Color color;
	public Shape shape;
	public boolean isCircle;
	
	private GridSpace(int r, int c, Color colr, Shape s, boolean cir) {
		row = r;
		col = c;
		color = colr;
		shape = s;
		isCircle = cir;
	}
}
