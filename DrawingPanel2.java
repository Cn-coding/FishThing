import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.lang.Math;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawingPanel2 extends JPanel implements ActionListener{
	
	private int height = 980;
	private int width = 1600;
	
	private int seaSize = 40000;
	private SeaParticle2[] sea = new SeaParticle2[seaSize];
	private int numOfFish = 10;
	private int numOfStarFish = 10;
	private Fish[] fish = new Fish[numOfFish];
	private StarFish[] starFish = new StarFish[numOfStarFish];
	Random rand = new Random();
	private Timer myTimer = new Timer(100,this);
	private Graphics2D g2;
	private boolean first = true;
	
	
	DrawingPanel2(){
		
		
		myTimer.start();
		
		Color[] fishColor = new Color[8];
		
		fishColor[0] = Color.DARK_GRAY;
		fishColor[1] = Color.cyan;
		fishColor[2] = Color.pink;
		fishColor[3] = Color.red;
		fishColor[4] = Color.orange;
		fishColor[5] = Color.green;
		fishColor[6] = Color.blue;
		fishColor[7] = Color.MAGENTA;

		
		Color[] colorList = new Color[5];
		
//		Color c_orange = new Color(246,65,45);
//		Color c_dred = new Color(255,86,7);
//		Color c_red = new Color(255,149,0);
//		Color c_dyellow = new Color(255,193,0);
//		Color c_yellow = new Color(255,236,25);
		
		Color c_orange = new Color(3,37,76);
		Color c_dred = new Color(17,103,177);
		Color c_red = new Color(24,123,205);
		Color c_dyellow = new Color(42,157,244);
		Color c_yellow = new Color(208,239,255);
			
		colorList[0] = c_orange;
		colorList[1] = c_dred;
		colorList[2] = c_red;
		colorList[3] = c_dyellow;
		colorList[4] = c_yellow;
		
		
		for (int i=0; i<seaSize; i++) {
			
			Color color = colorList[rand.nextInt(5)];
			
			int width = rand.nextInt(55);
			int height = rand.nextInt(55);
			
			int locx = rand.nextInt(1700); //1000
			int locy = rand.nextInt(1000);
			
			sea[i] = new SeaParticle2(color, locx, locy, width, height);
		}
		
		
		for (int i=0; i<numOfFish; i++) {
			
			Color color = fishColor[rand.nextInt(fishColor.length)];
			
			int y1 = rand.nextInt(850);
			int x1 = 0;
			
			if (y1>250) {
				x1 = rand.nextInt(670);
			}
			else {
				x1 = rand.nextInt(1300);
			}
			
			fish[i] = new Fish(color, x1, y1);
		}
		
		
		for (int i=0; i<numOfStarFish; i++) {
			
			Color color = fishColor[rand.nextInt(fishColor.length)];
			
			int l = 30;
			int y1 = rand.nextInt(850);
			int x1 = 0;
			
			if (y1>250) {
				x1 = rand.nextInt(670);
			}
			else {
				x1 = rand.nextInt(1300);
			}
			
			int[] xs4 = new int[10];
			int[] ys4 = new int[10];
			
			xs4[0]=(int)(x1);
			xs4[1]=(int)(xs4[0]+l);
			xs4[2]=(int)(xs4[1]+(0.31*l));
			xs4[3]=(int)(xs4[2]+(0.31*l));
			xs4[4]=(int)(xs4[3]+l);
			xs4[5]=(int)(xs4[4]-(0.82*l));
			xs4[6]=(int)(xs4[5]+(0.31*l));
			xs4[7]=(int)(xs4[6]-(0.81*l));
			xs4[8]=(int)(xs4[7]-(0.81*l));
			xs4[9]=(int)(xs4[8]+(0.31*l));
			
			ys4[0]=(int)(y1);
			ys4[1]=(int)(ys4[0]);
			ys4[2]=(int)(ys4[1]-(0.95*l));
			ys4[3]=(int)(ys4[2]+(0.95*l));
			ys4[4]=(int)(ys4[3]);
			ys4[5]=(int)(ys4[4]+(0.59*l));
			ys4[6]=(int)(ys4[5]+(0.95*l));
			ys4[7]=(int)(ys4[6]-(0.59*l));
			ys4[8]=(int)(ys4[7]+(0.59*l));
			ys4[9]=(int)(ys4[8]-(0.95*l));	
			
			starFish[i] = new StarFish(color, x1, y1, l, xs4, ys4);
			
		}
		
	}
	
	
//	DrawingPanel2(){
//		paintFirst(this.g2);
//	}
	
	
	public void penguin(Graphics2D g2) {
		// blue penguin border
		g2.setColor(new Color(208,239,255));
		g2.fillRect(1000,350,600,600);
		g2.setColor(Color.BLACK);	
		
		
		//Penguin base
		for (int i=1; i<15; i++) {
			if (i!=100) {
				g2.setColor(new Color(20+i*10,20+i*10,20+i*10));
				int width = (600/i);
				int height = (600/i);
				
				g2.fillOval(1600-(width*i), 950-(height*i), width, height);
			}
		}
		
		g2.setColor(new Color(40,40,40));
		//g2.fillOval(1600-600+(600/9), 950-600+(600/9), 600/2, 600/2);
		
		
		// penguin eyes
		g2.setColor(Color.white);
		g2.fillOval(1085, 565, 60, 60);
		g2.fillOval(1235, 445, 60, 60);
		
		
		// penguin pupils
		g2.setColor(Color.BLACK);
		g2.fillOval(1090, 570, 30, 30);
		g2.fillOval(1240, 450, 30, 30);
	
		
		// penguin beak
		g2.setColor(new Color(255,255,0));
		int[] xs = {1000,1050,1200};
		int[] ys = {350,550,400};
		g2.fillPolygon(xs,ys,3);
	}
	
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		if (this.first == true) {
			this.first = false;
			penguin(g2);
		}
		
		else {
			drawSea(sea, g2);
			drawFish(fish, g2);
			drawStarFish(starFish, g2);
			penguin(g2);
		}
		
	}
	
	public void paintFirst(Graphics2D g2) {


		
	}
	
	
	
	public void drawSea (SeaParticle2[] sea, Graphics2D g2) {
		for (SeaParticle2 part: sea) {
			
			g2.setColor(part.getColor());
			g2.fillRect(part.getX(), part.getY(), part.getWidth(), part.getHeight());
			g2.setColor(Color.black);
			g2.drawRect(part.getX(), part.getY(), part.getWidth(), part.getHeight());
			
		}
	}
	
	
	public void drawFish (Fish[] fish, Graphics2D g2) {
		
		for (Fish f: fish) {
			g2.setColor(f.getColor());
			
			int x = f.getX();
			int y = f.getY();
			
			int[] xs3 = {x,x+25,x,x+100};
			int[] ys3 = {y,y+50,y+100,y+50};
			g2.fillPolygon(xs3,ys3,4);
			
			g2.fillOval(x+80, y+20, 250, 60);
			
			g2.setColor(Color.white);
			g2.fillOval(x+300, y+30, 20, 20);
			
			g2.setColor(Color.black);
			g2.fillOval(x+308, y+35, 10, 10);
		}
	}
	
	
	public void drawStarFish (StarFish[] starFish, Graphics2D g2) {
		
		
		
		for (StarFish sf: starFish) {

			int x = sf.getX();
			int y = sf.getY();
			int[] xs = sf.getXs();
			int[] ys = sf.getYs();
			
			Color color = sf.getColor();
			int l = sf.getL();
			
				
			g2.setColor(color);
			
			g2.fillPolygon(xs, ys, 10);
			
			g2.setColor(Color.white);
			
			int xx = (int)((x+l)-((l/5)/5));
			int yy = (int) (y+l/5);
			
			g2.fillOval(xx, yy, (int) l/5, (int) l/5);
			
			g2.setColor(Color.BLACK);
			g2.fillOval((xx + l/15), (int) (yy + l/15), (int) l/10, (int) l/10);
			
			g2.setColor(Color.white);
			
			xx = (int)(((x+(1.62*l))-l/5)-((l/5)/5));
			yy = (int) (y+l/5);
			
			g2.fillOval(xx, yy, (int) l/5, (int) l/5);
			
			g2.setColor(Color.BLACK);
			g2.fillOval((xx + l/15), (int) (yy + l/15), (int) l/10, (int) l/10);
		
		}
	}
	
	
	public void actionPerformed (ActionEvent e) {
		
		if (e.getSource() == myTimer) {
			for (SeaParticle2 part: sea) {
				part.setX(part.getX()+5);
				if (part.getX()+part.getWidth() > this.width) {
					part.setX(rand.nextInt(10));
				}
			}
			repaint();
			System.out.println("hi");
		}
		
	}
	
	
	
	
	

}
