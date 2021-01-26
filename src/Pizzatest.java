
public class Pizzatest {
	int radius;
	
	Pizzatest(int r) {
		radius = r;
	}
	
	Pizzatest whoLargest(Pizzatest p1, Pizzatest p2) {
		if (p1.radius > p2.radius)
			return p1;
		else
			return p2;
	}
	
	public static void main(String[] args) {
		Pizzatest obj1 = new Pizzatest(14);
		Pizzatest obj2 = new Pizzatest(18);
		
		Pizzatest largest = obj2.whoLargest(obj1, obj2);
		System.out.println(largest.radius + "인치 피자가 더 큼.");
		

	}

}
