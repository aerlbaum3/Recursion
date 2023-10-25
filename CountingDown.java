
public class CountingDown {
	
	public static void main(String[] args) {
		int i = 7;
		System.out.println(countingDown(i));
	}

	private static int countingDown(int i) {
		if (i == 1) {
			return i;
		}
		System.out.print(i + ", ");
		return countingDown(i - 1);
		
		
	}
}
