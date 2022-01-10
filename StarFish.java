import java.awt.Color;

public class StarFish {
	private Color color;
	private int x;
	private int y;
	private int l;
	private int[] xs = new int[10];
	private int[] ys = new int[10];

	
	StarFish(Color color, int x, int y, int l, int[] xs, int[] ys){
		this.color = color;
		this.x = x;
		this.y = y;
		this.l = l;
		this.xs = xs;
		this.ys = ys;
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
	
	public void setYs(int[] ys) {
		this.ys = ys;
	}
	
	public int[] getYs() {
		return this.ys;
	}
	
	public void setXs(int[] xs) {
		this.xs = xs;
	}
	
	public int[] getXs() {
		return this.xs;
	}

	public void setL(int l) {
		this.l = l;
	}
	
	public int getL() {
		return this.l;
	}
	
	
	
	
	
	
	
	
}
