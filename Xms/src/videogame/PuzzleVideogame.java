package videogame;

import java.util.Scanner;

public class PuzzleVideogame extends Videogame {

	public PuzzleVideogame(GameKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
        setVideogameName(input);
        setVideogameGenre(input);
        setVideogameUserScore(input);
        setVideogameMetaScore(input);

    }
	public void printInfo() {
	    String skind = getkindString();
		System.out.println("kind:" + skind + "name :" + name + " genre "+ genre +" userscore :" + userscore + " metascore: " + metascore + " parent's userscore :" + userscore + " parent's metascore: " + metascore);
	
}
}
