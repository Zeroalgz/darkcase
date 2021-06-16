
public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		Instructor teacher = new Instructor();
		teacher.setId(1);
		student.setId(23);
		UserManager userManager = new UserManager();
		User[] users = {teacher,student};
		userManager.addMultiple(users);
		
		
		
	}

}
