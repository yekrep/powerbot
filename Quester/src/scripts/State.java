package scripts;

interface State{
	void enter();		//actions executed one time when state is reached
	void update();		//actions executed on "every frame"
	void exit();		//actions executed one time before leaving the state
	State transition();	//handles events and conditions that would cause a transition to a different state
}

/*abstract class State{
	//possibly better implemented as an interface
	abstract void entryActions();	//actions executed one time when state is reached
	abstract void duringActions();	//actions executed on "every frame"
	abstract void exitActions();	//actions executed one time before leaving the state
	abstract State ();	//handles events and conditions that would cause a transition to a different state
}*/
