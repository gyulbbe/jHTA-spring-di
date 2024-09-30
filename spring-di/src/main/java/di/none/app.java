package di.none;

public class app {

	public static void main(String[] args) {
		
		// 회원가입 기능 실행하기
		UserService service = new UserService();
		
		service.회원가입(new User(10,"홍길동","hong@gmail.com"));
	}
}
