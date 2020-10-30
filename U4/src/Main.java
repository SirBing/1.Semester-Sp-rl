import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Person> table = new HashMap<>();
		table.put(0, new Person("Jakob", "Wetter", 19));
		table.put(1, new Person("Florian", "Dietsche", 19));
		table.put(2, new Person("Moritz", "Meyer", 19)); 
		
		int rand = (int)(Math.random() * 3);
		System.out.println("Mein Name ist " + table.get(rand).getVorname() + " " + table.get(rand).getName() + " und ich bin " + table.get(rand).getAlter() + " Jahre alt.");
	}

}
