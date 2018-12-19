package Pojo;

public class User {

	 private int id;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private String name;
	 private int age;
	 
	 public User(){
	 }

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	
}
