import java.util.ArrayList;
import java.util.Scanner;

public class Zahleneingabe {

	ArrayList<Integer> data = new ArrayList<>();
	
	public void addNumber(Integer a) {
		data.add(a);
	}
	
	public void ausgeben () {
		for(int i = data.size()-1; i >= 0; i--) {
			System.out.print(data.get(i) + " ");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Zahleneingabe ein = new Zahleneingabe();
		Integer in = 0;
		while(in != -1) {
			in = scanner.nextInt();
			if(in == -1) break;
			ein.addNumber(in);
		}
		ein.ausgeben();
		scanner.close();
		
	}
}
