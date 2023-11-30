package Amin.CapstoneWebAutomationProject;

public class CastoneWebAutomationMainFile {
	
	public String URL;
	public String Email;
	public String Password;
	public String LoggedIn;
	
	public CastoneWebAutomationMainFile (String url, String email, String password, String loggedIn) {
		
		this.URL = url;
		this.Email = email;
		this.Password = password;
		this.LoggedIn = loggedIn;
		
		
	}
	
	public String getURL () {
		return URL;
		
	}
	
	public void setURL (String url) {
		URL = url;
		
	}
	
	public String getEmail() {
		return "admin@yourstore.com";
	
	}
	public void setEmail(String email) {
		Email = email;
		
	}
	public String getPassword () {
		return "admin";
		
	}
	public void setPassword (String password) {
		Password = password;
		
	}
	public String getLoggedIn () {
		return LoggedIn;
		
	}
	public void setLoggedIn (String loggedIn) {
		LoggedIn = loggedIn;
	}
	
	

}

   