package Animal;

public class Animal {
	private int weight;
	private int age;
	private String name;
	
	public Animal () {
				
	}
	
	public Animal (String n, int w, int a) {
		weight = w;
		age = a;
		name = n;		
	}
	
	public Animal (String n) {
		name = n;		
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
