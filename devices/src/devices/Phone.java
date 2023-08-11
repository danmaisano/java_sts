package devices;

public class Phone extends Device {

	public Phone() {
	
	}
	public void makeACall() {
		this.setBatteryLife(getBatteryLife() -5);
		System.out.println("Making a phone call decreased battery life by 5%");
		if (this.getBatteryLife() <= 10) {
			batteryCritical();
		}
	}
	public void playAGame() {
		if (this.getBatteryLife() < 25) {
			System.out.println("You can't play a game until you charge your phone");
			return;
		}
		this.setBatteryLife(getBatteryLife() -20);
		System.out.println("Playing a game decreased battery life by 20%");
		if (this.getBatteryLife() <= 10) {
			batteryCritical();
		}
	}
	public void chargePhone() {
		this.setBatteryLife(getBatteryLife() +50);
		if (this.getBatteryLife() > 100) {
			setBatteryLife(100);
		}
		System.out.println("Charging your phone increased battery life by 50%, up to 100% maximum");
	}
	
	public void batteryCritical() {
		System.out.println("Your battery is at " + this.getBatteryLife() + ". Please charge your phone before you continue using it.");
	}

}
