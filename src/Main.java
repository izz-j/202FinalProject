import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Fighters> fighters = new ArrayList<Fighters>();
	        BattleSystem game = new BattleSystem();
	        Player player = new Player();
    		Rival rival = new Rival();
	        Scanner sc = new Scanner(System.in);
	        boolean run = true;
	        boolean displayMainMenu = true;
	        int choice = 0;
	        //load 
	        System.out.println("Loading fighters...");
	       fighters = game.readFighterFile("Fighters_data", fighters);
	        System.out.println("Done!");
	        //game loop
	        while (run) {
	        	if (displayMainMenu) {
	        		System.out.println("================================");
	        		System.out.println("Main Menu");   
	        		System.out.println("1. Fight");
	        		System.out.println("2. Create Fighter");
	        		System.out.println("3. View Fighters");
	        		System.out.println("4. Quit");
	        		System.out.println("================================");
	        	}
	        	displayMainMenu = false;
	        
	        		System.out.println("Please select option according to number");
	        		choice = sc.nextInt();
	        		
	        if (choice == 1) {
	        	//Player picks fighters before battle
	        	
	        	game.LoadFighters(fighters, player, rival);
	        }
	        		
	        if (choice == 2) {
	        	//create fighter
	        	game.createFighter(fighters);
	        }
	        if (choice == 3) {
	        	if (!fighters.isEmpty()) {
	        		//print fighter from array
	        		for (int i = 0; i < fighters.size(); i++) {
	        			System.out.println("====================");
	        			System.out.println("Fighter: " + i);
	        			System.out.println("====================");
	        			System.out.println("Name:" + fighters.get(i).name);
	        			System.out.println("Health:" + fighters.get(i).health);
	        			System.out.println("Strength:" + fighters.get(i).strength);
	        			} 
	        		}
	        	else {
	        		System.out.println("There are no fighters");
	        	}
	        }
	        
	        if (choice == 4) {
	        	//exits loop
	        
	        	System.out.println("Exited Program.");
	        	run = false;
	        }
	        //hidden option for debugging
	        if (choice == 5) {
		       	System.out.println("Test");
		       
		       }	
	        
	        }
	      sc.close();
	        }
	        
}

	
