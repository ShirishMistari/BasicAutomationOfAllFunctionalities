package Practice1;
class enn{
	private int  pass=123433,otp=12243;
	String username="mistari";
	public void setPassword(int passs) {
		pass=passs;
	}
	public int getPassword() {
		return pass;
	}
	public void setUsername(String usernamee) {
		username=usernamee;
	}
	public String getUsername() {
		return username;
	}
	public void setOTP(int otpp) {
		otp=otpp;
	}
	public int getOTP() {
		return otp;
	}
}
public class Encapsulation3 {
	public static void main(String[] args) {
		enn obj = new enn();
		// obj.setPassword(1208);
		System.out.println("Your Password is :"+obj.getPassword());
		// obj.setUsername("Shirish Mistari");
		System.out.println("Your Username is :"+obj.getUsername());
		// obj.setOTP(10215);
		System.out.println("Your OTP is :"+obj.getOTP());
		obj.setUsername("Shirish Mistari");
		System.out.println("Your new Username is :"+obj.getUsername());
		obj.setPassword(888555222);
		System.out.println("Your new password is :"+obj.getPassword());
		obj.setOTP(745478);
		System.out.println("Your new OTP is :"+obj.getOTP());
	}
}
