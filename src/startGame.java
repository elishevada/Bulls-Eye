//********Elisheva Dayan I.D:208027102****and****Liora Barda I.D:318926003********
//	Course Name: Object Oriented Programming, 2018, Semester 2, project

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class startGame extends JPanel {
	private JButton start,instructions;
	private Image img;
	private JPanel f;
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;

	public startGame() {
		l1=new JLabel("the Purpose of the game:");
		l2=new JLabel("The player must discover the hidden order of colors.");
		l3=new JLabel("the progress of the game:");
		l4=new JLabel("1. The player must first select a certain order of his choice and");
		l5=new JLabel("press ok only after he has selected 4 different colors.");
		l6=new JLabel("2.The black number is the number of times you've put the correct color");
		l7=new JLabel("in the position and the number of bricks is the number");
		l8=new JLabel("of times you've put the correct color but not in the right place ");
		l9=new JLabel("(at a later stage you can get a blank hint that it means none of the colors exist)");
		Border emptyBorder=BorderFactory.createEmptyBorder();
		f=new JPanel();
		f.setOpaque(false);
		img=Toolkit.getDefaultToolkit().createImage("src/11.jpg");
		ButtonListener b1=new ButtonListener();
		start=new JButton("start");
		start.addActionListener(b1);
		start.setFont(new Font ("ALGERIAN",60,60));//OK font
		start.setContentAreaFilled(false);
		start.setBorder(emptyBorder);
		f.add(start);

		instructions=new JButton("instructions");
		instructions.addActionListener(b1);
		instructions.setFont(new Font ("ALGERIAN",60,60));
		instructions.setContentAreaFilled(false);
		instructions.setBorder(emptyBorder);
		f.add(instructions);
		f.setLayout(new GridLayout(1,2,500,500));
		//		add(f,BorderLayout.SOUTH);
		add(f);

	}




	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img,0,0,this);
	}




	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Border emptyBorder2;
			if(e.getSource().equals(start)) {
				JFrame f=new JFrame("bull's eye");
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setSize(1300,800);
				level p=new level();
				f.add(p);
				emptyBorder2=BorderFactory.createEmptyBorder(330,245,0,500);//גודל הפנאל הראשי 
				p.setBorder(emptyBorder2);
				f.setVisible(true);

			}

			if(e.getSource().equals(instructions)) {

				JFrame f1=new JFrame("Instructions");

				f1.setSize(1300,800);
				level p9=new level();
				f1.add(p9);
				p9.add(l1);
				p9.add(l2);
				p9.add(l3);
				p9.add(l4);
				p9.add(l5);
				p9.add(l6);
				p9.add(l7);
				p9.add(l8);
				p9.add(l9);
				p9.setLayout(new GridLayout(9,1)); 
				emptyBorder2=BorderFactory.createEmptyBorder(300,200,0,300);//גודל הפנאל  
				p9.setBorder(emptyBorder2);
				f1.setVisible(true);

			}


		}
	}
}
