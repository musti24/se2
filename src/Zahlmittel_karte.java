package pizzaAutomat;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Savepoint;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JPanel;

import javafx.stage.FileChooser;

public class Zahlmittel_karte implements ActionListener
{
	private String password="";
	Kartenzahlung karte_get;
	Zahlmittel_karte(Kartenzahlung karte_eingabe)
	{
		this.karte_get = karte_eingabe;
	}
	
	
	
	public void actionPerformed(ActionEvent betrag)
	{
		Object getsource = betrag.getSource();
		
		if(getsource == karte_get.zero)
    	{
			karte_get.geld_display.append("*");
			String null_st ="0";
			password+=null_st;
    	}
    	if(getsource == karte_get.eins)
    	{
    		karte_get.geld_display.append("*");
			String eins_st ="1";
			password+=eins_st;
    	}
    	if(getsource == karte_get.zwei)
    	{
    		karte_get.geld_display.append("*");
			String zwei_st ="2";
			password+=zwei_st;
    	}
    	if(getsource == karte_get.drei)
    	{
    		karte_get.geld_display.append("*");
			String drei_st ="3";
			password+=drei_st;
    	}
    	if(getsource == karte_get.vier)
    	{
    		karte_get.geld_display.append("*");
			String vier_st ="4";
			password+=vier_st;
    	}
    	if(getsource == karte_get.fünf)
    	{
    		karte_get.geld_display.append("*");
			String fünf_st ="5";
			password+=fünf_st;
    	}
    	if(getsource == karte_get.sechs)
    	{
    		karte_get.geld_display.append("*");
			String sechs_st ="6";
			password+=sechs_st;
    	}
    	if(getsource == karte_get.sieben)
    	{
    		karte_get.geld_display.append("*");
			String sieben_st ="7";
			password+=sieben_st;
    	}
    	if(getsource == karte_get.acht)
    	{
    		karte_get.geld_display.append("*");
			String acht_st ="8";
			password+=acht_st;
    	}
    	if(getsource == karte_get.neun)
    	{
    		karte_get.geld_display.append("*");
			String neun_st ="9";
			password+=neun_st;
    	}
    
    	if(password.length()==4 && getsource==karte_get.bestätigen)
    	{	
    		
    		if(password.equals("1489"))
        	{
    			karte_get.geld_display.setText("Pin korrekt");
    			karte_get.fehler.setForeground(Color.green);
    			karte_get.fehler.setText("Bezahlvorgang läuft.....");
        		if(karte_get.fehler.getText().equals("Bezahlvorgang läuft....."))
        		{
        			try {
						karte_get.fehler.setText("Bezahlung erfolgreich, Vielen Dank ");
						karte_get.schließen.setVisible(true);
						Thread.sleep(3000);
						
						//Thread.sleep(1000);		
					} catch (InterruptedException e) {karte_get.setVisible(false);
						
					} 
        		}
   
        	}
    		
			
			
        	else
        	{
        		karte_get.geld_display.setText("Pin inkorrekt");
        		if(karte_get.geld_display.getText().equals("Pin inkorrekt"))
        		{
        			karte_get.geld_display.setText("");
        			karte_get.fehler.setText("Fehler! Bitte geben Sie Pin erneut ein");
        			if(karte_get.fehler.getText().equals("Fehler! Bitte geben Sie Pin erneut ein"))
        			{
        			  try {
						Thread.sleep(1000);
						karte_get.fehler.setForeground(Color.RED);
						karte_get.fehler.setText("Fehler! Bitte geben Sie Pin erneut ein");
					} catch (InterruptedException e) {
					}	
        			}
        		}
        	}
    		
    		
    		password="";
    	}
    	if(getsource==karte_get.schließen)
    	{
    		karte_get.dispose();
    	}
    	
    
    	if(getsource==karte_get.zurück)
		{
    		karte_get.geld_display.setText("");
		}
    	
    	
	}
	
    
}
