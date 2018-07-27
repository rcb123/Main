package Main;

import java.util.*;

public class MyClass {
	static int healthInit = 5;
   public static void main(String args[]) {
		int range = 0;
		int probability = 0;
		int damage;
    int fursInit = 0;
    int healthInit = 7;
    int partyInit = 4;
    System.out.println ("Enter your name: ");
    Scanner keyboard = new Scanner(System.in);
    String userName = keyboard.nextLine();
     healthInit = takeDamage(2);
    System.out.println("You are " + userName + ". You and your family of 4 have decided to travel along the Oregon trail in an effort to better your lives.");
    System.out.println("You buy a wagon, two oxen, and supplies. You gather your most important belongings and set off on your adventure.");
      
    
     
    // FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST 
      
    System.out.println("First, you enter a forest and find some deer and turkey. You start to hunt and halfway through your hunt, you are ambushed by bandits.");
    System.out.println("Do you... \n 1) Run towards a cave. \n 2) Fight the bandits and also fight the boss for rewards.");
    int userInput = keyboard.nextInt();
      if(userInput == 1){
      cavebandito(userInput, partyInit, probability, healthInit, userName);//1.2.1
    }
      if(userInput == 2){  
      boss(userInput, partyInit, probability, userName, healthInit);//1.2.2
    }
    
    }
    //----------------------------------------------------------
    public static void cavebandito(int userInput, int partyInit, int probability,int healthInit, String userName){ //1.2.1
	Scanner keyboard = new Scanner(System.in);
      System.out.println("You enter the cave and walk for a bit. soon, you come to a cavern that splits into two paths.");
      System.out.println("Do you... \n 1) go left \n 2) go right");
      userInput = keyboard.nextInt();
      if(userInput == 1){
      batsleft(userInput, partyInit, probability, healthInit, userName);//1.2.1.1
      }
      if(userInput == 2){  
      gunsright(userInput, partyInit, probability, healthInit, userName);//1.2.1.2
      }
    
    }
  
  	public static void boss(int userInput, int partyInit, int probability, String userName, int healthInit){//1.2.2
   		System.out.println("You decide to fight the bandits head on.\nAfter being assaulted by waves of bandits, you are attacked by a machine-gun wagon.\nFighting through the gunfire you take down the wagon and aquire furs and medicines.\n\n");
      int range = 2;
        healthInit = takeDamage(range);
      	damageTaken(healthInit, userName);
      	searchForFood(userInput, partyInit, probability, healthInit, userName);//1.3
    }
    //----------------------------------------------------------
  	public static void batsleft(int userInput, int partyInit, int probability, int healthInit, String userName){//1.2.1.1
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You take the left path ");
      System.out.println("As you are walking through the left tunnel, you hear squeaks from all over and all of a sudden you are swarmed by thousands of bats. \nYou and your family run all the way down the tunnel until you get out of the cave.\n\n");
      int range = 2;
        healthInit = takeDamage(range);
      	damageTaken(healthInit, userName);
      searchForFood(userInput, partyInit, probability, healthInit, userName);//1.3
    }
  
  	public static void gunsright(int userInput, int partyInit, int probability, int healthInit, String userName){//1.2.1.2
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You take the right path ");
      System.out.println("As you are walking through the right tunnel, you trip on a large wooden box. You are curious to see whats inside, so you open it up and find guns and ammo.\n\n");
      searchForFood(userInput, partyInit, probability, healthInit, userName);//1.3
        
    }
  //-------------------------------------------------------------
  //	public static void unicorns(int userInput){//1.2.3
  //    Scanner keyboard = new Scanner(System.in);
  //    
  //    
  //  }
  //
  //	public static void unicornsshoot(int userInput){//1.2.3.1
  //    Scanner keyboard = new Scanner(System.in);
  //    
  //    
 //   }
 //     
 // 	public static void unicornsnoshoot(int userInput){//1.2.3.2
 //     Scanner keyboard = new Scanner(System.in);
 //     
 //     
 //   }
 //---------------------------------------------------------------- 
		public static void searchForFood(int userInput, int partyInit, int probability, int healthInit, String userName){//1.3
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You approach a meadow full of berry bushes. You and your family are famished and decide to pick some berries. As you are picking berries, one of the kids comes back to you with news that they found another cave.");
      System.out.println("Do you... \n 1) go to the cave \n 2) keep collecting berries");
      userInput = keyboard.nextInt();
      if(userInput == 1){
      cave(userInput, partyInit, probability, healthInit, userName);//1.3.3
      }
      if(userInput == 2){  
      bears(userInput, partyInit, probability, healthInit, userName);//1.3.1
      }
      
    }  
  //---------------------------------------------------------------
  	public static void bears(int userInput,int partyInit, int probability, int healthInit, String userName){//1.3.1
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You continue to pick berries and a few minutes later, you hear a rustling in the bushes.\nYou turn around and see a massive bear. It advances on you, and you have no choice but to blast it into mcnuggets with your Supreme Money Gun.");
      System.out.println("Unfortunately for you, its dying cries were heard by its distant relatives who rushed over to bean you.");
      System.out.println("The angry bear squad comes and dunks on yo headtop.");
      bearAttack(userInput, partyInit, probability, healthInit, userName);//1.3.2
      
    }
  
  	public static void bearAttack(int userInput,int partyInit, int probability, int healthInit, String userName){//1.3.2
      Scanner keyboard = new Scanner(System.in);
      int range = 3;
      takeDamage(range);
      damageTaken(healthInit, userName);
      cave(userInput, partyInit, probability, healthInit, userName);//1.3.3
    }
  	//------------------------------------------------------------
  	public static void cave(int userInput,int partyInit, int probability, int healthInit, String userName){//1.3.3
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You exit the cave and see the great plains, however, you see a river blocking the way.");
      river(userInput, partyInit, probability, healthInit, userName);
    }
  
  
  
  
  
  // RIVER RIVER RIVER RIVER RIVER RIVER RIVER RIVER RIVER RIVER RIVER RIVER RIVER RIVER RIVER RIVER RIVER RIVER RIVER RIVER RIVER RIVER RIVER RIVER RIVER RIVER RIVER RIVER RIVER RIVER RIVER RIVER RIVER
  	public static void river(int userInput,int partyInit, int probability, int healthInit, String userName){//2
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You can either...\n1) Ford the river\nor...\n2) Jump the river");
      userInput = keyboard.nextInt();
      if(userInput == 1){
      ford(userInput, partyInit, probability, healthInit, userName);//1.2.1.1
      }
      if(userInput == 2){  
      jump(userInput, partyInit, probability, healthInit, userName);//1.2.1.2
      }
    }
  //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  	public static void ford(int userInput,int partyInit, int probability, int healthInit, String userName){//2.1
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You decide to ford the river, a less risky decision than jumping it.\n");
      int range = 2;
      probability = choiceProb(range);
      if(probability == 0){
      pirateShip(userInput, partyInit, probability, healthInit, userName);//1.2.1.1
      }
      if(probability == 1){  
      hitBoulders(userInput, partyInit, probability, healthInit, userName);//1.2.1.2
      }
      if(probability == 2){
      dodgeBoulders(userInput, partyInit, probability, healthInit, userName);//1.2.1.1
      }
    }
  
  	public static void pirateShip(int userInput,int partyInit, int probability, int healthInit, String userName){//2.1.1
      Scanner keyboard = new Scanner(System.in);
      System.out.println("A pirateship blocks your path, seeking to plunder your loot/n");
      int range = 3;
        healthInit = takeDamage(range);
      	damageTaken(healthInit, userName);
      System.out.println("\nGrazed by a cannon, you drift away to the other side of the river");
      greatPlains(userInput, partyInit, probability, healthInit, userName);
    }
  
  	public static void hitBoulders(int userInput,int partyInit, int probability, int healthInit, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You are immediately assaulted by boulders raining down on you./n");
      int range = 5;
        healthInit = takeDamage(range);
      	damageTaken(healthInit, userName);
      greatPlains(userInput, partyInit, probability, healthInit, userName);
    }
  
  	public static void dodgeBoulders(int userInput, int partyInit, int probability, int healthInit, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Boulders jut out from the river, forcing you to dodge./n");
      int range = 3;
        healthInit = takeDamage(range);
      	damageTaken(healthInit, userName);
      greatPlains(userInput, partyInit, probability, healthInit, userName);
    }
  
  	public static void jump(int userInput,int partyInit, int probability, int healthInit, String userName){
      Scanner keyboard = new Scanner(System.in);
      int range = 2;
      probability = choiceProb(range);
      if(probability == 0){
      landAcross(userInput, partyInit, probability, healthInit, userName);//1.2.1.1
      }
      if(probability == 1){  
      landMiddle(userInput, partyInit, probability, healthInit, userName);//1.2.1.2
      }
      if(probability == 2){
      landBears(userInput, partyInit, probability, healthInit, userName);//1.2.1.1
      }
    }
  
  	public static void landAcross(int userInput,int partyInit, int probability, int healthInit, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You manage to safely land across the river, being propelled by a gust of air");
      System.out.println("\nThat's literally it, what did you expect");
      greatPlains(userInput, partyInit, probability, healthInit, userName);
    }
  
  	public static void landMiddle(int userInput,int partyInit, int probability, int healthInit, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You land right in the middle of the river, in a sea of boulders");
      int range = 4;
        healthInit = takeDamage(range);
      	damageTaken(healthInit, userName);
      greatPlains(userInput, partyInit, probability, healthInit, userName);
    }
  
  	public static void landBears(int userInput,int partyInit, int probability, int healthInit, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You land across the river, but the loud thud angers the nearby bears");
      int range = 5;
        healthInit = takeDamage(range);
      	damageTaken(healthInit, userName);
      greatPlains(userInput, partyInit, probability, healthInit, userName);
    }
  //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  	public static void greatPlains(int userInput,int partyInit, int probability, int healthInit, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.print("After crossing the river, you arrive at the great plains.\n\nLand of the Buffalo\n\nYou see hundreds of buffalo roaming around.\nDo you \n 1)move on\n 2) hunt some buffalo");
      userInput = keyboard.nextInt();
      if(userInput == 1){
      moveOn(userInput, partyInit, probability, healthInit, userName);//1.2.1.1
      }
      if(userInput == 2){  
      huntBuffalo(userInput, partyInit, probability, healthInit, userName);//1.2.1.2
      }
    }
  //-----------------------------------------------------------------------------------------------------
  	public static void moveOn(int userInput,int partyInit, int probability, int healthInit, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("\n\nCongrats, you moved on without dying.\n\n");
    	chillin(userInput, partyInit, probability, healthInit, userName);
    }
  
  	public static void huntBuffalo(int userInput,int partyInit, int probability, int healthInit, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("\n\nAfter brutally slaughtering about 10 buffalo, a group of the males decide to fight back.\nYou get swarmed and run away as fast as possible.\n\n");
      int range = 2;
        healthInit = takeDamage(range);
      	damageTaken(healthInit, userName);
      chillin(userInput, partyInit, probability, healthInit, userName);
    }
  //------------------------------------------------------------------------------------------------------
  	public static void chillin(int userInput,int partyInit, int probability, int healthInit, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You come to a crossing. One way is rumored to contain treasure, but is dangerous, and the other is a direct path onwards.\n Do you\n1) hunt for treasure\n2) move on");
      userInput = keyboard.nextInt();
      if(userInput == 1){
      huntTreasure(userInput, partyInit, probability, userName);//1.2.1.1
      }
      if(userInput == 2){  
      wheelsBreak(userInput, partyInit, probability, healthInit, userName);//1.2.1.2
      }
      
    }
  //---------------------------------------------------------------------------------------------------------
  	public static void huntTreasure(int userInput,int partyInit, int probability, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You decide to adventure towards treasure");
      int range = 2;
      probability = choiceProb(range);
      if(probability == 0){
      findFalcon(userInput, partyInit, probability, userName);
      }
      if(probability == 1){  
      findPistol(userInput, partyInit, probability, userName);
      }
    }
  
  	public static void findFalcon(int userInput,int partyInit, int probability, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You stumble across an injured falcon, its keen eyes show that it will be useful in hunting");
      
    }
  
    public static void findPistol(int userInput,int partyInit, int probability, String userName){
	   Scanner keyboard = new Scanner(System.in);
     System.out.println("");
      
    }
  //--------------------------------------------------------------------------------------------------------
  public static void wheelsBreak(int userInput,int partyInit, int probability, int healthInit, String userName){
      Scanner keyboard = new Scanner(System.in);
    	System.out.println("Your front wheels have fallen off.\nDo you...\n1) Wait for help\nor...\n2) Raid a nearby camp for one.");
      userInput = keyboard.nextInt();
      if(userInput == 1){
      deathStarve(userInput, partyInit, probability, userName);//1.2.1.1
      }
      if(userInput == 2){  
      campRaid(userInput, partyInit, probability, healthInit, userName);//1.2.1.2
      }
      
    }
  //-----------------------------------------------------------------------------------------------------------
  public static void deathStarve(int userInput,int partyInit, int probability, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You starved to death.\n\nCongrats\n\n");
      gameOver(userName);
    }
  
  public static void campRaid(int userInput,int partyInit, int probability, int healthInit, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You decided to raid a nearby camp but are met with fierce resistance.");
      konamiCode(userInput, partyInit, probability, healthInit, userName);
    }
  //-----------------------------------------------------------------------------------------------------------------
  public static void konamiCode(int userInput, int partyInit, int probability, int healthInit, String userName){
    	Scanner keyboard = new Scanner(System.in);
    	System.out.println("Press Enter to continue to part 2");
    	userInput = keyboard.nextInt();
      if(userInput == 573){
      tornado(userInput, partyInit, probability, healthInit, userName);
      }
      else{  
      trainRobbery(userInput, partyInit, probability, healthInit, userName);
      }
  }
  
  public static void tornado(int userInput,int partyInit, int probability, int healthInit, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You have found the easter egg, enjoy your zone warp\n");
      riverSecond(userInput, partyInit, probability, healthInit, userName);
    }
  //---------------------------------------------------------------------------------------------------------------------
  public static void trainRobbery(int userInput,int partyInit, int probability, int healthInit, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You hear gunshots, and upon further investigation, find out that a train robbing is taking place.\nYou can choose to either...\n1) Fight the bandits\nor...\n2) Flee");
    	userInput = keyboard.nextInt();
      if(userInput == 1){
      trainBattle(userInput, partyInit, probability, healthInit, userName);
      }
      if(userInput == 2){  
      trainDamage(userInput, partyInit, probability, healthInit, userName);
      }
    }
  
  public static void trainBattle(int userInput,int partyInit, int probability, int healthInit, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You decide to fight the bandits, but it is very difficult as they are on top of the train.\n");
      int range = 4;
        healthInit = takeDamage(range);
      	damageTaken(healthInit, userName);
    	trainReward(userInput, partyInit, probability, healthInit, userName);
    }
  
  public static void trainReward(int userInput,int partyInit, int probability, int healthInit, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("\nYou had a rough fight but were heavily rewarded by the passengers.");
      riverSecond(userInput, partyInit, probability, healthInit, userName);
    }
  
  public static void trainDamage(int userInput,int partyInit, int probability, int healthInit, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You flee from the scene");
    	int range = 2;
        healthInit = takeDamage(range);
      	damageTaken(healthInit, userName);
  		riverSecond(userInput, partyInit, probability, healthInit, userName);
    }
  
  public static void riverSecond(int userInput,int partyInit, int probability, int healthInit, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You have arrived at a grand river which you can neither ford nor jump");
      System.out.println("You can choose to either\n1) Go underwater and swim through the river\nor...\n2) Go around the river through the desert");
    	userInput = keyboard.nextInt();
       if(userInput == 1){
      underwaterDanger(userInput, partyInit, probability, healthInit, userName);
      }
      if(userInput == 2){  
      desertRoute(userInput, partyInit, probability, healthInit, userName);
      }
    }
  
  public static void underwaterDanger(int userInput, int partyInit, int probability, int healthInit, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("The river is full of danger\n\n");
      int range = 2;
      if(probability == 0){
      underwaterCreatures(userInput, partyInit, probability, healthInit, userName);
      }
      if(probability == 1){  
      underwaterBuffalo(userInput, partyInit, probability, healthInit, userName);
      }
    	if(probability == 2){
      underwaterBoss(userInput, partyInit, probability, healthInit, userName);
      }
    }
  
  public static void underwaterCreatures(int userInput, int partyInit, int probability, int healthInit, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You encounter some terrorist squid. Their mission is to suicide ink you to death.");
    	int range = 3;
        healthInit = takeDamage(range);
      	damageTaken(healthInit, userName);
      mountainPass(userInput, partyInit, probability, healthInit, userName);
    }
  
  public static void underwaterBuffalo(int userInput, int partyInit, int probability, int healthInit, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You have encountered a rare herd of water buffalo and decide to hunt them.\nUnfortunately, they are more vicious than normal.\n");
        int range = 2;
        healthInit = takeDamage(range);
      	damageTaken(healthInit, userName);
      mountainPass(userInput, partyInit, probability, healthInit, userName);
    }
  
  public static void underwaterBoss(int userInput, int partyInit, int probability, int healthInit, String userName){
      Scanner keyboard = new Scanner(System.in);
    	System.out.println("You encounter the deadly Osama Squid-Laden and he is out for blood\n");
      int range = 6;
        healthInit = takeDamage(range);
      	damageTaken(healthInit, userName);
      underwaterReward(userInput, partyInit, probability, healthInit, userName);
    }
  
  public static void underwaterReward(int userInput, int partyInit, int probability, int healthInit, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Achievement Unlocked: --Suicide Trail--");
      mountainPass(userInput, partyInit, probability, healthInit, userName);
    }
  
  public static void desertRoute(int userInput,int partyInit, int probability, int healthInit, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Going around the river, you enter a large desert expanse");
      System.out.println("\nYour family spots some supplies in the distance, possibly a partially buried treasure chest\n");
      System.out.println("Do you...\n1) Continue on your way\nor...\n2) Make a detour to search the supplies");
    	userInput = keyboard.nextInt();
      if(userInput == 1){
      desertAttack(userInput, partyInit, probability, healthInit, userName);
      }
      if(userInput == 2){  
      desertTreasure(userInput, userName);
      }
    }
  
  public static void desertAttack(int userInput, int partyInit, int probability, int healthInit, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("As you cross the desert you are attacked by bandits who want to steal your stuff.");
      mountainPass(userInput, partyInit, probability, healthInit, userName);
    }
  
  public static void desertTreasure(int userInput, String userName){
	Scanner keyboard = new Scanner(System.in);
      System.out.println("You approach the treasure and confirm that it was not a mirage.");
      desertTreasureDanger(userName);
    }
  
  public static void desertTreasureDanger(String userName){
      Scanner keyboard = new Scanner(System.in);
      gameOver(userName);
      
    }
  
  public static void mountainPass(int userInput,int partyInit, int probability, int healthInit, String userName){
      Scanner keyboard = new Scanner(System.in);
    	System.out.println("You have crossed the dangerous desert and reached the mountain pass.\n");
      int range = 1;
    	probability = choiceProb(range);
      if(probability == 0){
      huntMountains(userInput, partyInit, userName, probability);
      }
      if(probability == 1){  
      huntLlamas(userInput, healthInit, userName);
      }
    }
  
  public static void huntMountains(int userInput,int partyInit, String userName, int probability){
      Scanner keyboard = new Scanner(System.in);
    	System.out.println("In order to survive in the mountians, you must hunt at least 40 animals to feed your family.\n");
      int range = 2;
    	probability = choiceProb(range);
      if(probability == 0){
      huntSuccess(userInput, userName);
      }
      if(probability == 1){  
      huntFailStarve(userInput, userName);
      }
    	if(probability == 2){
      huntFailCannibal(userInput,partyInit ,userName);
      }
    }
  
  public static void huntSuccess(int userInput, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You successfully were able to feed your family");
      cliff(userInput, userName);
    }
  
  public static void huntFailStarve(int userInput, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You were unable to feed your family and you chose to starve to death in the snow instead of resorting to cannabalism.");
      gameOver(userName);
    }
  
  public static void huntFailCannibal(int userInput, int partyInit, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You have failed your hunt and have chosen cannabalism to move on");
      oneDeath(userInput, partyInit);
    	cliff(userInput, userName);
    }
  
  public static int oneDeath(int userInput, int partyInit){
      Scanner keyboard = new Scanner(System.in);
      partyInit = partyInit--;
      return partyInit;
    }
  
  public static void fullDeath(int userInput, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You all died");
      gameOver(userName);
    }
  
  public static void huntLlamas(int userInput, int healthInit, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You encounter llamas in the mountain and have chosen to hunt them.\n\n");
      System.out.println("Unfortunately they did not want to be hunted");
    int range = 1;
        healthInit = takeDamage(range);
      	damageTaken(healthInit, userName);
      llamaReward(userInput, healthInit, userName);
    }
  
  public static void llamaReward(int userInput, int healthInit, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("After dealing with vicious llamas you forged your way onwards");
      cliff(userInput, userName);
    }
  
  public static void cliff(int userInput, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You are met with a cliff");
      System.out.println("Do you...\n1) Jump off\nor...\n2) Go around");
      userInput = keyboard.nextInt();
    	if(userInput == 1){
        buffaloRevenge(userInput, userName);
      }
        
      else{
      	buffaloRevenge(userInput, userName);
      }
        
    }
  
  public static void buffaloRevenge(int userInput, String userName){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("\n\n\nWhether intentional or by accident, your cart has fallen off the cliff.\nAngry buffalo have also followed you to avenge their fallen brothers.\n\n\n");
      gameOver(userName);
    }   
  
  public static int takeDamage(int range){
	  Random rand = new Random(); 
	  int random = (rand.nextInt(range));
	  damageInt(range, healthInit, random);
      return(random);
    }
  
  public static void damageInt(int range, int healthInit, int random){
	  healthInit= healthInit-random;
  }
  
  public static int choiceProb(int range){
  	Random rand = new Random();
		int probability = (int) (rand.nextInt(range));
    	return probability;
  	}
  
  public static void damageDeath(String userName){
	  if(healthInit == 0){
		  gameOver(userName);
	  }
	  //write damageDeath(); at the end of each method to check for health == 0
  }
  
  public static void damageTaken(int healthInit, String userName){
    
    System.out.println(userName+" has been rekt, you have "+ healthInit +" health left");
    
  }
  
  public static void gameOver(String userName){
      
      System.out.println("Unfortunately, " + userName + ".exe has stopped working. You have died.");
      
    }
}
