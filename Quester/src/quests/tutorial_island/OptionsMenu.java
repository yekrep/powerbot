package quests.tutorial_island;
import org.powerbot.script.Condition;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Game;
public class OptionsMenu{
	/***/
	static void viewOptions(ClientContext ctx){
		/*"Options menu"*/
		/*"Please click on the flashing spanner icon found at the bottom
		 * right of your screen. This will display your options menu."*/
		if(ctx.game.tab()!=Game.Tab.OPTIONS){
			ctx.game.tab(Game.Tab.OPTIONS);
			Condition.wait(()->ctx.varpbits.varpbit(281)==7,250,5);
		}
		//TODO: consider adjusting and randomizing settings
	}
}
