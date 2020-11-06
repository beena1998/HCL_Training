package service;

public class UserMainCode {
	public static int checkSum(int num) {

		int sum=0;
		        while(num>0) {
        	
        if((num%10)%2!=0) {
        	sum+=num%10;
        	
        }
        num=num/10;
        }
        
        if(sum%2!=0) {
        	return 1;
        }
        else
        	return -1;
		
	}

}
