
public class StudentV2 extends Student
{

	private int marks;
	
	public StudentV2(int rollno, String name, int marks) {
		super(rollno, name);
		this.marks = marks;
	
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentV2 [marks=" + marks + "]";
	}
	
	
	
}
