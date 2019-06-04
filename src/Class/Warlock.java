package Class;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javafx.scene.control.ChoiceDialog;

public class Warlock extends ClassType {
	
	private final String name = "Warlock";
	private ArrayList<String> Features = new ArrayList<>();
	private ArrayList<String> Proficiencies = new ArrayList<>();
	private boolean isChosen = false;
	private String hitDice = "1d8";
	private ArrayList<String> equipment = new ArrayList<>();
	private String subClass;

	
	public Warlock(){
		
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
		Proficiencies.add("Saving Throw: Wisdom");
		Proficiencies.add("Saving Throw: Charisma");
		
		for(int i = 0; i < 2; i++){
			List<String> skill = new ArrayList<>();
			skill.add("Arcana");
			skill.add("Deception");
			skill.add("History");
			skill.add("Intimidation");
			skill.add("Investigation");
			skill.add("Nature");
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
		
		Features.add("Otherworldly Patron");
		Features.add("Pact Magic");
		if(level >= 2){
			Features.add("Eldritch Invocations");
		}
		if(level >= 3){
			Features.add("Pact Boon");
		}
		if(level >= 11){
			Features.add("Mystic Arcanum (6th level)");
		}
		if(level >= 13){
			Features.add("Mystic Arcanum (7th level)");
		}
		if(level >= 15){
			Features.add("Mystic Arcanum (8th level)");
		}
		if(level >= 17){
			Features.add("Mystic Arcanum (9th level)");
		}
		if(level >= 20){
			Features.add("Eldritch Master");
		}
		
		List<String> subclass = new ArrayList<>();
		subclass.add("Archfey");
		subclass.add("Fiend");
		subclass.add("Great Old One");
		
		ChoiceDialog<String> subclassdialog = new ChoiceDialog<>("Sub-Class", subclass);
		subclassdialog.setTitle("Subclass");
		subclassdialog.setHeaderText("Choose your subclass");
		subclassdialog.setContentText("Select Subclass");

		Optional<String> subresult = subclassdialog.showAndWait();
		if(subresult.isPresent()){
			if(subresult.get().contains("Archfey")){
				Features.add("Expanded Spell List");
				Features.add("Fey Presense");
				if(level >= 6){
					Features.add("Misty Escape");
				}
				if(level >= 10){
					Features.add("Beguiling Defense");
				}
				if(level >= 14){
					Features.add("Dark Delirium");
				}
			}
			if(subresult.get().contains("Fiend")){
				Features.add("Expanded Spell List");
				Features.add("Dark One's Blessing");
				if(level >= 6){
					Features.add("Dark One's Own Luck");
				}
				if(level >= 10){
					Features.add("Fiendish Resilience");
				}
				if(level >= 14){
					Features.add("Hurl Through Hell");
				}
			}
			if(subresult.get().contains("Great")){
				Features.add("Expanded Spell List");
				Features.add("Awakened Mind");
				if(level >= 6){
					Features.add("Entropic Wind");
				}
				if(level >= 10){
					Features.add("Thought Shield");
				}
				if(level >= 14){
					Features.add("Create Thrall");
				}
			}
		}
	}

	private void determineStartingEquipment() {
		// TODO Auto-generated method stub
		List<String> item = new ArrayList<>();
		item.add("Light Crossbow and 20 bolts");
		item.add("Club");
		item.add("Dagger");
		item.add("Greatclub");
		item.add("Javelin");
		item.add("Light Hammer");
		item.add("Mace");
		item.add("Quarterstaff");
		item.add("Sickle");
		item.add("Spear");
		item.add("Crossbow, light");
		item.add("Dart");
		item.add("Shortbow");
		item.add("Sling");
		
		ChoiceDialog<String> dialog = new ChoiceDialog<>("Item", item);
		dialog.setTitle("Item Select");
		dialog.setHeaderText("Select Item");
		dialog.setContentText("Select Item");

		Optional<String> result = dialog.showAndWait();
		if (result.isPresent()) {
			equipment.add(result.get());
		}
		
		item.clear();
		
		item.add("Compenent Pouch");
		item.add("Arcane Focus");
		
		ChoiceDialog<String> dialog2 = new ChoiceDialog<>("Item", item);
		dialog2.setTitle("Item Select");
		dialog2.setHeaderText("Select Item");
		dialog2.setContentText("Select Item");
		
		result = dialog2.showAndWait();
		if(result.isPresent()){
			equipment.add(result.get());
		}
		
		item.clear();
		
		item.add("Scholar's Pack");
		item.add("Dungeoneer's Pack");
		
		
		ChoiceDialog<String> dialog3 = new ChoiceDialog<>("Item", item);
		dialog3.setTitle("Item Select");
		dialog3.setHeaderText("Select Item");
		dialog3.setContentText("Select Item");
		
		result = dialog3.showAndWait();
		if(result.isPresent()){
			equipment.add(result.get());
		}
		
		equipment.add("Leather Armor");
		equipment.add("Simple Weapon");
		equipment.add("Dagger");
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
