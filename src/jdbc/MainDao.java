package jdbc;

public class MainDao {

	public static void main(String[] args) {
		StudentDao dao=new StudentDao();
	String re=dao.saveStudent(101, "ashi", 9876456778l, "abc", 453663);
		System.out.println(re);
	}

}
