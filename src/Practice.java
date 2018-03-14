
public class Practice {
	
	static boolean compare(int one, int two) {
		return false;
	}
	
	static boolean odd(int one, int two) {
		return false;
	}
	
	static String sum(int one, int two) {
		return "";
	}
	
	static int highest(int[] numbers) {
		return 0;
	}
	
	static int[] revert(int[] numbers) {
		return numbers;
	}
	
	static int[] remove(int[] numbers, int divider) {
		int[] tmp = new int[numbers.length];
		int ke = 0;
		for(int k : numbers) {
			if(k%divider!=0) {
				tmp[ke] = k; ke++;}
			
		}
		for(int k : tmp) System.out.println(k);
		return numbers;
	}
	
}
