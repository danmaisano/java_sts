
public class Gorilla extends Mammal {
	
	public Gorilla () {
		
	}
	
	public void throwSomething() {
		if(this.getEnergy() < 5) {
			System.out.println("Not enough energy to throw something! Must feed on more bananas first.");
		}
		this.setEnergy(getEnergy()-5);
		System.out.println("The gorilla threw something!");
	}
	
	public void eatBananas() {
		this.setEnergy(getEnergy()+10);
//		if (this.getEnergy() > 100) { // thought maybe 100% was cap, but maybe not?
//			this.setEnergy(100);
//		}
		System.out.println("The gorilla is satisfied with his banana!");
	}
	public void climbTree() {
		if(this.getEnergy() < 10) {
			System.out.println("Not enough energy to climb! Must feed on more bananas first.");
		}
		this.setEnergy(getEnergy()-10);
		System.out.println("The gorilla has climbed a tree!");
	}
}
