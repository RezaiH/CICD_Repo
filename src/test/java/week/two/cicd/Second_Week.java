package week.two.cicd;

public class Second_Week {

	private static void showOne() {
		System.out.println("This is a void method coming from Second_Week class.");
	}
	protected static void showTwo() {
		System.out.println("This is a void method coming from Second_Week class.");
	}
	
	static public void main(String args[]) {
		showOne();
		showTwo();
	}
}
