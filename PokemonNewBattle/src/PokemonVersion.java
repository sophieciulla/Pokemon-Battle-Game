import java.util.ArrayList;

public class PokemonVersion
	{
		static ArrayList<Pokemon> dictionary = new ArrayList<Pokemon>();
		public static void fillDictionary()
		{
			dictionary.add(new Pokemon("Bulbasaur", "001", "Grass", "Tackle 40", 40, "Vine Whip 40", 40, "None", 0, "None", 0, 1 ,20 ,20 ,10 ,1 ));
			dictionary.add(new Pokemon("Ivysaur", "002", "Grass", "Tackle 40", 40, "Vine Whip 40", 40, "Sleep Powder (special)", 0, "None", 0, 16 ,320 ,200 ,80 ,35 ));
			dictionary.add(new Pokemon("Venusaur", "003", "Grass", "Tackle 40", 40, "Vine Whip 40", 40, "Sleep Powder (special)", 0, "Solar Beam 120", 120, 36 ,720 ,420 ,200 ,80 ));
			dictionary.add(new Pokemon("Charmander", "004", "Fire",  "Scratch 40", 40, "Ember 40", 40, "None", 0, "None", 0, 1, 20, 20, 10, 2));
			dictionary.add(new Pokemon("Charmeleon", "005", "Fire", "Scratch 40", 40, "Ember 40", 40, "Bite 60", 60, "None", 0, 16 ,320 ,200 ,80 ,35));
			dictionary.add(new Pokemon("Charmander", "006", "Fire", "Scratch 40", 40, "Ember 40", 40, "Bite 60", 60, "Flare Blitz 120", 120, 36 ,720 ,420 ,200 ,80 ));
			dictionary.add(new Pokemon("Squirtle", "007", "Water", "Tackle 40", 40, "Water Gun 40", 40, "None", 0, "None", 0, 1, 20, 20, 10, 2));
			dictionary.add(new Pokemon("Wartortle", "008", "Water", "Tackle 40", 40, "Water Gun 40", 40, "Freeze 60", 60, "None", 0, 16 ,320 ,200 ,80 ,35));
			dictionary.add(new Pokemon("Blastoise", "009", "Water", "Tackle 40", 40, "Water Gun 40", 40, "Freeze 60", 60, "Hydro Pump 120", 120, 36 ,720 ,420 ,200 ,80 ));
		}
		
				
			
		
			

	}
