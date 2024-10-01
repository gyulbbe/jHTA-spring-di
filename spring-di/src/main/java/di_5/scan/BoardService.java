package di_5.scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

	@Autowired
	private BoardDao boardDao;
	
	@Autowired
	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
		System.out.println("BoardService의 setBoardDao() 메소드 실행됨");
		System.out.println("BoardService의 setBoardDao() 메소드의 매개변수로 전달됟 객체: " + boardDao);
	}
	
	public BoardService() {
		System.out.println("BoardService의 생성자 메소드 실행됨");
	}
	
	public void 게시글등록(String title, String content) {
		System.out.println("BoardService의 게시글등록() 메소드 실행");
		boardDao.insert(title, content);
	}
}
