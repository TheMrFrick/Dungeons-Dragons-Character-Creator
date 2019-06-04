package Class;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javafx.scene.control.ChoiceDialog;

public class Paladin extends ClassType {

	private final String name = "Paladin";
	private ArrayList<String> Features = new ArrayList<>();
	private ArrayList<String> Proficiencies = new ArrayList<>();
	private boolean isChosen = false;
	private String hitDice = "1d10";
	private ArrayList<String> equipment = new ArrayList<>();
	private String subClass;

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
		Proficiencies.add("Armor: All");
		Proficiencies.add("Armor: Shield");
		Proficiencies.add("Weapons: Simple");
		Proficiencies.add("Weapons: Martial");
		Proficiencies.add("Saving Throw: Wisdom");
		Proficiencies.add("Saving Throw: Charisma");

		

		for (int i = 0; i < 2; i++) {
			List<String> skill = new ArrayList<>();
			skill.add("Athletics");
			skill.add("Insight");
			skill.add("Intimidation");
			skill.add("Medicine");
			skill.add("Persuasion");
			skill.add("Religion");

			ChoiceDialog<String> dialog = new ChoiceDialog<>("Skill", skill);
			dialog.setTitle("Choose Skill");
			dialog.setHeaderText("Select Skill");
			dialog.setContentText("Select Skills");

			Optional<String> result = dialog.showAndWait();
			if (result.isPresent()) {
				Proficiencies.add("Skill: " + result.get());
			}
		}
		determineStartingEquipment();

		Features.add("Divine Sense");
		Features.add("Lay on Hands");

		if (level >= 2) {
			Features.add("Fighting Style");
			Features.add("Spellcasting");
			Features.add("Divine Smite");
		}
		if (level >= 3) {
			Features.add("Divine Health");
			Features.add("Sacred Oath");
		}
		if (level >= 5) {
			Features.add("Extra Attack");
		}
		if (level >= 6) {
			Features.add("Aura of Protection");
		}
		if (level >= 10) {
			Features.add("Aura of Courage");
		}
		if (level >= 11) {
			Features.add("Improved Divine Smite");
		}
		if (level >= 14) {
			Features.add("Cleansing Touch");
		}
		if (level >= 18) {
			Features.add("Aura Improvements");
		}

		if (level >= 3) {
			List<String> subclass = new ArrayList<>();
			subclass.add("Oath of Devotion");
			subclass.add("Oath of the Ancients");
			subclass.add("Oath of Vengeance");

			ChoiceDialog<String> subclassdialog = new ChoiceDialog<>("Sub-Class", subclass);
			subclassdialog.setTitle("Subclass");
			subclassdialog.setHeaderText("Choose your subclass");
			subclassdialog.setContentText("Select Subclass");

			Optional<String> subresult = subclassdialog.showAndWait();
			if (subresult.isPresent()) {
				if (subresult.get().contains("Devotion")) {
					Features.add("Tenets of Devotion");
					Features.add("Oath Spells");
					Features.add("Channel Divinity");
					if (level >= 7) {
						Features.add("Aura of Devotion");
					}
					if (level >= 15) {
						Features.add("Purity of Spirit");
					}
					if (level >= 20) {
						Features.add("Holy Nimbus");
					}
				}
				if (subresult.get().contains("Ancients")) {
					Features.add("Tenets of the Ancients");
					Features.add("Oath Spells");
					Features.add("Channel Divinity");
					if (level >= 7) {
						Features.add("Aura of Warding");
					}
					if (level >= 15) {
						Features.add("Undying Sentinel");
					}
					if (level >= 20) {
						Features.add("Elder Champion");
					}
				}
				if (subresult.get().contains("Vengeance")) {
					Features.add("Tenets of Vengeance");
					Features.add("Oath Spells");
					Features.add("Channel Divinity");
					if (level >= 7) {
						Features.add("Relentless Avenger");
					}
					if (level >= 15) {
						Features.add("Soul of Vengeance");
					}
					if (level >= 20) {
						Features.add("Avenging Angel");
					}
				}
			}
		}

	}

	private void determineStartingEquipment() {
		// TODO Auto-generated method stub
		List<String> item1 = new ArrayList<>();
		item1.add("Martial Weapon and a shield");
		item1.add("Two Martial Weapons");

		ChoiceDialog<String> dialog = new ChoiceDialog<>("Item", item1);
		dialog.setTitle("Item Select");
		dialog.setHeaderText("Select Item");
		dialog.setContentText("Select Item");

		Optional<String> result = dialog.showAndWait();
		if (result.isPresent()) {
			equipment.add(result.get());
		}

		List<String> item2 = new ArrayList<>();
		item2.add("five javelins");
		item2.add("Club");
		item2.add("Dagger");
		item2.add("Greatclub");
		item2.add("Javelin");
		item2.add("Light Hammer");
		item2.add("Mace");
		item2.add("Quarterstaff");
		item2.add("Sickle");
		item2.add("Spear");
		item2.add("Crossbow, light");
		item2.add("Dart");
		item2.add("Shortbow");
		item2.add("Sling");

		ChoiceDialog<String> dialog2 = new ChoiceDialog<>("Item", item2);
		dialog2.setTitle("Item Select");
		dialog2.setHeaderText("Select Item");
		dialog2.setContentText("Select Item");

		Optional<String> result2 = dialog2.showAndWait();
		if (result2.isPresent()) {
			equipment.add(result2.get());
		}

		List<String> item3 = new ArrayList<>();
		item3.add("Priest's Pack");
		item3.add("Explorer's Pack");

		ChoiceDialog<String> dialog3 = new ChoiceDialog<>("Item", item3);
		dialog3.setTitle("Item Select");
		dialog3.setHeaderText("Select Item");
		dialog3.setContentText("Select Item");

		Optional<String> result3 = dialog3.showAndWait();
		if (result3.isPresent()) {
			equipment.add(result3.get());
		}

		equipment.add("Chain Mail");
		equipment.add("Holy Symbol");
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
