package studio9;

import java.util.HashMap;
import java.util.Map;
import assignment7.Student;

public class UniversityDatabase {
	//TODO: Complete this class according to the studio instructions
 
	private final Map<String,Student> database = new HashMap<>();;
	

	public void addStudent(String accountName, Student aStudent) {
		database.put(accountName, aStudent);
	}

	public int getStudentCount() {
		return database.size();
	}

	public String lookupFullName(String accountName) {
		String name = null;
		if (database.get(accountName) != null)
		{
		name = database.get(accountName).getFullName();
		}
	
		return name;
	}
	public double getTotalBearBucks() {
		double count = 0;
		for (String each:database.keySet())
		{
			count += database.get(each).getBearBucksBalance();
		}
		return count;
		
		
		
	}
}
