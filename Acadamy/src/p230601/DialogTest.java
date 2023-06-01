package p230601;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DialogTest extends WindowAdapter {
	Frame f;
	Dialog info;

	public void startframe() {
		f = new Frame("Parent");
		f.setSize(300, 200);

		info = new Dialog(f, "Information", true);
		info.setSize(140, 90);
		info.setLocation(50, 50);
		info.setLayout(new FlowLayout());
		
		Label msg = new Label("This is modal Dialog", Label.CENTER);
		Button ok = new Button("OK");
		info.add(msg);
		info.add(ok);		
		
		ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                info.dispose();
            }
        });
		
		info.addWindowListener(this);
		f.addWindowListener(this);
		f.setVisible(true);
		info.setVisible(true);	

	}


	public void windowClosing(WindowEvent e) {		
		info.dispose();
	}
	
	public static void main(String[] args) {
		DialogTest dt = new DialogTest();
		dt.startframe();
	}

}
