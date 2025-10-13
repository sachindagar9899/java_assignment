package interfce;

public class fordevices {
	interface Device {
	    void turnOn();
	    void turnOff();
	}

	static class Light implements Device {
	    public void turnOn() {
	        System.out.println("Light is turned on.");
	    }
	    public void turnOff() {
	        System.out.println("Light is turned off.");
	    }
	}

	static class AC implements Device {
	    public void turnOn() {
	        System.out.println("AC is turned on.");
	    }
	    public void turnOff() {
	        System.out.println("AC is turned off.");
	    }
	}

	static class TV implements Device {
	    public void turnOn() {
	        System.out.println("TV is turned on.");
	    }
	    public void turnOff() {
	        System.out.println("TV is turned off.");
	    }
	}

	
	    public static void main(String[] args) {
	        Device light = new Light();
	        Device ac = new AC();
	        Device tv = new TV();

	        light.turnOn();
	        ac.turnOn();
	        tv.turnOn();

	        light.turnOff();
	        ac.turnOff();
	        tv.turnOff();
	    }
	
}
