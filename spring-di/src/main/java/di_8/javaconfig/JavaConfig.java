package di_8.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "di_8.javaconfig")
public class JavaConfig {
	
	// 어노테이션을 사용하여 스캔할 수 없을 때
	// 예를들어 라이브러리(내가 수정할 수 없는 코드) 기능을 쓰고 싶을 때
	@Bean
	public MyDao myDao() {
		return new MyDao();
	}
	
	@Bean
	public MyService myService(MyDao myDao) {
		MyService service = new MyService();
		service.setMyDao(myDao);
		
		return new MyService();
	}
	
	/*
	@Bean
	public MyService myService(MyDao myDao) {
		System.out.println("@Bean 쪽에서 본 " + myDao);
		return new MyService();
	}
	*/
	
	@Bean
	public MeService meService(MyDao myDao) {
		MeService meService = new MeService();
		meService.setMyDao(myDao);
		
		return meService;
	}
}
