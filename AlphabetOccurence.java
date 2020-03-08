package stringHandling;

public class occur {
	public static void main(String [] args) {
		occu o2 = new occu();
		o2.getInfo();
	}
}

class occu{
	
	void getInfo() {	

		String n1 = "aaaajhka";
		int length = n1.length();
		int count=0;
		
		for(int i=0; i<length; i++) {
			char c = n1.charAt(i);
			int ascii = c;
			if(ascii == 97) {
				count++;				
			}
		}
		if(count>0) {
			System.out.println("a is prensent in string\nLength of string is "+length+" \nNumber of a's are "+count);
			
		}
	}
		
}
