package Race;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DarkElf extends Race {

	private int[] abilities = { 0, 2, 0, 0, 0, 1 };
	private ArrayList<String> Features = new ArrayList<>();
	private ArrayList<String> Proficiencies = new ArrayList<>();
	private final String race = "DarkElf(Drow)";
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

	public DarkElf() {

	}

	private void fillProficiencies() {
		// TODO Auto-generated method stub
		Proficiencies.add("Perception");
		Proficiencies.add("Language: Common");
		Proficiencies.add("Language: Elvish");
		Proficiencies.add("Weapon: Rapiers");
		Proficiencies.add("Weapon: Shortsword");
		Proficiencies.add("Weapon: Crossbows");
	}

	private void fillFeatures() {
		// TODO Auto-generated method stub
		Features.add("Keen Senses");
		Features.add("Superior Darkvision");
		Features.add("Fey Ancestry");
		Features.add("Trance");
		Features.add("Sunlight Sensitivity");
		Features.add("Drow Magic");
	}

	public int[] getAbilities() {
		// TODO Auto-generated method stub
		return abilities;
	}

	public ArrayList<String> getFeatures() {
		// TODO Auto-generated method stub
		return Features;
	}

	public String getInfo() {
		// TODO Auto-generated method stub
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

	public ArrayList<String> getProficiencies() {
		// TODO Auto-generated method stub
		return Proficiencies;
	}

	public int getSpeed() {
		return speed;
	}

	@Override
	public String getRace() {
		// TODO Auto-generated method stub
		return race;
	}

}
