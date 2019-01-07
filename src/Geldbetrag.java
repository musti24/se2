package pizzaAutomat;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class  Geldbetrag implements ActionListener 
{
	
	Kassensystem kasse ;
	
	Geldbetrag(Kassensystem kasse_ubergabe_wert)
	{
		this.kasse = kasse_ubergabe_wert;
	}
	
	
	
	
	public void actionPerformed(ActionEvent betrag)
	{
		Object getsource =betrag.getSource();
		String filename ="Rechnung.pdf";
		SimpleDateFormat format= new SimpleDateFormat("dd.MM.yyyy 'um' HH:mm:ss\n\n");
    	kasse.txt_bestellung.append("\n\nAuftrag aufgegeben am:\n"+format.format(new Date())+"\n\nQuittung von Pizza4You\n"+"----------------------"+"\n"+kasse.txt_bestellung.getText());	
		try
		{	
			PrintWriter outputStrem = new PrintWriter("Pizza4You-Rechnung.pdf");
			//System.out.println();
			outputStrem.println(kasse.txt_bestellung.getText());
			outputStrem.close();
			
			

		}
		catch (FileNotFoundException e)
		{
			
			e.printStackTrace();
		}
		
		/*if(getsource==kasse.barzahlung)
		{
			kasse.funf_cent_btn.setEnabled(true);
			kasse.zehn_cent_btn.setEnabled(true);
			kasse.funfzig_cent_btn.setEnabled(true);
			kasse.zwanzig_cent_btn.setEnabled(true);
			
			kasse.funf_euro_btn.setEnabled(true);
			kasse.zehn_euro_btn.setEnabled(true);
			kasse.zwanzig_euro_btn.setEnabled(true);
			kasse.funfzig_euro_btn.setEnabled(true);
			
		}*/
		if(getsource==kasse.kartenzahlung)
		{
			Kartenzahlung karte = new Kartenzahlung();
			karte.karte();	
			try {
				Thread.sleep(10);
				kasse.storno.setVisible(false);
				kasse.kartenzahlung.setVisible(false);
				kasse.dispose();
				kasse.setEnabled(false);
				
			} catch (InterruptedException e) 
			{
			
			}
		}		
		if(getsource==kasse.storno)
		{
			kasse.setVisible(false);	
			mainclass main = new mainclass();
			main.main(null);
			//main.setVisible(false);
		}
		
		
		
}
}
