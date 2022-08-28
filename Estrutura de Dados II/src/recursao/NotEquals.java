package recursao;

public final class NotEquals {

	public static boolean notEquals(int x, int y) {
		if(Negativo.isNegativo(x) || Negativo.isNegativo(y))
			return x == 0 && y == 0 ? false :  x == 0 || y == 0 ? true : notEquals(x+1, y+1);
	
		return x == 0 && y == 0 ? false : x == 0 || y == 0 ? true : notEquals(x-1, y-1);
	}
	
	public static void main(String[] args) {
		System.out.println(notEquals(1, 2));
		System.out.println(notEquals(2, 2));
		System.out.println(notEquals(-1, 2));
		System.out.println(notEquals(-1, -2));
	}
}
