
public class Understanding_StrLen {

	public static void main(String[] args) {
		String email= "name@domain.ext";
		int count = 0;
		if(email.indexOf("@") > -1){
			String domain = email.substring(14,0);
			System.out.println(domain);
		}else{
			System.out.println("not a valid email!");
		}
		int len = email.length();
		
		System.out.println(len);
		
	}
}