package di.none;

public class UserDao2 {

	public void addsertUser(User user) {
		System.out.println("UserDao2의 addUser() 실행됨");
		System.out.println("user.getNo,"+ ",");
	}
	
	public void removeUser (int no) {
		System.out.println();
		System.out.println(no);
	}
}
