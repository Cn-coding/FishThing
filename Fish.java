import java.awt.Color;

public class Fish {

	private Color color;
	private int x;
	private int y;
	
	Fish(Color color, int x, int y){
		this.color = color;
		this.x = x;
		this.y = y;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return this.color;
	}

	public void setX(int num) {
		this.x = num;
	}
	
	public void setY(int num) {
		this.y = num;
	}
		
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	
}
