package p230601;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class TextFieldTest implements ActionListener{
	private Frame f, f2;
	private TextField id, pwd, print;
	private final String idc ="hi";
	private final String pwdc ="123";

	public void startframe() {
		f = new Frame("Login");
		f2 = new Frame("success");
        f.setSize(400, 120);
        f2.setSize(400, 120);
        f.setLayout(new FlowLayout());
 
        Label lid = new Label("ID : ", Label.RIGHT);
        Label lpwd = new Label("Password : ", Label.RIGHT);
        Button btn = new Button("Login");
        btn.addActionListener(this);
        
        id = new TextField(10);
        pwd = new TextField(10);
        print = new TextField(50);
        pwd.setEchoChar('*');
        print.addActionListener(this);
 
        f.add(lid);
        f.add(id);
        f.add(lpwd);
        f.add(pwd);
        f.add(btn);
        f.add(print);
        f.setVisible(true);
        
        
	}
	
    public static void main(String[] args) {
    	TextFieldTest tf = new TextFieldTest();
    	tf.startframe();  	
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		TextFieldTest tt = new TextFieldTest();
		if(e.getActionCommand().equals("Login")) {
			 if(id.getText().equals(idc) && pwd.getText().equals(pwdc)) {
		        	print.setText("login sucess");
		        	print.setEditable(false);
		        	f2.setVisible(true);
//		        	System.exit(0);
		        }else {
		        	print.setText("login wrong");
		        	tt.startframe();
		        	f.setVisible(false);
		        }
		}
	}
}
