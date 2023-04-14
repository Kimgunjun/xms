import java.util.Scanner;

public class MenuManger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		GameManager gameManager = new GameManager(input);
		
		int num = -1;
		while (num != 5) { /*5을 입력하면 메뉴로 되돌아 온다*/
		System.out.println("1. Add videogames"); /* 비디오 게임을 추가한다 */
		System.out.println("2. Delete videogames"); /* 비디오 게임을 삭제한다 */
		System.out.println("3. Edit videogames"); /* 비디오 게임을 편집한다 */
		System.out.println("4. View videogames"); /* 비디오 게임을 본다 */
    	System.out.println("5. Exit"); /* 메뉴를 나간다 */
		System.out.println("Select one number between 1-6:"); /* 1-6번 사이 숫자를 입력하시오를 출력한다 */
		num = input.nextInt(); /*숫자입력을 받는다*/
		if (num == 1) {
			gameManager.addvideogame();
		}
		else if (num == 2) {
			gameManager.deletevideogame();
		}
		else if (num == 3) {
			gameManager.editvideogame();
		}
		else if (num == 4) {
			gameManager.viewvideogame();
		}
		else { /*6번을 누르면 종료된다 */
			continue;
		}
      } 
   }
}