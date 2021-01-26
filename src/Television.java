public class Television {
	private int channel;
	private int volum;
	private boolean onOff;
	
	public Television() {
		channel = 11;
		volum = 100;
		onOff = true;
	}
	
	public Television(int chan, int vol, boolean o) {
		channel = chan;
		volum = vol;
		onOff = o;
	}
	
	void print() {
		System.out.println("채널은"+channel+"이고 볼륨은"+volum+"입니다.");
	}
	public static void main(String[] args) {
		Television obj = new Television();
		obj.print();
		Television obj2 = new Television (100,200,false);
		obj2.print();

	}

}
