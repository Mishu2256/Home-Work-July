package hw6IfElseCondition01;

public class Voter {
	public static void main(String[] args) {
		//System.out.println("Please add valid age");
		int age = 17;
		if (age == 18) {
			System.out.println("I am a voter");
		} else if (age < 18) {
			System.out.println("I am not a voter");
		} else if (age > 18) {
			System.out.println("I am a voter");
		} else {
			System.out.println("Please add a valid age");
		}
	}
}