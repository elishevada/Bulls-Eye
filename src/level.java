//********Elisheva Dayan I.D:208027102****and****Liora Barda I.D:318926003********
//	Course Name: Object Oriented Programming, 2018, Semester 2, project

import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class level extends JPanel{
private JButton level_1,level_2;
private JPanel f;
private Image img;
//constructor
public level() {
	
	f=new JPanel();

	f.setOpaque(false);
	img=Toolkit.getDefaultToolkit().createImage("src/choose.jpg");

	level_1= new JButton("level 1"); 
	level_2= new JButton("level 2"); 

ButtonListener b1=new ButtonListener();
//level 1
level_1.addActionListener(b1);
level_1.setFont(new Font ("ALGERIAN",60,60));//level1 font
level_1.setContentAreaFilled(false);

f.add(level_1);
//level 2
level_2.addActionListener(b1);
level_2.setFont(new Font ("ALGERIAN",60,60)); //level2 font
level_2.setContentAreaFilled(false);

f.add(level_2);
f.setLayout(new GridLayout(2,1,10,80));
add(f);

}



public void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.drawImage(img,0,0,this);
}




private class ButtonListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		Border emptyBorder2;
		if(e.getSource().equals(level_1)) {
			JFrame f=new JFrame("bull's eye");
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setSize(1300,800);
			Level1 p=new Level1();
			f.add(p);
			emptyBorder2=BorderFactory.createEmptyBorder(50,50,0,500);//size of main panel 
			p.setBorder(emptyBorder2);
			f.setVisible(true);

		}


		
		if(e.getSource().equals(level_2)) {
			JFrame f=new JFrame("bull's eye");
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setSize(1300,800);
			Level2 p=new Level2();
			f.add(p);
			emptyBorder2=BorderFactory.createEmptyBorder(50,50,0,500);//size of main panel 
			p.setBorder(emptyBorder2);
			f.setVisible(true);

		}

	}
}



}
