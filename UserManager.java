
public class UserManager extends User  {

	
	
	
	public void add(User user) {
		
		System.out.println(user.firstName+user.lastName +" " + "isimli kullan�c� eklendi.");
		
	}
	
	
	public void delete(User user) {
		
		
		System.out.println(user.firstName+user.lastName + " " + "isimli kullan�c�n�n kayd� silindi!");
	}
	
	
}

