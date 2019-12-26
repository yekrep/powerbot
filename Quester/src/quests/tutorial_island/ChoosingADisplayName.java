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
		/*"Choose display name"*/
		/*"In order to play Old School Runescape, you must select a
		 * unique display name for your character.
		 * This may be changed at a later stage."*/
		if(ctx.components.select(DISPLAY_NAME).textContains("Set name").isEmpty()){

		}
		else{

		}



		/////////////////////////////////////////////////////////////


		/*"Choose display name"*/
		/*"In order to play Old School Runescape, you must select a
		 * unique display name for your character.
		 * This may be changed at a later stage."*/
		if(ctx.components.select(DISPLAY_NAME).textContains(">available").isEmpty()){
		//if(ctx.widgets.component(558,12).text().contains(">available")){
			/*"Great! This display name is available!"*/
			ctx.components.select(DISPLAY_NAME).textContains("Set Name").poll().click();
			//ctx.widgets.component(558,18,9).interact("Set Name");
			//wait for character design widget
			Condition.wait(()->ctx.components.select(APPEARANCE).poll().visible());
			//Condition.wait(()->ctx.widgets.component(269,97).visible());
		}
		else{
			//If you have attempted all variations of your display name
			if(variation==displayName.size()){
				//and tried 5 different display names
				if(attempt>=5){
					//as a last resort, use a random Jagex suggested name
					ctx.widgets.component(DISPLAY_NAME,14+Random.nextInt(0,3)).interact("Set name");
				}
				//otherwise, try an entirely different display name
				else{
					displayName=generateRandomName();
					variation=0;
					attempt++;
				}
			}
			else{
				/*"Please enter a name to see whether is it available."*/
				//or
				/*"Sorry, this display name is not available.
				 * Try clicking one of our suggestions, instead:"*/
				//Try looking up a variation of the display name
				if(!ctx.widgets.component(162,44).visible()){
					/*"Choosing a display name"*/
					/*"Before you get started you'll need a unique display name. Please
					 * follow the instructions on the open interface to look up names you
					 * might like, or to choose a suggested one."*/
					ctx.widgets.component(DISPLAY_NAME,17,9).interact("Look up name");
					Condition.wait(()->ctx.widgets.component(162,44).visible(),100,50);
				}
				if(ctx.widgets.component(162,44).visible()){
					/*"Please pick a unique display name (up to 12 characters)"*/
					ctx.input.send(displayName.get(variation++));
					ctx.input.send("{VK_ENTER}");}}
			//Wait for name look up results,
			//the button turns grey when a query is sent and turns back to orange when a result is returned
			Condition.wait(()->ctx.widgets.component(558,17,9).textColor()==0x7f7f7f,250,5);
			Condition.wait(()->ctx.widgets.component(558,17,9).textColor()==0xff981f,250,5);
		}
	}
}
