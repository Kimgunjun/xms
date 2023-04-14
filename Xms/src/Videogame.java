
public class Videogame {
	String name;
	String genre;
	int userscore;
	int metascore;
	
	public Videogame() {
	}

	public Videogame(String name, String genre, int userscore, int metascore) {
		this.name = name;
		this.genre = genre;
		this.userscore = userscore;
		this.metascore = metascore;
	}
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("name :" + name + " genre "+ genre +" userscore :" + userscore + " metascore: " + metascore);
	}

}
