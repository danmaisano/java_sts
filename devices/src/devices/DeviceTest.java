package devices;

public class DeviceTest {

	public static void main(String[] args) {
		Device device1 = new Device();
		System.out.println(device1.getBatteryLife());
		
		Phone phone1 = new Phone();
		phone1.makeACall();
		phone1.makeACall();
		phone1.makeACall();
		phone1.playAGame();
		phone1.playAGame();
		phone1.playAGame();
		phone1.playAGame();
		phone1.playAGame();
		phone1.chargePhone();
		phone1.playAGame();
		System.out.println(phone1.getBatteryLife());
	}

}
