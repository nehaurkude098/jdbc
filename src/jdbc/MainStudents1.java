package jdbc;

public class MainStudents1 {

	public static void main(String[] args) {
		StudentsDao dao1=new StudentsDao();
		Students s2=dao1.getDetails(1);
		System.out.println(s2);
	}

}
