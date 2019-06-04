package Background;

public class Entertainer extends Background {
	
	public Entertainer(){
		this.name = "Entertainer";
	}

	@Override
	public void determineIdeal() {
		// TODO Auto-generated method stub
		rand6 = (int)(Math.random()*6) + 1;
		switch (rand6){
		case 1:
			ideal = "Beauty. When I perform, I make the world better than it was.";
			break;
		case 2:
			ideal = "Tradition. The stories, legends, and songs of the past must never be forgotten, for they teach us who we are.";
			break;
		case 3:
			ideal = "Creativity. The world is in need of new ideas and bold action. ";
			break;
		case 4:
			ideal = "Greed. I'm only in it for the money and fame.";
			break;
		case 5:
			ideal = "People. I like seeing the smiles on people's faces when I perform. That's all that matters.";
			break;
		case 6:
			ideal = "Honesty. Art should reflect the soul; it should come from within and reveal who we really are.";
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
			personalityTrait = "I know a story releant to almost every situation.";
			break;
		case 2:
			personalityTrait = "Whenever I come to a new place, I collect local rumors and spread gossip.";
			break;
		case 3:
			personalityTrait = "I'm a hopeless romantic, always searching for that \"special someone\".";
			break;
		case 4:
			personalityTrait = "Nobody stays angry at me or around me for long, since I can defuse any amount of tension.";
			break;
		case 5:
			personalityTrait = "I love a good insult, even one directed at me.";
			break;
		case 6:
			personalityTrait = "I get bitter if I'm not the center of attention.";
			break;
		case 7:
			personalityTrait = "I'll settle for nothing less than perfection.";
			break;
		case 8:
			personalityTrait = "I change my mood or my mind as quickly as I change key in a song.";
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
			bond = "My instruments is my most treasure possession, and it reminds me of someone I love.";
			break;
		case 2:
			bond = "Someone stole my precious instrument, and someday I'll get it back.";
			break;
		case 3:
			bond = "I want to be famous, whatever it takes.";
			break;
		case 4:
			bond = "I idolize a hero of the old tales and measure my deeds against that person's.";
			break;
		case 5:
			bond = "I will do anything to prove myself superior to my hated rival.";
			break;
		case 6:
			bond = "I would do anything for the other members of my old troupe.";
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
			flaw = "I'll do anything to win fame and renown.";
			break;
		case 2:
			flaw = "I'm a sucker for a pretty face.";
			break;
		case 3:
			flaw = "A scandal prevents me from ever going home again. That kind of trouble seems to follow me around.";
			break;
		case 4:
			flaw = "I once satirized a noble who still wants my head. It was a mistake that I will likely repeat.";
			break;
		case 5:
			flaw = "I have troubel keeping my true feelings hidden. My sharp tongue lands me in trouble.";
			break;
		case 6:
			flaw = "Despite my best efforts, I am unreliable to my friends.";
			break;
		default:
			break;
		}

	}

	@Override
	public void determineProficiencies() {
		// TODO Auto-generated method stub
		Proficiencies.add("Skill: Acrobatics");
		Proficiencies.add("Skill: Performance");
		Proficiencies.add("Tool: Disguise Kit");
//		Proficiencies.add("Skill: Animal Handling");
//		Proficiencies.add("Skill: Survival");
	}

	@Override
	public void determineFeatures() {
		// TODO Auto-generated method stub
		Features.add("By Popular Demand");
//		Features.add("Rustic Hopsitality");
	}

	@Override
	public void determineEquipment() {
		// TODO Auto-generated method stub
		equipment.add("Letter from an admirer");
		equipment.add("Musical Instrument");
		equipment.add("Costume");
		equipment.add("15GP");
//		equipment.add("Shovel");
//		equipment.add("Common clothes");
//		equipment.add("10Gp");
	}

}
