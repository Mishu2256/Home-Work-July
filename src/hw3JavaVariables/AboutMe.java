package hw3JavaVariables;

public class AboutMe {
	public String name;// variable declared
	public String name1 = "Mishu ";// variable initialized
	public byte age = 127;
	public short myCarPayment = 32000;
	public int myGasBill = 21233;
	public long myGrossIncome = 9223344555543333l;
	public float myInterest = 1.0f;
	public double myGrade = 3.4;
	public char sex = 'M';
	public boolean usCitizen = false;

	public static void main(String[] args) {
		AboutMe aboutme = new AboutMe();
		System.out.println(
				"My Name:" + aboutme.name1 + "\nMy Age:" + aboutme.age + "\nMy Car Payment:" + aboutme.myCarPayment);

	}

}
