package Class;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javafx.scene.control.ChoiceDialog;

public class Bard extends ClassType {

	private final String name = "Bard";
	private ArrayList<String> Features = new ArrayList<>();
	private ArrayList<String> Proficiencies = new ArrayList<>();
	private boolean isChosen = false;
	private String hitDice = "1d8";
	private ArrayList<String> equipment = new ArrayList<>();
	private String subClass;

	public Bard() {

	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		String info = "";
		String line = "";
		try {
			FileReader fr = new FileReader(name + ".txt");
			BufferedReader br = new BufferedReader(fr);
			while ((line = br.readLine()) != null) {
				info += line;
				info += "\n";
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return info;
	}

	@Override
	public void determineFeatures(int level) {
		// TODO Auto-generated method stub
		Proficiencies.add("Armor: Light");
		Proficiencies.add("Weapons: Simple");
		Proficiencies.add("Weapon: Hand Crossbows");
		Proficiencies.add("Weapon: Longswords");
		Proficiencies.add("Weapon: Rapier");
		Proficiencies.add("Weapon: Shortsword");
		Proficiencies.add("Saving Throw: Dexterity");
		Proficiencies.add("Saving Throw: Charisma");

		int count = 3;
		while (count > 0) {
			List<String> choices = new ArrayList<>();
			choices.add("Bagpipes");
			choices.add("Drum");
			choices.add("Dulcimer");
			choices.add("Flute");
			choices.add("Lute");
			choices.add("Lyre");
			choices.add("Horn");
			choices.add("Pan Flute");
			choices.add("Shawm");
			choices.add("Viol");

			ChoiceDialog<String> dialog = new ChoiceDialog<>("Musical Instrument", choices);
			dialog.setTitle("Choice Dialog");
			dialog.setHeaderText("Musical Instrument Proficiency choice");
			dialog.setContentText("Choose your Musical Instrument:");

			// Traditional way to get the response value.
			Optional<String> result = dialog.showAndWait();
			if (result.isPresent()) {
				Proficiencies.add("Musical Instrument: " + result.get());
				count--;
			}

		}
		count = 2;
		while (count > 0) {
			List<String> choices = new ArrayList<>();
			choices.add("Acrobatics");
			choices.add("Animal Handling");
			choices.add("Arcana");
			choices.add("Athletics");
			choices.add("Deception");
			choices.add("History");
			choices.add("Insight");
			choices.add("Intimidation");
			choices.add("Investigation");
			choices.add("Medicine");
			choices.add("Nature");
			choices.add("Perception");
			choices.add("Performance");
			choices.add("Persuasion");
			choices.add("Religion");
			choices.add("Sleight of Hand");
			choices.add("Stealth");
			choices.add("Survival");

			ChoiceDialog<String> dialog = new ChoiceDialog<>("Skills", choices);
			dialog.setTitle("Skills Choice");
			dialog.setHeaderText("Choose a Skill");
			dialog.setContentText("Choose your skill to be proficient in:");

			// Traditional way to get the response value.
			Optional<String> result = dialog.showAndWait();
			if (result.isPresent()) {
				Proficiencies.add("Skill: " + result.get());
				choices.remove(result.get());
				count--;
			}
		}
		determineStartingEquipment();
		Features.add("Spellcasting");
		Features.add("Bardic Inspiration (d6)");
		if (level >= 2) {
			Features.add("Jack of All Trades");
			Features.add("Song of Rest (d6)");
		}
		if (level >= 3) {
			Features.add("Bardic College");
			Features.add("Expertise");
			count = 2;
			while (count > 0) {
				List<String> choices = new ArrayList<>();
				choices.add("Acrobatics");
				choices.add("Animal Handling");
				choices.add("Arcana");
				choices.add("Athletics");
				choices.add("Deception");
				choices.add("History");
				choices.add("Insight");
				choices.add("Intimidation");
				choices.add("Investigation");
				choices.add("Medicine");
				choices.add("Nature");
				choices.add("Perception");
				choices.add("Performance");
				choices.add("Persuasion");
				choices.add("Religion");
				choices.add("Sleight of Hand");
				choices.add("Stealth");
				choices.add("Survival");

				ChoiceDialog<String> dialog = new ChoiceDialog<>("Skills", choices);
				dialog.setTitle("Skills Choice");
				dialog.setHeaderText("Choose a Skill");
				dialog.setContentText("Choose your skill to be proficient in:");

				// Traditional way to get the response value.
				Optional<String> result = dialog.showAndWait();
				if (result.isPresent()) {
					Proficiencies.add("Skill: " + result.get());
					choices.remove(result.get());
					count--;
				}
			}
		}
		if (level >= 5) {
			Features.add("Bardic Inspiration (d8)");
			Features.add("Font of Inspiration");
		}
		if (level >= 6) {
			Features.add("Countercharm");
		}
		if (level >= 9) {
			Features.add("Song of rest (d8)");
		}
		if (level >= 10) {
			Features.add("Bardic Inspiration (d10)");
			Features.add("Expertise");
			Features.add("Magical Secrets");
			count = 2;
			while (count > 0) {
				List<String> choices = new ArrayList<>();
				choices.add("Acrobatics");
				choices.add("Animal Handling");
				choices.add("Arcana");
				choices.add("Athletics");
				choices.add("Deception");
				choices.add("History");
				choices.add("Insight");
				choices.add("Intimidation");
				choices.add("Investigation");
				choices.add("Medicine");
				choices.add("Nature");
				choices.add("Perception");
				choices.add("Performance");
				choices.add("Persuasion");
				choices.add("Religion");
				choices.add("Sleight of Hand");
				choices.add("Stealth");
				choices.add("Survival");

				ChoiceDialog<String> dialog = new ChoiceDialog<>("Skills", choices);
				dialog.setTitle("Skills Choice");
				dialog.setHeaderText("Choose a Skill");
				dialog.setContentText("Choose your skill to be proficient in:");

				// Traditional way to get the response value.
				Optional<String> result = dialog.showAndWait();
				if (result.isPresent()) {
					Proficiencies.add("Skill: " + result.get());
					choices.remove(result.get());
					count--;
				}
			}
		}
		if (level >= 13) {
			Features.add("Song of Rest (d10)");
		}
		if (level >= 14) {
			Features.add("Magical Secrets");
		}
		if (level >= 15) {
			Features.add("Bardic Inspiration (d12)");
		}
		if (level >= 17) {
			Features.add("Song of Rest (d12)");
		}
		if (level >= 18) {
			Features.add("Magical Secrets");
		}
		if (level >= 20) {
			Features.add("Superior Inspiration");
		}

		if (level >= 3) {
			List<String> choices = new ArrayList<>();
			choices.add("College of Lore");
			choices.add("College of Valor");

			ChoiceDialog<String> dialog = new ChoiceDialog<>("Bard College", choices);
			dialog.setTitle("Bard College");
			dialog.setHeaderText("Bard College choice");
			dialog.setContentText("Choose your Bard College:");

			// Traditional way to get the response value.
			Optional<String> result = dialog.showAndWait();
			if (result.isPresent()) {
				if (result.get().contains("Lore")) {
					subClass = result.get();
					count = 3;
					while (count > 0) {
						List<String> choice = new ArrayList<>();
						choice.add("Acrobatics");
						choice.add("Animal Handling");
						choice.add("Arcana");
						choice.add("Athletics");
						choice.add("Deception");
						choice.add("History");
						choice.add("Insight");
						choice.add("Intimidation");
						choice.add("Investigation");
						choice.add("Medicine");
						choice.add("Nature");
						choice.add("Perception");
						choice.add("Performance");
						choice.add("Persuasion");
						choice.add("Religion");
						choice.add("Sleight of Hand");
						choice.add("Stealth");
						choice.add("Survival");

						ChoiceDialog<String> dialog2 = new ChoiceDialog<>("Skills", choice);
						dialog2.setTitle("Skills Choice");
						dialog2.setHeaderText("Choose a Skill");
						dialog2.setContentText("Choose your skill to be proficient in:");

						// Traditional way to get the response
						// value.
						Optional<String> result1 = dialog2.showAndWait();
						if (result1.isPresent()) {
							Proficiencies.add("Skill: " + result1.get());
							choices.remove(result1.get());
							count--;
						}
					}
					Features.add("Cutting Words");
					if (level >= 6) {
						Features.add("Additional Magic Secrets");
					}
					if (level >= 14) {
						Features.add("Peerless Skill");
					}
				}
				if (result.get().contains("Valor")) {
					Proficiencies.add("Armor: Medium");
					Proficiencies.add("Armor: Shields");
					Proficiencies.add("Weapons: Martial");
					Features.add("Combat Inspiration");
					Features.add("Extra Attack");
					Features.add("Battle Magic");
				}
			}
		}
	}

	private void determineStartingEquipment() {
		// TODO Auto-generated method stub
		List<String> weapon1 = new ArrayList<>();
		weapon1.add("Rapier");
		weapon1.add("Longsword");
		weapon1.add("Club");
		weapon1.add("Dagger");
		weapon1.add("Greatclub");
		weapon1.add("Javelin");
		weapon1.add("Light Hammer");
		weapon1.add("Mace");
		weapon1.add("Quarterstaff");
		weapon1.add("Sickle");
		weapon1.add("Spear");
		weapon1.add("Crossbow, light");
		weapon1.add("Dart");
		weapon1.add("Shortbow");
		weapon1.add("Sling");

		ChoiceDialog<String> dialog2 = new ChoiceDialog<>("Weapon", weapon1);
		dialog2.setTitle("Choice Weapon");
		dialog2.setHeaderText("Choose a weapon");
		dialog2.setContentText("Choose your weapon");

		// Traditional way to get the response value.
		Optional<String> result2 = dialog2.showAndWait();
		if (result2.isPresent()) {
			equipment.add(result2.get());
		}

		List<String> item2 = new ArrayList<>();
		item2.add("Diplomat's Pack");
		item2.add("Entertainer's Pack");

		ChoiceDialog<String> dialog1 = new ChoiceDialog<>("Item 2", item2);
		dialog1.setTitle("Choice Weapon");
		dialog1.setHeaderText("Choose an item");
		dialog1.setContentText("Choose your second item");

		// Traditional way to get the response value.
		Optional<String> result = dialog1.showAndWait();
		if (result.isPresent()) {
			equipment.add(result.get());
		}

		List<String> choices = new ArrayList<>();
		choices.add("Bagpipes");
		choices.add("Drum");
		choices.add("Dulcimer");
		choices.add("Flute");
		choices.add("Lute");
		choices.add("Lyre");
		choices.add("Horn");
		choices.add("Pan Flute");
		choices.add("Shawm");
		choices.add("Viol");

		ChoiceDialog<String> dialog = new ChoiceDialog<>("Musical Instrument", choices);
		dialog.setTitle("Choice Dialog");
		dialog.setHeaderText("Musical Instrument Proficiency choice");
		dialog.setContentText("Choose your Musical Instrument:");

		// Traditional way to get the response value.
		Optional<String> result3 = dialog.showAndWait();
		if (result3.isPresent()) {
			Proficiencies.add("Musical Instrument: " + result3.get());
		}

		equipment.add("Leather Armor");
		equipment.add("Dagger");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public ArrayList<String> getFeatures() {
		// TODO Auto-generated method stub
		return Features;
	}

	@Override
	public ArrayList<String> getProficiencies() {
		// TODO Auto-generated method stub
		return Proficiencies;
	}

	@Override
	public boolean isChosen() {
		// TODO Auto-generated method stub
		return isChosen;
	}

	public String getHitDice() {
		return hitDice;
	}

	public void setHitDice(String hitDice) {
		this.hitDice = hitDice;
	}

	public ArrayList<String> getEquipment() {
		return equipment;
	}

	public void setEquipment(ArrayList<String> equipment) {
		this.equipment = equipment;
	}

	public String getSubClass() {
		return subClass;
	}

	public void setSubClass(String subClass) {
		this.subClass = subClass;
	}

}
