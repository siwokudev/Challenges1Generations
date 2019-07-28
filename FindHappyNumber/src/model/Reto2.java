package model;


public abstract class Reto2 {
	public static boolean isHappy(int number) {
		
		int result = sumaCuadrados(toArray(number));
		
		while(result != 1) {
			result = sumaCuadrados(toArray(result));
		}
		
		return true;
		
		
		/*//recursive method
		int resultado = sumaCuadrados(toArray(number));
		System.out.println(resultado);
		if( resultado == 1 ) {
			return true;
		} else {
			return isHappy(resultado);
		}
		*/
		
	}
	
	private static int sumaCuadrados(int array[]) {		
		int result = 0;
		for(int i=0 ; i < array.length ; i++) {
			result += (array[i] * array[i]);
		}
		return result;
	}
	
	private static int[] toArray(int number) {
		
		/*//mod method
		int array[] = new int[((Integer)number).toString().length()];
		int i = 0;
		while(number > 0 ) {
			array[i] = number % 10;
			number /= 10;
			i++;
		}
		return array;
		*/
		
		//String split method
		String number2 = ((Integer) number).toString();
		int array[] = new int[number2.length()];
		
		for(int i=0; i<number2.length(); i++) {
			array[i] =Character.getNumericValue( number2.charAt(i) );
		}
		
		return array;
		

	}
	
}
