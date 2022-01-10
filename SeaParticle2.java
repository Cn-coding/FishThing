import java.awt.Color;

public class SeaParticle2 {
	private Color color;
	private int x;
	private int y;
	private int height;
	private int width;

	
	SeaParticle2(Color color, int x, int y, int width, int height){
		this.color = color;
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public void setWidth(int num) {
		this.width = num;
	}
	
	public void setHeight(int num) {
		this.height = num;
	}
	
	public void setX(int num) {
		this.x = num;
	}
	
	public void setY(int num) {
		this.y = num;
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	
	
	
	
	
	
	
	
}
