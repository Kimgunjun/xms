package videogame;

import java.util.Scanner;

public interface VideogameInput {
	public String getName();
	
	public void setName(String name);
	
	public String getGenre();
	
	public void setGenre(String genre);
	
	public int getUserscore();
	
	public void setUserscore(int userscore);
	
	public int getMetascore();
	
	public void setMetascore(int metascore);
	
	public void getUserInput(Scanner input);
	
	public abstract void printInfo();
}
