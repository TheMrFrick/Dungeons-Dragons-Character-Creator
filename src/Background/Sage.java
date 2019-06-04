package Background;

public class Sage extends Background {
	
	public Sage(){
		this.name = "Sage";
	}

	@Override
	public void determineIdeal() {
		// TODO Auto-generated method stub
		rand6 = (int)(Math.random()*6) + 1;
		switch (rand6){
		case 1:
			ideal = "Knowledge. The path to power and self-improvement is through knowledge.";
			break;
		case 2:
			ideal = "Beauty. What is beautiful points us beyond itself toward what is true.";
			break;
		case 3:
			ideal = "Logic. Emotions must not cloud our logical thinking.";
			break;
		case 4:
			ideal = "No Limits. Nothing should fetter the infinite possibility inherent in all existence.";
			break;
		case 5:
			ideal = "Power. Knowledge is the path to power and domination.";
			break;
		case 6:
			ideal = "Self-Improvement. The goal of a life of study is the betterment of oneself.";
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
			personalityTrait = "I use polysyllabic words that convey the impression of great erudition.";
			break;
		case 2:
			personalityTrait = "I've read every book in the world's greatest libraries--or I like to boast that I have";
			break;
		case 3:
			personalityTrait = "I'm used to helping out those who aren't as smart as I am, and I patiently explain anything and everything to others.";
			break;
		case 4:
			personalityTrait = "There's nothing I like more than a good mystery.";
			break;
		case 5:
			personalityTrait = "I'm willing to listen to every side of an argument before I make my own judgement.";
			break;
		case 6:
			personalityTrait = "I...speak...slowly...when talking...to idiots...which...almost...everyone...is...compared...to me.";
			break;
		case 7:
			personalityTrait = "I am horribly, horribly awkward in social situations.";
			break;
		case 8:
			personalityTrait = "I'm convinced that people are always trying to steal my secrets.";
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
			bond = "It is my duty to protect my students.";
			break;
		case 2:
			bond = "I have an ancient text that holds terrible secrets that must not fall into the wrong hands.";
			break;
		case 3:
			bond = "I work to preserve a library, university, scriptorium, or monastery.";
			break;
		case 4:
			bond = "My life's work is a series of tomes related to a specific field of lore.";
			break;
		case 5:
			bond = "I've been searching my whole life for the answer to a certain question.";
			break;
		case 6:
			bond = "I sold my soul for knowledge. I hope to do great deeds and win it back.";
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
			flaw = "I ma easily distracted by the promise of information.";
			break;
		case 2:
			flaw = "Most people scream and run when they see a demon. I stop and take notes on its anatomy.";
			break;
		case 3:
			flaw = "Unlocking an ancient mystery is worth the price of a civilization.";
			break;
		case 4:
			flaw = "I overlook obvious solutions in favor of complicated ones.";
			break;
		case 5:
			flaw = "I speak without really thinking through my words, invariably insulting others.";
			break;
		case 6:
			flaw = "I can't keep a secret to save my life, or anyone else's";
			break;
		default:
			break;
		}

	}

	@Override
	public void determineProficiencies() {
		// TODO Auto-generated method stub
		Proficiencies.add("Skill: Arcana");
		Proficiencies.add("Skill: History");
	}

	@Override
	public void determineFeatures() {
		// TODO Auto-generated method stub
		Features.add("Researcher");
	}

	@Override
	public void determineEquipment() {
		// TODO Auto-generated method stub
		equipment.add("Bottle of black ink");
		equipment.add("Quill");
		equipment.add("Small knife");
		equipment.add("Letter form a dead colleague posing a question you have not been able to answer");
		equipment.add("Common Clothes");
		equipment.add("10Gp");
	}

}
