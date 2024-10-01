package di_5.scan;

import org.springframework.stereotype.Repository;

@Repository
public class BoardDao {

	public BoardDao() {
		System.out.println("BoardDao의 생성자 메소드 실행됨");
	}
	
	public void insert(String title, String content) {
		System.out.println("BoardDao의 insert() 메소드를 실행");
		System.out.println("title: " + title + " content: " + content);
		System.out.println("BoardDao의 insert() 메소드를 종료");
	}
}
