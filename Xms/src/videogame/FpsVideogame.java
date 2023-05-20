package videogame;

import java.util.Scanner;

import exception.UserscoreFormatException;

public class FpsVideogame extends TeenageUser {
	
	protected int Userscore;
	protected int Metascore;
	
	public FpsVideogame(GameKind kind) {
		super(kind);
	}

	  public void getUserInput(Scanner input) {
            setVideogameName(input);
            setVideogameGenre(input);
            setVideogameUsecorewithYN(input);
            setyourVideogamescorewithYN(input);

	     	setVideogameMetaScore(input);

	    }
    
	  public void setyourVideogamescorewithYN(Scanner input) {
			char answer = 'x';
			while (answer != 'y' && answer != 'y' && answer != 'n' && answer != 'N'){
				System.out.print("How game's your score? (Y/N) ");
				answer = input.next().charAt(0);
				try {
				if(answer == 'y' ||  answer == 'Y') {
					setVideogameMetaScore(input);
					break;
				}
				else if (answer == 'n' ||  answer == 'N') {
					this.setUserscore("");
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
	  
	  public void printInfo() {
		  String skind = getkindString();
			System.out.println("kind:" + skind + "name :" + name + " genre "+ genre +" userscore :" + userscore + " metascore: " + metascore + " parent's userscore :" + userscore + " parent's metascore: " + metascore);
		
}

}