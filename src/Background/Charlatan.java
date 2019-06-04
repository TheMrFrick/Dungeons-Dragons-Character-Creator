package Background;

public class Charlatan extends Background {
	
	public Charlatan(){
		this.name = "Charlatan";
	}

	@Override
	public void determineIdeal() {
		// TODO Auto-generated method stub
		rand6 = (int) (Math.random()*6) + 1;
		switch(rand6){
		case 1:
			ideal = "Independence. I am a free spirit--no one tells me what to do.";
			break;
		case 2:
			ideal = "Fairness. I never target people who can't afford to lose a few coins.";
			break;
		case 3:
			ideal = "Charity. I distribute the money I acquire to the people who really need it.";
			break;
		case 4:
			ideal = "Creativity. I never un the same con twice.";
			break;
		case 5:
			ideal = "Friendship. Material goods come and go. Bonds of freindship last forever.";
			break;
		case 6:
			ideal = "Aspiration. I'm determined to make something of myself.";
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
			personalityTrait = "I fall in and out of love easily, and am always pursuing someone.";
			break;
		case 2:
			personalityTrait = "I have a joke for every occasion, especially occasions where humor is inappropriate.";
			break;
		case 3:
			personalityTrait = "Flattery is my preferred trick for getting what I want.";
			break;
		case 4:
			personalityTrait = "I'm a born gambler who can't resist taking a risk for a potential payoff.";
			break;
		case 5:
			personalityTrait = "I lie about almost everything, even when there's no good reason to.";
			break;
		case 6:
			personalityTrait = "Sarcasm and insults are my weapons of choice.";
			break;
		case 7:
			personalityTrait = "I keep multiple holy symbols on me and invoke whateverdeity might come in useful at any given moment.";
			break;
		case 8:
			personalityTrait = "I pocket anything I see that might have some value.";
			break;
		default:
			personalityTrait = "";
			break;
		}
	}

	@Override
	public void determineBond() {
		// TODO Auto-generated method stub
		rand6 = (int) (Math.random()*6) + 1;
		switch (rand6){
		case 1:
			bond= "I felleced the wrong person and must work to ensure that this individual never crosses paths with me or those I care about.";
			break;
		case 2:
			bond= "I owe everything to my mentor--a horrible person who's probably rotting in jail somewhere.";
			break;
		case 3:
			bond= "Somewhere out there, I have a child who doesn't know me. I'm making the world better for him or her.";
			break;
		case 4:
			bond= "I come from a noble family, and one day I'll raclaim my lands and title from those who stole them from me.";
			break;
		case 5:
			bond= "A powerful person killed someone I love. Some day soon, I'll have my revenge.";
			break;
		case 6:
			bond= "I swindled and ruined a person who didn't deserve it. I seek toa tone for my misdeeds but might never be able to forgive myself.";
			break;
			
		default:
			break;
		}
	}

	@Override
	public void determineFlaw() {
		// TODO Auto-generated method stub
		rand6 = (int)(Math.random()*6) + 1;
		switch(rand6){
		case 1:
			flaw = "I can't resist a pretty face.";
			break;
		case 2:
			flaw = "I'm always in debt. I spend my ill-gotten gains on decadent luxuries faster than I bring them in.";
			break;
		case 3:
			flaw = "I'm convinced that no one could ever fool me the way I fool others.";
			break;
		case 4:
			flaw = "I'm too greedy for my own good. I can't resist taking a risk if theres money involved.";
			break;
		case 5:
			flaw = "I can't resist swindling people who are more powerful than me.";
			break;
		case 6:
			flaw = "I hate to admit it and will hate myself for it, but I'll run and preserve my own hide if the going gets tough.";
			break;
		default:
			break;
		
		}
	}

	@Override
	public void determineProficiencies() {
		// TODO Auto-generated method stub
		Proficiencies.add("Skill: Deception");
		Proficiencies.add("Skill: Sleight of Hand");
		Proficiencies.add("Tool: Disguise Kit");
		Proficiencies.add("Tool: Forgery Kit");
	}

	@Override
	public void determineFeatures() {
		// TODO Auto-generated method stub
		Features.add("Charlatan: False Identity");
	}

	@Override
	public void determineEquipment() {
		// TODO Auto-generated method stub
		equipment.add("Fine clothes");
		equipment.add("Disguise kit");
		equipment.add("15 Gp");
	}

}
