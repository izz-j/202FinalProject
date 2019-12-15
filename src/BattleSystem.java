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
			System.out.println("Input was invalid, returning to main menu.");
		}
	}
	
	
	public void LoadFighters(ArrayList<Fighters> fightersArray, Player player, Rival rival)
	{	
		//Establishes player and rival fighters, loads from index and prints stats to console
		try {
		Scanner s = new Scanner(System.in);
		System.out.println("=========");
		for (int i = 0; i < fightersArray.size(); i++) {
			System.out.println("Fighter: " + i);
			System.out.println("Name:" + fightersArray.get(i).name);
			} 
		
		if (!fightersArray.isEmpty()) { 
			System.out.println("Which fighters would you like to use for this battle?");
			System.out.println("Choose your fighter.");
		
			int i = s.nextInt();
			player.name = fightersArray.get(i).name;
			player.health = fightersArray.get(i).health;
			player.strength = fightersArray.get(i).strength;
			
			System.out.println("You have chosen: " + player.name + "!");
			System.out.println("Choose your rival's fighter.");
			
			int y = s.nextInt();
			rival.name = fightersArray.get(y).name;
			rival.health = fightersArray.get(y).health;
			rival.strength = fightersArray.get(y).strength;
			
			System.out.println("Your rival has chosen: " + rival.name + "!");
			
		}	
		else {
			System.out.println("There are no fighters available to choose!");
			return;
			}
		}catch (Exception e) {
			System.out.println("The input is invalid or the chosen fighter does not exist.");
			System.out.println("Returning to the main menu...");
		}
		
	
	}
	
	public static void Battles(Player player, Rival rival) {
		boolean finished = true;
		
		System.out.println("Player's " + player.name + " begins the fight against rival's " + rival.name + "!");
		while (finished) {
		    rival.health = rival.health - player.strength;

		    System.out.println("Player's fighter did " + player.strength + " damage to rival's " + rival.name + "!");
		    System.out.println("Rival's " + rival.name + " has " + rival.health + " health left!");

		    player.health = player.health - rival.strength;

		    System.out.println("Rival's fighter did " + rival.strength + " damage to " + player.name + "!");
		    System.out.println("Player's " + player.name + " has " + player.health +  " health left!");
		    
		    if(player.health < 1) {
				finished = false;
				System.out.println(player.name + " was knocked unconscious!");
			    System.out.println("Player's " + player.name + " has lost the fight...");
			  }  
			   
			else if(rival.health < 1) {
				finished = false;
				System.out.println(rival.name + " was knocked unconscious!");
			    System.out.println("Player's " + player.name + " has won the fight!");
			    
			  }
		  }
		  if(finished = false) {
			  return;
		  }
	}
	
	//Public Methods
	public void statGenerator()
	{
		
	}

}
