package Background;

public class Criminal extends Background {

	public Criminal() {
		this.name = "Criminal";
	}

	@Override
	public void determineIdeal() {
		// TODO Auto-generated method stub
		rand6 = (int) (Math.random() * 6) + 1;
		switch (rand6) {
		case 1:
			ideal = "Honor. I don't steal from others in the trade.";
			break;
		case 2:
			ideal = "Freedom. Chains are meant to be broken, as are those who would forge them.";
			break;
		case 3:
			ideal = "Charity. I steal from the wealthy so that I can help people in need.";
			break;
		case 4:
			ideal = "Greed. I will do whatever it takes to become wealthy.";
			break;
		case 5:
			ideal = "People. I'm loyal to my friends, not to any ideals, and everyone else can take a trip down the Styx for all I care.";
			break;
		case 6:
			ideal = "Redemption. There's a spark of good in everyone.";
			break;
		default:
			break;
		}
	}

	@Override
	public void determinePersonalityTrait() {
		// TODO Auto-generated method stub
		rand8 = (int) (Math.random() * 8) + 1;
		switch (rand8) {
		case 1:
			personalityTrait = "I always have a plan for what to do whent hings go wrong.";
			break;
		case 2:
			personalityTrait = "I am always calm, no matter what the situation. I never raise my voice or let my emotions control me.";
			break;
		case 3:
			personalityTrait = "The first thing I do in a new place is note the locations of everything valueable--or where such things could be hidden.";
			break;
		case 4:
			personalityTrait = "I would rather make a new friend than a new enemy.";
			break;
		case 5:
			personalityTrait = "I am incredibly slow to trust. Those who seem the fairest often have the most to hide.";
			break;
		case 6:
			personalityTrait = "I don't pay attention to the rsiks in a situation. Never tell me the odds.";
			break;
		case 7:
			personalityTrait = "The best way to get me to do something is to tell me I can't do it.";
			break;
		case 8:
			personalityTrait = "I blow up at the slightest insult.";
			break;

		default:
			break;
		}
	}

	@Override
	public void determineBond() {
		// TODO Auto-generated method stub
		rand6 = (int) (Math.random() * 6) + 1;
		switch (rand6) {
		case 1:
			bond = "I'm trying to pay off an old debt I owe to a generous benefactor.";
			break;
		case 2:
			bond = "My ill-gotten gains go to support my family.";
			break;
		case 3:
			bond = "Something important was taken from me, and I aim to steal it back.";
			break;
		case 4:
			bond = "I will become the greatest thief that ever lived.";
			break;
		case 5:
			bond = "I'm guilty of a terrible crime. I hope I can redeem myself for it.";
			break;
		case 6:
			bond = "Someone I oved died because of 1 mistake I made. That will never happen again.";
			break;

		default:
			break;
		}
	}

	@Override
	public void determineFlaw() {
		// TODO Auto-generated method stub
		rand6 = (int) (Math.random() * 6) + 1;
		switch (rand6) {
		case 1:
			flaw = "When I see somthing valuable, I can't think about anything but how to steal it.";
			break;
			
		case 2:
			flaw = "When faced with a choice between money and my friends, I usually choose the money.";
			break;
			
		case 3:
			flaw = "If there's a paln, I'll forget it. If I don't forget it, I'll ignore it.";
			break;
			
		case 4:
			flaw = "I have a \"tell\" that reveals when I'm lying.";
			break;
			
		case 5:
			flaw = "I turn tail and run when things look bad.";
			break;
			
		case 6:
			flaw = "An innocent perons is in prison for a crim that I committed. I'm okay with that.";
			break;
			
		default:
			break;

		}
	}

	@Override
	public void determineProficiencies() {
		// TODO Auto-generated method stub
		Proficiencies.add("Skill: Deception");
		Proficiencies.add("Skill: Stealth");
		Proficiencies.add("Tool: Gaming set");
		Proficiencies.add("Tool: Thieves' Tools");
	}

	@Override
	public void determineFeatures() {
		// TODO Auto-generated method stub
		Features.add("Criminal Contact");
	}

	@Override
	public void determineEquipment() {
		// TODO Auto-generated method stub
		equipment.add("Crowbar");
		equipment.add("Dark common clothes with hood");
		equipment.add("15 Gp");
	}

}
