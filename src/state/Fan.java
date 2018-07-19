package state;

import java.util.Collections;
import java.util.Comparator;

public class Fan {
	
	State fanOffState;
	State fanLowState;
	State fanMedState;
	
	State state;

	public Fan() {
		fanOffState =new FanOffState(this);
		fanLowState= new FanOffState(this);
		fanMedState =new FanMedState(this);
	}
	
	public void pullchain(){
		state.handleRequest();
	}
	public String toString(){
		return state.toString();
	}
	
	
	

	public State getFanLowState() {
		
		return fanOffState ;
	}

	public void setState(State state) {
		// TODO Auto-generated method stub
		this.state=state;
		
	}

	public State getFanMediumState() {
		// TODO Auto-generated method stub
		return fanMedState;
	}
	
	public static void main(String[] args) {
		
		Collections.sort(peopleList, new Comparator<Personclass>() {
			
			if(p1.getAge()>p2.getAge())
				return 1;
			else 
				return -1;
		});
		
		Collections.sor
	}
	
	  

}
