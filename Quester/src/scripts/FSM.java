package scripts;
import java.util.Stack;
class FSM{
	FSM(){
		//set default state here
		//currentState.push(new PlaceholderDefaultState());//possible implementation
	}
	void update(){
		State nextState=currentState.peek().transition();
		if(nextState!=null){
			currentState.peek().exit();
			currentState.push(nextState);
			currentState.peek().enter();
		}
		currentState.peek().update();
	}
	private Stack<State> currentState; //possible implementation
}

