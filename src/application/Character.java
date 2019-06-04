package application;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Character {
	// Variables
	private int[] abilities = new int[6];
	private int[] modifiers = new int[6];
	private int[] skillsMod = new int[18];
	private ArrayList<String> skills = new ArrayList<>();
	private String Class = "";
	private int speed;
	private String race;
	private int level;
	private ArrayList<String> Features = new ArrayList<>();
	private ArrayList<String> Proficiencies = new ArrayList<>();
	private ArrayList<String> Equipment = new ArrayList<>();
	private String personalityTrait;
	private String ideal;
	private String bond;
	private String flaw;
	private String background;
	private int[] money = new int[5];

	// Constructions
	public Character() {
		Class = "";
		speed = 0;
		race = "";
		level = 0;
	}

	public Character(int[] abilities) {
		this.abilities = abilities;
		determineModifiers();
	}

	public void printAbilities() {
		System.out.println("Strength\t" + abilities[0] + " " + modifiers[0]);
		System.out.println("Dexterity\t" + abilities[1] + " " + modifiers[1]);
		System.out.println("Constitution\t" + abilities[2] + " " + modifiers[2]);
		System.out.println("Intelligence\t" + abilities[3] + " " + modifiers[3]);
		System.out.println("Wisdom\t\t" + abilities[4] + " " + modifiers[4]);
		System.out.println("Charisma\t" + abilities[5] + " " + modifiers[5]);
	}

	public void determineModifiers() {
		for (int i = 0; i < 6; i++) {
			if (abilities[i] == 30) {
				modifiers[i] = 10;
			} else if (abilities[i] == 28 || abilities[i] == 29) {
				modifiers[i] = 9;
			} else if (abilities[i] == 26 || abilities[i] == 27) {
				modifiers[i] = 8;
			} else if (abilities[i] == 24 || abilities[i] == 25) {
				modifiers[i] = 7;
			} else if (abilities[i] == 22 || abilities[i] == 23) {
				modifiers[i] = 6;
			} else if (abilities[i] == 20 || abilities[i] == 21) {
				modifiers[i] = 5;
			} else if (abilities[i] == 18 || abilities[i] == 19) {
				modifiers[i] = 4;
			} else if (abilities[i] == 16 || abilities[i] == 17) {
				modifiers[i] = 3;
			} else if (abilities[i] == 14 || abilities[i] == 15) {
				modifiers[i] = 2;
			} else if (abilities[i] == 12 || abilities[i] == 13) {
				modifiers[i] = 1;
			} else if (abilities[i] == 10 || abilities[i] == 11) {
				modifiers[i] = 0;
			} else if (abilities[i] == 8 || abilities[i] == 9) {
				modifiers[i] = -1;
			} else if (abilities[i] == 6 || abilities[i] == 7) {
				modifiers[i] = -2;
			} else if (abilities[i] == 4 || abilities[i] == 5) {
				modifiers[i] = -3;
			} else if (abilities[i] == 2 || abilities[i] == 3) {
				modifiers[i] = -4;
			} else {
				modifiers[i] = -5;
			}
		}
		setSkillsMod();
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void addAbilities(int[] abilitiesToAdd) {
		for (int i = 0; i < abilitiesToAdd.length; i++) {
			this.abilities[i] += abilitiesToAdd[i];
		}
		determineModifiers();
	}

	public void addProficiencies(ArrayList<String> adding) {
		for (int i = 0; i < adding.size(); i++) {
			Proficiencies.add(adding.get(i));
		}
		Collections.sort(Proficiencies);
	}

	public void addFeatures(ArrayList<String> adding) {
		for (int i = 0; i < adding.size(); i++) {
			Features.add(adding.get(i));
		}
		Collections.sort(Features);
	}

	public void addEquipment(ArrayList<String> adding) {
		for (int i = 0; i < adding.size(); i++) {
			Equipment.add(adding.get(i));
		}
		Collections.sort(Equipment);
	}

	public void printProficiencies() {
		for (int i = 0; i < Proficiencies.size(); i++) {
			System.out.println(Proficiencies.get(i));
		}
	}

	public void printFeatures() {
		for (int i = 0; i < Features.size(); i++) {
			System.out.println(Features.get(i));
		}
	}

	public void printEquipment() {
		for (int i = 0; i < Equipment.size(); i++) {
			System.out.println(Equipment.get(i));
		}
	}

	public void addClass(String name) {
		this.Class += " " + name;
	}

	public void printCharacter() {
		String filename = "character.js";
		PrintWriter writer;
		try {
			writer = new PrintWriter(filename);
			writer.println("$(document).ready(function(){"); // beginning of
																// jquery
																// document
			writer.println("$('h3.class-and-level').text(\"" + Class + "\"+" + "\": \"" + "+\"" + level + "\");");
			writer.println("$('h2.class-and-level').text(\"" + Class + "\"+" + "\": \"" + "+\"" + level + "\");");
			writer.println("$('#strength').append(\"" + abilities[0] + "\");");
			writer.println("$('#dexterity').append(\"" + abilities[1] + "\");");
			writer.println("$('#constitution').append(\"" + abilities[2] + "\");");
			writer.println("$('#intelligence').append(\"" + abilities[3] + "\");");
			writer.println("$('#wisdom').append(\"" + abilities[4] + "\");");
			writer.println("$('#charisma').append(\"" + abilities[5] + "\");");
			writer.println("$('#acrobatics').append(\"" + modifiers[1] + "\");");
			writer.println("$('#animal-handling').append(\"" + modifiers[4] + "\");");
			writer.println("$('#arcana').append(\"" + modifiers[3] + "\");");
			writer.println("$('#athletics').append(\"" + modifiers[0] + "\");");
			writer.println("$('#deception').append(\"" + modifiers[5] + "\");");
			writer.println("$('#history').append(\"" + modifiers[3] + "\");");
			writer.println("$('#insight').append(\"" + modifiers[4] + "\");");
			writer.println("$('#intimidation').append(\"" + modifiers[5] + "\");");
			writer.println("$('#investigation').append(\"" + modifiers[3] + "\");");
			writer.println("$('#medicine').append(\"" + modifiers[4] + "\");");
			writer.println("$('#nature').append(\"" + modifiers[3] + "\");");
			writer.println("$('#perception').append(\"" + modifiers[4] + "\");");
			writer.println("$('#performance').append(\"" + modifiers[5] + "\");");
			writer.println("$('#persuasion').append(\"" + modifiers[5] + "\");");
			writer.println("$('#religion').append(\"" + modifiers[3] + "\");");
			writer.println("$('#sleight-of-hand').append(\"" + modifiers[1] + "\");");
			writer.println("$('#stealth').append(\"" + modifiers[1] + "\");");
			writer.println("$('#survival').append(\"" + modifiers[4] + "\");");
			writer.println("$('#personalityTrait').append(\"" + personalityTrait + "\");");
			writer.println("$('#ideal').append(\"" + ideal + "\");");
			writer.println("$('#bond').append(\"" + bond + "\");");
			writer.println("$('#flaw').append(\"" + flaw + "\");");
			writer.print("$('#proficiencies').html(\"");
			for(int i =0; i< Proficiencies.size(); i++){
				writer.print("<li>");
				writer.print(Proficiencies.get(i));
				writer.print("</li>");
			}
			writer.println("\");");
			writer.print("$('#features').html(\"");
			for(int i =0; i<Features.size(); i++){
				writer.print("<li>");
				writer.print(Features.get(i));
				writer.print("</li>");
			}
			writer.println("\");");
			writer.print("$('#equipment').html(\"");
			for(int i =0; i<Equipment.size(); i++){
				writer.print("<li>");
				writer.print(Equipment.get(i));
				writer.print("</li>");
			}
			writer.print("<li> Copper: " + money[0] + "</li>");
			writer.print("<li> Silver: " + money[1] + "</li>");
			writer.print("<li> Electrum: " + money[2] + "</li>");
			writer.print("<li> Gold: " + money[3] + "</li>");
			writer.print("<li> Platinum: " + money[4] + "</li>");
			writer.print("\");");
			writer.print("});"); // end of jquery document
			writer.close();
			Desktop.getDesktop().open(new File("index.html"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Getters and Setters!
	public int getSpeed() {
		return speed;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getClassName() {
		return Class;
	}

	public void setClass(String Class) {
		this.Class = Class;
	}

	public int[] getAbilities() {
		return abilities;
	}

	public void setAbilities(int[] abilities) {
		this.abilities = abilities;
		determineModifiers();
	}

	public int[] getModifiers() {
		return modifiers;
	}

	public int[] getSkillsMod() {
		return skillsMod;
	}

	public void setSkillsMod() {
		skillsMod[0] = modifiers[1]; // Acrobatics
		skillsMod[1] = modifiers[4]; // Animal handling
		skillsMod[2] = modifiers[3]; // Arcana
		skillsMod[3] = modifiers[0]; // Athletics
		skillsMod[4] = modifiers[5]; // Deception
		skillsMod[5] = modifiers[3]; // History
		skillsMod[6] = modifiers[4]; // Insight
		skillsMod[7] = modifiers[5]; // Intimidation
		skillsMod[8] = modifiers[3]; // Investigation
		skillsMod[9] = modifiers[4]; // Medicine
		skillsMod[10] = modifiers[3]; // Nature
		skillsMod[11] = modifiers[4]; // Perception
		skillsMod[12] = modifiers[5]; // Performance
		skillsMod[13] = modifiers[5]; // Persuasion
		skillsMod[14] = modifiers[3]; // Religion
		skillsMod[15] = modifiers[1]; // Sleight of Hand
		skillsMod[16] = modifiers[1]; // stealth
		skillsMod[17] = modifiers[4]; // Survival
		setSkills();
	}

	public ArrayList<?> getSkills() {
		return skills;
	}

	public void setSkills() {
		// skills.add("Acrobatics " + skillsMod[0]);
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public ArrayList<String> getFeatures() {
		return Features;
	}

	public void setFeatures(ArrayList<String> features) {
		Features = features;
	}

	public ArrayList<String> getProficiencies() {
		return Proficiencies;
	}

	public void setProficiencies(ArrayList<String> proficiencies) {
		Proficiencies = proficiencies;
	}

	public ArrayList<String> getEquipment() {
		return Equipment;
	}

	public void setEquipment(ArrayList<String> equipment) {
		Equipment = equipment;
	}

	public String getPersonalityTrait() {
		return personalityTrait;
	}

	public void setPersonalityTrait(String personalityTrait) {
		this.personalityTrait = personalityTrait;
	}

	public String getIdeal() {
		return ideal;
	}

	public void setIdeal(String ideal) {
		this.ideal = ideal;
	}

	public String getBond() {
		return bond;
	}

	public void setBond(String bond) {
		this.bond = bond;
	}

	public String getFlaw() {
		return flaw;
	}

	public void setFlaw(String flaw) {
		this.flaw = flaw;
	}

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	public int[] getMoney() {
		return money;
	}

	public void setMoney(int[] money) {
		this.money = money;
	}
}
