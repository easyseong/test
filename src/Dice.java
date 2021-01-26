import java.util.Scanner;

public class Dice {
	public static void main(String[] args) {
		double f_temp, c_temp;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("화씨온도를 입력하시오: ");
		f_temp = input.nextInt();
		
		c_temp = 5*(f_temp-32)/9;
		
		
		
		
		System.out.print("섭씨온도는 "+c_temp);
	}

}
