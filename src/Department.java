
public class Department {
	
	private int depid;
	private String deptname;
	
	
	public Department(int depid, String deptname) {
		super();
		this.depid = depid;
		this.deptname = deptname;
	}
	public int getDepid() {
		return depid;
	}
	public void setDepid(int depid) {
		this.depid = depid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	@Override
	public String toString() {
		return "Department [depid=" + depid + ", deptname=" + deptname + "]";
	}
	

}
