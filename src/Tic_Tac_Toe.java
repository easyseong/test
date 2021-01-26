import java.util.Scanner;

public class Tic_Tac_Toe {
	
	int size;
	String type;
	
	public Tic_Tac_Toe() {
		size =12;
		type = "슈퍼슈프림";
	}//매개 변수가 없는 생성자
	
	public Tic_Tac_Toe(int s, String t) {
		size = s;
		type = t;
	}// 매개 변수가 있는 생성자

	public static void main(String[] args) {

		Tic_Tac_Toe obj1 = new Tic_Tac_Toe();
		System.out.println(obj1.size+", "+obj1.type);
		
		Tic_Tac_Toe obj2 = new Tic_Tac_Toe(453,"이지성");
		System.out.print(obj2.size+", "+obj2.type);

	}

}
