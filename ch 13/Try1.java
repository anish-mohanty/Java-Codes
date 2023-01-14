package practice;

public class Try1<T> {
	int val;
	private T t;
	public void set(T t,int val) {
		
	}
	public T getT() {
		return t;
		
	}
	public int getval () {
		return val;
		
	}
	public static void main(String[] args) {
		Try1<String> nt=new Try1<String>();
		nt.set("BONE" ,10);
		System.out.println(nt.getT());
		System.out.println(nt.getval());
		
		
	}

}
