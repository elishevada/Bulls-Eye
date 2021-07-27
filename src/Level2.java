//********Elisheva Dayan I.D:208027102****and****Liora Barda I.D:318926003********
//	Course Name: Object Oriented Programming, 2018, Semester 2, project

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;



public class Level2 extends Level1 {

	private Icon pink6;




	public Level2(){
		super();
	}


	public void TopArray() {
		a=new JPanel();
		pink6=new ImageIcon("src/6.jpg");
		ButtonListener b1=new ButtonListener();
		a.setOpaque(false);
		Icon[] cArr= {green2,blue3,perpel5,yellow7,pink6};
		arr=new JButton[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]= new JButton(" ");  
			arr[i].setIcon(cArr[i]);
			arr[i].addActionListener(b1);
			a.add(arr[i]);
		}
		a.setLayout(new GridLayout(1,4,30,2));
		a.setPreferredSize(new Dimension(10,10)); 

	}



	public void ourArray() {//Our hidden arrays that the actor guesses from
		Icon[] arr1= {pink6,green2,perpel5,yellow7};

		for(int i=0;i<arr1.length;i++) {
			ourArray[i]=new JButton(" ");
			ourArray[i].setContentAreaFilled(false);
			ourArray[i].setIcon(arr1[i]); 
			ourArray[i].setBorder(emptyBorder);
		}
	}






	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img,0,0,this);
	}


	public boolean full(){
		return super.full();
	}


	public boolean twice(){
		return super.twice();
	}

	public void bla_whi(){
		super.bla_whi();

	}



	private class ButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e){


			if(e.getSource().equals(continu)) {

				java.awt.Window win[] = java.awt.Window.getWindows();

				for(int i=0;i<win.length;i++) { 

					win[i].dispose();
				}


				Border emptyBorder2;
				JFrame f=new JFrame("bull's eye");
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setSize(1300,800);
				Level1 p=new Level1();
				f.add(p);
				emptyBorder2=BorderFactory.createEmptyBorder(50,50,0,500);//גודל הפנאל הראשי 
				p.setBorder(emptyBorder2);
				f.setVisible(true);

			}

			if(e.getSource().equals(close)) {
				java.awt.Window win[] = java.awt.Window.getWindows();

				for(int i=0;i<win.length;i++){ 

					win[i].dispose();
				}
			}

			
			if(e.getSource().equals(ok)){
				if(full()==false) {
					if(twice()==false){
						bla_whi();
						if(counter<9)
							counter++;
					}
					else {		
						wrong=new JFrame("twice");
						wrong.setSize(1300,800);
						JPanel p4=new JPanel();
						wrong.add(p4);
						JLabel fail=new JLabel("you have two same colors, change one of them!!!!");
						p4.add(fail);
						fail.setSize(150,150);
						fail.setFont(new Font ("Ariel", 50,50)); 
						wrong.setVisible(true);
					}


				}
				else {
					wrong=new JFrame("missing");
					wrong.setSize(1300,800);
					JPanel p4=new JPanel();
					wrong.add(p4);
					JLabel fail=new JLabel("you need to fill all the spaces with color!!!!");
					p4.add(fail);
					fail.setSize(150,150);
					fail.setFont(new Font ("Ariel",50,50)); 
					wrong.setVisible(true);

				}
			}


			for (int i = 0; i < arr.length; i++) {				
				if (e.getSource().equals(arr[i]))
					newColor=arr[i].getIcon();
			}

			for (int ik = 0; ik <4; ik++) {
				if (e.getSource().equals(mat1[counter][ik]))
					mat1[counter][ik].setIcon(newColor);
			}
		}
	}

}



