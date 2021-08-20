package firstProject;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main {
	
	public static void main(String[] args) {
		Main n = new Main();
		JFrame f = new JFrame("Roman Converter");
		
		JTextField tf = new JTextField();
		tf.setBounds(100, 50, 150, 25);
		
		JTextField tf1 = new JTextField();
		tf1.setBounds(100, 100, 150, 25);
		
		ActionListener a = new ActionListener(){public void actionPerformed(ActionEvent e) {
			
			String s1 = tf.getText();
			int x = Integer.parseInt(s1);
			
			tf1.setText(Converter.converter(x));
		}};
	
		
		JButton b = new JButton("Click Me");
		b.setBounds(100, 200, 100, 50);
		b.addActionListener(a);
		f.add(b);
		f.add(tf);
		f.add(tf1);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		
		
	}
	
}
