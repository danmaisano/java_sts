
public class GiantBat extends Mammal {

	public GiantBat() {
		this.setEnergy(300);
	}
	
	public void fly() {
		if(this.getEnergy() < 50) {
			System.out.println("Not enough energy to fly! Must feed on more humans first.");
			return;
		}
		this.setEnergy(getEnergy()-50);
		System.out.println("Watch out, the bat is airborne!");
	}
	public void eatHumans() {
		this.setEnergy(getEnergy()+25);
		System.out.println("Someone was not vigilant! The bat fed on them and is feeling very satisfied");
	}
	public void attackTown() {
		if(this.getEnergy() < 100) {
			System.out.println("Not enough energy to attack a town! Must feed on more humans first.");
			return;
		}
		this.setEnergy(getEnergy()-100);
		System.out.println("Giant bat is burninating the people!");
	}
}
