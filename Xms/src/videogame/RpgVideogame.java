package videogame;

import java.util.Scanner;

public class RpgVideogame extends Videogame implements VideogameInput {
	
	protected int parentuserscore;
	protected int parentmetascore;
	
	public RpgVideogame(GameKind kind) {
		super(kind);
	}
	
	  public void getUserInput(Scanner input) {
	    	System.out.print("videogame NAME:");
		    String name = input.next();
		    this.setName(name);
		    
			System.out.println("videogameGenre");
			String genre = input.next();
			this.setGenre(genre);
			
			char answer = 'x';
			while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
			{
			  System.out.println("How parent's game's userscore? (Y/N)");
			  answer = input.next().charAt(0);
			  if (answer == 'y' || answer == 'Y') {
			    System.out.println("parent's videogameUserscore");
			    int userscore = input.nextInt();
			    this.setUserscore(userscore);
			}
			  else if (answer == 'n' || answer == 'N') {
		      this.setUserscore(userscore);
		      break;
			}
			else {
				
			}
			System.out.println("videogameMetasore");
			int metascore = input.nextInt();
			this.setMetascore(metascore);
	    }
	  }
			public void printInfo() {
				String skind = "none";
				switch(this.kind) {
				case Fps:
					skind = "F";
					break;
				case Puzzle:
					skind = "P";
					break;
				case Rpg:
					skind = "R";
					break;
					default:
				}
				System.out.println("kind:" + skind + "name :" + name + " genre "+ genre +" userscore :" + userscore + " metascore: " + metascore + " parent's userscore :" + userscore + " parent's metascore: " + metascore);
			
	  }
	  
	  
}
