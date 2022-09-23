package jdbc1practice;

public class mainEmp {

	public static void main(String[] args) {
		EmpDao ed = new EmpDao();
//		Employee e1=ed.getDetailsByFloor(4);
//		System.out.println(e1.getName());
//		System.out.println(e1.getId());
//		System.out.println(e1.getPhone());
//		System.out.println(e1.getFloor());
//		System.out.println(e1.getBranch());
//	}
		boolean b = ed.getDetailsByFloorExecute(4);
		System.out.println(b);
	}

}
