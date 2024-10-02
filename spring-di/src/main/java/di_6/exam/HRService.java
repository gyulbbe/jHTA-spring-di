package di_6.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HRService {

	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private DeptService deptService;
	@Autowired
	private JobService jobService;
	
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	public void setDeptService(DeptService deptService) {
		this.deptService = deptService;
	}
	public void setJobService(JobService jobService) {
		this.jobService = jobService;
	}
	
	public HRService() {
		System.out.println("HRService 생성자메소드 실행");
	}
}
