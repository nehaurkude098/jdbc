package jdbc;

public class StudentPojo {
	private int id;
	private String name;
	private long phoneNo;
	private String address;
	private int pin;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "StudentPojo [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + ", address=" + address + ", pin="
				+ pin + "]";
	}
	
	

}
