package nov24;

public class Student {
	private int sno;
	private String name;
	private double fee;

	public Student(int sno, String name, double fee) {
		super();
		this.sno = sno;
		this.name = name;
		this.fee = fee;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", fee=" + fee + "]";
	}

}
