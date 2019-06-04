package Class;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javafx.scene.control.ChoiceDialog;

public class Wizard extends ClassType {

	private final String name = "Wizard";
	private ArrayList<String> Features = new ArrayList<>();
	private ArrayList<String> Proficiencies = new ArrayList<>();
	private boolean isChosen = false;
	private String hitDice = "1d6";
	private ArrayList<String> equipment = new ArrayList<>();
	private String subClass;

	public Wizard() {

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
		Proficiencies.add("Weapon: Dagger");
		Proficiencies.add("Weapon: Dart");
		Proficiencies.add("Weapon: Sling");
		Proficiencies.add("Weapon: Quarterstaff");
		Proficiencies.add("Weapon: Light Crossbow");
		Proficiencies.add("Saving Throw: Intelligence");
		Proficiencies.add("Saving Throw: Wisdom");

		for (int i = 0; i < 2; i++) {
			List<String> skill = new ArrayList<>();
			skill.add("Arcana");
			skill.add("History");
			skill.add("Insight");
			skill.add("Investigation");
			skill.add("Medicine");
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

		Features.add("Spellcasting");
		Features.add("Arcane Recovery");
		if (level >= 2) {
			Features.add("Arcane Tradition");
		}
		if (level >= 18) {
			Features.add("Spell Mastery");
		}
		if (level >= 20) {
			Features.add("Signature Spell");
		}
		if (level >= 2) {
			List<String> subclass = new ArrayList<>();
			subclass.add("Abjuration");
			subclass.add("Conjuration");
			subclass.add("Divination");
			subclass.add("Enchantment");
			subclass.add("Evocation");
			subclass.add("Illusion");
			subclass.add("Necromancy");
			subclass.add("Transmutation");

			ChoiceDialog<String> subclassdialog = new ChoiceDialog<>("Sub-Class", subclass);
			subclassdialog.setTitle("Subclass");
			subclassdialog.setHeaderText("Choose your subclass");
			subclassdialog.setContentText("Select Subclass");

			Optional<String> subresult = subclassdialog.showAndWait();
			if (subresult.isPresent()) {
				if (subresult.get().contains("Abjuration")) {
					Features.add("Abjuration Savant");
					Features.add("Arcane Ward");
					if (level >= 6) {
						Features.add("Projected Ward");
					}
					if (level >= 10) {
						Features.add("Improved Abjuration");
					}
					if (level >= 14) {
						Features.add("Spell Resistance");
					}
				}
				if (subresult.get().contains("Conjuration")) {
					Features.add("Conjuration Savant");
					Features.add("Minor Conjuration");
					if (level >= 6) {
						Features.add("Benign Transposition");
					}
					if (level >= 10) {
						Features.add("Focused Conjuration");
					}
					if (level >= 14) {
						Features.add("Durable Summons");
					}
				}
				if (subresult.get().contains("Divination")) {
					Features.add("Divination Savant");
					Features.add("Portent");
					if (level >= 6) {
						Features.add("Expert Divination");
					}
					if (level >= 10) {
						Features.add("The Third Eye");
					}
					if (level >= 14) {
						Features.add("Greater Portent");
					}
				}
				if (subresult.get().contains("Enchantment")) {
					Features.add("Enchantment Savant");
					Features.add("Hypnotic Gaze");
					if (level >= 6) {
						Features.add("Instinctive Charm");
					}
					if (level >= 10) {
						Features.add("Split Enchantment");
					}
					if (level >= 14) {
						Features.add("Alter Memories");
					}
				}
				if (subresult.get().contains("Evocation")) {
					Features.add("Evocation Sevant");
					Features.add("Sculpt Spells");
					if(level >= 6){
						Features.add("Potent Cantrip");
					}
					if(level >= 10){
						Features.add("Empowered Evocation");
					}
					if(level >= 14){
						Features.add("Overchannel");
					}
				}
				if(subresult.get().contains("Illusion")){
					Features.add("Illusion Savant");
					Features.add("Improved Minor Illusion");
					if(level >= 6){
						Features.add("Malleable Illusions");
					}
					if(level >= 10){
						Features.add("Illusory Self");
					}
					if(level >= 14){
						Features.add("Illusory Reality");
					}
				}
				if(subresult.get().contains("Necromancy")){
					Features.add("Necromancy Savant");
					Features.add("Grim Harvest");
					if(level >= 6){
						Features.add("Undead Thralls");
					}
					if(level >= 10){
						Features.add("Inured to Death");
					}
					if(level >= 14){
						Features.add("Command Undead");
					}
				}
				if(subresult.get().contains("Transmutation")){
					Features.add("Transmutation Savant");
					Features.add("Minor Alchemy");
					if(level >= 6){
						Features.add("Transmuter's Stone");
					}
					if(level >= 10){
						Features.add("Shapechanger");
					}
					if(level >= 14){
						Features.add("Master Transmuter");
					}
				}
			}
		}
	}

	private void determineStartingEquipment() {
		// TODO Auto-generated method stub
		List<String> item = new ArrayList<>();
		item.add("Quarterstaff");
		item.add("Dagger");

		ChoiceDialog<String> dialog = new ChoiceDialog<>("Item", item);
		dialog.setTitle("Item Select");
		dialog.setHeaderText("Select Item");
		dialog.setContentText("Select Item");

		Optional<String> result = dialog.showAndWait();
		if (result.isPresent()) {
			equipment.add(result.get());
		}

		item.clear();

		item.add("Component Pouch");
		item.add("Arcane Focus");

		ChoiceDialog<String> dialog2 = new ChoiceDialog<>("Item", item);
		dialog2.setTitle("Item Select");
		dialog2.setHeaderText("Select Item");
		dialog2.setContentText("Select Item");

		result = dialog2.showAndWait();
		if (result.isPresent()) {
			equipment.add(result.get());
		}

		item.clear();

		item.add("Scholar's Pack");
		item.add("Explorer's Pack");

		ChoiceDialog<String> dialog3 = new ChoiceDialog<>("Item", item);
		dialog3.setTitle("Item Select");
		dialog3.setHeaderText("Select Item");
		dialog3.setContentText("Select Item");

		result = dialog3.showAndWait();
		if (result.isPresent()) {
			equipment.add(result.get());
		}

		equipment.add("Spellbook");
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
