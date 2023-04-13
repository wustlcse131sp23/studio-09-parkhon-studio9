package assignment7;

//TODO: Copy a working Student class from Assignment 7 over this file.
public class Student {
	private String firstName;
	private String lastName;
	private int studentID;
	private int attemptedCredits;
	private int passingCredits;
	private double totalGrade;
	private double bearBucks;

	
	public Student(String initfirst, String initlast, int initID) {
		firstName = initfirst;
		lastName = initlast;
		studentID = initID;
		bearBucks = 0;	
		
		attemptedCredits = 0;
		passingCredits = 0;
		totalGrade = 0;
	}
	
	// Returns the first and last names with a space between them.
	public String getFullName() {
		return firstName + " " + lastName;
	}

	// Returns the student id number.
	public int getId() {
		return studentID;
	}
	
	// Returns the number of attempted credits
	public int getTotalAttemptedCredits() {
		return attemptedCredits;
	}
	
	// Returns the number of passing credits
	public int getTotalPassingCredits() {
		return passingCredits;
	}

	// Calculate and Return GPA
	public double calculateGradePointAverage() {
			return totalGrade/attemptedCredits;
		}
	
	// Takes in a course grade and the number of credits for a course, and updates the student’s credits and GPA points accordingly.
	public void submitGrade(double grade, int credits) {
		attemptedCredits += credits;
		if (grade >= 1.7)
			passingCredits += credits;
		
		totalGrade += credits * grade;
	}
	
	// Returns the students class standing based on how many passing credits they have
	public String getClassStanding() {
		if (passingCredits < 30)
			return "First Year";
		
		else if (passingCredits < 60)
			return "Sophomore";
		
		else if (passingCredits < 90)
			return "Junior";
		
		else 
			return "Senior";
	}
	
	// Returns if the students eligible for Phi Beta Kappa
	public boolean isEligibleForPhiBetaKappa() {
		if (attemptedCredits >= 98 && this.calculateGradePointAverage() >= 3.6)
			return true;
		
		else if (attemptedCredits >= 75 && this.calculateGradePointAverage() >= 3.8)
			return true;
		
		else 
			return false;
	}
	
	
	// Increases the Bear Bucks
	public void depositBearBucks(double amount) {
		bearBucks += amount;
	}
	
	// Decreases the Bear Bucks
	public void deductBearBucks(double amount) {
		bearBucks -= amount;
	}
	
	// Returns the Bear Bucks balance
	public double getBearBucksBalance() {
		return bearBucks;
	}
	
	// Zero out the Bear Bucks balance and return the appropriate amount
	public double cashOutBearBucks() {
		double returnValue = 0;
		
		if (bearBucks >= 10) 
			returnValue = bearBucks - 10;
		
		bearBucks = 0;
		return returnValue;
	}
	
	
	// Newly-created legacy
	public String getLastName() {
		return lastName;
	}
	public Student createLegacy(String firstName, Student otherParent, boolean isHyphenated, int id) {
		String lastname1 = this.getLastName();
		String lastname2 = otherParent.getLastName();
		String lastname = "";
		
		if (isHyphenated == true) {
			lastname = lastname1 + "-" + lastname2;
		}
		else {
			lastname = lastname1;
		}
		
		double bb1 = this.cashOutBearBucks();
		double bb2 = otherParent.cashOutBearBucks();
		
		Student legacy = new Student(firstName, lastname,id);
		legacy.depositBearBucks(bb1+bb2);
		
		return legacy;
	}
	
	// Returns the students full name and student ID
	public String toString() {
		return  firstName + " " + lastName + " " + studentID;
	}
	
	
}