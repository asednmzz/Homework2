
public class Main {

	public static void main(String[] args) {
	User ase=new User();
	
   ase.setId(1);
   ase.setFirstName("Asl�can");
   ase.setLastName("D�nmez");
   
   Instructor instructor=new Instructor();
	instructor.setId(4);
	instructor.setFirstName("Engin");
	instructor.setLastName("Demiro�");		
	
	UserManager userManager=new UserManager();
	userManager.add(ase);
	userManager.delete(ase);
	
	
	
	InstructorManager instructorManager=new InstructorManager();
	instructorManager.add(instructor);
	
	
	
	StudentManager studentManager=new StudentManager();
	studentManager.add(ase);
	
	
	
	
	
	}

}
