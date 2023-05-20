package videogame;

import java.util.Scanner;

import exception.UserscoreFormatException;

public interface VideogameInput {
	public String getName();
	
	public void setName(String name);
	
	public String getGenre();
	
	public void setGenre(String genre);
	
	public String getUserscore();
	
	public void setUserscore(String userscore) throws UserscoreFormatException;
	
	public int getMetascore();
	
	public void setMetascore(int metascore);
	
	public void getUserInput(Scanner input);
	
	public abstract void printInfo();
	
	public void setVideogameName(Scanner input);
	
	public void setVideogameGenre(Scanner input);
	
	public void setVideogameUserScore(Scanner input);
	
	public void setVideogameMetaScore(Scanner input);
}
