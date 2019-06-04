package Background;

public class Hermit extends Background {
	
	public Hermit(){
		this.name = "Hermit";
	}

	@Override
	public void determineIdeal() {
		// TODO Auto-generated method stub
		rand6 = (int)(Math.random()*6) + 1;
		switch (rand6){
		case 1:
			ideal = "Greater Good. My gifts are meant to be shared with all, not used for my own benefit.";
			break;
		case 2:
			ideal = "Logic. Emotions must not cloud our sense of what is right and true, or our logical thinking.";
			break;
		case 3:
			ideal = "Free Thinking. Inquiry and curiousity are the pillars of progress.";
			break;
		case 4:
			ideal = "Power. Solitude and contemplation are paths toward mystical or magical power.";
			break;
		case 5:
			ideal = "Live and Let Live. Meddling in the affairs of others only causes trouble.";
			break;
		case 6:
			ideal = "Self-Knowledge. If you know yourself, there's nothing left to know.";
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
			personalityTrait = "I've been isolated for so long that I rarely speak, preferring gestures and the occasional grunt.";
			break;
		case 2:
			personalityTrait = "I am utterly serene, even in the face of disaster.";
			break;
		case 3:
			personalityTrait = "The leader of my community had something wise to say on every topic, and I am eager to share that wisdom";
			break;
		case 4:
			personalityTrait = "I feel tremendous empathy for all who suffer.";
			break;
		case 5:
			personalityTrait = "I'm oblivious to etiquette and social expectations.";
			break;
		case 6:
			personalityTrait = "I connect everything that happens to me to a grand cosmis plan.";
			break;
		case 7:
			personalityTrait = "I often get lost in my own thoughts and contemplation, becoming oblivious to my surroundings.";
			break;
		case 8:
			personalityTrait = "I am working on a grand philosophical theory and love sharing my ideas.";
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
			bond = "Nothing is more important than the other members of my hermitage, order, or association.";
			break;
		case 2:
			bond = "I entered seclusion to hide from the ones who might still be hunting me. I must someday confront them.";
			break;
		case 3:
			bond = "I'm still seeking the enlightenment I pursued in my seclusion, and it still eludes me.";
			break;
		case 4:
			bond = "I entered seclusion because I loved someone I could not have.";
			break;
		case 5:
			bond = "Should my discovery come to light, it could bring ruin to the world.";
			break;
		case 6:
			bond = "My isolation gave me great insight into a great evil that only I can destroy.";
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
			flaw = "Now that I've return to the world, I enjoyed its delights a little too much.";
			break;
		case 2:
			flaw = "I harbor dark, bloodthirsty thoughts that my isolation and meditation failed to quell.";
			break;
		case 3:
			flaw = "I am dogmatic in my thoughts and philosophy.";
			break;
		case 4:
			flaw = "I let my need to win arguments overshadow friendships and harmony.";
			break;
		case 5:
			flaw = "I'd risk too much to uncover a lost bit of knowledge.";
			break;
		case 6:
			flaw = "I like keeping secrets and won't share them with anyone.";
			break;
		default:
			break;
		}

	}

	@Override
	public void determineProficiencies() {
		// TODO Auto-generated method stub
		Proficiencies.add("Skill: Medicine");
		Proficiencies.add("Skill: Religion");
		Proficiencies.add("Tool: Herbalism kit");
	}

	@Override
	public void determineFeatures() {
		// TODO Auto-generated method stub
		Features.add("Discovery");
	}

	@Override
	public void determineEquipment() {
		// TODO Auto-generated method stub
		equipment.add("Scroll case stuffed full of notes from studies and prayers.");
		equipment.add("Winter Blanket");
		equipment.add("Common Clothes");
		equipment.add("5Gp");
	}

}
