package recursao;

public final class GeaterOrEqual {

	public static boolean isGreaterOrEqual(int x, int y) {
		
		if(Negativo.isNegativo(x) && Negativo.isNegativo(y)) 
			return GreaterThan.isGreaterThan(x, y) || x == y ? true : isGreaterOrEqual(x+1, y+1);
		
		return false;
		/*if(!Negativo.isNegativo(x) && Negativo.isNegativo(y)) 

		if(Negativo.isNegativo(x) && !Negativo.isNegativo(y)) 
			
		if(!Negativo.isNegativo(x) && !Negativo.isNegativo(y)) */
	}
	
	public static void main(String[] args) {
		System.out.println(isGreaterOrEqual(1, 2));
		System.out.println(isGreaterOrEqual(-1, 2)); 
		System.out.println(isGreaterOrEqual(2, 1));
		System.out.println(isGreaterOrEqual(-1, -1));		
	}
}