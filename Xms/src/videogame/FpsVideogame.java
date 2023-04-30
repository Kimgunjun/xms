package videogame;

import java.util.Scanner;

public class FpsVideogame extends Videogame {

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
			  System.out.println("How game's userscore? (Y/N)");
			  answer = input.next().charAt(0);
			  if (answer == 'y' || answer == 'Y') {
			    System.out.println("videogameUserscore");
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
}