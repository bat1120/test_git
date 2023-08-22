package work0821;

public class EmpVO {
	public int empno;
	public String ename;
	public String hiredate;
	public String job;
	public int sal;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public EmpVO(int empno, String ename, String hiredate, String job, int sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.hiredate = hiredate;
		this.job = job;
		this.sal = sal;
	}
	
	public EmpVO() {
		super();
	}
	
	public EmpVO(int empno) {
		super();
		this.empno=empno;
	}
	
	
}
