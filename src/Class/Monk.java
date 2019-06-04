package Class;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javafx.scene.control.ChoiceDialog;

public class Monk extends ClassType {
	private final String name = "Monk";
	private ArrayList<String> Features = new ArrayList<>();
	private ArrayList<String> Proficiencies = new ArrayList<>();
	private boolean isChosen = false;
	private String hitDice = "1d10";
	private ArrayList<String> equipment = new ArrayList<>();
	private String subClass;

	public Monk() {

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
		Proficiencies.add("Weapons: Simple");
		Proficiencies.add("Weapon: Shortsword");
		Proficiencies.add("Tool: Artisan's Tool or Musical Instrument");
		Proficiencies.add("Saving Throw: Strength");
		Proficiencies.add("Saving Throw: Dexterity");

		List<String> skills = new ArrayList<>();
		skills.add("Acrobatics");
		skills.add("Athletics");
		skills.add("History");
		skills.add("Insight");
		skills.add("Religion");
		skills.add("Stealth");

		ChoiceDialog<String> dialog = new ChoiceDialog<>("Skill", skills);
		dialog.setTitle("Choose Skill");
		dialog.setHeaderText("Select Skill");
		dialog.setContentText("Select Skills");

		Optional<String> result = dialog.showAndWait();
		if (result.isPresent()) {
			Proficiencies.add("Skill: " + result.get());
		}

		determineStartingEquipment();

		Features.add("Unarmored Defense");
		Features.add("Martial Arts");
		if (level >= 2) {
			Features.add("Ki");
			Features.add("Unarmored Movement");
		}
		if (level >= 3) {
			Features.add("Monastic Tradition");
			Features.add("Deflect Missiles");
		}
		if (level >= 4) {
			Features.add("Slow Fall");
		}
		if (level >= 5) {
			Features.add("Extra Attack");
			Features.add("Stunning Strike");
		}
		if (level >= 6) {
			Features.add("Ki Empowered Strike");
		}
		if (level >= 7) {
			Features.add("Evasion");
			Features.add("Stillness of Mind");
		}
		if (level >= 9) {
			Features.add("Unarmored Movement Improvement");
		}
		if (level >= 10) {
			Features.add("Purity of Body");
		}
		if (level >= 13) {
			Features.add("Tongue of the Sun and the Moon");
		}
		if (level >= 14) {
			Features.add("Diamond Soul");
		}
		if (level >= 15) {
			Features.add("Timeless Body");
		}
		if (level >= 18) {
			Features.add("Empty Body");
		}
		if (level >= 20) {
			Features.add("Perfect Self");
		}

		if (level >= 3) {
			List<String> subclass = new ArrayList<>();
			subclass.add("Way of the Open Hand");
			subclass.add("Way of the Shadow");
			subclass.add("Way of the Four Elements");

			ChoiceDialog<String> subclassdialog = new ChoiceDialog<>("Sub-Class", subclass);
			subclassdialog.setTitle("Subclass");
			subclassdialog.setHeaderText("Choose your subclass");
			subclassdialog.setContentText("Select Subclass");

			Optional<String> result1 = subclassdialog.showAndWait();
			if (result1.isPresent()) {
				if (result1.get().contains("Hand")) {
					Features.add("Open Hand Technique");
					if (level >= 6) {
						Features.add("Wholeness of Body");
					}
					if (level >= 11) {
						Features.add("Tranquility");
					}
					if (level >= 17) {
						Features.add("Quivering Palm");
					}
				}
				if (result1.get().contains("Shadow")) {
					Features.add("Shadow Arts");
					if (level >= 6) {
						Features.add("Shadow Step");
					}
					if (level >= 11) {
						Features.add("Cloak of Shadows");
					}
					if (level >= 17) {
						Features.add("Opportunist");
					}
				}
				if (result1.get().contains("Four")) {
					Features.add("Disciple of the Elements");
				}
			}
		}

	}

	private void determineStartingEquipment() {
		// TODO Auto-generated method stub
		List<String> item1 = new ArrayList<>();
		item1.add("Shortsword");
		item1.add("Club");
		item1.add("Dagger");
		item1.add("Greatclub");
		item1.add("Javelin");
		item1.add("Light Hammer");
		item1.add("Mace");
		item1.add("Quarterstaff");
		item1.add("Sickle");
		item1.add("Spear");
		item1.add("Crossbow, light");
		item1.add("Dart");
		item1.add("Shortbow");
		item1.add("Sling");

		ChoiceDialog<String> dialog = new ChoiceDialog<>("Weapon", item1);
		dialog.setTitle("Choice Weapon");
		dialog.setHeaderText("Choose a weapon");
		dialog.setContentText("Choose your weapon");

		// Traditional way to get the response value.
		Optional<String> result = dialog.showAndWait();
		if (result.isPresent()) {
			equipment.add(result.get());
		}

		List<String> item2 = new ArrayList<>();
		item2.add("Explorer's Pack");
		item2.add("Dungeoneer's Pack");

		ChoiceDialog<String> dialog2 = new ChoiceDialog<>("Item", item2);
		dialog2.setTitle("Choice Item");
		dialog2.setHeaderText("Choose an Item");
		dialog2.setContentText("Choose your Item");

		// Traditional way to get the response value.
		Optional<String> result2 = dialog2.showAndWait();
		if (result2.isPresent()) {
			equipment.add(result2.get());
		}

		equipment.add("10 darts");
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
