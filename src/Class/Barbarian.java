package Class;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javafx.scene.control.ChoiceDialog;

public class Barbarian extends ClassType {

	private final String name = "Barbarian";
	private ArrayList<String> Features = new ArrayList<>();
	private ArrayList<String> Proficiencies = new ArrayList<>();
	private boolean isChosen = false;
	private String hitDice = "1d12";
	private ArrayList<String> equipment = new ArrayList<>();
	private String subClass;

	public Barbarian() {

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
		Proficiencies.add("Armor: Medium");
		Proficiencies.add("Armor: Shield");
		Proficiencies.add("Weapon: Simple");
		Proficiencies.add("Weapon: Martial");
		Proficiencies.add("Saving Throw: Strength");
		Proficiencies.add("Saving Throw: Constitution");

		int count = 2;
		while (count > 0) {
			List<String> choices = new ArrayList<>();
			choices.add("Animal Handling");
			choices.add("Athletics");
			choices.add("Intimidation");
			choices.add("Nature");
			choices.add("Perception");
			choices.add("Survival");

			ChoiceDialog<String> dialog = new ChoiceDialog<>("Skill", choices);
			dialog.setTitle("Choice Dialog");
			dialog.setHeaderText("Skill choice");
			dialog.setContentText("Choose your Skill:");

			// Traditional way to get the response value.
			Optional<String> result = dialog.showAndWait();
			if (result.isPresent()) {
				Proficiencies.add(result.get());
				count--;
			}
		}
		determineStartingEquipment();
		Features.add("Rage");
		Features.add("Unarmored Defense");
		if (level >= 2) {
			Features.add("Reckless Attack");
			Features.add("Danger Sense");
		}
		if (level >= 3) {
			Features.add("Primal Path");
		}
		if (level >= 5) {
			Features.add("Fast Movement");
			Features.add("Extra Attack");
		}
		if (level >= 7) {
			Features.add("Feral Instinct");
		}
		if (level >= 9) {
			Features.add("Brutal Critical (1 die)");
		}
		if (level >= 11) {
			Features.add("Relentless Rage");
		}
		if (level >= 13) {
			Features.add("Brutal Critical (2 die)");
		}
		if (level >= 15) {
			Features.add("Persistant Rage");
		}
		if (level >= 17) {
			Features.add("Brutal Critical (3 die)");
		}
		if (level >= 18) {
			Features.add("Indomitable Might");
		}
		if (level >= 20) {
			Features.add("Primal Champion");
		}
		if (level >= 3) {
			while (true) {
				List<String> choices = new ArrayList<>();
				choices.add("Path of the Beserker");
				choices.add("Path of the Totem Warrior");

				ChoiceDialog<String> dialog = new ChoiceDialog<>("Primal Path", choices);
				dialog.setTitle("Primal Path");
				dialog.setHeaderText("Primal Path choice");
				dialog.setContentText("Choose your Primal Path:");


				// Traditional way to get the response value.
				Optional<String> result = dialog.showAndWait();
				if (result.isPresent()) {
					setSubClass(result.get());
					if (result.get().contains("Beserker")) {
						Features.add("Frenzy");
						if (level >= 6) {
							Features.add("Mindless Rage");
						}
						if (level >= 10) {
							Features.add("Intimidating Presence");
						}
						if (level >= 14) {
							Features.add("Retaliation");
						}
					}
					if (result.get().contains("Totem")) {
						Features.add("Spirit Seeker");
						Features.add("Totem Spirit");
						if (level >= 6) {
							Features.add("Aspect of the Beast");
						}
						if (level >= 10) {
							Features.add("Spirit Walker");
						}
						if (level >= 14) {
							Features.add("Totemic Attunement");
						}
					}
				}
			}
		}
	}

	private void determineStartingEquipment() {
		// TODO Auto-generated method stub
		//Martial Weapons
		List<String> weapon1 = new ArrayList<>();
		weapon1.add("GreatAxe");
		weapon1.add("BattleAxe");
		weapon1.add("Flail");
		weapon1.add("Glaive");
		weapon1.add("Greatsword");
		weapon1.add("Halberd");
		weapon1.add("Lance");
		weapon1.add("Longsword");
		weapon1.add("Maul");
		weapon1.add("Morningstar");
		weapon1.add("Pike");
		weapon1.add("Rapier");
		weapon1.add("Scimitar");
		weapon1.add("Shortsword");
		weapon1.add("Trident");
		weapon1.add("War Pick");
		weapon1.add("Warhammer");
		weapon1.add("Whip");
		weapon1.add("Blowgun");
		weapon1.add("Crossbow, hand");
		weapon1.add("Crossbow, heavy");
		weapon1.add("Longbow");
		weapon1.add("Net");

		ChoiceDialog<String> dialog = new ChoiceDialog<>("Weapon", weapon1);
		dialog.setTitle("Choice Weapon");
		dialog.setHeaderText("Choose a weapon");
		dialog.setContentText("Choose your weapon");

		// Traditional way to get the response value.
		Optional<String> result = dialog.showAndWait();
		if (result.isPresent()) {
			equipment.add(result.get());
		}

		//Simple Weapons
		List<String> weapon2 = new ArrayList<>();
		weapon2.add("2 Handaxes");
		weapon2.add("Club");
		weapon2.add("Dagger");
		weapon2.add("Greatclub");
		weapon2.add("Javelin");
		weapon2.add("Light Hammer");
		weapon2.add("Mace");
		weapon2.add("Quarterstaff");
		weapon2.add("Sickle");
		weapon2.add("Spear");
		weapon2.add("Crossbow, light");
		weapon2.add("Dart");
		weapon2.add("Shortbow");
		weapon2.add("Sling");

		ChoiceDialog<String> dialog2 = new ChoiceDialog<>("Weapon", weapon2);
		dialog2.setTitle("Choice Weapon");
		dialog2.setHeaderText("Choose a weapon");
		dialog2.setContentText("Choose your weapon");

		// Traditional way to get the response value.
		Optional<String> result2 = dialog2.showAndWait();
		if (result2.isPresent()) {
			equipment.add(result2.get());
		}

		equipment.add("Explorer's Pack");
		equipment.add("Four Javelins");
	}

	public String getName() {
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

	public ArrayList<String> getEquipment() {
		return equipment;
	}

	public void setEquipment(ArrayList<String> equipment) {
		this.equipment = equipment;
	}

	public String getHitDice() {
		return hitDice;
	}

	public void setHitDice(String hitDice) {
		this.hitDice = hitDice;
	}

	public String getSubClass() {
		return subClass;
	}

	public void setSubClass(String subClass) {
		this.subClass = subClass;
	}

}
