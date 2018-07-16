package Animal;

public class Bird extends Animal{
	
private int ants;
	
	Bird (String n) {
    	super (n);    	
    }
    
    Bird (String n, int w, int a, int t) {
    	super (n, w, a);
    	ants = t;
    }
    
	public int getAnts() {
		return ants;
	}

	public void setAnts(int ants) {
		this.ants = ants;
	}

	public void show () {
		System.out.println ("Вес "+ getWeight()+ "  Возраст "+ getAge()+ "  Имя "+ getName());
		System.out.println();
	}
}


