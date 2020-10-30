import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringController sc = new StringController();
		Scanner scanner = new Scanner(System.in);
		
		int selection = -1;
		while (selection != 0) {
			System.out.println("0 - Beenden");
			System.out.println("1 - String setzen");
			System.out.println("2 - Teilstring ersetzen");
			System.out.println("3 - String ausgeben");
			System.out.println("4 - String Statistik");

			String str = "";
			int startidx = -1;
			int endidx = -1;

			selection = scanner.nextInt();
			scanner.nextLine(); //Eat the new Line
			switch (selection) {
			case 0:
				scanner.close();
				break;
			case 1:
				System.out.println("Geben Sie den zu setzenden String ein: ");
				str = scanner.nextLine();
				sc.setString(str);
				break;
			case 2:
				System.out.println("Geben Sie den zu setzenden String ein: ");
				str = scanner.nextLine();
				System.out.println("Geben Sie den Startindex ein: ");
				startidx = scanner.nextInt();
				System.out.println("Für automatisches Einfügen: -1. Für manuellen Endindex eingeben: ");
				endidx = scanner.nextInt();
				if (endidx == -1)
					sc.replaceString(startidx, str);
				else
					sc.replaceString(startidx, endidx, str);
				break;
			case 3:
				System.out.println(sc.getString());
				break;
			case 4:
				System.out.println("Capacity: " + sc.getCapacity());
				System.out.println("Length: " + sc.getLength());
				break;
			}
		}
	}
}
