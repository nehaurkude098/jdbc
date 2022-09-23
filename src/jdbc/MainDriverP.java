package jdbc;

public class MainDriverP {

	public static void main(String[] args) {
		StudentPojo s = new StudentPojo();
		s.setId(10);
		s.setName("nita");
		s.setPhoneNo(9746647478l);
		s.setAddress("mumbai");
		s.setPin(655400);
		Dao d = new Dao();
		d.saveStudent(s);

	}
}