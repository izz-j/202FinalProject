import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Fighters> fighters = new ArrayList<Fighters>();
	        BattleSystem game = new BattleSystem();
	        Scanner sc = new Scanner(System.in);
	        boolean run = true;
	        boolean displayMainMenu = true;
	       
	        boolean input = true;//true=enable user input. false=disable user input
	        int choice = 0;
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
	        try {
	        	if (input) {
	        		System.out.println("Please select option according to number");
	        		choice = sc.nextInt();
	        	}
	        	input = false;
	        }
	        catch (Exception e) {
	        	choice = 0;
	        	input = true;
	        }
	        
	        if (choice == 3) {
	        	game.readFighterFile("Fighters_data", fighters);
	        	input = true;
	        }
	        
	        if (choice == 4) {
	        	//exits loop
	        	System.out.println("Exited Program.");
	        	run = false;
	        }
	        //hidden option for debugging
	        if (choice == 5) {
		       	System.out.println("Test");
		       	input = false;
		       }	
	        
	        }
	      
	        }
	        
}

	
