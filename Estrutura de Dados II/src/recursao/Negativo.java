package recursao;

public final class Negativo {

	public static boolean isNegativo(int num) {
		
		return isNegativo(num, num);
	}
	
	private static boolean isNegativo(int aumenta, int diminui) {
		return aumenta == 0 ? true : diminui == 0 ? false : isNegativo(aumenta+1, diminui-1) ;
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(isNegativo(0));
			System.out.println(isNegativo(-2));
		} catch (Exception ignored) {}
	}
}