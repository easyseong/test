import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		int i = (int) (Math.random()*100);
		int input;
		int num =0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("정답을 추측하여 보시오: ");
			input = sc.nextInt();
			num++;
			
			if(input < i)
				System.out.println("HIGH");
			if(input > i)
				System.out.println("LOW");			
		} while (input != i);
		
		System.out.printf("축하합니다. 시도횟수=%d",num);	

	}

}
