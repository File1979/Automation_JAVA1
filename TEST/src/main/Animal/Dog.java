package Animal;

public class Dog extends Animal{
	
	private int cats;
	
	Dog (String n) {
    	super (n);    	
    }
    
    Dog (String n, int w, int a, int c) {
    	super (n, w, a);
    	cats = c;
    }
    
	public int getCats() {
		return cats;
	}

	public void setCats(int cats) {
		this.cats = cats;
	}

	public void show () {
		System.out.println ("Вес "+ getWeight()+ "  Возраст "+ getAge()+ "  Имя "+ getName());
		System.out.println();
	}
}