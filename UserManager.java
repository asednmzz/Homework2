
public class UserManager extends User  {

	
	
	
	public void add(User user) {
		
		System.out.println(user.firstName+user.lastName +" " + "isimli kullanýcý eklendi.");
		
	}
	
	
	public void delete(User user) {
		
		
		System.out.println(user.firstName+user.lastName + " " + "isimli kullanýcýnýn kaydý silindi!");
	}
	
	
}

