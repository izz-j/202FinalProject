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
	

	public ArrayList<Fighters> readFighterFile(String filepath, ArrayList<Fighters> fightersArray)
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
			String s;
			while (sc.hasNext()) {
				/* 
				 * loop should run while sc has next line.
				 * Will increment through each fighter in arraylist, 'i' being its index.
				 * Fighter save file should look like:
				 * NAME,HEALTH,STENGTH,SPECIALMOVE
				 * 
				 * Parsing trims the string as its being written
				 */
				Fighters fighter = new Fighters(); 
				 s = sc.next();
				fighter.name = s.substring(0, s.indexOf(','));
				//trim  everything before the first comma occurrence
				s = s.substring(s.indexOf(',') + 1);
				//health is set to everything after first occurrence of comma
		
				fighter.health = Integer.parseInt(s.substring(0, s.indexOf(',')));
				//trim everything before the first comma occurrence
				s = s.substring(s.indexOf(',') + 1);
				fighter.strength = Integer.parseInt(s);
				fightersArray.add(fighter);
			}
			sc.close();
			
		}
		}
		catch (Exception e) {
			//do something
			System.out.println(e);
		}
		return fightersArray;
	}
	
	public void writeFighterFile(String filepath, ArrayList<Fighters> fighters) {
		
		try{
		PrintWriter p = new PrintWriter(filepath);
		for (int i = 0; i < fighters.size(); i++){
			p.print(fighters.get(i).name + ",");
			p.print(fighters.get(i).health + ",");
			p.print(fighters.get(i).strength);
			p.println();
		}
		p.close();
		}catch(FileNotFoundException e){
			System.out.println(e);
		}
	}
	
	public void createFighter(ArrayList<Fighters> fightersArray) {
		try {
		Fighters fighter = new Fighters();
		Scanner s = new Scanner(System.in);
		System.out.println("Type the name of your fighter.");
		fighter.name = s.next();
		System.out.println("Set the health of your fighter");
		fighter.health = s.nextInt();
		System.out.println("Set the strength of your fighter");
		fighter.strength = s.nextInt();
		System.out.println("Do you want to save this Fighter? (y)es/(n)o");
		String choice = s.next();
		System.out.println(choice);
		if (choice.equals("y") || choice.equals("yes")) {
			fightersArray.add(fighter);
			writeFighterFile("Fighters_data", fightersArray);
			System.out.println("Fighter Saved!");
		}
		
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	public void LoadFighters(ArrayList<Fighters> fightersArray)
	{	
		//Establishes player and rival fighters, loads from index and prints stats to console
			Fighters playerFighter = new Fighters();
			Fighters rivalFighter = new Fighters();
			Scanner s = new Scanner(System.in);
			
			if (!fightersArray.isEmpty()) {	
			
				System.out.println("Which fighters would you like to use?");
				System.out.println("Choose your fighter.");
			
				int i = s.nextInt();
				playerFighter = fightersArray.get(i);
				
				System.out.println("Choose your rival's fighter.");
				
				int y = s.nextInt();
				rivalFighter = fightersArray.get(y);
			
				System.out.println("====================");
    			System.out.println("Player's Fighter: " + i);
    			System.out.println("====================");
    			System.out.println("Name:" + fightersArray.get(i).name);
    			System.out.println("Health:" + fightersArray.get(i).health);
    			System.out.println("Strength:" + fightersArray.get(i).strength);
    			
    			System.out.println("====================");
    			System.out.println("Rival's Fighter: " + i);
    			System.out.println("====================");
    			System.out.println("Name:" + fightersArray.get(y).name);
    			System.out.println("Health:" + fightersArray.get(y).health);
    			System.out.println("Strength:" + fightersArray.get(y).strength);
			}
			
			else {
				System.out.println("There are no fighters available to choose!");
				return;
			}
	}
	
	public void rivalSelector()
	{
		
	}
	
	/* public static void Battles(Fighters) {
		do {
		    System.out.println("Player's" + Fighters + " begins the fight against rival's " + Fighters);
		    rivalHealth = rivalHealth - playerStrength;

		    System.out.prinktln("Player's fighter did " + playerStrength + "damage to rival's fighter!");
		    System.out.println("Rival's fighter has " + rivalHealth + "left!");

		    playerHealth = playerHealth - rivalStrength;

		    System.out.println("Rival's fighter did " + rivalStrength + "damage to player's fighter!");
		    System.out.println("Player's fighter has " + playerHealth +  "left!");
		    
		  }
		while (pokemon1.health >= 1 || pokemon2.health >= 1);
		  if(pokemon1.health < 1)
		    System.out.println(pokemon1 +" has lost the fight");
		  else
		    System.out.println(pokemon2 +" has lost the fight");
		  } 
	} */
	
	//Public Methods
	public void statGenerator()
	{
		
	}

}
