package videogame;

import java.util.Scanner;

public class RpgVideogame extends TeenageUser {
	
	protected int parentuserscore;
	protected int parentmetascore;
	
	public RpgVideogame(GameKind kind) {
		super(kind);
	}
	
	  public void getUserInput(Scanner input) {
          setVideogameName(input);
          setVideogameGenre(input);
		  setVideogameUsecorewithYN(input);
          setVideogameMetaScore(input);
	    
	  }

	  
			
	  
	  
}
