package jdbc1practice;

public class mainPhone {

	public static void main(String[] args) {
		Phone p=new Phone();
		p.setImei(154645);
		p.setBrand("samsung");
		p.setSize(6);
		p.setPrice(40000);
		PhoneDao pd=new PhoneDao();
		pd.savePhoneDetails(p);
	}

}
