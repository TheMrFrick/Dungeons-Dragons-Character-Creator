package Background;

public class Soldier extends Background {
	
	public Soldier(){
		this.name = "Soldier";
	}

	@Override
	public void determineIdeal() {
		// TODO Auto-generated method stub
		rand6 = (int)(Math.random()*6) + 1;
		switch (rand6){
		case 1:
			ideal = "Greater Good. Our lot is to lay down our lives in defense of others.";
			break;
		case 2:
			ideal = "Responsibility. I do what I must and obey just authority.";
			break;
		case 3:
			ideal = "Independence. When people follow orders blindly, they embrace a kind of tyranny.";
			break;
		case 4:
			ideal = "Might. In life as in war, the stronger force wins.";
			break;
		case 5:
			ideal = "Live and Let Live. Ideals aren't worth killing over or going to war for.";
			break;
		case 6:
			ideal = "Nation. My city nation or people are all that matter.";
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
			personalityTrait = "I'm always polite and respectful";
			break;
		case 2:
			personalityTrait = "I'm haunted by memories of war. I can't get the images of violence out of my mind.";
			break;
		case 3:
			personalityTrait = "I've lost too many friends, and I'm slow to make new ones.";
			break;
		case 4:
			personalityTrait = "I'm full of inspiring and cautionary tales from my military experience relevant to almost every combat situation.";
			break;
		case 5:
			personalityTrait = "I can stare down a hell hound without flinching.";
			break;
		case 6:
			personalityTrait = "I enjoy being strong and like breaking things.";
			break;
		case 7:
			personalityTrait = "I have a crude sense of humor.";
			break;
		case 8:
			personalityTrait = "I face problems head-on. A simple, direct solution is the best path to success.";
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
			bond = "I would still lay down my life for the people I served with.";
			break;
		case 2:
			bond = "Someone saved my life on the battlefield. To this day, I will never leave a friend behind.";
			break;
		case 3:
			bond = "My honor is my life.";
			break;
		case 4:
			bond = "I'll never forget the crushing defeat my company suffered or the enemies who dealt it.";
			break;
		case 5:
			bond = "Those who fight beside me are those worth dying for.";
			break;
		case 6:
			bond = "I fight for those who cannot fight for themselves.";
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
			flaw = "The monstrous enemy we faced in battle still leaves me quivering with fear.";
			break;
		case 2:
			flaw = "I have little respect for anyone who is not a proven warrior.";
			break;
		case 3:
			flaw = "I made a terrible mistake in battle cost many lives--and I would do anything to keep that mistake secret.";
			break;
		case 4:
			flaw = "My hatred of my enemies is blind and unreasoning.";
			break;
		case 5:
			flaw = "I obey the law, even if the law causes misery.";
			break;
		case 6:
			flaw = "I'd rather eat my armor than admit when I'm wrong.";
			break;
		default:
			break;
		}

	}

	@Override
	public void determineProficiencies() {
		// TODO Auto-generated method stub
		Proficiencies.add("Skill: Athletics");
		Proficiencies.add("Skill: Intimidation");
	}

	@Override
	public void determineFeatures() {
		// TODO Auto-generated method stub
		Features.add("Military Rank");
	}

	@Override
	public void determineEquipment() {
		// TODO Auto-generated method stub
		equipment.add("Insignia of Rank");
		equipment.add("Trophy taken from fallen enemy");
		equipment.add("Set of bone dice");
		equipment.add("Common Clothes");
		equipment.add("10Gp");
	}

}
