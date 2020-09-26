package passing.arguments;

public class Students {
public void getStudentInfo(int id) {
	System.out.println("Student ID:"+ id );

}
public void getStudentInfo(int id,String name) {
	System.out.println("Student ID :" + id);
	System.out.println("Name:"+ name);

}
public void getStudentInfo(String email,long phoneNumber) {
	System.out.println("Student email:"+ email);
System.out.println("Phone number:"+ phoneNumber);
}

	public static void main(String[] args) {
		Students stud=new Students();
		stud.getStudentInfo(12);
		stud.getStudentInfo(12, "Mritha");
		stud.getStudentInfo("mritha@yahoo.com", 213123123);
		
		
	}

}
