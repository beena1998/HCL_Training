package service;

public class checkCharacters {
	public  static int validOrNot(String str) {
		int len=str.length();
		int valid=-1;
		char ch1=str.charAt(0);
		char ch2=str.charAt(len-1);
		
		if(ch1==(ch2)) {
			valid=1;
		}
		
			
		return valid;
	}

}
