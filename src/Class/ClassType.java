package Class;

import java.util.ArrayList;

public abstract class ClassType {

	String name;
	int level;
	
	public ClassType(){
		
	}
	
	public ClassType(String name){
		this.name = name;
	}
	
	public abstract String getInfo();
	
	public abstract void determineFeatures(int level);
	
	public abstract String getName();
	
	public abstract ArrayList<String> getFeatures();
	
	public abstract ArrayList<String> getProficiencies();
	
	public abstract ArrayList<String> getEquipment();
	
	public abstract boolean isChosen();
}
