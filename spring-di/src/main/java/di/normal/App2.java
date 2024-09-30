package di.normal;

import di.none.User;

public class App2 {
	public static void main(String[] args) {
	
		UserService2 service = new UserService2();
		service.회원가입(new User(1,"김유신","kim@gamil.com"));
	}
}
