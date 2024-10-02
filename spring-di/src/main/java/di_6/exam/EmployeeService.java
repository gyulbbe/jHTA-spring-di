package di_6.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private DeptDao deptDao;
	@Autowired
	private EmpDao empDao;
	@Autowired
	private JobDao jobDao;
	
	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}
	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}
	public void setJobDao(JobDao jobDao) {
		this.jobDao = jobDao;
	}
	
	public EmployeeService() {
		System.out.println("EmployeeService생성자 메소드 실행");
	}
}
