package Class;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javafx.scene.control.ChoiceDialog;

public class Rogue extends ClassType {

	private final String name = "Rogue";
	private ArrayList<String> Features = new ArrayList<>();
	private ArrayList<String> Proficiencies = new ArrayList<>();
	private boolean isChosen = false;
	private String hitDice = "1d8";
	private ArrayList<String> equipment = new ArrayList<>();
	private String subClass;

	public Rogue() {

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
		Proficiencies.add("Weapon: Rapiers");
		Proficiencies.add("Weapon: Shortswords");
		Proficiencies.add("Tool: Thieve's Tools");
		Proficiencies.add("Saving Throw: Dexterity");
		Proficiencies.add("Saving Throw: Intelligence");

		for (int i = 0; i < 4; i++) {
			List<String> skill = new ArrayList<>();
			skill.add("Acrobatics");
			skill.add("Athletics");
			skill.add("Deception");
			skill.add("Insight");
			skill.add("Intimidation");
			skill.add("Investigation");
			skill.add("Perception");
			skill.add("Performance");
			skill.add("Persuasion");
			skill.add("Sleight of Hand");
			skill.add("Stealth");

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

		Features.add("Expertise");
		Features.add("Sneak Attack");
		Features.add("Theives' Cant");

		if (level >= 2) {
			Features.add("Cunning Action");
		}
		if (level >= 3) {
			Features.add("Roguish Archtype");
		}
		if (level >= 5) {
			Features.add("Uncanny Dodge");
		}
		if (level >= 6) {
			Features.add("Expertise");
		}
		if (level >= 7) {
			Features.add("Evasion");
		}
		if (level >= 11) {
			Features.add("Reliable Talent");
		}
		if (level >= 14) {
			Features.add("Blindsense");
		}
		if (level >= 15) {
			Features.add("Slippery Mind");
		}
		if (level >= 18) {
			Features.add("Elusive");
		}
		if (level >= 20) {
			Features.add("Stroke of Luck");
		}
		if (level >= 3) {
			List<String> subclass = new ArrayList<>();
			subclass.add("Assassin");
			subclass.add("Thief");
			subclass.add("Arcane Trickster");

			ChoiceDialog<String> subclassdialog = new ChoiceDialog<>("Sub-Class", subclass);
			subclassdialog.setTitle("Subclass");
			subclassdialog.setHeaderText("Choose your subclass");
			subclassdialog.setContentText("Select Subclass");

			Optional<String> subresult = subclassdialog.showAndWait();
			if (subresult.isPresent()) {
				if (subresult.get().contains("Thief")) {
					Features.add("Fast Hands");
					Features.add("Second-Story Work");
					if (level >= 9) {
						Features.add("Supreme Sneak");
					}
					if (level >= 13) {
						Features.add("Use Magic Device");
					}
					if (level >= 17) {
						Features.add("Thief's Reflexes");
					}
				}
				if (subresult.get().contains("Assassin")) {
					Features.add("Bonus Proficiencies");
					Features.add("Assassinate");
					if (level >= 9) {
						Features.add("Infiltration Expertise");
					}
					if (level >= 13) {
						Features.add("Imposter");
					}
					if (level >= 17) {
						Features.add("Death Strike");
					}
				}
				if (subresult.get().contains("Arcane")) {
					Features.add("Spellcasting");
					Features.add("Mage Hand Legerdemain");
					if (level >= 9) {
						Features.add("Magical Ambush");
					}
					if (level >= 13) {
						Features.add("Versatile Trickster");
					}
					if(level >= 17){
						Features.add("Spell Thief");
					}
				}
			}
		}
	}

	private void determineStartingEquipment() {
		// TODO Auto-generated method stub
		List<String> item = new ArrayList<>();
		item.add("Rapier");
		item.add("Shortsword");

		ChoiceDialog<String> dialog = new ChoiceDialog<>("Item", item);
		dialog.setTitle("Item Select");
		dialog.setHeaderText("Select Item");
		dialog.setContentText("Select Item");

		Optional<String> result = dialog.showAndWait();
		if (result.isPresent()) {
			equipment.add(result.get());
		}

		item.clear();

		item.add("Shortbow and 20 arrows");
		item.add("Shortsword");

		ChoiceDialog<String> dialog2 = new ChoiceDialog<>("Item", item);
		dialog2.setTitle("Item Select");
		dialog2.setHeaderText("Select Item");
		dialog2.setContentText("Select Item");

		result = dialog2.showAndWait();
		if (result.isPresent()) {
			equipment.add(result.get());
		}

		item.clear();

		item.add("Burglar's Pack");
		item.add("Dungeoneer's Pack");
		item.add("Explorer's Pack");

		ChoiceDialog<String> dialog3 = new ChoiceDialog<>("Item", item);
		dialog3.setTitle("Item Select");
		dialog3.setHeaderText("Select Item");
		dialog3.setContentText("Select Item");

		result = dialog3.showAndWait();
		if (result.isPresent()) {
			equipment.add(result.get());
		}

		equipment.add("Leather Armor");
		equipment.add("Dagger");
		equipment.add("Dagger");
		equipment.add("Thieve's Tools");

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
