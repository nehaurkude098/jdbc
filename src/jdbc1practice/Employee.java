package jdbc1practice;

public class Employee {
	private int id;
	private String name;
	private Long phone;
	private String role;
	private String branch;
	private int floor;
	
	public Employee(int id, String name, Long phone, String role, String branch, int floor, int i) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.role = role;
		this.branch = branch;
		this.floor = floor;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + ", role=" + role + ", branch=" + branch
				+ ", floor=" + floor + "]";
	}
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
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	

}
