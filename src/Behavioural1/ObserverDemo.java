package Behavioural1;

public class ObserverDemo {
	
	public static void main(String[] args) {
		Subject subject=new MessageStream();
		
		PhoneClient phoneClient=new PhoneClient(subject);
		
		phoneClient.addMessage("here is a message");
	}

}
