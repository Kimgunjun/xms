import java.util.Scanner;

public class Xms {

	public Xms() {
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); /*입력*/
		int num = 5;

		while (num != 6) { /*6을 입력하면 메뉴로 되돌아 온다*/
		System.out.println("1. Add videogames"); /* 비디오 게임을 추가한다 */
		System.out.println("2. Delete videogames"); /* 비디오 게임을 삭제한다 */
		System.out.println("3. Edit videogames"); /* 비디오 게임을 편집한다 */
		System.out.println("4. View videogames"); /* 비디오 게임을 본다 */
		System.out.println("5. Show videogames"); /* 비디오 게임들을 보여준다 */
		System.out.println("6. Exit"); /* 메뉴를 나간다 */
		System.out.println("Select one number between 1-6:"); /* 1-6번 사이 숫자를 입력하시오를 출력한다 */
		num = input.nextInt(); /*숫자입력을 받는다*/
		if (num == 1) {
			addvideogame();
		}
		else if (num == 2) {
			deletevideogame();
		}
		else if (num == 3) {
			editvideogame();
		}
		else if (num == 4) {
			viewvideogame();
		}
		else if (num == 5) {
			showvideogame();
		}
       } 
	}
	
		public static void addvideogame () {
			Scanner input = new Scanner(System.in);
			System.out.print("videogame NAME:");
		    String videogameName = input.next();
			System.out.println("videogameGenre");
			String videogameGenre = input.next();
			System.out.println("videogameUserscore");
			int videogameUserscore = input.nextInt();
			System.out.println("videogameMetasore");
			int Metascore = input.nextInt();
    }
		public static void deletevideogame () {
			Scanner input = new Scanner(System.in);
			System.out.print("videogame NAME:");
			String videogameName = input.next();
	}
		public static void editvideogame () {
			Scanner input = new Scanner(System.in);
			System.out.print("videogame NAME:");
			String videogameName = input.next();
    }
		public static void viewvideogame () {
			Scanner input = new Scanner(System.in);
			System.out.print("videogame NAME:");
			String videogameName = input.next();
    }
		public static void showvideogame () {
			Scanner input = new Scanner(System.in);
			System.out.print("videogame NAME:");
			String videogameName = input.next();
		}
}