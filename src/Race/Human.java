package Race;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

import javafx.scene.control.TextInputDialog;

public class Human extends Race {

	private int[] abilities = { 1, 1, 1, 1, 1, 1 };
	private ArrayList<String> Features = new ArrayList<>();
	private ArrayList<String> Proficiencies = new ArrayList<>();
	private final String race = "Human";
	private final int speed = 30;
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

	public Human() {

	}

	private void fillProficiencies() {
		// TODO Auto-generated method stub
		Proficiencies.add("Language: Common");
		TextInputDialog dialog = new TextInputDialog("walter");
		dialog.setTitle("Text Input Dialog");
		dialog.setHeaderText("Look, a Text Input Dialog");
		dialog.setContentText("Enter another language to speak");

		// Traditional way to get the response value.
		Optional<String> result = dialog.showAndWait();
		if (result.isPresent()) {
			Proficiencies.add(result.get());
		}
	}

	private void fillFeatures() {
		// TODO Auto-generated method stub

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
