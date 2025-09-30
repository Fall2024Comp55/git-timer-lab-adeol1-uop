import acm.graphics.*;
import acm.program.*;
import javax.swing.*;
import java.awt.event.*;


public class MyFirstTimer extends GraphicsProgram implements ActionListener{
	public static final int PROGRAM_HEIGHT = 600;
	public static final int PROGRAM_WIDTH = 800;
	public static final int MAX_STEPS = 20;
	Timer t;
	private int numTimes;
	private GLabel myLabel;

	public void actionPerformed(ActionEvent e){
		//TODO add what we want to do every second
		myLabel.move(5,0);
		numTimes++;
		if(numTimes == 10)
		{
			t.stop();
		}
		myLabel.setLabel("times called? "  + numTimes);
		}

	
	public void init() {
		setSize(PROGRAM_WIDTH, PROGRAM_HEIGHT);
		requestFocus();
	}
	
	public void run() {
		numTimes = 0;
		myLabel = new GLabel("# of times called?", 0, 100);
		add(myLabel);
		t = new Timer(1000,this);
		t.setInitialDelay(3000);
		t.start();

	}
	
	public static void main(String[] args) {
		new MyFirstTimer().start();
	}
}