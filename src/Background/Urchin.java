package Background;

public class Urchin extends Background {
	
	public Urchin(){
		this.name = "Urchin";
	}

	@Override
	public void determineIdeal() {
		// TODO Auto-generated method stub
		rand6 = (int)(Math.random()*6) + 1;
		switch (rand6){
		case 1:
			ideal = "Respect. All people, rich or poor, deserve respect.";
			break;
		case 2:
			ideal = "Community. We have to take care of each other, because no one else is going to do it.";
			break;
		case 3:
			ideal = "Change. The low are lifted up, and the high and mighty are brought down. Change is the nature of things.";
			break;
		case 4:
			ideal = "Retribution. The rich need to be shown what life and death are like in the gutters.";
			break;
		case 5:
			ideal = "People. I help the eople who help me--that's what keeps us alive.";
			break;
		case 6:
			ideal = "Aspiration. I'm going to prove that I'm worthy of a better life.";
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
			personalityTrait = "I hide scraps of food and trinkets away in my pockets.";
			break;
		case 2:
			personalityTrait = "I ask a lot of questions.";
			break;
		case 3:
			personalityTrait = "I like to squeeze into small places where no one else can get to me.";
			break;
		case 4:
			personalityTrait = "I sleep with my back to a wall or tree, with everything I own wrapped in a bundle in my arms.";
			break;
		case 5:
			personalityTrait = "I eat like a pig and have bad manners.";
			break;
		case 6:
			personalityTrait = "I think anyone who's nice to me is hiding evil intent.";
			break;
		case 7:
			personalityTrait = "I don't like to bathe.";
			break;
		case 8:
			personalityTrait = "I bluntly say what other people are hinting at or hiding.";
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
			bond = "My town or city is my home, and I'll fight to defend it.";
			break;
		case 2:
			bond = "I sponsor an orphanage to keep others from enduring what I was forced to endure.";
			break;
		case 3:
			bond = "I owe my survival to another urchin who taught me to live on the streets.";
			break;
		case 4:
			bond = "I owe a debt I can never repay to the person who took pity on me.";
			break;
		case 5:
			bond = "I escaped my life of poverty by robbing an important person, and I'm wanted for it.";
			break;
		case 6:
			bond = "No one else should have to endure the hardships I've been through.";
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
			flaw = "If I'm outnumbered, I will run away from a fight.";
			break;
		case 2:
			flaw = "Gold seems like a lot of money to me, and I'll do just about anything for more of it.";
			break;
		case 3:
			flaw = "I will never fully trust anyone other than myself.";
			break;
		case 4:
			flaw = "I'd rahter kill someon in their sleep then fight fair";
			break;
		case 5:
			flaw = "It's not stealing if I need it more than someone else.";
			break;
		case 6:
			flaw = "People who can't take care of themselves get what they deserve.";
			break;
		default:
			break;
		}

	}

	@Override
	public void determineProficiencies() {
		// TODO Auto-generated method stub
		Proficiencies.add("Skill: Sleight of Hand");
		Proficiencies.add("Skill: Stealth");
		Proficiencies.add("Tool: Disguise Kit");
		Proficiencies.add("Tool: Thieves' tools");
	}

	@Override
	public void determineFeatures() {
		// TODO Auto-generated method stub
		Features.add("City Secrets");
	}

	@Override
	public void determineEquipment() {
		// TODO Auto-generated method stub
		equipment.add("Small Knife");
		equipment.add("Map of the city");
		equipment.add("Pet mouse");
		equipment.add("Token taken from parents");
		equipment.add("10Gp");
	}

}
