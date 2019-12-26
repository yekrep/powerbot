package quests.tutorial_island;
import org.powerbot.script.Random;
import org.powerbot.script.Condition;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Interactive;
import java.util.*;
public class SettingYourAppearance{
	/*TODO: move gender selection to tutorial island script in order to incorporate it in the name generation
	TODO: manual selection of design and colour*/
	//this map contains all the design options for each body part
	static private Map<String,List<List<String>>> design=new HashMap<String,List<List<String>>>(){{
		put("head", new ArrayList<List<String>>(){{
			add(new ArrayList<String>(){{//male
				add("Bald");
				add("Dreadlocks");
				add("Long");
				add("Medium");
				add("Tonsure");
				add("Short");
				add("Cropped");
				add("Wild spikes");
				add("Spikes");
				add("Mohawk");
				add("Wind braids");
				add("Quiff");
				add("Samurai");
				add("Princely");
				add("Curtains");
				add("Long curtains");
				add("The Supreme Leader");
				add("Tousled");
				add("Side wedge");
				add("Front wedge");
				add("Front spikes");
				add("Frohawk");
				add("Rear skirt");
				add("Queue");
			}});
			add(new ArrayList<String>(){{//female
				add("Bald");
				add("Bun");
				add("Dreadlocks");
				add("Long");
				add("Medium");
				add("Pigtails");
				add("Short");
				add("Cropped");
				add("Wild spikes");
				add("Spiky");
				add("Earmuffs");
				add("Side pony");
				add("Curls");
				add("Wind braids");
				add("Ponytail");
				add("Braids");
				add("Bunches");
				add("Bob");
				add("Layered");
				add("Straight");
				add("Straight braids");
				add("Curtains");
				add("The Supreme Leader");
				add("Two-back");
			}});
		}});
		put("jaw",  new ArrayList<List<String>>(){{
			add(new ArrayList<String>(){{//male only
				add("Goatee");
				add("Long");
				add("Medium");
				add("Small moustache");
				add("Clean-shaven");
				add("Short");
				add("Pointy");
				add("Split");
				add("Handlebar");
				add("Mutton");
				add("Full mutton");
				add("Big moustache");
				add("Waxed moustache");
				add("Dali");
				add("Vizier");
			}});
			add(new ArrayList<String>(){{//female
				add("None");
			}});
		}});
		put("torso",new ArrayList<List<String>>(){{
			add(new ArrayList<String>(){{//male
				add("Plain");
				add("Light buttons");
				add("Dark buttons");
				add("Jacket");
				add("Shirt");
				add("Stitching");
				add("Torn");
				add("Two-toned");
				add("Sweater");
				add("Buttoned shirt");
				add("Vest");
				add("Princely");
				add("Ripped weskit");
				add("Torn weskit");
			}});
			add(new ArrayList<String>(){{//female
				add("Plain");
				add("Crop-top");
				add("Polo-neck");
				add("Simple");
				add("Torn");
				add("Sweater");
				add("Shirt");
				add("Vest");
				add("Frilly");
				add("Corsetry");
				add("Bodice");
			}});
		}});
		put("arms", new ArrayList<List<String>>(){{
			add(new ArrayList<String>(){{//male
				add("Regular");
				add("Musclebound");
				add("Loose sleeved");
				add("Large cuffed");
				add("Thin sleeved");
				add("Shoulder pads");
				add("Thin stripe");
				add("White cuffs");
				add("Princely");
				add("Tatty");
				add("Ripped");
			}});
			add(new ArrayList<String>(){{//female
				add("Short sleeves");
				add("Bare arms");
				add("Muscley");
				add("Long sleeved");
				add("Large cuffs");
				add("Frilly");
				add("Sweater");
				add("White cuffs");
				add("Thin stripe");
				add("Tatty");
				add("Bare shoulders");
			}});
		}});
		put("hands",new ArrayList<List<String>>(){{
			add(new ArrayList<String>(){{//unisex
				add("Bangle");
				add("Bare");
			}});
			add(new ArrayList<String>(){{//redundant, find a way to reduce this
				add("Bangle");
				add("Bare");
			}});
		}});
		put("legs", new ArrayList<List<String>>(){{
			add(new ArrayList<String>(){{//male
				add("Plain");
				add("Shorts");
				add("Flares");
				add("Turn-ups");
				add("Tatty");
				add("Beach");
				add("Princely");
				add("Leggings");
				add("Side-stripes");
				add("Ripped");
				add("Patched");
			}});
			add(new ArrayList<String>(){{//female
				add("Plain");
				add("Skirt");
				add("Flares");
				add("Long skirt");
				add("Long narrow skirt");
				add("Tatty");
				add("Turn-ups");
				add("Short skirt");
				add("Layered");
				add("Sash & dots");
				add("Big hem");
				add("Sash & trousers");
				add("Patterned");
				add("Torn skirt");
				add("Patched skirt");
			}});
		}});
		put("feet", new ArrayList<List<String>>(){{
			add(new ArrayList<String>(){{//unisex
				add("Small");
				add("Large");
			}});
			add(new ArrayList<String>(){{//redundant, find a way to reduce this
				add("Small");
				add("Large");
			}});
		}});
	}};
	//this map contains all the colour options for each body part
	static private Map<String,List<String>> colour=new HashMap<String,List<String>>(){{
		put("hair", new ArrayList<String>(){{
			add("Dark brown");
			add("White");
			add("Light grey");
			add("Dark grey");
			add("Apricot");
			add("Straw");
			add("Light brown");
			add("Brown");
			add("Turquoise");
			add("Green");
			add("Ginger");
			add("Magenta");
			add("Black");
			add("Grey");
			add("Beige");
			add("Peach");
			add("Light blue");
			add("Royal blue");
			add("Pale pink");
			add("Intense pink");
			add("Maroon");
			add("Light green");
			add("Dark green");
			add("Purple");
			add("Light purple");
		}});
		put("torso",new ArrayList<String>(){{
			add("Khaki");
			add("Charcoal");
			add("Crimson");
			add("Navy");
			add("Straw");
			add("White");
			add("Red");
			add("Blue");
			add("Green");
			add("Yellow");
			add("Purple");
			add("Orange");
			add("Rose");
			add("Lime");
			add("Cyan");
			add("Emerald");
			add("Black");
			add("Grey");
			add("Onion");
			add("Peach");
			add("Lumbridge blue");
			add("Deep blue");
			add("Light pink");
			add("Cadmium red");
			add("Maroon");
			add("Pale green");
			add("Turquoise");
			add("Deep purple");
			add("Light purple");
		}});
		put("legs", new ArrayList<String>(){{
			add("Emerald");
			add("Khaki");
			add("Charcoal");
			add("Crimson");
			add("Navy");
			add("Straw");
			add("White");
			add("Red");
			add("Blue");
			add("Green");
			add("Yellow");
			add("Purple");
			add("Orange");
			add("Rose");
			add("Lime");
			add("Cyan");
			add("Black");
			add("Grey");
			add("Onion");
			add("Peach");
			add("Lumbridge blue");
			add("Deep blue");
			add("Light pink");
			add("Cadmium red");
			add("Maroon");
			add("Pale green");
			add("Turquoise");
			add("Deep purple");
			add("Light purple");
		}});
		put("feet", new ArrayList<String>(){{
			add("Brown");
			add("Khaki");
			add("Ashen");
			add("Dark");
			add("Terracotta");
			add("Grey");
		}});
		put("skin", new ArrayList<String>(){{
			add("Cream");
			add("Vanilla");
			add("Honey");
			add("Caramel");
			add("Mocha");
			add("Chocolate");
			add("Coffee");
			add("Milk");
		}});
	}};
	/***/
	public static void randomizeAppearance(ClientContext ctx){
		/*"Setting your appearance"*/
		/*"Before you get started, you'll need to se the appearance of your
		 * character. Please use the open interface to set your appearance."*/
		//This is a map of all the buttons used to customize design
		Map<String,Interactive[]> change=new HashMap<String,Interactive[]>(){{
			put("head", new Interactive[]{ctx.widgets.component(269,106),ctx.widgets.component(269,113)});
			put("jaw",  new Interactive[]{ctx.widgets.component(269,107),ctx.widgets.component(269,114)});
			put("torso",new Interactive[]{ctx.widgets.component(269,108),ctx.widgets.component(269,115)});
			put("arms", new Interactive[]{ctx.widgets.component(269,109),ctx.widgets.component(269,116)});
			put("hands",new Interactive[]{ctx.widgets.component(269,110),ctx.widgets.component(269,117)});
			put("legs", new Interactive[]{ctx.widgets.component(269,111),ctx.widgets.component(269,118)});
			put("feet", new Interactive[]{ctx.widgets.component(269,112),ctx.widgets.component(269,119)});
		}};
		//This is a map of all the buttons used to customize colour
		Map<String,Interactive[]> recolour=new HashMap<String,Interactive[]>(){{
			put("hair", new Interactive[]{ctx.widgets.component(269,105),ctx.widgets.component(269,121)});
			put("torso",new Interactive[]{ctx.widgets.component(269,123),ctx.widgets.component(269,127)});
			put("legs", new Interactive[]{ctx.widgets.component(269,122),ctx.widgets.component(269,129)});
			put("feet", new Interactive[]{ctx.widgets.component(269,124),ctx.widgets.component(269,130)});
			put("skin", new Interactive[]{ctx.widgets.component(269,125),ctx.widgets.component(269,131)});
		}};
		/*"Welcome to Runescape"*/
		/*"Use the buttons below to design your player"*/
		//0 clicks left arrows, 1 clicks right arrows

		//TODO: texture id 308 left 309 right
		//select(true,269).tooltipContains("Change "+part).texture(s).poll();


		int s=Random.nextInt(0,2);
		//GENDER
		//add option to manually choose gender
		//0 is male, 1 is female
		int g=Random.nextInt(0,2);
		ctx.widgets.component(269,136+g).interact(g==0?"Male":"Female");
		//DESIGN
		//for each body part
		for(String part:change.keySet()){
			Condition.sleep(Random.nextInt(707,1414));
			int x=design.get(part).get(g).size();
			int y=x;
			//add option to manually choose design
			int z=Random.nextInt(0,y);
			//until the displayed design matches the selected design
			while(x%y!=z){
				//change.get(part)[s].interact("Change");
				//TODO: hopefully I can switch this back later
				Interactive w=change.get(part)[s];
				if(w.contains(ctx.input.getLocation())){
					ctx.input.click(true);
				}
				else{
					w.interact("Change");
				}
				//left arrows cycle backwards, right arrows cycle forwards
				x+=s==0?-1:1;
				Condition.sleep(Random.nextInt(707,1414));
			}
		}
		//COLOUR
		//for each body part
		for(String part:recolour.keySet()){
			Condition.sleep(Random.nextInt(707,1414));
			int x=colour.get(part).size();
			int y=x;
			//add option to manually choose colour
			int z=Random.nextInt(0,y);
			//until the displayed colour matches the selected colour
			while(x%y!=z){
				//recolour.get(part)[s].interact("Recolour");
				//TODO: hopefully I can switch this back later
				Interactive w=recolour.get(part)[s];
				if(w.contains(ctx.input.getLocation())){
					ctx.input.click(true);
				}
				else{
					w.interact("Recolour");
				}
				//left arrows cycle backwards, right arrows cycle forwards
				x+=s==0?-1:1;
				Condition.sleep(Random.nextInt(707,1414));
			}
		}
		ctx.widgets.component(269,99).interact("Accept");
		Condition.wait(()->ctx.varpbits.varpbit(281)==2,250,5);
	}
}
