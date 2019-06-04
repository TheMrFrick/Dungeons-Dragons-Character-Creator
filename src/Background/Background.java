package Background;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Background {

	protected String ideal;
	protected String personalityTrait;
	protected String bond;
	protected String flaw;
	protected String name;
	
	protected ArrayList<String> Proficiencies = new ArrayList<>();
	protected ArrayList<String> equipment = new ArrayList<>();
	protected ArrayList<String> Features = new ArrayList<>();

	protected int rand8;
	protected int rand6;

	public abstract void determineIdeal();

	public abstract void determinePersonalityTrait();

	public abstract void determineBond();

	public abstract void determineFlaw();
	
	public abstract void determineProficiencies();
	
	public abstract void determineFeatures();
	
	public abstract void determineEquipment();

	public String getInfo() {
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

	public String getIdeal() {
		return ideal;
	}

	public String getPersonalityTrait() {
		return personalityTrait;
	}

	public String getBond() {
		return bond;
	}

	public String getFlaw() {
		return flaw;
	}

	public String getName() {
		return name;
	}

	public ArrayList<String> getProficiency(){
		return Proficiencies;
	}
	
	public ArrayList<String> getFeatures(){
		return Features;
	}
	
	public ArrayList<String> getEquipment(){
		return equipment;
	}
}
