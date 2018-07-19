package state;

public abstract class State {
	
	public void handleRequest()
	{
		System.out.println("shouldnt be able to get here");
	}

}
