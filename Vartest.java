package Practice0628;

public class Vartest {
	public void argTest(int... n) {
		for (int i = 0; i < n.length; i++)
			System.out.println("n[" + i + "]" + n[i]);
		System.out.println("---------------");

	}
		System.out,ptintln("Nomal Task1");
		System.out.println("Nomal Task2");
	public static void main(String[] args) {
		Vartest vt = new Vartest();
		vt.argTest(100, 200, 300, 400);
		vt.argTest(100, 200);	

	}

	
}

// retouch