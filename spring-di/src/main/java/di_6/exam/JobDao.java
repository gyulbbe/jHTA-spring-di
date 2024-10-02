package di_6.exam;

import org.springframework.stereotype.Repository;

@Repository
public class JobDao {

	public JobDao() {
		System.out.println("JobDao생성자 메소드 실행");
	}
}
