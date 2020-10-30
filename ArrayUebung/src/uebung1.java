
public class uebung1 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 11);
		}
		for(int j = arr.length-1; j >= 0; j--) {
			System.out.print(arr[j] + " ");
		}

	}

}
