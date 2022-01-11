import java.awt.Color;

public class Fish {

	private Color color;
	private double x;
	private double y;
	private double l;
	private int speed = 1;
	private double xSpeedProportion = 1;
	private double ySpeedProportion = 0;
	
	Fish(Color color, int x, int y, double l){
		this.color = color;
		this.x = x;
		this.y = y;
		this.l = l;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return this.color;
	}

	public void setX(double num) {
		this.x = num;
	}
	
	public void setY(double num) {
		this.y = num;
	}
		
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getXSpeedProportion() {
		return xSpeedProportion;
	}

	public void setXSpeedProportion(double xSpeedProportion) {
		this.xSpeedProportion = xSpeedProportion;
	}

	public double getYSpeedProportion() {
		return ySpeedProportion;
	}

	public void setYSpeedProportion(double ySpeedProportion) {
		this.ySpeedProportion = ySpeedProportion;
	}

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}
	
	
}
