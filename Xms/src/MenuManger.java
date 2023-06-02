import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class MenuManger {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		GameManager gameManager = getObject("gamemanager.ser");
		
		if (gameManager == null) {
			gameManager = new GameManager(input); 
			
		}
		selectMenu(input, gameManager);
		putObject(gameManager, "gamemanager.ser");
		
   }
   public static void selectMenu(Scanner input, GameManager gameManager) {
		int num = -1;
		while (num != 5) {
			try {
			showMenu();
		num = input.nextInt(); 
		switch(num) {
			case 1:
				gameManager.addvideogame();
				logger.log("add a videogame");
				break;
			case 2:
				gameManager.deletevideogame();
				logger.log("delete a videogame");
				break;
			case 3:
				gameManager.editvideogame();
				logger.log("edit a videogame");
				break;
			case 4:
				gameManager.viewvideogame();
				logger.log("edit a list of videogame");
				break;
		default:
			continue;
		    }	
		} 
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!!");
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
   
   public static GameManager getObject(String filename) {
	   GameManager gameManager = null;
	   try {
		   FileInputStream file = new FileInputStream(filename);
		   ObjectInputStream in = new ObjectInputStream(file);
		   
		   gameManager = (GameManager) in.readObject();
		   
		   in.close();
		   file.close();
	   } catch (FileNotFoundException e) {
		  return gameManager;
	   } catch (IOException e) {
     	   e.printStackTrace();
       } catch (ClassNotFoundException e) {
	       e.printStackTrace();
       }
	  
       return gameManager;
	   
   }
public static void putObject(GameManager gameManager, String filename) {
	   try {
		   FileOutputStream  file = new FileOutputStream(filename);
		   ObjectOutputStream out = new ObjectOutputStream(file);
		   
		   out.writeObject(gameManager);
		   
		   out.close();
		   file.close();
	   } catch (FileNotFoundException e) {
		   e.printStackTrace(); 
	   } catch (IOException e) {
     	   e.printStackTrace();
     }
   }
}

 