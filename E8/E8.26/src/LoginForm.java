
public class LoginForm {
	private String username;
	private String password;
	private String currentUsername;
	private String currentPassword;
	private boolean logged;
	private boolean firstInput;
	
	public LoginForm(String username, String password)
	{
		this.username = username;
		this.password = password;
		this.logged = false;
		this.firstInput = true;
	}
	
	public void input(String text)
	{
		if (!loggedIn()) // 로그인 되지 않은 경우에만 입력가능
		{
			if (this.firstInput)
			{
				this.currentUsername = text; // id 입력
				firstInput = false;
			}
			else
			{
				this.currentPassword = text; // password 입력
			}
		}
	}
	
	private boolean CheckLogin()
	{
		if (!this.username.equals(currentUsername) || !this.password.equals(currentPassword))
		{
			System.out.println("User is not logged in.");
			return false;
		}
		else
		{
			System.out.println("User is logged in.");
			return true;
		}
	}
	
	public void click(String button)
	{
		if (button.equals("Submit"))	// submit인 경우
		{
			logged = CheckLogin();
		}
		else if (button.equals("Reset")) // reset인 경우
		{
			reset();
		}
	}
	
	private void reset()
	{
		this.currentUsername = "";
		this.currentPassword = "";
		this.logged = false;
		this.firstInput = true;
	}
	
	public boolean loggedIn()
	{
		return logged;
	}
}
