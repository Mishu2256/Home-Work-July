package hw4JavaVariables;

public class AboutMe {
	public String name;//variable declared
	public byte age;
	public short myApartmentRent;
	public int myYearlySalary;
	public long myBankBalance; 
	public float myHeight;
	public double myGrade;
	public char sex;
	public boolean usCitizen;
	public AboutMe() {// Constructor Declared
		System.out.println("This is all about us");
	}
	public void aboutMe(){// method implemented
		System.out.println("My Name is: " + name + "\nMy Age: " + age + "\nMy Apartment Rent: " + myApartmentRent
				+ "\nYearly Salary: " + myYearlySalary + "\nMy Bank Balance" + myBankBalance + "\nSex: " + sex
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);
		
	}
	
	
	

	
}
