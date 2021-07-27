//********Elisheva Dayan I.D:208027102****and****Liora Barda I.D:318926003********
//	Course Name: Object Oriented Programming, 2018, Semester 2, project

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Level1 extends JPanel{
	protected JPanel a,b,c,d,new_a,new_b,new_d,new_aa,new_bb,new_dd;
	protected JButton[][] mat1,mat3;
	protected JButton[] arr,ourArray;
	protected JButton continu,close;
	protected JButton ok;
	protected int counter;
	protected JFrame aa,aaa,wrong;
	protected Border emptyBorder2;
	protected Image img,imgg;
	protected Icon green2,blue3,perpel5,yellow7,newColor,newIcon,black1,white1,pink6;
	protected JLabel lable1,lable2,lable3;
	protected ButtonListener b1;
	protected Border emptyBorder;
	






	public Level1() {
		
		ButtonListener b1=new ButtonListener();
		Border emptyBorder=BorderFactory.createEmptyBorder();

		imgg=Toolkit.getDefaultToolkit().createImage("src/22.jpg");
		img=Toolkit.getDefaultToolkit().createImage("src/22.jpg");
		lable1=new JLabel("Choose a color from this blank!");
		lable1.setFont(new Font ("ALGERIAN",30,30));
		lable2=new JLabel("Filling chart:");
		lable2.setFont(new Font ("ALGERIAN",15,15));
		lable3=new JLabel("Hint:");
		lable3.setFont(new Font ("ALGERIAN",15,15));


		black1=new ImageIcon("src/black.jpg");
		white1=new ImageIcon("src/white.jpg");
		newIcon=new ImageIcon("src/gray.jpg");
		green2=new ImageIcon("src/2.jpg");
		blue3=new ImageIcon("src/3.jpg");
		perpel5=new ImageIcon("src/5.jpg");
		yellow7=new ImageIcon("src/7.jpg");
		pink6=new ImageIcon("src/6.jpg");

		counter=0;
		new_a=new JPanel();
		new_aa=new JPanel();

		new_b=new JPanel();
		new_bb=new JPanel();

		new_d=new JPanel();
		new_dd=new JPanel();


		a=new JPanel();
		b=new JPanel();
		c=new JPanel();
		d=new JPanel();
		ok=new JButton("o.k.");

		mat1=new JButton[10][4]; 
		mat3=new JButton[10][4];



		ok.addActionListener(b1);
		ourArray=new JButton[4];

		ourArray();

		TopArray();

		
		b.setOpaque(false);//panel and on it the matrix of filling
		for(int w=0;w<mat1.length;w++) {
			for(int r=0;r<mat1[w].length;r++) {
				mat1[w][r]= new JButton();
				mat1[w][r].addActionListener(b1);
				mat1[w][r].setContentAreaFilled(false);
				mat1[w][r].setIcon(newIcon);
				//	mat1[w][r].addActionListener(b1);‏‏
				b.add(mat1[w][r]);
			}
		}
		b.setLayout(new GridLayout(10,4,10,10));//mat 1 
		b.setPreferredSize(new Dimension(200,400));




		c.setOpaque(false);//clear panel
		c.add(ok);
		ok.setFont(new Font ("ALGERIAN",30,30));//font of the OK button
		ok.setContentAreaFilled(false);
		ok.setBorder(emptyBorder);





		d.setOpaque(false);//panel and on it a matrix of the black and white
		for(int q=0;q<mat3.length;q++) {
			for(int z=0;z<mat3[q].length;z++) {
				mat3[q][z]= new JButton();
				mat3[q][z].setContentAreaFilled(false);
				mat3[q][z].setIcon(newIcon);
				mat3[q][z].addActionListener(b1);
				d.add(mat3[q][z]);
			}
		}
		d.setLayout(new GridLayout(10,4,10,10));
		d.setPreferredSize(new Dimension(200,400));

		setLayout(new BorderLayout(30,30));


		new_a.setOpaque(false);
		new_a.add(lable1);
		new_b.setOpaque(false);
		new_b.add(lable2);
		new_d.setOpaque(false);
		new_d.add(lable3);


		new_aa.setOpaque(false);
		new_aa.add(new_a);
		new_aa.add(a);
		new_aa.setLayout(new GridLayout(2,1));


		new_bb.setOpaque(false);
		new_bb.add(new_b);
		new_bb.add(b);




		new_dd.setOpaque(false);
		new_dd.add(new_d);
		new_dd.add(d);



		add(new_aa,BorderLayout.NORTH);
		add(new_bb,BorderLayout.WEST);
		add(c,BorderLayout.CENTER);
		add(new_dd,BorderLayout.EAST);



		setBorder(emptyBorder);


	} 


	
	/////////////////////////////

	public void ourArray() {//unseen arrays that the player needs to gusse
		Icon[] arr2={green2,yellow7,perpel5,blue3};
		
		
		
			for(int i=0;i<arr2.length;i++) {
				ourArray[i]=new JButton(" ");
				ourArray[i].setContentAreaFilled(false);
				ourArray[i].setIcon(arr2[i]); 
				ourArray[i].setBorder(emptyBorder);//פסים של כפ
			}
		}
	



	/////////////////////////


	public void TopArray() {//choose array
		a=new JPanel();
		ButtonListener b1=new ButtonListener();

		a.setOpaque(false);
		Icon[] cArr= {green2,blue3,perpel5,yellow7};

		arr=new JButton[4];
		for(int i=0;i<arr.length;i++) {
			arr[i]= new JButton(" ");  
			arr[i].setIcon(cArr[i]);
			arr[i].addActionListener(b1);
			a.add(arr[i]);
		}
		a.setLayout(new GridLayout(1,4,30,2));
		a.setPreferredSize(new Dimension(10,10)); 
	}


	////////////////


	public void paintComponent(Graphics g) {//backround of panel
		super.paintComponent(g);
		g.drawImage(img,0,0,this);

	}

	////////////////////////


	public boolean full(){//func that check if the player fill in all the squers
		for (int i = 0; i <4; i++) {
			if(mat1[counter][i].getIcon()==newIcon)
				return true;
		}
		return false;
	}


	/////////////////////////////

	public boolean twice() {//func that check if there is one color twice
		for (int i = 0; i <4; i++) {
			for (int j = 0; j<4; j++) {
				if(mat1[counter][i].getIcon()==mat1[counter][j].getIcon()&&i!=j) {
					return true;
				}
			}
		}
		return false;
	}


	/////////////////////////////

	public void bla_whi(){//A method that checks how much stamp there is and how much damage and also performs the coloring of the squares in black and white
		int bla=0,whi=0,blacke=0;
		for(int i=0;i<ourArray.length;i++) {
			for(int j=0;j<mat1[counter].length;j++){
				if(ourArray[i].getIcon()==mat1[counter][j].getIcon()) {//
					if(i==j) 
						bla++;
					else
						whi++;
				}
			}
		}
		blacke=bla;
		for (int t = 0; t < 4; t++) {
			if(bla>=1) {
				mat3[counter][t].setIcon(black1);
				bla--;
			}
			else
				if(whi>=1) {
					mat3[counter][t].setIcon(white1);
					whi--;
				}
		}
		if(blacke==4) {//if all black= win 
			Border emptyBorde=BorderFactory.createEmptyBorder();
			ButtonListener b2=new ButtonListener();
			aa=new JFrame("WINER");
			aa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			aa.setSize(1300,800);
			JPanel p2=new JPanel();
			p2.setBackground(Color.yellow);
			aa.add(p2);
			p2.setLayout(new GridLayout(3,1,50,50));
			JLabel win=new JLabel("   you won!!");
			p2.add(win);
			continu=new JButton("continue");
			close=new JButton("close");
			continu.addActionListener(b2);
			close.addActionListener(b2);
			continu.setContentAreaFilled(false);
			continu.setBorder(emptyBorde);
			continu.setFont(new Font ("Rauhaus 93", 50,50));
			close.setContentAreaFilled(false);
			close.setBorder(emptyBorde);
			close.setFont(new Font ("Rauhaus 93", 50,50));
			p2.add(continu);
			p2.add(close);
			win.setSize(150,150);
			win.setFont(new Font ("ALGERIAN", 200,200)); 
			aa.setVisible(true);
		}
		else

			if(counter==9) {//loos
				Border emptyBorde=BorderFactory.createEmptyBorder();
				ButtonListener b2=new ButtonListener();
				aaa=new JFrame("Game Over");
				aaa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				aaa.setSize(1300,800);
				JPanel p3=new JPanel();
				p3.setBackground(Color.gray);
				aaa.add(p3);
				JLabel fail=new JLabel("   you fail!");
				p3.add(fail);
				continu=new JButton("continue");
				close=new JButton("close");
				continu.addActionListener(b2);
				close.addActionListener(b2);
				continu.setContentAreaFilled(false);
				continu.setBorder(emptyBorde);
				continu.setFont(new Font ("Adobe Caslon Pro Bold", 50,50));
				close.setContentAreaFilled(false);
				close.setBorder(emptyBorde);
				close.setFont(new Font ("Adobe Caslon Pro Bold", 50,50));
				p3.add(continu);
				p3.add(close);
				fail.setSize(150,150);
				fail.setFont(new Font ("ALGERIAN", 200,200)); 
				aaa.setVisible(true);
			}
	}


	/////////////////////

	private class ButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e){



			if(e.getSource().equals(continu)) {
			
				java.awt.Window win[] = java.awt.Window.getWindows();//close all windows

				for(int i=0;i<win.length;i++) { 

					win[i].dispose();
				}


				
				Border emptyBorder2;
				JFrame f=new JFrame("bull's eye");
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setSize(1300,800);
				level p=new level();
				f.add(p);
				emptyBorder2=BorderFactory.createEmptyBorder(330,245,0,500);//גודל הפנאל הראשי 
				p.setBorder(emptyBorder2);
				f.setVisible(true);
			}
			if(e.getSource().equals(close)) {
				java.awt.Window win[] = java.awt.Window.getWindows();

				for(int i=0;i<win.length;i++){ 

					win[i].dispose();
				}
			}


			//Conditions for clicking OK
			if(e.getSource().equals(ok)) {//If you click OK twice or you have not finished the line or there are two times then an error will be printed
				if(full()==false) {
					if(twice()==false){
						bla_whi();
						if(counter<9)
							counter++;
					}
					else {		
						wrong=new JFrame("twice");//A window that opens if there are two
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
					wrong=new JFrame("missing");//A window that opens if missing color
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

			for (int i = 0; i < arr.length; i++) {//It picks up what color he wants to put on				
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