package hw5Q3Constructor;

public class Student {
	public String stName;
	public int stID;
	public char sex;
	public boolean stProgrammer;
	public float grade;

	public Student() {
		System.out.println("This is from default constructor of studenta class");

	}

	public Student(String stName, int stID, char sex, boolean stProgrammer, float grade) {
		super();
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.stProgrammer = stProgrammer;
		this.grade = grade;
		System.out.println("Student name:" + stName + ",ID:" + stID + ",Sex:" + sex + ",Grade:" + grade
				+ ",Java Programmer:" + stProgrammer);
	}

}
