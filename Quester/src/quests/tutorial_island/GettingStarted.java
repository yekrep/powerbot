package quests.tutorial_island;
import org.powerbot.script.Condition;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Npc;
public class GettingStarted{
	/***/
	static void talkToGielinorGuide(ClientContext ctx){
		/*"Getting started"*/
		/*"Before you begin, have a read through the controls guide in the
		 * top left of the screen. When you're ready to get started, click on
		 * the Gielinore Guide. He is indicated by the flashing yellow arrow."*/
		if(ctx.widgets.component(219,1,0).text().contains("What's your experience")){
			for(int i=1;i<=3;i++){
				if(ctx.widgets.component(219,1,i).text().contains("experienced")){
					ctx.input.send(String.valueOf(i));
					Condition.wait(()->ctx.varpbits.varpbit(281)==3,250,5);
				}
			}
		}else{
			if(ctx.widgets.component(229,1).text().contains("To answer")
					||ctx.widgets.component(231,2).text().equals("Gielinor Guide")){
				ctx.input.send(" ");
				/*add wait condition*/
			}else{
				if(ctx.widgets.component(263,1,0).text().contains("click on the Gielinor Guide")){
					Npc gielinorGuide=ctx.npcs.select().id(3308).nearest().poll();
					if(gielinorGuide.inViewport()){
						gielinorGuide.interact("Talk-to");
						/*Condition.wait(()->);*/
					}else{
						ctx.camera.turnTo(gielinorGuide);
						Condition.wait(gielinorGuide::inViewport,250,5);
					}
				}
			}
		}
	}
}
/**/
/**/

/*Gielinor Guide*/
/*"Greetings! I see you are a new arrival to the world of
 * Gielinor. My job is to welcome all new visitors. So
 * welcome!"*/

/**/
/*"You have already learned the first thing needed to
 * succeed in this word: talking to other people!"*/

/**/
/*"You will find many inhabitants of this world have useful
 * things to say to you. By clicking on them you can talk
 * to them."*/

/**/
/*"Before we get going, if you could be so kind to let me
 * know how much experience you have with Old School
 * Runescape, that would be wonderful!"*/

/*"To answer, simply click your chosen answer on the following screen."*/

/*I am an experienced player.
 * I am brand new! This is my first time here.
 * I've played in the past, but not recently.*/