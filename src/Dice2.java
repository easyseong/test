
public class Dice2 {
	private int	value;//클래스 내부에서만 사용 가능
	int[] a = {1,2,3,4,5,6};
	
	public Dice2() {
		value=0;
	}//생성자
	
	public void roll() {
		
		
		int i = (int) (Math.random()*5);
		this.value = a[i];
		
	}
	
	public int getValue() { return value; }
	public void setValue(int value) {	this.value = value;	}
	

	public static void main(String[] args) {
		int count = 0;
		int value1, value2;
		
		do {
			Dice2 obj1 = new Dice2();
			obj1.roll();
			value1 = obj1.value ;
			
			Dice2 obj2 = new Dice2();
			obj2.roll();
			value2 = obj2.value ;	//두 개의 객체 생성
	
			
			System.out.println("주사위 1= "+value1+" 주사위 2= "+value2);
			count++;
			
		} while(value1+value2 != 2);
		
		System.out.println("(1,1)이 나오는데 걸린 횟수 = "+count);

	}

}
