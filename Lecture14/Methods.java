package Lecture14;

public class Methods {

	public static void main(String[] args) {
		add(5, 7);
		add(10, 29);
		Methods m = new Methods();
		m.sub(5, 7);
	}

	private static void add(int a, int b) {
		System.out.println(a + b);
	}

	private void sub(int a, int b) {
		System.out.println(a - b);
	}

}
