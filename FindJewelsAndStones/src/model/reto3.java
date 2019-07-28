package model;

public abstract class reto3 {

	public static int FindJewelsAndStones(String jewels, String batch) {
		int count = 0;
		
		for(char s : batch.toCharArray()) {
			if(jewels.indexOf(s) != -1)
				count++;
		}
		return count;
	}
	
}
