package Background;

public class FolkHero extends Background {
	
	public FolkHero(){
		this.name = "FolkHero";
	}

	@Override
	public void determineIdeal() {
		// TODO Auto-generated method stub
		rand6 = (int)(Math.random()*6) + 1;
		switch (rand6){
		case 1:
			ideal = "Respect. People deserve to be treated with dignity and repsect.";
			break;
		case 2:
			ideal = "Fairness. No one should get preferential treatment before the law, and no one is above the law.";
			break;
		case 3:
			ideal = "Freedom. Tyrants must not be allowed to oppress the people.";
			break;
		case 4:
			ideal = "Might. If I become strong, I can take what I want--what I deserve.";
			break;
		case 5:
			ideal = "Sincerity. There's no good in pretending to be something I'm not.";
			break;
		case 6:
			ideal = "Destiny. Nothing and no one can steer me away from my higher calling.";
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
			personalityTrait = "I judge people by their actions, not their words.";
			break;
		case 2:
			personalityTrait = "If someone is in trouble, I'm always ready to lend help.";
			break;
		case 3:
			personalityTrait = "When I et my mind to something. I follow through no matter what gets in my way.";
			break;
		case 4:
			personalityTrait = "I have a strong sense of fair play and always try to find the most equitable solution to arguments.";
			break;
		case 5:
			personalityTrait = "I'm confident in my own abilities and do what I can to instill confidence in others.";
			break;
		case 6:
			personalityTrait = "Thinking is for other people. I prefer action.";
			break;
		case 7:
			personalityTrait = "I misuse long words in an attempt to sound smarter.";
			break;
		case 8:
			personalityTrait = "I get bored easily. When am I going to get on with my destiny?";
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
			bond = "I have a family, but I have no ideaa where they are. One day, I hope to see them again.";
			break;
		case 2:
			bond = "I worked the land, I love the land, and I will protect the land.";
			break;
		case 3:
			bond = "A proud noble once gave me a horrible beating, and I will take my revenge on any bully I encounter.";
			break;
		case 4:
			bond = "My tools are symbols of my past life, and I carry them so that I will never forget my roots.";
			break;
		case 5:
			bond = "I protect those who cannot protect themselves.";
			break;
		case 6:
			bond = "I wish my childhood sweetheart had come with me to pursue my destiny.";
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
			flaw = "The tyrant who rules my land will stop at nothing to see me killed.";
			break;
		case 2:
			flaw = "I'm convinced of the significance of my destiny, and blind to my shortcomings and the risk of failure.";
			break;
		case 3:
			flaw = "The people who knew me when I was young know my shameful secret, so I can never go home again.";
			break;
		case 4:
			flaw = "I have a weakness fo the vices of the city, especially hard drink.";
			break;
		case 5:
			flaw = "Secretly, I believe that things would be better if I were a tyrant lording over the land.";
			break;
		case 6:
			flaw = "I have trouble trusting in my allies.";
			break;
		default:
			break;
		}

	}

	@Override
	public void determineProficiencies() {
		// TODO Auto-generated method stub
		Proficiencies.add("Skill: Animal Handling");
		Proficiencies.add("Skill: Survival");
	}

	@Override
	public void determineFeatures() {
		// TODO Auto-generated method stub
		Features.add("Rustic Hopsitality");
	}

	@Override
	public void determineEquipment() {
		// TODO Auto-generated method stub
		equipment.add("Shovel");
		equipment.add("Common clothes");
		equipment.add("10Gp");
	}

}
