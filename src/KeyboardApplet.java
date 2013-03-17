import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Panel;
import java.awt.TextField;


public class KeyboardApplet extends Applet
{
	final int MAXBUTTONS = 35;
	
	TextField objTxt;
	Panel objPnl = new Panel();
	Checkbox objChk;
	Button objBtn;
	Button [] arrBtn;
	String [] strBtn;
	
	public KeyboardApplet()
	{
		setLayout(null);
		objTxt = new TextField();
		objTxt.setBounds(20, 20, 200, 20);
		add(objTxt);
		
		objPnl = new Panel();
		objPnl.setBounds(10, 90, 300, 300);
		objPnl.setBackground(Color.LIGHT_GRAY);
		
		
		//String [] strBtn = new String[36];
		String [] strBtn = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9"};
		arrBtn = new Button[36];
		
		objPnl.setLocation(20, 100);
		
		for(int iTmp = 0, xPos=20, yPos=100; iTmp < 36; iTmp++,xPos += 25)
		{
			if(iTmp == 10)
			{
				xPos = 20;
				yPos += 25;
			}
			else if(iTmp == 20)
			{
				xPos = 20;
				yPos += 25;
			}
			else if(iTmp == 26)
			{
				xPos = 20;
				yPos += 25;
			}			
			
			/*if (iTmp < 27)
			{
				arrBtn[iTmp] = new Button(String.valueOf((char) (iTmp + 97)));
			}
			else if(iTmp > 26)
			{
				arrBtn[iTmp] = new Button(String.valueOf(iTmp-27));
			}
			arrBtn[iTmp].setBounds(xPos, yPos, 20, 20);
			add(arrBtn[iTmp]);*/
			
			arrBtn[iTmp] = new Button(strBtn[iTmp]);
			arrBtn[iTmp].setBounds(xPos, yPos, 20, 20);
			add(arrBtn[iTmp]);
			arrBtn[iTmp].addMouseListener(new Handler());
			
			
			
			//System.out.print((char)cnvChar[iTmp]);
		}
		
			
		
		objBtn = new Button("Randomize keyboard");
		objBtn.setBounds(100, 200, 150, 30);
		add(objBtn);
		objBtn.addMouseListener(new Handler());
		
		
		
		/*objChk = new Checkbox("Enable Virtual Keyboard");
		objChk.setBounds(20, 70, 200, 20);
		add(objChk);*/	
		
		
		
	}
}










/*

Random randomGenerator = new Random();
for (int idx = 1; idx <= 10; ++idx){
  int randomInt = randomGenerator.nextInt(100);
  log("Generated : " + randomInt);
}
*/