//********Elisheva Dayan I.D:208027102****and****Liora Barda I.D:318926003********
//	Course Name: Object Oriented Programming, 2018, Semester 2, project
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class tester1 {
	public static void main(String[] args) {
		Border emptyBorder2;
		JFrame f=new JFrame("bull's eye");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1300,800);
		startGame p=new startGame();
		f.add(p);
		emptyBorder2=BorderFactory.createEmptyBorder(657,373,0,500);//size main panel 
		p.setBorder(emptyBorder2);
		f.setVisible(true);
	}
}

