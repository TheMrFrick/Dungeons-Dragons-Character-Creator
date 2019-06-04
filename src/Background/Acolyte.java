package Background;

import java.util.Optional;

import javafx.scene.control.TextInputDialog;

public class Acolyte extends Background {

	public Acolyte() {
		this.name = "Acolyte";
	}
	
	

	@Override
	public void determinePersonalityTrait() {
		// TODO Auto-generated method stub
		rand8 = (int) (Math.random() * 8) + 1;
		System.out.println(rand8);
		switch (rand8) {
		case 1:
			personalityTrait = "I idolize a particular hero of my faith, and constantly refer to that person's deeds and example.";
			break;
		case 2:
			personalityTrait = "I can find common ground between the fiercest enemies, empathizing with them and always working toward peace";
			break;
		case 3:
			personalityTrait = "I see omens in every event and action. The gods try to speak to us, we just need to listen.";
			break;
		case 4:
			personalityTrait = "Nothing can shake my optimistic attitude.";
			break;
		case 5:
			personalityTrait = "I quote (or misquote) sacred texts and proverbs in almost every situation.";
			break;
		case 6:
			personalityTrait = "I am tolerant (or intolerant) of other faiths and respect (or condemn) the worship of other gods.";
			break;
		case 7:
			personalityTrait = "I've enjoyed fine food, drink, and high scoiety among my temple's elite. Rough living grates on me.";
			break;
		case 8:
			personalityTrait = "I've spent so long in the temple that I have little practical experience dealing with people in the outside world.";
			break;
		default:
			personalityTrait = "Number not found";
			break;

		}
	}

	@Override
	public void determineIdeal() {
		// TODO Auto-generated method stub
		rand6 = (int) (Math.random() * 6) + 1;
		switch (rand6) {
		case 1:
			ideal = "Tradition. The ancient traditions of worship and sacrifice must be preserved and upheld.";
			break;
		case 2:
			ideal = "Charity. i always try to help those in need, no matter what the personal cost.";
			break;
		case 3:
			ideal = "Change. We must help bring about the changes the gods are constantly working in the world.";
			break;
		case 4:
			ideal = "Power. I hope to one day rise to the top of my faith's religious hierarchy.";
			break;
		case 5:
			ideal = "Faith. I trust that my deity will guide my actions. I have faith that if I work hard, things will go well.";
			break;
		case 6:
			ideal = "Aspiration. I seek to prove myself worthy of my god's favor by matching my actions against his or her teachings.";
			break;
		default:
			ideal = "Number not found";
			break;
		}
	}

	@Override
	public void determineBond() {
		// TODO Auto-generated method stub
		rand6 = (int) (Math.random() * 6) + 1;
		switch (rand6) {
		case 1:
			bond = "I would die to recover an ancient relic of my faith that was lost long ago.";
			break;
		case 2:
			bond = "I will someday get revenge on the corrupt temple hierarchy who branded me a heretic.";
			break;
		case 3:
			bond = "I owe my life to the priest who took me in when my parents died.";
			break;
		case 4:
			bond = "Everything I do is for the common people.";
			break;
		case 5:
			bond = "I will do anything to protect the temple where I served";
			break;
		case 6:
			bond = "I seek to preserve a sacred text that my enemies consider heretical and seek to destroy.";
			break;
		default:
			bond = "Number not found";
			break;
		}

	}

	@Override
	public void determineFlaw() {
		// TODO Auto-generated method stub
		rand6 = (int)(Math.random()*6) + 1;
		switch(rand6){
		case 1: 
			flaw = "I judge others harshly, and myself even more severely.";
			break;
		case 2: 
			flaw = "I put too much trust in those who wield power within my temple's hierarchy.";
			break;
		case 3: 
			flaw = "My piety sometimes leads me to blindly trust those that profess faith in my god.";
			break;
		case 4: 
			flaw = "I am inflexible in my thinking.";
			break;
		case 5: 
			flaw = "I am suspicious of strangers and expect the worst of them.";
			break;
		case 6: 
			flaw = "Once I pick a goal, I become obsesed with it to the detriment of everything else in my life.";
			break;
			
		default:
			flaw = "Number not found";
			break;
		}
	}




	@Override
	public void determineProficiencies() {
		// TODO Auto-generated method stub
		Proficiencies.add("Skill: Insight");
		Proficiencies.add("Skill: Religion");
		
		for(int i = 0; i < 2; i++){
			TextInputDialog dialog = new TextInputDialog("Common");
			dialog.setTitle("Text Input Dialog");
			dialog.setHeaderText("Add another language");
			dialog.setContentText("Enter another language to speak");

			// Traditional way to get the response value.
			Optional<String> result = dialog.showAndWait();
			if (result.isPresent()) {
				Proficiencies.add("Language: " + result.get());
			}
		}
	}




	@Override
	public void determineFeatures() {
		// TODO Auto-generated method stub
		Features.add("Acolyte: Shelter of the Faithful");
	}




	@Override
	public void determineEquipment() {
		// TODO Auto-generated method stub
		equipment.add("Holy Symbol");
		equipment.add("Prayer Book");
		equipment.add("5 sticks of incense");
		equipment.add("Vestments");
		equipment.add("Common clothes");
		equipment.add("15 Gp");
	}

}
