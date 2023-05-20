import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		GameManager gameManager = new GameManager(input);
		
		selectMenu(input, gameManager);
   }
   public static void selectMenu(Scanner input, GameManager gameManager) {
		int num = -1;
		while (num != 5) {/*5을 입력하면 메뉴로 되돌아 온다*/
			try {
			showMenu();
		num = input.nextInt(); /*숫자입력을 받는다*/
		switch(num) {
			case 1:
				gameManager.addvideogame();
				break;
			case 2:
				gameManager.deletevideogame();
				break;
			case 3:
				gameManager.editvideogame();
				break;
			case 4:
				gameManager.viewvideogame();
				break;
		default:
			continue;
		    }	
		} 
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
   }
   public static void showMenu() {
	   System.out.println("1. Add videogames"); /* 비디오 게임을 추가한다 */
		System.out.println("2. Delete videogames"); /* 비디오 게임을 삭제한다 */
		System.out.println("3. Edit videogames"); /* 비디오 게임을 편집한다 */
		System.out.println("4. View videogames"); /* 비디오 게임을 본다 */
   	    System.out.println("5. Exit"); /* 메뉴를 나간다 */
		System.out.println("Select one number between 1-6:");
   
   }
}