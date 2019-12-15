202 Final Project Group 10: Iseman, Eric (Han Seong), Christine, and Rachaeal

Fighters and Battles Project: Group 10

Github Usernames:
	Iseman: (izz-j)
	Eric: (HK651ScarletEK)
	Christine: (codewithchristine20)
	Rachael: (rachaeln)

Summary:
In essence, this project allows a user to create a list of fighters and set their health and strength stats, and thereafter provides options for the user to
view their created fighters as well as pit two selected fighters in a one-on-one, turn-based battle wherein a fighter's health is reduced by their opponent's
strength. 

List of features:
Classes - Main Class: 
		Runs the main method to output a main menu interface to console.
		Allows user to select menu options and execute their functions.
	  BattleSystem Class: 
		Declares, but does not initialize, player and rival fighter stat variables.
		Creates the Fighters_data file in the root folder.
		Contains functions needed to create fighters, set fighter stats based on user input, and select two fighters for a battle, which are thereafter saved to file based on user instruction.
		Contains actual battle function, wherein two selected fighters take turns reducing their opponent's health by their strength.
	  Fighters Class: 
		Declares, but does not initialize, global fighter stat variables (Name, health, and strength)
		Sets default values for global fighter stats and information.
	  Player and Rival Class:
		Inherit from the Fighters class, are utilized by the BattleSystem's loadFighters method to create two fighter objects selected by the user based on input for use in the Battle, which are read and loaded from the Fighters_data file.

Program Instructions:
Compile and run within a Java IDE. A main menu will be output to console - select options based on user desire. 
On first run, recommend the user first selects Option 2, "Create Fighters," to create one or more fighters and set their health and strength.
Option 3 allows a user to view their created Fighters in a list, alongside their stats and information.
Option 1 allows a user to select two of their created fighters for a one-on-one, turn-based battle. First selection is the player's fighter; second selection is the opposing fighter.
Recommend that two fighters have been created for use of the Battle feature.
During the battle, a fighter's health is reduced by their opponent's strength. The player will always start first. In the case that the opposing (rival) fighter is knocked unconscious first, they will be allowed one last hit wherein the player may still lose the battle.
Option 4 allows a user to close and exit the program.
		
		       
