import java.util.ArrayList;
import java.util.Scanner;

public class GameManager {
	
	ArrayList<Videogame> videogames = new ArrayList<Videogame>();
    Scanner input;
    GameManager(Scanner input) {
    	this.input = input;
    }
    
    public void addvideogame() { /* 1번을 선택하면 게임추가메뉴로 들어온다 */
		Videogame videogame = new Videogame();
		System.out.print("videogame NAME:");
	    videogame.name = input.next();
		System.out.println("videogameGenre");
		videogame.genre = input.next();
		System.out.println("videogameUserscore");
		videogame.userscore = input.nextInt();
		System.out.println("videogameMetasore");
		videogame.metascore = input.nextInt();
		videogames.add(videogame);
}
	public void deletevideogame() { /* 2번을 선택하면 게임삭제메뉴로 들어온다 */
		System.out.print("videogame NAME:");
		String videogameName = input.next();
		int index = -1;
		for (int i = 0; i<videogames.size(); i++) {
			if (videogames.get(i).name == videogameName) {
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
			Videogame videogame = videogames.get(i);
			if (videogame.name == videogameName) {
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
						videogame.name = input.next();
					}
					else if (num == 2) {
						System.out.print("Videogame Genre:");
						videogame.genre = input.next();
					}
					else if (num == 3) {
						System.out.print("Videogame UserScore:");
						videogame.userscore = input.nextInt();
					}
					else if (num == 4) {
						System.out.print("Videogame MetaScore:");
						videogame.metascore = input.nextInt();
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
