package Class;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.TextInputDialog;

public class Cleric extends ClassType {

	private final String name = "Cleric";
	private ArrayList<String> Features = new ArrayList<>();
	private ArrayList<String> Proficiencies = new ArrayList<>();
	private boolean isChosen = false;
	private String hitDice = "1d8";
	private ArrayList<String> equipment = new ArrayList<>();
	private String subClass;

	public Cleric() {

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
		Proficiencies.add("Weapons: Simple");
		Proficiencies.add("Saving Throw: Wisdom");
		Proficiencies.add("Saving Throw: Charisma");

		int count = 2;
		while (count > 0) {
			List<String> profSkill = new ArrayList<>();
			profSkill.add("History");
			profSkill.add("Insight");
			profSkill.add("Medicine");
			profSkill.add("Persuasion");
			profSkill.add("Religion");

			ChoiceDialog<String> profSkillDialog = new ChoiceDialog<>("Proficient Skill", profSkill);
			profSkillDialog.setTitle("Proficient Skill");
			profSkillDialog.setHeaderText("Proficient Skill Choice");
			profSkillDialog.setContentText("Choose your proficient skill");

			Optional<String> result = profSkillDialog.showAndWait();
			if (result.isPresent()) {
				Proficiencies.add("Skill: " + result.get());
				count--;
			}
		}
		determineStartingEquipment();

		Features.add("Spellcasting");
		Features.add("Divine Domain");
		if (level >= 2) {
			Features.add("Channel Divinity (1/rest)");
		}
		if (level >= 5) {
			Features.add("Destroy Undead (CR 1/2)");
		}
		if (level >= 6) {
			Features.add("Channel Divinity (2/rest)");
		}
		if (level >= 8) {
			Features.add("Destroy Undead (CR 1)");
		}
		if (level >= 10) {
			Features.add("Divine Intervention");
		}
		if (level >= 11) {
			Features.add("Destroy Undead (CR 2)");
		}
		if (level >= 14) {
			Features.add("Destroy Undead (CR 3)");
		}
		if (level >= 17) {
			Features.add("Destroy Undead (CR 4)");
		}
		if (level >= 18) {
			Features.add("Channel Divinity (3/rest)");
		}
		if (level >= 20) {
			Features.add("Divine Intervention Improvement");
		}

		List<String> subClasses = new ArrayList<>();
		subClasses.add("Knowledge");
		subClasses.add("Life");
		subClasses.add("Light");
		subClasses.add("Nature");
		subClasses.add("Tempest");
		subClasses.add("Trickery");
		subClasses.add("War");

		ChoiceDialog<String> subClassDialog = new ChoiceDialog<>("Sub Classes", subClasses);
		subClassDialog.setTitle("Sub Classes");
		subClassDialog.setHeaderText("Select Sub-Class");
		subClassDialog.setContentText("Select Sub-Class:");

		Optional<String> resultSubClass = subClassDialog.showAndWait();
		if (resultSubClass.isPresent()) {
			if (resultSubClass.get().contains("Knowledge")) {
				for (int i = 0; i < 2; i++) {
					TextInputDialog dialog = new TextInputDialog("Common");
					dialog.setTitle("Text Input Dialog");
					dialog.setHeaderText("Add another language");
					dialog.setContentText("Enter another language to speak");

					// Traditional way to get the response value.
					Optional<String> result = dialog.showAndWait();
					if (result.isPresent()) {
						Proficiencies.add("Language: " + result.get());
					}
					
					List<String> skills = new ArrayList<>();
					skills.add("Arcana");
					skills.add("History");
					skills.add("Nature");
					skills.add("Religion");
					
					ChoiceDialog<String> skillDialog = new ChoiceDialog<>("Skill", skills);
					skillDialog.setTitle("Skill Select");
					skillDialog.setHeaderText("Select Skill");
					skillDialog.setContentText("Select Skill: ");
					
					Optional<String> result1 = skillDialog.showAndWait();
					if(result1.isPresent()){
						Proficiencies.add("Expertise: " + result1.get());
					}
					if(level >= 2){
						Features.add("Channel Divinity: Knowledge of the Ages");
					}
					if(level >= 6){
						Features.add("Channel Divinity: Read Thoughts");
					}
					if(level >= 8){
						Features.add("Potent Spellcasting");
					}
					if(level >= 17){
						Features.add("Visions from the Past");
					}
				}
				if(resultSubClass.get().contains("Life")){
					Features.add("Disciple of Life");
					if(level >= 2){
						Features.add("Channel Divinity: Preserve Life");
					}
					if(level >= 6){
						Features.add("Blessed Healing");
					}
					if(level >= 8){
						Features.add("Divine Strike");
					}
					if(level >= 17){
						Features.add("Supreme Healing");
					}
				}
				if(resultSubClass.get().contains("Light")){
					Features.add("Bonus Cantrip: Light");
					Features.add("Warding Flare");
					if(level >= 2){
						Features.add("Channel Divinity: Radiance of the Dawn");
					}
					if(level >= 6){
						Features.add("Improved Flare");
					}
					if(level >= 8){
						Features.add("Potent Spellcasting");
					}
					if(level >= 17){
						Features.add("Corona of Light");
					}
				}
				if(resultSubClass.get().contains("Nature")){
					List<String> skills = new ArrayList<>();
					skills.add("Animal Handling");
					skills.add("Nature");
					skills.add("Survival");
					
					ChoiceDialog<String> dialog = new ChoiceDialog<>("Skills", skills);
					dialog.setTitle("Skill Select");
					dialog.setHeaderText("Select Skills");
					dialog.setContentText("Select Skill");
					
					Optional<String> result = dialog.showAndWait();
					if(result.isPresent()){
						Proficiencies.add("Skill: " + result.get() );
					}
					Proficiencies.add("Armor: Heavy");
					if(level >= 2){
						Features.add("Channel Divinity: Charm Animals and Plants");
					}
					if(level >= 6){
						Features.add("Dampen Elements");
					}
					if(level >= 8){
						Features.add("Divine Strike");
					}
					if(level >= 17){
						Features.add("Master of Nature");
					}
				}
				if(resultSubClass.get().contains("Tempest")){
					Proficiencies.add("Weapons: Martial");
					Proficiencies.add("Armor: Heavy");
					Features.add("Wrath of the Storm");
					if(level >= 2){
						Features.add("Channel Divinity: Destructive Wrath");
					}
					if(level >= 6){
						Features.add("Thunderbolt Strike");
					}
					if(level >= 8){
						Features.add("Divine Strike");
					}
					if(level >= 17){
						Features.add("Stormborn");
					}
				}
				if(resultSubClass.get().contains("Trickery")){
					Features.add("Blessing of the Trickster");
					if(level >= 2){
						Features.add("Channel Divinity: Invoke Duplicity");
					}
					if(level >= 6){
						Features.add("Channel Divinity: Cloak of Shadows");
					}
					if(level >= 8){
						Features.add("Divine Strike");
					}
					if(level >= 17){
						Features.add("Improved Duplicity");
					}
				}
				if(resultSubClass.get().contains("War")){
					Proficiencies.add("Armor: Heavy");
					Proficiencies.add("Weapons: Martial");
					Features.add("War Priest");
					if(level >= 2){
						Features.add("Channel Divinity: Guided Strike");
					}
					if(level >= 6){
						Features.add("Channel Divinity: War God's Blessing");
					}
					if(level >= 8){
						Features.add("Divine Strike");
					}
					if(level >= 17){
						Features.add("Avatar of Battle");
					}
				}
			}
		}
	}

	private void determineStartingEquipment() {
		// TODO Auto-generated method stub
		List<String> item1 = new ArrayList<>();
		item1.add("Mace");
		item1.add("Warhammer");

		ChoiceDialog<String> item1Dialog = new ChoiceDialog<>("Item", item1);
		item1Dialog.setTitle("Item Choice");
		item1Dialog.setHeaderText("Item Choice");
		item1Dialog.setContentText("Choose your Item");

		Optional<String> item1result = item1Dialog.showAndWait();
		if (item1result.isPresent()) {
			equipment.add(item1result.get());
		}

		List<String> item2 = new ArrayList<>();
		item2.add("Scale Mail");
		item2.add("Leather Armor");
		item2.add("Chain Mail");

		ChoiceDialog<String> item2Dialog = new ChoiceDialog<>("Item", item2);
		item2Dialog.setTitle("Item Choice");
		item2Dialog.setHeaderText("Item Choice");
		item2Dialog.setContentText("Choose your Item");

		Optional<String> item2result = item2Dialog.showAndWait();
		if (item2result.isPresent()) {
			equipment.add(item2result.get());
		}

		List<String> item3 = new ArrayList<>();
		item3.add("Crossbow and 20 Bolts");
		item3.add("Club");
		item3.add("Dagger");
		item3.add("Greatclub");
		item3.add("Javelin");
		item3.add("Light Hammer");
		item3.add("Mace");
		item3.add("Quarterstaff");
		item3.add("Sickle");
		item3.add("Spear");
		item3.add("Crossbow, light");
		item3.add("Dart");
		item3.add("Shortbow");
		item3.add("Sling");

		ChoiceDialog<String> item3Dialog = new ChoiceDialog<>("Item", item3);
		item3Dialog.setTitle("Item Choice");
		item3Dialog.setHeaderText("Item Choice");
		item3Dialog.setContentText("Choose your Item");

		Optional<String> item3result = item3Dialog.showAndWait();
		if (item3result.isPresent()) {
			equipment.add(item3result.get());
		}

		List<String> item4 = new ArrayList<>();
		item4.add("Priest's Pack");
		item4.add("Explorer's Pack");

		ChoiceDialog<String> item4Dialog = new ChoiceDialog<>("Item", item4);
		item4Dialog.setTitle("Item Choice");
		item4Dialog.setHeaderText("Item Choice");
		item4Dialog.setContentText("Choose your Item");

		Optional<String> item4result = item4Dialog.showAndWait();
		if (item4result.isPresent()) {
			equipment.add(item4result.get());
		}

		equipment.add("Shield");
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

	@Override
	public ArrayList<String> getEquipment() {
		// TODO Auto-generated method stub
		return equipment;
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
