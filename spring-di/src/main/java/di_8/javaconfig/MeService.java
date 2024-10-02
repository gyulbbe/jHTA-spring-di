package di_8.javaconfig;

public class MeService {

	private MyDao myDao;
	
	public void setMyDao(MyDao myDao) {
		this.myDao = myDao;
		System.out.println("MeService객체의 setMyDao() 메소드 실행됨");
		System.out.println("MeService객체의 setMyDao() 메소드가 주입받은 myDao: " + myDao);
	}
	
	public MeService() {
		System.out.println("MeService객체의 생성자 메소드 실행됨");
	}
}
