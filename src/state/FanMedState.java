package state;

public class FanMedState extends State {
	
	private Fan fan;

	public FanMedState(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void handleRequest() {
		System.out.println("Turning fan on to low");
		fan.setState(fan.getFanMediumState());
	}

	@Override
	public String toString() {
		return "Fan is low";
	}

}
