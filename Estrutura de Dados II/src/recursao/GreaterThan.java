package recursao;

public final class GreaterThan {

	public static boolean isGreaterThan(int x, int y) {
		
		if(Negativo.isNegativo(x) || Negativo.isNegativo(y)) 
			return x == 0 && y == 0 ? false : x == 0 || y == 0 ? true : isGreaterThan(x + 1, y + 1);
		
		return x == 0 && y == 0 ? false : x == 0 || y == 0 ? true : isGreaterThan(x - 1, y - 1);
	}
	
	public static void main(String[] args) {
		System.out.println(isGreaterThan(1, 2));
		System.out.println(isGreaterThan(2, 2));
		System.out.println(isGreaterThan(2, -2));
		System.out.println(isGreaterThan(-2, 2));
		System.out.println(isGreaterThan(-2, -2));
		System.out.println(isGreaterThan(-4, -2));
		System.out.println(isGreaterThan(-2, -4));
	}
}
