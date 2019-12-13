import java.util.*;
import java.io.*;
public class BattleSystem 
{
    
	//Attributes
	public int playerHealth;
	public int playerStrength;
	public int playerSpecialMove;
	
	public int rivalHealth;
	public int rivalStrength;
	public int rivalSpecialMove;
	
	//Constructor
	BattleSystem(){
		//initialize battle system variables here.
		
	}
	

	public void readFighterFile(String filepath, ArrayList<Fighters> fighters)
	{
		File f = new File(filepath);
		try {
		if (!f.exists())
			f.createNewFile();
		}catch (Exception e) {
			//do something
		}
		try {
		//do nothing if file is empty
		if (f.length() == 0)
			System.out.println("There are no fighters");
		else {
			Scanner sc = new Scanner(f);
			String s = sc.next();
			//while (sc.hasNext()) {
			for (int i = 0; sc.hasNext(); i++) {
				/* 
				 * loop should run while sc has next line.
				 * Will increment through each fighter in arraylist, 'i' being its index.
				 * Fighter save file should look like:
				 * NAME,HEALTH,STENGTH,SPECIALMOVE
				 * 
				 * Parsing trims the string as its being written
				 */
				fighters.get(i).name = s.substring(0, s.indexOf(','));
				//	System.out.print(p.first_name);
				//trim  everything before the first comma occurrence
				s = s.substring(s.indexOf(',') + 1);
				//health is set to everything after first occurrence of comma
				fighters.get(i).health = Integer.parseInt(s.substring(0, s.indexOf(',')));
				//trim everything before the first comma occurrence
				s = s.substring(s.indexOf(',') + 1);
				fighters.get(i).strength = Integer.parseInt(s.substring(0, s.indexOf(',')));
			}
			sc.close();
		}
		}
		catch (Exception e) {
			//do something
			System.out.println("THere is something wrong");
		}
	}
	public void LoadFighters()
	{
		
	}
	
	public void rivalSelector()
	{
		
	}
	
	public void fighterPrompt()
	{
		
	}
	
	//Public Methods
	public void statGenerator()
	{
		
	}
	
}
