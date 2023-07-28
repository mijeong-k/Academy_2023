package calculationMake;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Setting extends WindowAdapter implements ActionListener {
   private Frame f;
   private TextField text;

   private Panel p;

   private String[] num;
   private Button[] btn;

   private String first;
   private String result;

   private char cha;
   private double res;

   // windowClosing
   public void windowClosing(WindowEvent e) {
      System.exit(0);
   }

   // Setting() 생성자
   public Setting() {
      f = new Frame("Calculator");
      p = new Panel();
      text = new TextField();
      result = "";
      first = "";
      cha = '\0';
      res = 0;

      num = new String[] { "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "x", "c", "0", "=", "/" };

      btn = new Button[num.length];
      for (int i = 0; i < num.length; i++) {
         btn[i] = new Button(num[i]);
      }

   }

   public void startFrame() {

      // Frame 세팅
      f.setSize(300, 200);
      f.addWindowListener(this);
      f.add(text, BorderLayout.NORTH);

      // Panel 세팅
      f.add(p, BorderLayout.CENTER);
      p.setLayout(new GridLayout(4, 4));
      for (int i = 0; i < num.length; i++) {
         p.add(btn[i]);
      }

      // ActionListener 세팅
      for (int i = 0; i < num.length; i++) {
         btn[i].addActionListener(this);
      }

      f.setVisible(true);
   }

   //  계산하기
   public void calculation() {
      if (cha == '/') {
         res = Double.parseDouble(first) / Double.parseDouble(result);
         if(res%1 == .0) {
            result = String.valueOf((int)res);
         }else {
            result = String.valueOf(res);
         }
      } else {
         switch (cha) {
         case '+':
            res = Integer.parseInt(first) + Integer.parseInt(result);
            break;
         case '-':
            res = Integer.parseInt(first) - Integer.parseInt(result);
            break;
         case 'x':
            res = Integer.parseInt(first) * Integer.parseInt(result);
            break;
         }
         result = String.valueOf((int) res);
      }
   }

   // 값 저장하기
   public void change() {
      first = result;
      result = "";
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == btn[3]) {
         cha = '+';         
         change();
         text.setText(text.getText() + "+");
         return;
      } else if (e.getSource() == btn[7]) {
         cha = '-';
         change();
         text.setText(text.getText() + "-");
         return;
      } else if (e.getSource() == btn[11]) {
         cha = 'x';
         change();
         text.setText(text.getText() + "x");
         return;
      } else if (e.getSource() == btn[15]) {
         cha = '/';
         change();
         text.setText(text.getText() + "/");
         return;
      } else if (e.getSource() == btn[14]) { // '='
         calculation();
      } else if (e.getSource() == btn[12]) { // 'c'
         result = "";
      } else {
         for (int i = 0; i < num.length; i++) {
            if (e.getSource() == btn[i]) {
               result = result + num[i];
            }
         }
      }
      text.setText(result);
   }
}