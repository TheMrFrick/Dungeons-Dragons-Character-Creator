package Background;

public class GuildArtisan extends Background {

	public GuildArtisan(){
		this.name = "GuildArtisan";
	}
	@Override
	public void determineIdeal() {
		// TODO Auto-generated method stub
		rand6 = (int)(Math.random()*6) + 1;
		switch (rand6){
		case 1:
			ideal = "Community. It is the duty of all civilized people to strengthen the bonds of community and the security of civilization.";
			break;
		case 2:
			ideal = "Generosity. My talents were given to me so that I could use them to benefit the world.";
			break;
		case 3:
			ideal = "Freedom. Everyone should be free to pursure his or her own livelihood.";
			break;
		case 4:
			ideal = "Greed. I'm only in it for the money.";
			break;
		case 5:
			ideal = "People. I'm committed to the people I care about, not to ideals.";
			break;
		case 6:
			ideal = "Aspiration. I work hard to be the best there is at my craft. ";
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
			personalityTrait = "I believe that anything worth doing is worth doing right. I can't help it--I'm a perfectionist.";
			break;
		case 2:
			personalityTrait = "I'm a snob who looks down on those who can't appreciate fine art.";
			break;
		case 3:
			personalityTrait = "I always want to know how things work and what makes people tick.";
			break;
		case 4:
			personalityTrait = "I'm full of witty aphorisms and have a proverb for every occasion.";
			break;
		case 5:
			personalityTrait = "I'm rude to people who lack my commitment to hard work and fair play.";
			break;
		case 6:
			personalityTrait = "I like to talk at length about my profession.";
			break;
		case 7:
			personalityTrait = "I don't part with my money easily and will haggle tirelessly to get the best deal possible.";
			break;
		case 8:
			personalityTrait = "I'm well known for my work, and I want to make sure everyone appreciates it. I'm always taken aback when people haven't heard of me.";
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
			bond = "The workshop where I learned my trade is the most important place in the world to me.";
			break;
		case 2:
			bond = "I created a great work for someon, and then found them unworthy to recieve it. I'm still looking for someone worthy.";
			break;
		case 3:
			bond = "I owe my guild a great debt for forging me into the person I am today.";
			break;
		case 4:
			bond = "I pursue wealth to secure someone's love.";
			break;
		case 5:
			bond = "One day I will return to my guild and prove that I am the greatest artisan of them all.";
			break;
		case 6:
			bond = "I will get revenge on the evil forces that destroyed my place of businees and ruined my livelihood.";
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
			flaw = "I'll do anything to get my hands on somehting rare or priceless.";
			break;
		case 2:
			flaw = "I'm quick to assusme that someone is trying to cheat me.";
			break;
		case 3:
			flaw = "No one must ever learn that I once stole money from guild coffers.";
			break;
		case 4:
			flaw = "I'm never satisfied with what I have--I always want more.";
			break;
		case 5:
			flaw = "I would kill to acquire a noble title.";
			break;
		case 6:
			flaw = "I'm horribly jealous of anyone who can outshine my handiwork. Everywhere I go, I'm surrounded by rivals.";
			break;
		default:
			break;
		}

	}

	@Override
	public void determineProficiencies() {
		// TODO Auto-generated method stub
		Proficiencies.add("Skill: Insight");
		Proficiencies.add("Skill: Persuasion");
		
	}

	@Override
	public void determineFeatures() {
		// TODO Auto-generated method stub
		Features.add("Guild Membership");
	}

	@Override
	public void determineEquipment() {
		// TODO Auto-generated method stub
		equipment.add("Artisan's Tool");
		equipment.add("Letter of Introduction from the Guild");
		equipment.add("Traveler's Clothes");
		equipment.add("15Gp");
	}

}
