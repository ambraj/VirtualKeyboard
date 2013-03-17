import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;


public class Handler extends MouseAdapter
{
	//int randomInt;
	@Override
	public void mousePressed(MouseEvent e)
	{
		Button btn = (Button)e.getSource();
		KeyboardApplet aplt = (KeyboardApplet)btn.getParent();		
				
		if(btn.getActionCommand().equals("Randomize keyboard"))
			try
			{
				random(btn, aplt);
			}
			catch (Exception e1)
			{}
		else
			aplt.objTxt.setText(aplt.objTxt.getText()+btn.getActionCommand());
	}


	public void random(Button btn, KeyboardApplet aplt) throws Exception
	{
		Random randomVal = new Random();
		String [] strBtn = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9"};
		int randomInt = randomVal.nextInt(36);
		for (int jTmp = 0; jTmp < 36; jTmp++)
		{
			try
			{
				  randomInt = randomVal.nextInt(36);
				  String tmp = aplt.arrBtn[randomInt].getLabel();
				  aplt.arrBtn[randomInt++].setLabel(aplt.arrBtn[randomInt].getLabel());
				  aplt.arrBtn[randomInt].setLabel(tmp);
			}
			finally
			{}
		}		 
	}
	/*@Override
	public void actionPerformed(ActionEvent e)
	{
		
		Checkbox chk = (Checkbox)e.getSource();
		KeyboardApplet aplt = (KeyboardApplet)chk.getParent();
		if(aplt.objChk.isEnabled())
			aplt.objPnl.disable();
	}*/

	
}
	


