package p230531;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FlowTest2 implements ActionListener, WindowListener {
	private Frame frame;
	private Button button1, button2, button3;

	public FlowTest2() {
		frame = new Frame("adapter example");
		button1 = new Button("Ok");
		button2 = new Button("Open");
		button3 = new Button("Close");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("윈도우 종료");
		System.exit(0);			
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("윈도우 등장");

	}

	@Override
	public void windowClosed(WindowEvent e) {	
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	public void startFrame() {
		frame.addWindowListener(this);
		frame.setLayout(new FlowLayout());
		button2.addActionListener(this);
		button3.addActionListener(this);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		FlowTest2 g = new FlowTest2();
		g.startFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Open")) {
			System.out.println("Whindow Open");
		}
		if (e.getActionCommand().equals("Close")) {
			System.exit(0);
		}
	}
}