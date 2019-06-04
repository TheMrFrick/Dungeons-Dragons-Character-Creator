package Race;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javafx.scene.control.ChoiceDialog;

public class HillDwarf extends Race {

	private int[] abilities = { 0, 0, 2, 0, 1, 0 };
	private ArrayList<String> Features = new ArrayList<>();
	private ArrayList<String> Proficiencies = new ArrayList<>();
	private final String race = "HillDwarf";
	private final int speed = 25;
	public boolean isChosen = false;

	@Override
	public void setChosen(boolean chosen) {
		isChosen = chosen;
		if (isChosen) {
			fillFeatures();
			fillProficiencies();
		}
	}

	@Override
	public boolean isChosen() {
		return isChosen;
	}

	public HillDwarf() {

	}

	private void fillProficiencies() {
		// TODO Auto-generated method stub
		Proficiencies.add("Weapon: BattleAxe");
		Proficiencies.add("Weapon: HandAxe");
		Proficiencies.add("Weapon: Throwing Hammer");
		Proficiencies.add("Weapon: Warhammer");

		List<String> choices = new ArrayList<>();
		choices.add("Smith's Tools");
		choices.add("Mason's Tools");
		choices.add("Brewer's Supplies");

		ChoiceDialog<String> dialog = new ChoiceDialog<>("b", choices);
		dialog.setTitle("Choice Dialog");
		dialog.setHeaderText("Look, a Choice Dialog");
		dialog.setContentText("Choose a tool to be proficient in");

		// Traditional way to get the response value.
		Optional<String> result = dialog.showAndWait();
		if (result.isPresent()) {
			Proficiencies.add(result.get());
		}

		Proficiencies.add("Language: Common");
		Proficiencies.add("Language: Dwarven");
	}

	private void fillFeatures() {
		// TODO Auto-generated method stub
		Features.add("Darkvision");
		Features.add("Dwarven Resilience");
		Features.add("Stone Cunning");
		Features.add("Dwarven Toughness");
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
