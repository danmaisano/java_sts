
public class MammalTest {

	public static void main(String[] args) {
		
		Gorilla gorilla1 = new Gorilla();
		
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		gorilla1.eatBananas();
		gorilla1.eatBananas();
		gorilla1.climbTree();
		System.out.println(gorilla1.getEnergy());
		
		GiantBat bat1 = new GiantBat();
		
		bat1.attackTown();
		bat1.attackTown();
		bat1.attackTown();
		bat1.eatHumans();
		bat1.eatHumans();
		bat1.fly();
		bat1.fly();
		System.out.println(bat1.getEnergy());
	}

}
