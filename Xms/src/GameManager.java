import java.util.ArrayList;
import java.util.InputMismatchException;
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
    	while (kind < 1 || kind > 3) {
    		try {
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
    	  catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
     }
   }
}
	public void deletevideogame() { /* 2번을 선택하면 게임삭제메뉴로 들어온다 */
		System.out.print("videogame NAME:");
		String videogameName = input.next();
		int index = findIndex(videogameName);
		removefromVideogames(index, videogameName);
	}
    public int findIndex(String videogameName) {
    	int index = -1;
		for (int i = 0; i<videogames.size(); i++) {
			if (videogames.get(i).getName() == videogameName) {
				index = i;
				break;
			}
		}
    	return index;
    }

	public int removefromVideogames(int index, String videogameName) {
		if (index >= 0) { 
			videogames.remove(index);
			System.out.println("the videogame " + videogameName + "is deleted");
			return 1;
		}
		else {
			System.out.println("the videogame has not been registered");
			return -1;
		}
	}
	public void editvideogame() { /* 3번을 선택하면 게임편집메뉴로 들어온다 */
		System.out.print("videogame NAME:");
		String videogameName = input.next();
		for (int i = 0; i<videogames.size(); i++) {
			VideogameInput videogame = videogames.get(i);
			if (videogame.getName() == videogameName) {
				int num = -1;
				while (num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1: videogame.setVideogameName(input);
						break;
					case 2: videogame.setVideogameGenre(input);
						break;
					case 3: videogame.setVideogameUserScore(input);
						break;
					case 4: videogame.setVideogameMetaScore(input);
						break;
						default:
							continue;
					}		
				}//while
				break;
			}//if
		}//for
}
	public void viewvideogame() { 
		System.out.println("# of registered videogames :" + videogames.size());/* 4번을 선택하면 게임보기메뉴로 들어온다 */
		for (int i = 0; i<videogames.size(); i++) {
			videogames.get(i).printInfo();
     	}
	}
	

	
	public void showEditMenu() {
		System.out.println("** Videogame Info Edit Menu **");
		System.out.println(" 1. Edit Name");
		System.out.println(" 2. Edit Genre");
		System.out.println(" 3. Edit UserScore");
		System.out.println(" 4. Edit MetaScore");
		System.out.println("Select one number between 1 - 6:");
	}
}
