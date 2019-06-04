package Race;

import java.util.ArrayList;

public abstract class Race {

	public abstract ArrayList<String> getFeatures();
	
	public abstract int[] getAbilities();
	
	public abstract ArrayList<String> getProficiencies();
	
	public abstract String getInfo();
	
	public abstract int getSpeed();
	
	public abstract String getRace();
	
	public abstract boolean isChosen();
	
	public abstract void setChosen(boolean chosen);
	
}
