package model;

public abstract class Reto1 {
	public static Integer findSigleElement(int array[]) {
		
		for(int i=0; i<array.length ; i+=2) {
			if(i == array.length-1) {
				return array[i];
			}else if ((array[i] != array[i + 1])){
				return array[i];
			}
		}
		
		return null;
	}
}
