package di_6.exam;

import org.springframework.stereotype.Repository;

@Repository
public class EmpDao {

	public EmpDao() {
		System.out.println("EmpDao생성자 메소드 실행");
	}
}
