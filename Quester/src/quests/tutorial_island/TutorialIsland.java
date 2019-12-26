package quests.tutorial_island;
import org.powerbot.script.Condition;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Npc;
import scripts.Task;

import static quests.tutorial_island.ChoosingADisplayName.randomizeName;
import static quests.tutorial_island.SettingYourAppearance.randomizeAppearance;
import static quests.tutorial_island.GettingStarted.talkToGielinorGuide;
import static quests.tutorial_island.OptionsMenu.viewOptions;

/***/
public class TutorialIsland extends Task<ClientContext>{
	public TutorialIsland(ClientContext ctx){
		super(ctx);
	}
	final static int TUTORIAL_ISLAND=281;//varpbit
	final static int DISPLAY_NAME=558;//widget
	final static int APPEARANCE=269;

	/***/
	@Override
	public boolean activate(){
		/*true if tutorial island incomplete*/
		return ctx.varpbits.varpbit(281)!=1000;
	}
	/***/
	@Override
	public void execute(){
		switch(ctx.varpbits.varpbit(TUTORIAL_ISLAND)){
			case 1:
				if(ctx.components.select(DISPLAY_NAME).textContains("Choose display name").poll().visible()){
					/*"Choosing a display name"*/
					/*"Before you get started you'll need a unique display name. Please
					 * follow the instructions on the open interface to look up names you
					 * might like, or to choose a suggested one."*/
					randomizeName(ctx);
					break;
				}
				if(ctx.components.select(APPEARANCE).textContains("Welcome to RuneScape").poll().visible()){
					/*"Setting your appearance"*/
					/*"Before you get started, you'll need to se the appearance of your
					 * character. Please use the open interface to set your appearance."*/
					randomizeAppearance(ctx);
					break;
				}
				break;
			case 2:
				/*"Getting started"*/
				/*"Before you begin, have a read through the controls guide in the
				 * top left of the screen. When you're ready to get started, click on
				 * the Gielinore Guide. He is indicated by the flashing yellow arrow."*/
				talkToGielinorGuide(ctx);
				break;
			case 3:
				/*"Options menu"*/
				/*"Please click on the flashing spanner icon found at the bottom
				 * right of your screen. This will display your options menu."*/
				viewOptions(ctx);
				break;
			case 7:/*Options menu*/
				/*"On the side panel, you can now see a variety of game options
				 * such as screen brightness and music volume. Don't worry about
				 * these too much for now, they will become clearer as you explore
				 * the game. Talk to the Gielinor Guide to continue.*/
				Npc gielinorGuide=ctx.npcs.select().id(3380).nearest().poll();
				if(gielinorGuide.inViewport()){
					gielinorGuide.interact("Talk-to");
					//Condition.wait(()->);
				}
				else{
					ctx.camera.turnTo(gielinorGuide);
					Condition.wait(gielinorGuide::inViewport,250,5);
				}

				//wait for chat "looks like youre making good progress
				//hit space "anyways i'd sya its time for you to go and meet your first instructor
				//hit space or open door
				break;
			case 10:/*Moving on*/
				//open door 9398/9476
				break;
			case 20:/*Talk to Survival Expert*/
				//talk to survival expert 8503
				break;
			case 30:/**/
				//hit space
				//fucked up
				//open inventory tab
				break;
			case 40:/**/
				//interact fishing spot
				//once you catch a shrimp varp goes to 50
				break;
			case 50:/**/
				//open skills tab
			case 60:/*Talk to Survival Expert*/
				//"i managed to catch some shrimp
				//hit space (varp updates here
				//"excellent work...
				//
				break;
			case 70:/*Woodcutting*/
				//interact tree 9730/1570
				//"you manage to cut some logs" (varp 80)
				//(hit space)
				break;
			case 80:/*Firemaking*/
				//use tinderbox 590 on logs ###
				//please wait
				break;
			case 90:/*Cooking*/
				//use raw shrimps ### with fire ###
				//"you manage to cook some shrimp [varp 120](continue)
				break;
			case 120:/*Moving on*/
				//click gate (9708 or 9470)/966
				break;
			case 130:/*Moving on*/
				//click door 9709/9476
				break;
			case 140:/*Cooking*/
				//talk to master chef 3305
				//wait for dialog "welcome newcomer" (space)
				//"i already know how to cook" (space)
				//"HAHAHAHAH" [varp 150] (space)
				//hands you flour and water 1929
				break;
			case 150:/*Making dough*/
				//use flour and water
				//you make some dough [160]
				break;
			case 160:/*Cooking dough*/
				//use dough 2307 on range 9736/1219
				//you manage to bake some bread [170] (continue)
				break;
			case 170:/*Moving on*/
				//door 9710/9476
				break;
			case 200:/*Fancy a run?*/
				//toggle tun [210]
				break;
			case 210:/*Moving on*/
				//long walk to door 9716/9476
				break;
			case 220:/*Quests*/
				//talk to Quest Guide 3312
				//"welcome" [230]
				break;
			case 230:/*Quest journal*/
				//Open quest tab [240]
				break;
			case 240:/*Quest journal*/
				//talk to quest guide "now that you have the journal open" (space)
				//"when you start" (space)
				//"clicking a quest" (space)
				//"if the quest"(space)
				//"its very easy"
				//"the minimap"
				//"the quests themselves"
				//"theres not a lot more" [250]
				break;
			case 250:/*Moving on*/
				//climb-down ladder 9726/1203
				break;
			case 260:/*Mining and Smithing*/


				break;
			default:
				break;
		}
	}
}

