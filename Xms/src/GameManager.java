import java.util.ArrayList;
import java.util.Scanner;

import videogame.FpsVideogame;
import videogame.GameKind;
import videogame.PuzzleVideogame;
import videogame.RpgVideogame;
import videogame.Videogame;
import videogame.VideogameInput;

public class GameManager {
	
	ArrayList<VideogameInput> videogames = new ArrayList<VideogameInput>();
    Scanner input;
    GameManager(Scanner input) {
    	this.input = input;
    }
    
    public void addvideogame() { /* 1번을 선택하면 게임추가메뉴로 들어온다 */
    	int kind = 0;
    	VideogameInput videogameInput;
    	while (kind !=1 && kind != 2) {
    	System.out.println("1 for puzzle");
    	System.out.println("2 for Fps");
    	System.out.println("3 for Rpg");
    	System.out.print("Select num 1, 2, or 3for Game Kind:");
	    kind = input.nextInt();
	    if (kind == 1) {
	    	videogameInput = new PuzzleVideogame(GameKind.Puzzle);
	    	videogameInput.getUserInput(input);
			videogames.add(videogameInput);
	    	break;

	    }
	    else if ( (kind == 2) ) {
	    	videogameInput = new FpsVideogame(GameKind.Fps);
	    	videogameInput.getUserInput(input);
			videogames.add(videogameInput);
	    	break;
	    }
	    else if ( (kind == 3) ) {
	    	videogameInput = new RpgVideogame(GameKind.Rpg);
	    	videogameInput.getUserInput(input);
			videogames.add(videogameInput);
	    	break;
	    }
	    else {
	    	System.out.print("Select num for Game Kind between 1 and 2:");
	    }
    }
}
	public void deletevideogame() { /* 2번을 선택하면 게임삭제메뉴로 들어온다 */
		System.out.print("videogame NAME:");
		String videogameName = input.next();
		int index = -1;
		for (int i = 0; i<videogames.size(); i++) {
			if (videogames.get(i).getName() == videogameName) {
				index = i;
				break;
			}
		}
		
		if (index >= 0) { 
			videogames.remove(index);
			System.out.println("the videogame " + videogameName + "is deleted");
		}
		else {
			System.out.println("the videogame has not been registered");
			return;
		}
}
	public void editvideogame() { /* 3번을 선택하면 게임편집메뉴로 들어온다 */
		System.out.print("videogame NAME:");
		String videogameName = input.next();
		for (int i = 0; i<videogames.size(); i++) {
			VideogameInput videogameInput = videogames.get(i);
			if (videogameInput.getName() == videogameName) {
				int num = -1;
				while (num != 5) {
					System.out.println("** Videogame Info Edit Menu **");
					System.out.println(" 1. Edit Name");
					System.out.println(" 2. Edit Genre");
					System.out.println(" 3. Edit UserScore");
					System.out.println(" 4. Edit MetaScore");
					System.out.println("Select one number between 1 - 6:");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Videogame Name:");
						String name = input.next();
						videogameInput.setName(name);
					}
					else if (num == 2) {
						System.out.print("Videogame Genre:");
						String genre = input.next();
						videogameInput.setGenre(genre);
					}
					else if (num == 3) {
						System.out.print("Videogame UserScore:");
						int userscore = input.nextInt();
						videogameInput.setUserscore(userscore);
					}
					else if (num == 4) {
						System.out.print("Videogame MetaScore:");
						int metascore = input.nextInt();
						videogameInput.setMetascore(metascore);
					}
					else {
						continue;
					}// if
				}//while
				break;
			}//if
		}//for
}
	public void viewvideogame() { /* 4번을 선택하면 게임보기메뉴로 들어온다 */
		for (int i = 0; i<videogames.size(); i++) {
			videogames.get(i).printInfo();
     	}
	}
	
}
