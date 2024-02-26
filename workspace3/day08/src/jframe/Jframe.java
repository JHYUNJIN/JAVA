package jframe;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;

public class Jframe {
	
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("GUI만들기");
			this.setLayout(new FlowLayout());
			
			JButton btn1 = new JButton("버튼 1");
			this.add(btn1);
			
			JButton btn2 = new JButton("버튼 2");
			this.add(btn2);
			
			JButton btn3 = new JButton("버튼 3");
			this.add(btn3);
			
			JButton btn4 = new JButton("버튼 4");
			this.add(btn4);
			
			JButton btn5 = new JButton("버튼 5");
			this.add(btn5);
			
			String[] pet = {"강아지","고양이","여우","이무기","드래곤","현무"};
			
			
			JComboBox combo = new JComboBox(pet);
			this.add(combo);
			
			
			JList list = new JList(pet);
			this.add(list);

	
	
	JButton btn6 = new JButton("버튼6");
	btn6.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			btn6.setBackground(Color.RED);
		}
	});
	
	this.add(btn6);
	
	
	setSize(200,200);
	setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new MyGUI();
	}
}
