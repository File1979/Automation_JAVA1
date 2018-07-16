package Animal;

public class Cat extends Animal{
	
	private int mouse;
  
    
    Cat (String n) {
    	super (n);    	
    }
    
    Cat (String n, int w, int a, int m) {
    	super (n, w, a);
    	mouse = m;
    }
    
	public int getMouse() {
		return mouse;
	}

	public void setMouse(int mouse) {
		this.mouse = mouse;
	}

	public void show () {
		System.out.println ("Вес "+ getWeight()+ "  Возраст "+ getAge()+ "  Имя "+ getName());
		System.out.println();
	}

}
