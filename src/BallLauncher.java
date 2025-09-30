import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class BallLauncher extends GraphicsProgram{
	public static final int PROGRAM_HEIGHT = 600;
	public static final int PROGRAM_WIDTH = 800;
	public static final int SIZE = 25;
	private ArrayList<GOval> balls;
	public static final int MS = 50;
	public static final int SPEED = 2;
	Timer t;
	public void init() {
		setSize(PROGRAM_WIDTH, PROGRAM_HEIGHT);
		requestFocus();
	}
	
	public void actionPerformed(ActionEvent e){
		//TODO add what we want to do every second
		for(GOval temp :balls)
		{
			temp.move(SPEED, 0);
		}
		}

	
	public void run() {
		balls = new ArrayList<GOval>();
		addMouseListeners();
		t = new Timer(MS,this);
		t.start();
	}
	
	public void mousePressed(MouseEvent e) {
		GOval ball = makeBall(SIZE/2, e.getY());
		add(ball);
		//balls.add(ball);
	}
	
	public GOval makeBall(double x, double y) {
		GOval temp = new GOval(x-SIZE/2, y-SIZE/2, SIZE, SIZE);
		temp.setColor(Color.RED);
		temp.setFilled(true);
		balls.add(temp);
		return temp;
	}
	
	public static void main(String[] args) {
		new BallLauncher().start();
	}

}
