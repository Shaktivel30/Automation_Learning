package Encapsulation_practise;

class student {

	private String studentname;
	private int studage;

	public void setstudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getstudentname() {
		return studentname;
	}

	public void setstudage(int studage) {
		this.studage = studage;
	}

	public int getstudage() {
		return studage;
	}

}

public class prmg1 {

	public static void main(String[] args) {
		student s = new student();
		s.setstudentname("shakthi");
		System.out.println(s.getstudentname());

		s.setstudage(30);
		System.out.println(s.getstudage());

	}

}
