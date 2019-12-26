package scripts;
import org.powerbot.script.PollingScript;
import org.powerbot.script.Script;
import org.powerbot.script.rt4.ClientContext;
import quests.tutorial_island.TutorialIsland;

import java.util.*;

@Script.Manifest(
		name = "AIO OSRS Quester",
		properties="author=Yekrep;",
		description="Completes quests efficiently")
public class AOQ extends PollingScript<ClientContext>{
	private List<Task> taskList=new ArrayList<>();
	@Override
	public void start(){
		taskList.add(new TutorialIsland(ctx));
		/*taskList.addAll(Arrays.asList(
				new TutorialIsland(ctx),
				new ... ))*/
	}
	@Override
	public void poll(){
		for(Task task:taskList){
			if(task.activate()){
				task.execute();
			}
		}
	}
}
