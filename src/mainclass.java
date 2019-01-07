package pizzaAutomat;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class mainclass  extends JFrame
{
	
	public static void main(String args[])
	
	{
		JFrame frm =  new Pizza4You();
		Dimension frame = new Dimension(571,537);  //Festlegung der Position;
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); //getPosition speichern in dim
		int top =(dim.height-frame.height)/2;
		int left =(dim.width-frame.width)/2;
		
		frm.setResizable(false);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminate
		frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // verschwindet löscht laufende Ressource
		frm.setVisible(true);
		frm.setSize(frame);
		frm.setLocation(left,top);
		frm.repaint();	
	
	}
	
	

}
