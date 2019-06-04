package Class;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javafx.scene.control.ChoiceDialog;

public class Druid extends ClassType {
	private final String name = "Druid";
	private ArrayList<String> Features = new ArrayList<>();
	private ArrayList<String> Proficiencies = new ArrayList<>();
	private boolean isChosen = false;
	private String hitDice = "1d8";
	private ArrayList<String> equipment = new ArrayList<>();
	private String subClass;

	public Druid() {

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
		Proficiencies.add("Weapon: Club");
		Proficiencies.add("Weapon: Dagger");
		Proficiencies.add("Weapon: Dart");
		Proficiencies.add("Weapon: Javelin");
		Proficiencies.add("Weapon: Mace");
		Proficiencies.add("Weapon: Quarterstaff");
		Proficiencies.add("Weapon: Scimitar");
		Proficiencies.add("Weapon: Sickle");
		Proficiencies.add("Weapon: Sling");
		Proficiencies.add("Weapon: Spear");
		Proficiencies.add("Tool: Herbalism Kit");
		Proficiencies.add("Saving Throw: Intelligence");
		Proficiencies.add("Saving Throw: Wisdom");
		for (int i = 0; i < 2; i++) {
			List<String> skill = new ArrayList<>();
			skill.add("Arcana");
			skill.add("Animal Handling");
			skill.add("Insight");
			skill.add("Medicine");
			skill.add("Nature");
			skill.add("Perception");
			skill.add("Religion");
			skill.add("Survival");

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
		Features.add("Druidic");
		Features.add("Spellcasting");
		if(level >= 2){
			Features.add("Wild Shape");
			Features.add("Druid Circle");
		}
		if(level >= 4){
			Features.add("Wild Shape Improvement");
		}
		if(level >=18){
			Features.add("Timeless Body");
			Features.add("Beast Spells");
		}
		if(level >= 20){
			Features.add("Arch Druid");
		}
		
		if(level >= 2){
			List<String> subclass = new ArrayList<>();
			subclass.add("Circle of the Moon");
			subclass.add("Circle of the Land");
			
			ChoiceDialog<String> dialog = new ChoiceDialog<>("Subclass", subclass);
			dialog.setTitle("Subclass Choice");
			dialog.setHeaderText("Subclass Select");
			dialog.setContentText("Select Subclass");
			
			Optional<String> result = dialog.showAndWait();
			if(result.isPresent()){
				if(result.get().contains("Land")){
					Features.add("Bonus Cantrip");
					Features.add("Natural Recovery");
					if(level >= 3){
						Features.add("Circle Spells");
					}
					if(level >= 6){
						Features.add("Land's Stride");
					}
					if(level >= 10){
						Features.add("Nature's Ward");
					}
					if(level >=14){
						Features.add("Nature's Sanctuary");
					}
				}
				if(result.get().contains("Moon")){
					Features.add("Combat Wild Shape");
					Features.add("Circle Forms");
					if(level >= 6){
						Features.add("Primal Strike");
					}
					if(level >= 10){
						Features.add("Elemental Wild Shape");
					}
					if(level >= 14){
						Features.add("Thousand Forms");
					}
				}
			}
		}
	}

	private void determineStartingEquipment() {
		// TODO Auto-generated method stub
		List<String> item1 = new ArrayList<>();
		item1.add("Wooden Shield");
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
		
		ChoiceDialog<String> dialog = new ChoiceDialog<>("Item", item1);
		dialog.setTitle("Item Selection");
		dialog.setHeaderText("Item Select");
		dialog.setContentText("Select Item");
		
		Optional<String> result = dialog.showAndWait();
		if(result.isPresent()){
			equipment.add(result.get());
		}
		
		List<String> item2 = new ArrayList<>();
		item2.add("Rapier");
		item2.add("Club");
		item2.add("Dagger");
		item2.add("Greatclub");
		item2.add("Javelin");
		item2.add("Light Hammer");
		item2.add("Mace");
		item2.add("Quarterstaff");
		item2.add("Sickle");
		item2.add("Spear");
		
		ChoiceDialog<String> dialog2 = new ChoiceDialog<>("Item", item2);
		dialog2.setTitle("Item Selection");
		dialog2.setHeaderText("Item Select");
		dialog2.setContentText("Select Item");
		
		Optional<String> result2 = dialog2.showAndWait();
		if(result2.isPresent()){
			equipment.add(result2.get());
		}
		equipment.add("Leather armor");
		equipment.add("Explorer's Pack");
		equipment.add("Druidic Focus");
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
