package Background;

public class Sailor extends Background {
	
	public Sailor(){
		this.name = "Sailor";
	}

	@Override
	public void determineIdeal() {
		// TODO Auto-generated method stub
		rand6 = (int)(Math.random()*6) + 1;
		switch (rand6){
		case 1:
			ideal = "Respect. The thing that keeps a ship together is mutual respect between captain and crew.";
			break;
		case 2:
			ideal = "Fairness. We all do the work, so we all share in the rewards.";
			break;
		case 3:
			ideal = "Freedom. The sea is freedom--the freedom to go anywhere and do anything.";
			break;
		case 4:
			ideal = "Mastery. I'm a predator, and the other ships on the sea are my prey.";
			break;
		case 5:
			ideal = "People. I'm committed to my crewmates, not to ideals.";
			break;
		case 6:
			ideal = "Aspiration. Someday I'll own my own ship and chart my own destiny.";
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
			personalityTrait = "My friends know they can rely on me, no matter what.";
			break;
		case 2:
			personalityTrait = "I work hard so that I can play hard when the work is done.";
			break;
		case 3:
			personalityTrait = "I enjoy sailing into new ports and making new friends over a flagon of ale.";
			break;
		case 4:
			personalityTrait = "I stretch the truth for the sake of a good story.";
			break;
		case 5:
			personalityTrait = "To me, a tavern brawl is a nice way to get to know a new city.";
			break;
		case 6:
			personalityTrait = "I never pass up a friendly wager.";
			break;
		case 7:
			personalityTrait = "My language is as foul as an otyugh nest.";
			break;
		case 8:
			personalityTrait = "I like a job well done, especially if I can convince someone else to do it.";
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
			bond = "I'm loyal to my captain first, everything else second.";
			break;
		case 2:
			bond = "The ship is most important--crewmates and captains come and go.";
			break;
		case 3:
			bond = "I'll always remember my first ship.";
			break;
		case 4:
			bond = "In a harbor town, I have a paramour whose eyes nearly stole me from the sea.";
			break;
		case 5:
			bond = "I was cheated out of my fair share of the profits, and I want to get my due.";
			break;
		case 6:
			bond = "Ruthless pirates murdered my captain and crewmates, plundered our ship, and left me to die. Vengeance will be mine.";
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
			flaw = "I follow orders, even if I think they're wrong.";
			break;
		case 2:
			flaw = "I'll say anything to avoid having to do extra work.";
			break;
		case 3:
			flaw = "Once someone questions my courage, I never back down no matter how dangerous the situation.";
			break;
		case 4:
			flaw = "Once I start drinking, it's hard for me to stop.";
			break;
		case 5:
			flaw = "I can't help but pocket loose coins and other trinkets I come across.";
			break;
		case 6:
			flaw = "My pride will probably lead to my destruction.";
			break;
		default:
			break;
		}

	}

	@Override
	public void determineProficiencies() {
		// TODO Auto-generated method stub
		Proficiencies.add("Skill: Athletics");
		Proficiencies.add("Skill: Perception");
		Proficiencies.add("Tool: Navigator's Tools");
	}

	@Override
	public void determineFeatures() {
		// TODO Auto-generated method stub
		Features.add("Ship's Passage");
	}

	@Override
	public void determineEquipment() {
		// TODO Auto-generated method stub
		equipment.add("Belaying pin");
		equipment.add("50 feet of silk rope");
		equipment.add("Lucky charm");
		equipment.add("Common Clothes");
		equipment.add("10Gp");
	}

}
