package jdbc1practice;

import java.util.ArrayList;
import java.util.List;

public class MainEmp1 {

	public static void main(String[] args) {
		List<Employee> ls=new ArrayList();
		Employee employee = new Employee(8, "ajit", 9876899769l, "er", "IT", 2, 3);
		Employee employee1 = new Employee(9, "ashnita", 9876899767l, "er", "IT", 2, 3);
		Employee employee2 = new Employee(10, "vishali", 9876899769l, "er", "IT", 2, 3);
		Employee employee3 = new Employee(11, "ashu", 9876896769l, "er", "IT", 2, 3);
		Employee employee4 = new Employee(12, "akshata", 9875999769l, "er", "IT", 2, 3);
		ls.add(employee);
		ls.add(employee1);
		ls.add(employee2);
		ls.add(employee3);
		ls.add(employee4);
		System.out.println(ls);
	}
}
