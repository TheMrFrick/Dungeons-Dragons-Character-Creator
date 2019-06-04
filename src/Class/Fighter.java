package Class;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javafx.scene.control.ChoiceDialog;

public class Fighter extends ClassType {
	private final String name = "Fighter";
	private ArrayList<String> Features = new ArrayList<>();
	private ArrayList<String> Proficiencies = new ArrayList<>();
	private boolean isChosen = false;
	private String hitDice = "1d10";
	private ArrayList<String> equipment = new ArrayList<>();
	private String subClass;

	public Fighter() {

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
		Proficiencies.add("Armor: All");
		Proficiencies.add("Armor: Shields");
		Proficiencies.add("Weapons: Simple");
		Proficiencies.add("Weapons: Martial");
		Proficiencies.add("Saving Throw: Strength");
		Proficiencies.add("Saving Throw: Constitution");

		List<String> skill = new ArrayList<>();
		skill.add("Acrobatics");
		skill.add("Animal Handling");
		skill.add("Athletics");
		skill.add("History");
		skill.add("Insight");
		skill.add("Intimidation");
		skill.add("Perception");
		skill.add("Survival");

		ChoiceDialog<String> dialog = new ChoiceDialog<>("Skill", skill);
		dialog.setTitle("Choose Skill");
		dialog.setHeaderText("Select Skill");
		dialog.setContentText("Select Skills");

		Optional<String> result = dialog.showAndWait();
		if (result.isPresent()) {
			Proficiencies.add("Skill: " + result.get());
		}

		determineStartingEquipment();
		Features.add("Fighting Style");
		Features.add("Second Wind");
		if (level >= 2) {
			Features.add("Action Surge (one use)");
		}
		if (level >= 3) {
			Features.add("Martial Archetype");
		}
		if (level >= 5) {
			Features.add("Extra Attack");
		}
		if (level >= 9) {
			Features.add("Indomitable (one use)");
		}
		if (level >= 11) {
			Features.add("Extra Attack (2)");
		}
		if (level >= 13) {
			Features.add("Indomitable (two uses)");
		}
		if (level >= 17) {
			Features.add("Action Surge (two uses)");
			Features.add("Indomitable (Three uses)");
		}
		if (level >= 20) {
			Features.add("Extra Attack (3)");
		}
		if (level >= 3) {
			List<String> subclass = new ArrayList<>();
			subclass.add("Champion");
			subclass.add("Battle Master");
			subclass.add("Eldritch Knight");

			ChoiceDialog<String> subclassdialog = new ChoiceDialog<>("Sub-Class", subclass);
			subclassdialog.setTitle("Subclass");
			subclassdialog.setHeaderText("Choose your subclass");
			subclassdialog.setContentText("Select Subclass");

			Optional<String> subclassResult = subclassdialog.showAndWait();
			if (subclassResult.isPresent()) {
				if (subclassResult.get().contains("Champion")) {
					Features.add("Improved Critical");
					if (level >= 7) {
						Features.add("Remarkable Athlete");
					}
					if (level >= 10) {
						Features.add("Additional Fighting Style");
					}
					if (level >= 15) {
						Features.add("Superior Critical");
					}
					if (level >= 18) {
						Features.add("Survivor");
					}
				}
				if(subclassResult.get().contains("Battle")){
					Features.add("Combat Superiority");
					Features.add("Student of War");
					if(level >= 7){
						Features.add("Know Your Enemy");
					}
					if(level >= 10){
						Features.add("Improved Combat Superiority");
					}
					if(level >= 15){
						Features.add("Relentless");
					}
				}
				if(subclassResult.get().contains("Knight")){
					Features.add("Spellcasting");
					Features.add("Weapon Bond");
					if(level >= 7){
						Features.add("War Magic");
					}
					if(level >= 10){
						Features.add("Eldritch Strike");
					}
					if(level >= 15){
						Features.add("Arcane Charge");
					}
					if(level >= 18){
						Features.add("Improved War Magic");
					}
				}
			}
		}
	}

	private void determineStartingEquipment() {
		// TODO Auto-generated method stub
		List<String> item1 = new ArrayList<>();
		item1.add("Chain Mail");
		item1.add("Leather Armor, Longbow and 20 Arrows");

		ChoiceDialog<String> dialog = new ChoiceDialog<>("Item", item1);
		dialog.setTitle("Item Selection");
		dialog.setHeaderText("Item Select");
		dialog.setContentText("Select Item");

		Optional<String> result = dialog.showAndWait();
		if (result.isPresent()) {
			equipment.add(result.get());
		}

		List<String> item2 = new ArrayList<>();
		item2.add("Martial Weapon and Shield");
		item2.add("Two Martial Weapons");

		ChoiceDialog<String> dialog2 = new ChoiceDialog<>("Item", item2);
		dialog2.setTitle("Item Selection");
		dialog2.setHeaderText("Item Select");
		dialog2.setContentText("Select Item");

		Optional<String> result2 = dialog2.showAndWait();
		if (result2.isPresent()) {
			equipment.add(result2.get());
		}

		List<String> item3 = new ArrayList<>();
		item3.add("Light Crossbow and 20 bolts");
		item3.add("Two Handaxes");

		ChoiceDialog<String> dialog3 = new ChoiceDialog<>("Item", item3);
		dialog3.setTitle("Item Selection");
		dialog3.setHeaderText("Item Select");
		dialog3.setContentText("Select Item");

		Optional<String> result3 = dialog3.showAndWait();
		if (result3.isPresent()) {
			equipment.add(result3.get());
		}

		List<String> item4 = new ArrayList<>();
		item4.add("Dungeoneer's Pack");
		item4.add("Explorer's Pack");

		ChoiceDialog<String> dialog4 = new ChoiceDialog<>("Item", item4);
		dialog4.setTitle("Item Selection");
		dialog4.setHeaderText("Item Select");
		dialog4.setContentText("Select Item");

		Optional<String> result4 = dialog4.showAndWait();
		if (result4.isPresent()) {
			equipment.add(result4.get());
		}
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

	public String getSubClass() {
		return subClass;
	}

	public void setSubClass(String subClass) {
		this.subClass = subClass;
	}

	public ArrayList<String> getEquipment() {
		return equipment;
	}

	public void setEquipment(ArrayList<String> equipment) {
		this.equipment = equipment;
	}

}
