package Class;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javafx.scene.control.ChoiceDialog;

public class Sorcerer extends ClassType {
	
	private final String name = "Sorcerer";
	private ArrayList<String> Features = new ArrayList<>();
	private ArrayList<String> Proficiencies = new ArrayList<>();
	private boolean isChosen = false;
	private String hitDice = "1d6";
	private ArrayList<String> equipment = new ArrayList<>();
	private String subClass;

	
	public Sorcerer(){
		
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
		Proficiencies.add("Saving Throw: Constitution");
		Proficiencies.add("Saving Throw: Charisma");
		
		for(int i = 0; i < 2; i++){
			List<String> skill = new ArrayList<>();
			skill.add("Arcana");
			skill.add("Deception");
			skill.add("Insight");
			skill.add("Intimidation");
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
		
		Features.add("Spellcasting");
		Features.add("Spellcasting Origin");
		if(level >= 2){
			Features.add("Font of Magic");
		}
		if(level >= 3){
			Features.add("Metamagic");
		}
		if(level >= 10){
			Features.add("Metamagic");
		}
		if(level >= 17){
			Features.add("Metamagic");
		}
		if(level >= 20){
			Features.add("Sorcerous Restoration");
		}
		
		List<String> subclass = new ArrayList<>();
		subclass.add("Draconic Bloodline");
		subclass.add("Wild Magic");
		
		ChoiceDialog<String> subclassdialog = new ChoiceDialog<>("Sub-Class", subclass);
		subclassdialog.setTitle("Subclass");
		subclassdialog.setHeaderText("Choose your subclass");
		subclassdialog.setContentText("Select Subclass");

		Optional<String> subresult = subclassdialog.showAndWait();
		if(subresult.isPresent()){
			if(subresult.get().contains("Draconic")){
				Features.add("Dragon Ancestor");
				Features.add("Draconic Resilience");
				if(level >= 6){
					Features.add("Elemental Affinity");
				}
				if(level >= 14){
					Features.add("Dragon Wings");
				}
				if(level >= 18){
					Features.add("Draconic Presence");
				}
			}
			if(subresult.get().contains("Wild")){
				Features.add("Wild Magic Surge");
				Features.add("Tides of Chaos");
				if(level >= 6){
					Features.add("Bend Luck");
				}
				if(level >= 14){
					Features.add("Controlled Chaos");
				}
				if(level >= 18){
					Features.add("Spell Bombardment");
				}
			}
		}
	}

	private void determineStartingEquipment() {
		// TODO Auto-generated method stub
		List<String> item = new ArrayList<>();
		item.add("Light Crossbow and 20 bolts" );
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
		
		item.add("Component Pouch");
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
		
		item.add("Dungeoneer's Pack");
		item.add("Explorer's Pack");
		
		ChoiceDialog<String> dialog3 = new ChoiceDialog<>("Item", item);
		dialog3.setTitle("Item Select");
		dialog3.setHeaderText("Select Item");
		dialog3.setContentText("Select Item");
		
		result = dialog3.showAndWait();
		if(result.isPresent()){
			equipment.add(result.get());
		}
		
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
