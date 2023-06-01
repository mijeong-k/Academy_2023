package p230601;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTest implements ActionListener {
	Frame f;

	public void startFrame() {
		f = new Frame("Login");
		f.setSize(300, 200);
		f.setLayout(null);
		Button b = new Button("Check");
		b.addActionListener(this);

		b.setSize(75, 50);
		b.setLocation(100, 75);

		f.add(b);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		ButtonTest bt = new ButtonTest();
		bt.startFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("체크 합니다.");
	}

}
