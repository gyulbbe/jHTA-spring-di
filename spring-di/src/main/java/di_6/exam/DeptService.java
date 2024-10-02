package di_6.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptService {

	@Autowired
	private DeptDao deptDao;
	@Autowired
	private EmpDao empDao;
	
	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}
	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}
	
	public DeptService() {
		System.out.println("DeptService생성자 메소드 실행");
	}
}
