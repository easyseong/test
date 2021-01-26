
public class cardgame {

	public static void main(String[] args) {
		String[] number = {"2","3","4","5","6","7","8","9","10","JACK","QUEEN","KING","ACE"};
		String[] a = {"Clubs","Diamonds","Hearts","Spades"};
		
		
		
		for (int i=0;i<5;i++) {
			int num_ran = (int)(Math.random()*12);
			int a_ran = (int)(Math.random()*3);
			
			
			System.out.println(a[a_ran]+"의 "+number[num_ran]);
		}
	
	
	
	
	
	}

}
