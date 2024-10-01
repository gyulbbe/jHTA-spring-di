package di_2.loose;

import di_1.none.User;

public class UserService1 {

	/*
	 * UserService1은 IUserDao 인터페이스에 의존한다.
	 * 1. IUserDao 타입의 참조변수를 선언한다.
	 * 2. IUserDao 구현객체를 직접 생성해서 참조변수에 대입한다.
	 * 
	 * UserService은 IUserDao 인터페이스에 의존하기 때문에
	 * UserDaoOracle객체, UserDaomySQL객체 중 아무 객체나 사용할 수 있다.
	 * 즉 UserService1은 UserDaoOracl과 느슨하게 결합한다.
	 * 		UserService1은 UserDaoMySql과 느슨하게 결합된다. 
	 */
	
//	UserDaoOracle userDao1 = new UserDaoMySQL();
//	IUserDao	  userDao1 = new UserDaoOracle();
	IUserDao	  userDao1 = new UserDaoMySQL();
	
	public void 회원가입(User user) {
		System.out.println("UserService1객체의 회원가입()실행됨");
		userDao1.insertUser(user);
	}
	
	public void 회원탈퇴(int no) {
		System.out.println("UserService1객체의 회원탈퇴()");
		userDao1.deleteUser(no);
	}
}
