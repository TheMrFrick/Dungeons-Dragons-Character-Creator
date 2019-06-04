package Background;

public class Noble extends Background {
	
	public Noble(){
		this.name = "Noble";
	}

	@Override
	public void determineIdeal() {
		// TODO Auto-generated method stub
		rand6 = (int)(Math.random()*6) + 1;
		switch (rand6){
		case 1:
			ideal = "Respect. Respect is due to me because of my position, but all people regardless of station deserve to be treated with dignity.";
			break;
		case 2:
			ideal = "Responsibility. It is my duty to respect the authority of those above me, just as those below me must respect mine.";
			break;
		case 3:
			ideal = "Independence. I must prove that I can handle myself without the coddling of my family.";
			break;
		case 4:
			ideal = "Power. If I can attain more power, no one will tell me what to do.";
			break;
		case 5:
			ideal = "Family. Blood runs thicker than water.";
			break;
		case 6:
			ideal = "Noble Obligations. It is my duty to protect and care for the people beneath me.";
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
			personalityTrait = "My eloquent flattery makes everyone I talk to feel like the most wonderful and important person in the world.";
			break;
		case 2:
			personalityTrait = "The common folk love me for my kindness and generosity.";
			break;
		case 3:
			personalityTrait = "No one could doubt by looking at my regal bearing that I am a cut above the unwashed masses.";
			break;
		case 4:
			personalityTrait = "I take great pains to always look my best and follow the latest fashions.";
			break;
		case 5:
			personalityTrait = "I don't like to get my hands dirty, and I won't be caught dead in unsuitable accommodations.";
			break;
		case 6:
			personalityTrait = "Despite my noble birth, I do not place myself above other folk. We all have the same blood.";
			break;
		case 7:
			personalityTrait = "My favor, once lost, is lost forever.";
			break;
		case 8:
			personalityTrait = "If you do me an injury, I will crush you, ruin your name, and salt your fields.";
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
			bond = "I will face any challenge to win the approval of my family.";
			break;
		case 2:
			bond = "My house's alliance with another noble family must be sustained at all costs.";
			break;
		case 3:
			bond = "Nothing is more important than the other members of my family.";
			break;
		case 4:
			bond = "I am in love with the heir of a family that my family despises.";
			break;
		case 5:
			bond = "My loyalty to my sovereign is unwavering.";
			break;
		case 6:
			bond = "The common folk must see me as a hero of the people.";
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
			flaw = "I secretly believe that everyone is beeath me.";
			break;
		case 2:
			flaw = "I hide a truly scandalous secret that could ruin my family forever.";
			break;
		case 3:
			flaw = "I too often hear veiled insults and threats in every word addressed to me, and I'm quick to anger.";
			break;
		case 4:
			flaw = "I have an insatiable desire for carnal pleasures.";
			break;
		case 5:
			flaw = "In fact, the world does revolve around me.";
			break;
		case 6:
			flaw = "By my words and actions I often bring shame to my family.";
			break;
		default:
			break;
		}

	}

	@Override
	public void determineProficiencies() {
		// TODO Auto-generated method stub
		Proficiencies.add("Skill: History");
		Proficiencies.add("Skill: Persuasion");
	}

	@Override
	public void determineFeatures() {
		// TODO Auto-generated method stub
		Features.add("Position of Privilege");
	}

	@Override
	public void determineEquipment() {
		// TODO Auto-generated method stub
		equipment.add("Fine Clothes");
		equipment.add("Signet ring");
		equipment.add("Scroll of pedigree");
		equipment.add("25Gp");
	}

}
