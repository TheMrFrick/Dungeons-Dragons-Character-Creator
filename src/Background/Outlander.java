package Background;

public class Outlander extends Background {
	
	public Outlander(){
		this.name = "Outlander";
	}

	@Override
	public void determineIdeal() {
		// TODO Auto-generated method stub
		rand6 = (int)(Math.random()*6) + 1;
		switch (rand6){
		case 1:
			ideal = "Change. Life is like the seasons, in constant change, and we must change with it.";
			break;
		case 2:
			ideal = "Greater Good. It is each perons's responsibility to make the most happiness for the whole tribe.";
			break;
		case 3:
			ideal = "Honor. If I dishonor myself, I dishonor my whole clan.";
			break;
		case 4:
			ideal = "Might. The strongest are meant to rule.";
			break;
		case 5:
			ideal = "Nature. The natural world is more important than all the constructs of civilization.";
			break;
		case 6:
			ideal = "Glory. I must earn glory in battle, for myself and my clan.";
			break;
			
		default:
			break;
		}
	}

	@Override
	public void determinePersonalityTrait() {
		// TODO Auto-generated method stub
		rand8 = (int)(Math.random()*8) + 1;
		switch(rand8){
		case 1:
			personalityTrait = "I'm driven by a wanderlust that led me away from hoe.";
			break;
		case 2:
			personalityTrait = "I watch over my friends as if they were a litter of newborn pups.";
			break;
		case 3:
			personalityTrait = "I once ran twenty-five miles without stopping to warn to my clan of an approaching orc horde. I'd do it again if I had to.";
			break;
		case 4:
			personalityTrait = "I have a lesson for every situation, drawn from observing nature.";
			break;
		case 5:
			personalityTrait = "I place no stock in wealthy or well-mannered folk. Money and manners won't save you from a hungry owlbear.";
			break;
		case 6:
			personalityTrait = "I'm always picking things up, absently fiddling with them, and sometimes accidentally breaking them.";
			break;
		case 7:
			personalityTrait = "I feel far more comfortable around animals than people.";
			break;
		case 8:
			personalityTrait = "I was, in fact, raised by wolves.";
			break;
			
		default:
			break;
		}
	}

	@Override
	public void determineBond() {
		// TODO Auto-generated method stub
		rand6 = (int)(Math.random()*6) + 1;
		switch(rand6){
		case 1:
			bond = "My family, clan, or tribe is the most important thing in my life, even when they are far from me.";
			break;
		case 2:
			bond = "An injury to the unspoiled wilderness of my home is an injury to me.";
			break;
		case 3:
			bond = "I will bring terrible wrath down on the evildoers who destroyed my homeland.";
			break;
		case 4:
			bond = "I am the last in my tribe and it is up to me to ensure their name enter legend.";
			break;
		case 5:
			bond = "I suffer awful visions of a coming disaster and will do anything to prevent it.";
			break;
		case 6:
			bond = "It is my duty to provide children to sustain my tribe.";
			break;
			
		default:
			break;
		}
	}

	@Override
	public void determineFlaw() {
		// TODO Auto-generated method stub
		rand6 = (int)(Math.random()*6) + 1;
		switch (rand6){
		case 1:
			flaw = "I am too enamored of ale, wine, and other intoxicants.";
			break;
		case 2:
			flaw = "There's no room for caution in a life lived to the fullest.";
			break;
		case 3:
			flaw = "I remember every insult I've recieved and nurse a silent resentmen toward anyone who's ever wronged me.";
			break;
		case 4:
			flaw = "I am slow to trust members of other races, tribes, and societies.";
			break;
		case 5:
			flaw = "Violence is my answer to almost any challenge";
			break;
		case 6:
			flaw = "Don't expect me to save those who can't save themselves. It is natures's way that the strong thrive and the weak perish";
			break;
		default:
			break;
		}

	}
	@Override
	public void determineProficiencies() {
		// TODO Auto-generated method stub
		Proficiencies.add("Skill: Athletics");
		Proficiencies.add("Skill: Survival");
		
	}

	@Override
	public void determineFeatures() {
		// TODO Auto-generated method stub
		Features.add("Wanderer");
	}

	@Override
	public void determineEquipment() {
		// TODO Auto-generated method stub
		equipment.add("Staff");
		equipment.add("Hunting trap");
		equipment.add("Trophy from animal killed");
		equipment.add("Traveler's Clothes.");
		equipment.add("10Gp");
	}

}
