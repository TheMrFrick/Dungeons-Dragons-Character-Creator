package Class;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javafx.scene.control.ChoiceDialog;

public class Ranger extends ClassType {
	
	private final String name = "Ranger";
	private ArrayList<String> Features = new ArrayList<>();
	private ArrayList<String> Proficiencies = new ArrayList<>();
	private boolean isChosen = false;
	private String hitDice = "1d10";
	private ArrayList<String> equipment = new ArrayList<>();
	private String subClass;

	
	public Ranger(){
		
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
		Proficiencies.add("Weapons: Martial");
		Proficiencies.add("Saving Throw: Strength");
		Proficiencies.add("Saving Throw: Dexterity");
		
		
		for(int i = 0; i < 3; i++){
			List<String> skills = new ArrayList<>();
			skills.add("Animal Handling");
			skills.add("Athletics");
			skills.add("Insight");
			skills.add("Investigation");
			skills.add("Nature");
			skills.add("Perception");
			skills.add("Stealth");
			skills.add("Survival");
			
			ChoiceDialog<String> dialog = new ChoiceDialog<>("Skill", skills);
			dialog.setTitle("Choose Skill");
			dialog.setHeaderText("Select Skill");
			dialog.setContentText("Select Skills");

			Optional<String> result = dialog.showAndWait();
			if (result.isPresent()) {
				Proficiencies.add("Skill: " + result.get());
			}
		}
		determineStartingEquipment();
		
		Features.add("Favored Enemy");
		Features.add("Natural Explorer");
		if(level >= 2){
			Features.add("Fighting Style");
			Features.add("Spellcasting");
		}
		if(level >= 3){
			Features.add("Ranger Archtype");
			Features.add("Primeval Awareness");
		}
		if(level >= 5){
			Features.add("Extra Attack");
		}
		if(level >= 6){
			Features.add("Favored Enemy and Natural Explorer Improvements");
		}
		if(level >= 8){
			Features.add("Land's Stride");
		}
		if(level >= 10){
			Features.add("Natural Explorer Improvement");
			Features.add("Hide in Plain Sight");
		}
		if(level >= 14){
			Features.add("Favored Enemy Improvement");
			Features.add("Vanish");
		}
		if(level >= 18){
			Features.add("Feral Senses");
		}
		if(level >= 20){
			Features.add("For Slayer");
		}
		if(level >= 3){
			List<String> subclass = new ArrayList<>();
			subclass.add("Hunter");
			subclass.add("Beast Master");
			
			ChoiceDialog<String> subclassdialog = new ChoiceDialog<>("Sub-Class", subclass);
			subclassdialog.setTitle("Subclass");
			subclassdialog.setHeaderText("Choose your subclass");
			subclassdialog.setContentText("Select Subclass");
			
			Optional<String> subresult = subclassdialog.showAndWait();
			if(subresult.isPresent()){
				if(subresult.get().contains("Hunter")){
					Features.add("Hunter's Prey");
					if(level >= 7){
						Features.add("Defensive Tactics");
					}
					if(level >= 11){
						Features.add("Multiattack");
					}
					if(level >= 15){
						Features.add("Superior Hunter's Defense");
					}
				}
				if(subresult.get().contains("Beast")){
					Features.add("Ranger's Companion");
					if(level >= 7){
						Features.add("Exceptional Training");
					}
					if(level >= 11){
						Features.add("Beastial Fury");
					}
					if(level >= 15){
						Features.add("Share Spells");
					}
				}
				
			}
		}
	}

	private void determineStartingEquipment() {
		// TODO Auto-generated method stub
		List<String> item = new ArrayList<>();
		item.add("Chain Mail");
		item.add("Leather Armor");
		
		ChoiceDialog<String> dialog = new ChoiceDialog<>("Item", item);
		dialog.setTitle("Item Select");
		dialog.setHeaderText("Select Item");
		dialog.setContentText("Select Item");

		Optional<String> result = dialog.showAndWait();
		if (result.isPresent()) {
			equipment.add(result.get());
		}
		
		item.clear();
		
		item.add("two shortswords");
		item.add("two simple melee weapons");
		
		ChoiceDialog<String> dialog2 = new ChoiceDialog<>("Item", item);
		dialog2.setTitle("Item Select");
		dialog2.setHeaderText("Select Item");
		dialog2.setContentText("Select Item");

		//Optional<String> result = dialog.showAndWait();
		result = dialog2.showAndWait();
		if (result.isPresent()) {
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
		
		equipment.add("Longbow");
		equipment.add("20 arrow");
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
