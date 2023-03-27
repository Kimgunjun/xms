import java.util.Scanner;

public class Xms {

	public Xms() {
	}
	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in); /*입력*/

		while (num != 6) { /*6을 입력하면 메뉴로 되돌아 온다*/
		System.out.println("1. Add videogames"); /* 비디오 게임을 추가한다 */
		System.out.println("2. Delete videogames"); /* 비디오 게임을 삭제한다 */
		System.out.println("3. Edit videogames"); /* 비디오 게임을 편집한다 */
		System.out.println("4. View videogames"); /* 비디오 게임을 본다 */
		System.out.println("5. Show videogames"); /* 비디오 게임들을 보여준다 */
		System.out.println("6. Exit"); /* 메뉴를 나간다 */
		System.out.println("Select one number between 1-6:"); /* 1-6번 사이 숫자를 입력하시오를 출력한다 */
		num = input.nextInt(); /*숫자입력을 받는다*/
		switch(num) { /* 변수 값에 따라 다른 동작을 위해 사용 */
		case 1:
			System.out.print("videogame name:"); /* videogame name을 출력한다 */
			String videogamename = input.next(); /* 문자 입력을 받는다 */
			System.out.print("videogame genre:");
			String videogamegenre = input.next();
			System.out.print("videogame platform:");
			String videogameplatform = input.next();
			System.out.print("videogame user score:");
			String videogameuserscore = input.next();
			break; /* case 1을 끝낸다 */
		case 2:
		case 3:
		case 4:
			System.out.print("videogame name:"); /* 비디오 게임 이름을 입력받는다 */
			String videogamename4 = input.next();
			break;
		}
       } 
    }
}