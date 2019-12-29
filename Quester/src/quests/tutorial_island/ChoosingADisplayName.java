package quests.tutorial_island;
import java.util.List;
import org.powerbot.script.Random;
import org.powerbot.script.Condition;
import org.powerbot.script.rt4.ClientContext;
import static quests.tutorial_island.RandomNameGenerator.generateRandomName;
import static quests.tutorial_island.TutorialIsland.DISPLAY_NAME;
import static quests.tutorial_island.TutorialIsland.APPEARANCE;
class ChoosingADisplayName{
	private static int attempt=0;
	private static int variation=0;
	private static List<String> displayName=generateRandomName();//todo: consider making this a local var if possible
	/***/
	static void randomizeName(ClientContext ctx){
		/*"Choosing a display name"*/
		/*"Before you get started you'll need a unique display name. Please
		 * follow the instructions on the open interface to look up names you
		 * might like, or to choose a suggested one."*/
		final int MAX_ATTEMPTS=3;//maximum calls to generateRandomName()
		final int CHAT_INPUT=162;//widget id
		final int ENABLED=1040;//texture id
		/*"Choose display name"*/
		/*"In order to play Old School Runescape, you must select a
		 * unique display name for your character.
		 * This may be changed at a later stage."*/
		ctx.components.select(DISPLAY_NAME).text("Set name").texture(ENABLED);
		if(ctx.components.isEmpty()){
			/*"Please enter a name to see whether is it available."*/
			if(variation==displayName.size()){
				displayName=generateRandomName();
				variation=0;
				attempt++;
			}
			if(attempt==MAX_ATTEMPTS){
				/*"Sorry, this display name is not available.
				 * Try clicking one of our suggestions, instead:"*/
				//todo: this is hardcoded, find a better implementation
				int c=ctx.components.select(DISPLAY_NAME).textContains("Sorry").poll().index();
				ctx.widgets.component(DISPLAY_NAME,c+Random.nextInt(2,5)).interact("Set name");
			}
			else{
				ctx.components.select(DISPLAY_NAME).text("Look up name").texture(ENABLED);
				if(!ctx.components.isEmpty()){
					ctx.components.poll().interact("Look up name");
					Condition.wait(()->ctx.components.select(CHAT_INPUT).textContains("Please pick").poll().visible());
				}
				ctx.components.select(CHAT_INPUT).visible();
				if(!ctx.components.isEmpty()){
					/*"Please pick a unique display name (up to 12 characters)"*/
					ctx.input.send(displayName.get(variation++));
					ctx.input.send("{VK_ENTER}");
				}
			}
			Condition.wait(()->ctx.components.select(DISPLAY_NAME).text("Look up name").texture(ENABLED).isEmpty());
			Condition.wait(()->!ctx.components.select(DISPLAY_NAME).text("Look up name").texture(ENABLED).isEmpty());
		}
		else{
			/*"Great! This display name is available!"*/
			//TODO uncomment this// ctx.components.poll().interact("Set name");
			Condition.wait(()->!ctx.components.select(APPEARANCE).isEmpty());
		}
	}
}
