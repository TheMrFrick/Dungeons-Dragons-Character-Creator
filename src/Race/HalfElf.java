package Race;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.TextInputDialog;

public class HalfElf extends Race {

	private int[] abilities = { 0, 0, 0, 0, 0, 0 };
	private ArrayList<String> Features = new ArrayList<>();
	private ArrayList<String> Proficiencies = new ArrayList<>();
	private final String race = "Half-Elf";
	private final int speed = 30;
	public boolean isChosen = false;

	@Override
	public void setChosen(boolean chosen) {
		isChosen = chosen;
		if (isChosen) {
			fillFeatures();
			fillProficiencies();
			determineAbilities();
		}
	}

	@Override
	public boolean isChosen() {
		return isChosen;
	}

	public HalfElf() {

	}

	private void determineAbilities() {
		// TODO Auto-generated method stub
		int count = 2;
		while (count > 0) {
			List<String> choices = new ArrayList<>();
			choices.add("Strength");
			choices.add("Dexterity");
			choices.add("Constitution");
			choices.add("Intelligence");
			choices.add("Wisdom");
			choices.add("Charisma");

			ChoiceDialog<String> dialog = new ChoiceDialog<>("Abilities", choices);
			dialog.setTitle("Choose Abilities score");
			dialog.setHeaderText("Ability Score Choice");
			dialog.setContentText("Choose your Ability to Increment");

			// Traditional way to get the response value.
			Optional<String> result = dialog.showAndWait();
			if (result.isPresent()) {
				if (result.get().equals("Strength"))
					abilities[0]++;
				if (result.get().equals("Dexterity"))
					abilities[1]++;
				if (result.get().equals("Constitution"))
					abilities[2]++;
				if (result.get().equals("Intelligence"))
					abilities[3]++;
				if (result.get().equals("Wisdom"))
					abilities[4]++;
				if (result.get().equals("Charisma"))
					abilities[5]++;
				count--;
			}
		}
	}

	private void fillProficiencies() {
		// TODO Auto-generated method stub
		Proficiencies.add("Skill Versatility");
		Proficiencies.add("Language: Common");
		Proficiencies.add("Language: Elvish");
		int count = 2;
		while (count > 0) {
			List<String> choices = new ArrayList<>();
			choices.add("Acrobatics");
			choices.add("Animal Handling");
			choices.add("Arcana");
			choices.add("Athletics");
			choices.add("Deception");
			choices.add("History");
			choices.add("Insight");
			choices.add("Intimidation");
			choices.add("Investigation");
			choices.add("Medicine");
			choices.add("Nature");
			choices.add("Perception");
			choices.add("Performance");
			choices.add("Persuasion");
			choices.add("Religion");
			choices.add("Sleight of Hand");
			choices.add("Stealth");
			choices.add("Survival");

			ChoiceDialog<String> dialog = new ChoiceDialog<>("Skills", choices);
			dialog.setTitle("Skills Choice");
			dialog.setHeaderText("Choose a Skill");
			dialog.setContentText("Choose your skill to be proficient in:");

			// Traditional way to get the response value.
			Optional<String> result = dialog.showAndWait();
			if (result.isPresent()) {
				Proficiencies.add("Skill: " + result.get());
				choices.remove(result.get());
				count--;
			}
		}
		TextInputDialog dialog = new TextInputDialog("Common");
		dialog.setTitle("Text Input Dialog");
		dialog.setHeaderText("Add another language");
		dialog.setContentText("Enter another language to speak");

		// Traditional way to get the response value.
		Optional<String> result = dialog.showAndWait();
		if (result.isPresent()) {
			Proficiencies.add("Language: " + result.get());
		}
	}

	private void fillFeatures() {
		// TODO Auto-generated method stub
		Features.add("Darkvision");
		Features.add("Fey Ancestry");
	}

	@Override
	public int[] getAbilities() {
		// TODO Auto-generated method stub
		return abilities;
	}

	@Override
	public ArrayList<String> getFeatures() {
		// TODO Auto-generated method stub
		return Features;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		String info = "";
		String line = "";
		try {
			FileReader fr = new FileReader(race + ".txt");
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
	public ArrayList<String> getProficiencies() {
		// TODO Auto-generated method stub
		return Proficiencies;
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return speed;
	}

	@Override
	public String getRace() {
		// TODO Auto-generated method stub
		return race;
	}

}
