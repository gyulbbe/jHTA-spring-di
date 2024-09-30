package di.loose;

import di.none.User;

/*
 * 사용자 정보 CRUD 기능에 대한 표준을 정의한 인터페이스다. 
 */
public interface IUserDao {

	void insertUser(User user);
	void deleteUser(int no);
	}
