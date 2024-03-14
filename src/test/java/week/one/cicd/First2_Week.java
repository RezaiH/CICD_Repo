package week.one.cicd;

public class First2_Week {

	public String showMyName(String name) {
		return name;
	}
	
	public int showMyAge(int age) {
		return age;
	}
	
	public String showMyEmail(String email) {
		return email;
	}
	
	public static void main(String args[]) {
		First2_Week one = new First2_Week();
		System.out.println(one.showMyName("Hussain Rezai"));
		System.out.println(one.showMyAge(28));
		System.out.println(one.showMyEmail("rezaih637@gmail.com"));
	}
}
