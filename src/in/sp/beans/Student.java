package in.sp.beans;



public class Student {
   
	private Ad name;
	private int roll;
	private String email;

//public void setName(Ad name) {
//		this.name = name;
//	}
//public void setRoll(int roll) {
//		this.roll = roll;
//	}
//public void setEmail(String email) {
//		this.email = email;
//	}
	
	public Student(Ad name, int roll, String email) {
		this.name = name;
		this.roll = roll;
		this.email = email;
	}
	
public void display() {
		System.out.println("Name"+name);
		System.out.println("Roll"+roll);
		System.out.println("Email"+email);
		}


}
