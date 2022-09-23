package jdbc;

public class MainStudents {

	public static void main(String[] args) {
		StudentsDao dao=new StudentsDao();
		Students s1=dao.getDetails(1);
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getAddress());
		System.out.println(s1.getPhoneNo());
		System.out.println(s1.getPin());
	}

}
