package videogame;

import java.util.Scanner;

import exception.UserscoreFormatException;

public abstract class TeenageUser extends Videogame {
	
	public TeenageUser(GameKind kind) {
		super(kind);
	}

	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		    String skind = getkindString();
           	System.out.println("kind:" + skind + "name :" + name + " genre "+ genre +" userscore :" + userscore + " metascore: " + metascore + " parent's userscore :" + userscore + " parent's metascore: " + metascore);
			
	  }
	public void setVideogameUsecorewithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
		  System.out.println("How parent's game's userscore? (Y/N)");
		  answer = input.next().charAt(0);
		  try {
			  if (answer == 'y' || answer == 'Y') {
			    System.out.println("parent's videogameUserscore:");
			    String userscore = input.next();
			    this.setUserscore(userscore);
			}
			  else if (answer == 'n' || answer == 'N') {
		      this.setUserscore(userscore);
		      break;
			}
			else {
			}
	}
		  catch(UserscoreFormatException e) {
	            System.out.println("Incorrect Userscore Format. put the userscore that contain %");		 
	         }
		  }
     }
}


