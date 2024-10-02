package di_8.javaconfig;

import org.springframework.stereotype.Repository;

@Repository
public class BookDao {

	public BookDao() {
		System.out.println("BookDao객체 생성자 메소드 실행");
	}
}
