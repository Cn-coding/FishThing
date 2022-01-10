import javax.swing.*;
import java.awt.*;
import java.awt.Dimension;

public class Runner{

	public static void main(String[] args) {


		JFrame window = new JFrame();
		window.setContentPane(new DrawingPanel2());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(1600,980); //955
		window.setVisible(true);
		window.setResizable(false);

	}

}
