package di_1.none;

public class UserService {

	/*
	 * UserService객체는 UserDao객체를 사용한다.(의존한다.)
	 * 1. UserService객체에는 UserDao객체를 참조하는 참조변수가 필요하다.
	 * 2. 의존하는 객체를 획득(생성)할 책임이 UserService에 있다.
	 * 
	 * 	  아래와 같이 UserDao객체를 직접 생성하고, 참조변수로 참조한다.
	 * 
	 * UserService객체가 UserDao2객체를 사용하는 것으로 변경되었다
	 * 	1. UserService 객체는 UserDao 타입의 참조변수를 UserDao2타입의 참조변수로 변경한다
	 *  2. UserDao객체를 생성하는 대신 UserDao 2 개체를 생성하는 코드로 수정한다.
	 *  User Dao와 UserDao2는 사용방법이 통일되지 않았기 때문에 실행코드로 전부 수정한다.
	 */
//    UserDao userDao = new UserDao();
	UserDao2 userDao = new UserDao2();
	
	public void 회원가입(User user) {
		System.out.println("UserService객체의 회원가입() 실행됨");
		userDao.addsertUser(user);
	}
	
	public void 회원탈퇴(int no) {
		System.out.println("UserService객체의 회원탈퇴() 실행됨");
		userDao.removeUser(no);
	}
}
