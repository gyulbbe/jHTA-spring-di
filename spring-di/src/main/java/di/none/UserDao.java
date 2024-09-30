package di.none;

public class UserDao {

	public void insertUser(User user ) {
		System.out.print("UserDao의 insertUser()메서드 실행됨");
		System.out.println(user.getNo()+","+user.getName()+","+user.getEmail());
	}
	
	public void deleteUser(int no) {
		System.out.print("UserDao의 deleteUser()메서드 실행됨");
		System.out.print(no);
	}
}
