package capsuel.human;

public class HumanCapsuel {
	private String name;
	private int age;
	
	public HumanCapsuel(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
}
