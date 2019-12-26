package quests.tutorial_island;
import org.powerbot.script.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class RandomNameGenerator{
	/*TODO: incorporate gender in name generation*/
	/*These String arrays are which a few words are picked to generate a display name*/
	private static List<List<String>> words=new ArrayList<List<String>>(){{
		add(new ArrayList<String>(/*Adjectives*/){{
			/*Superlative*/
			add("Famous");
			add("Infamous");
			add("Mega");
			add("Mighty");
			add("Super");
			add("Supreme");
			add("Ultra");
			add("Ultimate");
			/*Adjectives - etc*/
			add("Ancient");
			add("Angry");
			add("Astral");
			add("Cyber");
			add("Dank");
			add("Hungry");
			add("Lunar");
			add("Misty");
			add("Solar");
			add("Wise");
			/*Supernatural*/
			add("Angelic");
			add("Blessed");
			add("Cursed");
			add("Damned");
			add("Dark");
			add("Demonic");
			add("Divine");
			add("Eternal");
			add("Hallowed");
			add("Holy");
			add("Infernal");
			add("Immortal");
			add("Light");
			add("Magic");
			add("Mortal");
			add("Profane");
			add("Sacred");
			add("Unholy");
		}});
		add(new ArrayList<String>(/*Colors*/){{
			add("Aqua");
			add("Auburn");
			add("Azure");
			add("Bistre");
			add("Black");
			add("Blue");
			add("Brown");
			add("Cyan");
			add("Gray");
			add("Green");
			add("Grey");
			add("Indigo");
			add("Orange");
			add("Pink");
			add("Purple");
			add("Red");
			add("Rose");
			add("Teal");
			add("Violet");
			add("White");
			add("Yellow");
		}});
		add(new ArrayList<String>(/*Materials*/){{
			/*Metals*/
			add("Adamant");
			add("Brass");
			add("Bronze");
			add("Cobalt");
			add("Copper");
			add("Chrome");
			add("Electrum");
			add("Iron");
			add("Gold");
			add("Lead");
			add("Mercury");
			add("Mithril");
			add("Mythril");
			add("Nickle");
			add("Orichalc");
			add("Runite");
			add("Silver");
			add("Steel");
			add("Tin");
			add("Titanium");
			add("Zinc");
			/*Gems and stone*/
			add("Amber");
			add("Citrine");
			add("Crystal");
			add("Diamond");
			add("Emerald");
			add("Garnet");
			add("Granite");
			add("Jade");
			add("Marble");
			add("Obsidian");
			add("Onyx");
			add("Ruby");
			add("Sapphire");
			add("Slate");
			add("Stone");
			add("Topaz");
			add("Quartz");
			/*Organic*/
			add("Beer");
			add("Bone");
			add("Coral");
			add("Ivory");
			add("Leather");
			add("Pearl");
			add("Silk");
			add("Wood");
		}});
		add(new ArrayList<String>(/*Elemental / abstract*/){{
			add("Air");
			add("Anima");
			add("Comet");
			add("Curse");
			add("Dark");
			add("Death");
			add("Doom");
			add("Earth");
			add("Energy");
			add("Fire");
			add("Flame");
			add("Frost");
			add("Grave");
			add("Glow");
			add("Ice");
			add("Light");
			add("Meteor");
			add("Moon");
			add("Rage");
			add("Ray");
			add("Revenge");
			add("Rock");
			add("Shadow");
			add("Sky");
			add("Soul");
			add("Star");
			add("Stone");
			add("Storm");
			add("Sun");
			add("Vengeance");
			add("Water");
			add("Wind");
		}});
		add(new ArrayList<String>(/*Creatures*/){{
			/*Real world*/
			add("Beast");
			add("Bat");
			add("Bear");
			add("Bull");
			add("Camel");
			add("Coyote");
			add("Crab");
			add("Crane");
			add("Dingo");
			add("Dog");
			add("Donkey");
			add("Duck");
			add("Eagle");
			add("Eel");
			add("Emu");
			add("Falcon");
			add("Ferret");
			add("Fox");
			add("Frog");
			add("Gar");
			add("Goat");
			add("Gorilla");
			add("Hare");
			add("Heron");
			add("Hippo");
			add("Horse");
			add("Hyena");
			add("Ibis");
			add("Impala");
			add("Jackal");
			add("Jaguar");
			add("Kiwi");
			add("Koala");
			add("Komodo");
			add("Lemur");
			add("Leopard");
			add("Lion");
			add("Lobster");
			add("Lynx");
			add("Mole");
			add("Mongoose");
			add("Monkey");
			add("Moose");
			add("Mule");
			add("Ocelot");
			add("Octopus");
			add("Opossum");
			add("Otter");
			add("Ox");
			add("Panther");
			add("Pig");
			add("Possum");
			add("Puma");
			add("Rabbit");
			add("Raccoon");
			add("Scorpion");
			add("Seal");
			add("Shark");
			add("Skunk");
			add("Sloth");
			add("Snake");
			add("Spider");
			add("Squid");
			add("Stag");
			add("Swan");
			add("Tiger");
			add("Turkey");
			add("Vulture");
			add("Wasp");
			add("Wolf");
			add("Yak");
			add("Zebra");
			/*Mythical*/
			add("Amarok");
			add("Angel");
			add("Asura");
			add("Banshee");
			add("Basilisk");
			add("Bunyip");
			add("Cerberus");
			add("Cherub");
			add("Chimera");
			add("Cockatrice");
			add("Cyclopes");
			add("Demon");
			add("Deva");
			add("Devil");
			add("Dragon");
			add("Drake");
			add("Dwarf");
			add("Elf");
			add("Fairy");
			add("Faun");
			add("Garuda");
			add("Genie");
			add("Ghost");
			add("Ghoul");
			add("Giant");
			add("Gnome");
			add("Goblin");
			add("God");
			add("Golem");
			add("Gorgon");
			add("Gremlin");
			add("Griffin");
			add("Gryphon");
			add("Harpy");
			add("Hydra");
			add("Imp");
			add("Incubus");
			add("Kappa");
			add("Kraken");
			add("Lamia");
			add("Lich");
			add("Martian");
			add("Medusa");
			add("Mermaid");
			add("Monster");
			add("Nymph");
			add("Ogre");
			add("Oni");
			add("Orc");
			add("Phoenix");
			add("Pixie");
			add("Quilin");
			add("Roc");
			add("Satyr");
			add("Seraph");
			add("Siren");
			add("Sphinx");
			add("Succubus");
			add("Titan");
			add("Undine");
			add("Unicorn");
			add("Valkyrie");
			add("Vampire");
			add("Wendigo");
			add("Wraith");
			add("Wyvern");
			add("Yeti");
			add("Ziz");
			add("Zombie");
			add("Zu");
		}});
		add(new ArrayList<String>(/*Parts / sounds*/){{
			add("Beard");
			add("Bone");
			add("Claw");
			add("Corpse");
			add("Fang");
			add("Horn");
			add("Skull");
			add("Tooth");
			//Sounds
			add("Fart");
			add("Growl");
			add("Howl");
			add("Roar");
		}});
		add(new ArrayList<String>(/*Weapons*/){{
			add("Arrow");
			add("Axe");
			add("Blade");
			add("Bolt");
			add("Bow");
			add("Claymore");
			add("Club");
			add("Dagger");
			add("Dirk");
			add("Edge");
			add("Flail");
			add("Glaive");
			add("Hammer");
			add("Halberd");
			add("Javelin");
			add("Katana");
			add("Knife");
			add("Mace");
			add("Maul");
			add("Pike");
			add("Rapier");
			add("Saber");
			add("Scythe");
			add("Shield");
			add("Sickle");
			add("Spear");
			add("Sword");
			add("Trident");
		}});
		add(new ArrayList<String>(/*Misc*/){{
			add("Crash");
			add("Crush");
			add("Grind");
			add("Hack");
			add("Rend");
			add("Rip");
			add("Shred");
			add("Slash");
			add("Slice");
			add("Slit");
			add("Smash");
			add("Tear");
		}});
		add(new ArrayList<String>(/*Titles*/){{
			/*Civilian*/
			add("Dean");
			add("Doctor");		add("Dr");
			add("Elder");
			add("Fellow");
			add("Madam");
			add("Master");
			add("Mister");		add("Mr");
			add("Professor");
			add("Sir");
			/*Government*/
			add("Chancellor");
			add("Commissioner");
			add("Consort");
			add("Consul");
			add("Governor");
			add("Inquisitor");
			add("Minister");
			add("President");
			add("Secretary");
			add("Senator");
			/*Military*/
			add("Admiral");		add("RDML");add("RADM");add("VADM");add("ADM");add("FADM");
			add("Airman");		add("AMN");	add("A1C");	add("SRA");
			add("Captain");		add("CPT");
			add("Chief");		add("WO1");	add("CW2");	add("CW3");	add("CW4");	add("CW5");
			add("Colonel");		add("LTC");	add("COL");
			add("Commander");	add("CDR");
			add("Corporal");	add("CPL");	add("LCPL");
			add("Ensign");		add("ENS");
			add("General");		add("BG");	add("MG");	add("LTG");	add("GEN");	add("GotA");
			add("Lieutenant");	add("2LT");	add("1LT"); add("LT");
			add("Major");		add("MAJ");
			add("Marshal");		add("FM");
			add("Private");		add("PVT");	add("PV2");	add("PFC");
			add("Sergeant");	add("SGT");	add("SFC");	add("1SG");
			add("SSG");	add("SSGT");add("TSGT");add("GYSGT");
			add("MSG");	add("MSGT");add("SMSGT");add("CMSGT");add("CCM");
			add("SGM");	add("CSM");	add("SMA");
			add("Specialist");	add("SPC");
			/*Religious*/
			add("Bishop");
			add("Brother");		//sister
			add("Cardinal");
			add("Father");
			add("Pastor");
			add("Pope");
			add("Reverend");
			add("Saint");
			/*Royalty*/
			add("Archon");
			add("Baron");		//Baroness
			add("Count");		//Countess
			add("Duke");		//Duchess
			add("Earl");		add("Jarl");
			add("Emperor");		//Empress
			add("Esquire");		add("Squire");	add("Esq");
			add("Imperator");
			add("King");		//Queen
			add("Knight");		//Dame
			add("Lord");		//Lady
			add("Marquess");	//Marchioness
			add("Pharaoh");
			add("Prince");		//Princess
			add("Rex");
			add("Sire");
			add("Sultan");		//Sultana
			add("Viscount");	//Viscountess
		}});
		add(new ArrayList<String>(/*Names*/){{
			/*Boy names*/
			add("Adam");
			add("Aiden");
			add("Alan");	add("Al");
			add("Alex");
			add("Andrew");	add("Andy");
			add("Anthony");	add("Tony");
			add("Austin");
			add("Axel");
			add("Benjamin");add("Ben");
			add("Carter");
			add("Chris");
			add("Cooper");
			add("Daniel");	add("Dan");
			add("David");	add("Dave");
			add("Dylan");
			add("Elijah");	add("Eli");
			add("Ethan");
			add("Henry");
			add("Hunter");
			add("Ian");
			add("Isaac");
			add("Jacob");	add("Jack");	add("Jake");
			add("James");	add("Jimmy");	add("Jim");
			add("Jason");
			add("Joseph");	add("Jose");	add("Joe");
			add("John");	add("Johny");
			add("Jordan");
			add("Kyle");
			add("Leo");
			add("Levi");
			add("Liam");
			add("Logan");
			add("Lucas");	add("Luke");
			add("Mason");
			add("Matthew");	add("Matt");
			add("Max");
			add("Michael");	add("Mike");
			add("Nathan");	add("Nate");
			add("Nickolas");add("Nick");
			add("Noah");
			add("Oliver");
			add("Peter");	add("Pete");
			add("Ryan");
			add("Samuel");	add("Sam");
			add("Tod");
			add("Thomas");	add("Tom");
			add("Trey");
			add("William");	add("Bill");	add("Will");
			add("Wyatt");
			add("Zachary");	add("Zach");	add("Zack");
			/*Videogame Characters*/
			/*Nintendo*/
			/*Mario*/
			add("Bowser");
			add("Luigi");
			add("Mario");
			add("Toad");
			add("Yoshi");
			/*Zelda*/
			add("Ganon");
			add("Link");
			//add("Zelda");
			/*Fire Emblem*/
			add("Ike");
			add("Marth");
			/*Kid Icarus*/
			add("Pit");
			/*Street Fighter*/
			add("Ryu");
			/*Metroid*/
			add("Ridley");
			//add("Samus");
			/*Xenoblade*/
			add("Shulk");
			/*Blizzard*/
			/*Warcraft*/
			add("Akama");
			add("Arthas");
			add("Baine");
			add("Bolvar");
			add("Brann");
			add("Darion");
			add("Garrosh");
			add("Genn");
			add("Grom");
			add("Guldan");
			add("Illidan");
			add("Khadgar");
			add("Lothar");
			add("Luigi");
			add("Malfurion");
			add("Medivh");
			add("Saurfang");
			add("Thrall");
			add("Tirion");
			add("Uther");
			add("Varian");
			add("Velen");
			add("Voljin");
			/*Square Enix*/
			/*Final Fantasy*/
			add("Biggs");
			add("Chocobo");
			add("Cid");
			add("Wedge");
			/*FFVII*/
			add("Cloud");
			add("Nanaki");
			add("Vincent");
			/*FFVIII*/
			add("Squall");
			add("Zell");
			/*FFIX*/
			add("Vivi");
			add("Zidane");
			/*FFX*/
			add("Auron");
			add("Tidus");
			add("Wakka");
			/*Anime*/
			/*DBZ*/
			add("Buu");
			add("Freeza");
			add("Gohan");
			add("Goku");
			add("Goten");
			add("Trunks");
			add("Vegeta");
			/*Naruto*/
			add("Kakashi");
			add("Naruto");
			add("Sasuke");
			/*Bleach*/
			add("Ichigo");
			/*Religious*/
			/*Abrahamic*/
			add("Bahamut");
			add("Kujata");
			add("Leviathan");
			/*Mesopotamia*/
			add("Anu");
			add("Enki");
			add("Marduk");
			add("Nergal");
			add("Tiamat");
			/*Greek*/
			add("Apollo");
			add("Ares");
			add("Atlas");
			add("Chronos");
			add("Gaia");
			add("Hades");
			add("Hermes");
			add("Kratos");
			add("Zeus");
			/*Norse*/
			add("Balder");
			add("Fenrir");
			add("Garmr");
			add("Hati");
			add("Huginn");
			add("Loki");
			add("Mimir");
			add("Muninn");
			add("Odin");
			add("Skoll");
			add("Sleipnir");
			add("Surtr");
			add("Thor");
			add("Tyr");
			add("Ymir");
			/*Hindu*/
			add("Brahma");
			add("Shiva");
			add("Vishnu");
		}});
	}};
	static List<String> affixes=new ArrayList<String>(){{
		add("07");
		add("EZ");
		add("GF");
		add("OS");
		add("OSRS");
		add("PK");
		add("SSJ");
		add("X");
		add("Xx");
		add("xX");
	}};
	static List<String> numbers=new ArrayList<String>(){{
		for(int i=85;i<108;i++){
			String s=String.valueOf(i);
			add(s.substring(s.length()-2));
		}
		add("42");
		add("69");
		add("420");
		add("666");
		add("777");
		add("1337");
	}};
	static List<String> generateRandomName(){
		/*Generates a list of potential user names by combining 1-3 words and affixes*/
		/*temp variables*/
		List<Integer> sublistIndex=new ArrayList<>();
		List<String> picks=new ArrayList<>();
		List<String> names=new ArrayList<>();
		int r=Random.nextInt(0,3);
		/*pick up to 3 unique random sublists from words*/
		for(int i=0;i<=r+1;i++){
			int j=Random.nextInt(0,words.size());
			if(!sublistIndex.contains(j)){
				sublistIndex.add(j);
			}
		}
		/*sort the indices so that the selected sublists retain their ordering*/
		Collections.sort(sublistIndex);
		/*pick a random word from each sublist*/
		for(int k:sublistIndex){
			List<String> sl=words.get(k);
			picks.add(sl.get(Random.nextInt(0,sl.size())));
		}
		/*pick out a random prefix and suffix*/
		String pre=affixes.get(Random.nextInt(0,affixes.size()));
		String post=numbers.get(Random.nextInt(0,numbers.size()));
		/*compile a list of possible display names using the chosen words and affixes, with and without spaces*/
		names.add(String.join(" ",picks));
		names.add(String.join("",picks));
		names.add(String.join(" ",names.get(0),post));
		names.add(String.join(" ",pre,names.get(0)));
		names.add(String.join("",names.get(1),post));
		names.add(String.join("",pre,names.get(1)));
		/*prune any names that are too long*/
		names.removeIf(q->q.length()>12);
		/*if there is at least 1 valid name, return it*/
		if(names.size()>=1){
			return names;
		}
		/*if none of the names are an appropriate length, try again*/
		else{
			return generateRandomName();
		}
	}
}
