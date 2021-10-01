package map.concreteclasses;

public class Student implements java.io.Serializable{

	int sNo;
	String name;
	int whichClass;
	
	public Student(int sNo, String name, int whichClass) {
		
		this.sNo = sNo;
		this.name = name;
		this.whichClass = whichClass;
	}
	
	@Override
	public int hashCode() {
		
		return whichClass;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		//below condition should be presented; else there is a chance of getting claassCastException
		
		if (obj instanceof Student) {
			
			Student s = (Student) obj;
			
			if (this.sNo==s.sNo && this.name.equals(s.name) && this.whichClass == s.whichClass) {
				
				return true;
			}
			
		}
		return false;
	}

	@Override
	public String toString() {
		return "Student [whichClass=" + whichClass + "]";
	}
	
}
