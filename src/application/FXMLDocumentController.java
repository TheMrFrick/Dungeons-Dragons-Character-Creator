package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Optional;
import java.util.ResourceBundle;

//import org.controlsfx.control.ListSelectionView;

import Class.*;
import Race.*;
import Background.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;

/**
 *
 * @author TheMrFrick
 */
public class FXMLDocumentController implements Initializable {

//	ListSelectionView<String> view = new ListSelectionView<>();
	ArrayList<String> sourceItems = getSourceItems();
	HashMap<String, Integer> items = getItems();
	Character newChar = new Character();
	ArrayList<Race> races = new ArrayList<>();
	ArrayList<ClassType> classes = new ArrayList<>();
	ArrayList<Background> bg = new ArrayList<>();

	// part Declarations

	@FXML
	private Tab raceTab;
	@FXML
	private Tab classTab;
	@FXML
	private Tab backgroundTab;
	@FXML
	private Tab skillsTab;
	@FXML
	private Tab equipmentTab;
	@FXML
	private Tab completeTab;
	@FXML
	private TextField abilityTF1;
	@FXML
	private TextField abilityTF2;
	@FXML
	private TextField abilityTF3;
	@FXML
	private TextField abilityTF4;
	@FXML
	private TextField abilityTF5;
	@FXML
	private TextField abilityTF6;
	@FXML
	private RadioButton Strength1;
	@FXML
	private RadioButton Strength2;
	@FXML
	private RadioButton Strength3;
	@FXML
	private RadioButton Strength4;
	@FXML
	private RadioButton Strength5;
	@FXML
	private RadioButton Strength6;
	@FXML
	private RadioButton Dexterity1;
	@FXML
	private RadioButton Dexterity2;
	@FXML
	private RadioButton Dexterity3;
	@FXML
	private RadioButton Dexterity4;
	@FXML
	private RadioButton Dexterity5;
	@FXML
	private RadioButton Dexterity6;
	@FXML
	private RadioButton Constitution1;
	@FXML
	private RadioButton Constitution2;
	@FXML
	private RadioButton Constitution3;
	@FXML
	private RadioButton Constitution4;
	@FXML
	private RadioButton Constitution5;
	@FXML
	private RadioButton Constitution6;
	@FXML
	private RadioButton Intelligence1;
	@FXML
	private RadioButton Intelligence2;
	@FXML
	private RadioButton Intelligence3;
	@FXML
	private RadioButton Intelligence4;
	@FXML
	private RadioButton Intelligence5;
	@FXML
	private RadioButton Intelligence6;
	@FXML
	private RadioButton Wisdom1;
	@FXML
	private RadioButton Wisdom2;
	@FXML
	private RadioButton Wisdom3;
	@FXML
	private RadioButton Wisdom4;
	@FXML
	private RadioButton Wisdom5;
	@FXML
	private RadioButton Wisdom6;
	@FXML
	private RadioButton Charisma1;
	@FXML
	private RadioButton Charisma2;
	@FXML
	private RadioButton Charisma3;
	@FXML
	private RadioButton Charisma4;
	@FXML
	private RadioButton Charisma5;
	@FXML
	private RadioButton Charisma6;
	@FXML
	private Button submitAbilities;
	@FXML
	private Button submitRace;
	@FXML
	private Button rollAbilitiesBUT;
	@FXML
	private RadioButton HillDwarf;
	@FXML
	private RadioButton MountainDwarf;
	@FXML
	private RadioButton HighElf;
	@FXML
	private RadioButton WoodElf;
	@FXML
	private RadioButton DarkElf;
	@FXML
	private RadioButton LightfootHalfling;
	@FXML
	private RadioButton StoutHalfling;
	@FXML
	private RadioButton ForestGnome;
	@FXML
	private RadioButton RockGnome;
	@FXML
	private RadioButton DeepGnome;
	@FXML
	private RadioButton Human;
	@FXML
	private RadioButton Dragonborn;
	@FXML
	private RadioButton HalfElf;
	@FXML
	private RadioButton HalfOrc;
	@FXML
	private RadioButton Tiefling;
	@FXML
	private RadioButton Aarakocra;
	@FXML
	private RadioButton Goliath;
	@FXML
	private RadioButton FireGenasi;
	@FXML
	private RadioButton EarthGenasi;
	@FXML
	private RadioButton AirGenasi;
	@FXML
	private RadioButton WaterGenasi;
	@FXML
	private TextArea raceInfoTA;
	@FXML
	private RadioButton Barbarian;
	@FXML
	private RadioButton Bard;
	@FXML
	private RadioButton Cleric;
	@FXML
	private RadioButton Druid;
	@FXML
	private RadioButton Fighter;
	@FXML
	private RadioButton Monk;
	@FXML
	private RadioButton Paladin;
	@FXML
	private RadioButton Ranger;
	@FXML
	private RadioButton Rogue;
	@FXML
	private RadioButton Sorcerer;
	@FXML
	private RadioButton Warlock;
	@FXML
	private RadioButton Wizard;
	@FXML
	private TextArea classInfoTA;
	@FXML
	private Button submitClass;
	@FXML
	private CheckBox multiClass;
	@FXML
	private RadioButton Acolyte;
	@FXML
	private RadioButton Charlatan;
	@FXML
	private RadioButton Criminal;
	@FXML
	private RadioButton Entertainer;
	@FXML
	private RadioButton FolkHero;
	@FXML
	private RadioButton GuildArtisan;
	@FXML
	private RadioButton Hermit;
	@FXML
	private RadioButton Noble;
	@FXML
	private RadioButton Outlander;
	@FXML
	private RadioButton Sage;
	@FXML
	private RadioButton Sailor;
	@FXML
	private RadioButton Soldier;
	@FXML
	private RadioButton Urchin;
	@FXML
	private TextArea BackgroundInfo;
	@FXML
	private TextArea PersonalityTraits;
	@FXML
	private TextArea Ideals;
	@FXML
	private TextArea Bonds;
	@FXML
	private TextArea Flaws;
	@FXML
	private Button submitBackground;
	@FXML
	private Pane equipmentPane;
	@FXML
	private TextField copper;
	@FXML
	private TextField silver;
	@FXML
	private TextField electrum;
	@FXML
	private TextField gold;
	@FXML
	private TextField platinum;
	@FXML
	private Button submitEquipment;
	@FXML
	private Button printCharacter;

	// group Declarations
	final ToggleGroup Ability1 = new ToggleGroup();
	final ToggleGroup Ability2 = new ToggleGroup();
	final ToggleGroup Ability3 = new ToggleGroup();
	final ToggleGroup Ability4 = new ToggleGroup();
	final ToggleGroup Ability5 = new ToggleGroup();
	final ToggleGroup Ability6 = new ToggleGroup();
	final ToggleGroup race = new ToggleGroup();
	final ToggleGroup Class = new ToggleGroup();
	final ToggleGroup background = new ToggleGroup();

	@FXML
	private void rollAbilities(ActionEvent event) {
		// System.out.println("Roll Abilities Activated");
		int roll[] = new int[6];
		for (int i = 0; i < roll.length; i++) {
			int roll1, roll2, roll3, roll4;
			roll1 = (int) (Math.random() * 6) + 1;
			roll2 = (int) (Math.random() * 6) + 1;
			roll3 = (int) (Math.random() * 6) + 1;
			roll4 = (int) (Math.random() * 6) + 1;
			int min = roll1;
			if (min > roll2) {
				min = roll2;
			} else if (min > roll3) {
				min = roll3;
			} else if (min > roll4) {
				min = roll4;
			}
			int total = roll1 + roll2 + roll3 + roll4;
			total -= min;
			roll[i] = total;
		}
		abilityTF1.setText(Integer.toString(roll[0]));
		abilityTF2.setText(Integer.toString(roll[1]));
		abilityTF3.setText(Integer.toString(roll[2]));
		abilityTF4.setText(Integer.toString(roll[3]));
		abilityTF5.setText(Integer.toString(roll[4]));
		abilityTF6.setText(Integer.toString(roll[5]));
	}

	@FXML
	public void submitAbilities(ActionEvent event) {
		RadioButton chk1 = (RadioButton) Ability1.getSelectedToggle();
		RadioButton chk2 = (RadioButton) Ability2.getSelectedToggle();
		RadioButton chk3 = (RadioButton) Ability3.getSelectedToggle();
		RadioButton chk4 = (RadioButton) Ability4.getSelectedToggle();
		RadioButton chk5 = (RadioButton) Ability5.getSelectedToggle();
		RadioButton chk6 = (RadioButton) Ability6.getSelectedToggle();
		if ((chk1.getText().contains("Str") && (chk2.getText().contains("Str") || chk4.getText().contains("Str")
				|| chk3.getText().contains("Str") || chk5.getText().contains("Str") || chk6.getText().contains("Str")))
				|| (chk1.getText().contains("Dex") && (chk2.getText().contains("Dex") || chk3.getText().contains("Dex")
						|| chk4.getText().contains("Dex") || chk5.getText().contains("Dex")
						|| chk6.getText().contains("Dex")))
				|| (chk1.getText().contains("Con") && (chk2.getText().contains("Con") || chk3.getText().contains("Con")
						|| chk4.getText().contains("Con") || chk5.getText().contains("Con")
						|| chk6.getText().contains("Con")))
				|| (chk1.getText().contains("Int") && (chk2.getText().contains("Int") || chk3.getText().contains("Int")
						|| chk4.getText().contains("Int") || chk5.getText().contains("Int")
						|| chk6.getText().contains("Int")))
				|| (chk1.getText().contains("Wis") && (chk2.getText().contains("Wis") || chk3.getText().contains("Wis")
						|| chk4.getText().contains("Wis") || chk5.getText().contains("Wis")
						|| chk6.getText().contains("Wis")))
				|| (chk1.getText().contains("Cha") && (chk2.getText().contains("Cha") || chk3.getText().contains("Cha")
						|| chk4.getText().contains("Cha") || chk5.getText().contains("Cha")
						|| chk6.getText().contains("Cha")))) {
			Alert error = new Alert(AlertType.ERROR);
			error.setTitle("Error");
			error.setHeaderText("Multiple Chosen");
			error.setContentText("Sorry, but every skill can only be chosen once, not multiple times.");
			error.showAndWait();
		} else {
			if ((Ability1.getSelectedToggle() == null || Ability2.getSelectedToggle() == null
					|| Ability3.getSelectedToggle() == null || Ability4.getSelectedToggle() == null
					|| Ability5.getSelectedToggle() == null || Ability6.getSelectedToggle() == null)) {
				Alert error = new Alert(AlertType.ERROR);
				error.setTitle("Error");
				error.setHeaderText("Every Skill must be chosen");
				error.setContentText(
						"You must select Strength, Dexterity, Constitution, Intelligence, Wisdom and Charisma once. "
								+ "\nAlso, each must be selected.");
				error.showAndWait();
			} else {
				Alert confirm = new Alert(AlertType.CONFIRMATION);
				confirm.setTitle("Confirm Abilities");
				confirm.setHeaderText("Confirm Abilities?");
				confirm.setContentText("Once you confirm, you can no longer change your abilities, confirm?");
				Optional<ButtonType> result = confirm.showAndWait();
				if (result.get() == ButtonType.OK) {
					int[] abilities = new int[6];
					// Checking for Strength
					if (Ability1.getSelectedToggle().equals(Strength1)) {
						abilities[0] = Integer.parseInt(abilityTF1.getText());
					} else if (Ability2.getSelectedToggle().equals(Strength2)) {
						abilities[0] = Integer.parseInt(abilityTF2.getText());
					} else if (Ability3.getSelectedToggle().equals(Strength3)) {
						abilities[0] = Integer.parseInt(abilityTF3.getText());
					} else if (Ability4.getSelectedToggle().equals(Strength4)) {
						abilities[0] = Integer.parseInt(abilityTF4.getText());
					} else if (Ability5.getSelectedToggle().equals(Strength5)) {
						abilities[0] = Integer.parseInt(abilityTF5.getText());
					} else if (Ability6.getSelectedToggle().equals(Strength6)) {
						abilities[0] = Integer.parseInt(abilityTF6.getText());
					}
					// Checking for Dexterity.
					if (Ability1.getSelectedToggle().equals(Dexterity1)) {
						abilities[1] = Integer.parseInt(abilityTF1.getText());
					} else if (Ability2.getSelectedToggle().equals(Dexterity2)) {
						abilities[1] = Integer.parseInt(abilityTF2.getText());
					} else if (Ability3.getSelectedToggle().equals(Dexterity3)) {
						abilities[1] = Integer.parseInt(abilityTF3.getText());
					} else if (Ability4.getSelectedToggle().equals(Dexterity4)) {
						abilities[1] = Integer.parseInt(abilityTF4.getText());
					} else if (Ability5.getSelectedToggle().equals(Dexterity5)) {
						abilities[1] = Integer.parseInt(abilityTF5.getText());
					} else if (Ability6.getSelectedToggle().equals(Dexterity6)) {
						abilities[1] = Integer.parseInt(abilityTF6.getText());
					}
					// Checking for Constitution
					if (Ability1.getSelectedToggle().equals(Constitution1)) {
						abilities[2] = Integer.parseInt(abilityTF1.getText());
					} else if (Ability2.getSelectedToggle().equals(Constitution2)) {
						abilities[2] = Integer.parseInt(abilityTF2.getText());
					} else if (Ability3.getSelectedToggle().equals(Constitution3)) {
						abilities[2] = Integer.parseInt(abilityTF3.getText());
					} else if (Ability4.getSelectedToggle().equals(Constitution4)) {
						abilities[2] = Integer.parseInt(abilityTF4.getText());
					} else if (Ability5.getSelectedToggle().equals(Constitution5)) {
						abilities[2] = Integer.parseInt(abilityTF5.getText());
					} else if (Ability6.getSelectedToggle().equals(Constitution6)) {
						abilities[2] = Integer.parseInt(abilityTF6.getText());
					}
					// Checking for Intelligence
					if (Ability1.getSelectedToggle().equals(Intelligence1)) {
						abilities[3] = Integer.parseInt(abilityTF1.getText());
					} else if (Ability2.getSelectedToggle().equals(Intelligence2)) {
						abilities[3] = Integer.parseInt(abilityTF2.getText());
					} else if (Ability3.getSelectedToggle().equals(Intelligence3)) {
						abilities[3] = Integer.parseInt(abilityTF3.getText());
					} else if (Ability4.getSelectedToggle().equals(Intelligence4)) {
						abilities[3] = Integer.parseInt(abilityTF4.getText());
					} else if (Ability5.getSelectedToggle().equals(Intelligence5)) {
						abilities[3] = Integer.parseInt(abilityTF5.getText());
					} else if (Ability6.getSelectedToggle().equals(Intelligence6)) {
						abilities[3] = Integer.parseInt(abilityTF6.getText());
					}
					// Checking for Wisdom
					if (Ability1.getSelectedToggle().equals(Wisdom1)) {
						abilities[4] = Integer.parseInt(abilityTF1.getText());
					} else if (Ability2.getSelectedToggle().equals(Wisdom2)) {
						abilities[4] = Integer.parseInt(abilityTF2.getText());
					} else if (Ability3.getSelectedToggle().equals(Wisdom3)) {
						abilities[4] = Integer.parseInt(abilityTF3.getText());
					} else if (Ability4.getSelectedToggle().equals(Wisdom4)) {
						abilities[4] = Integer.parseInt(abilityTF4.getText());
					} else if (Ability5.getSelectedToggle().equals(Wisdom5)) {
						abilities[4] = Integer.parseInt(abilityTF5.getText());
					} else if (Ability6.getSelectedToggle().equals(Wisdom6)) {
						abilities[4] = Integer.parseInt(abilityTF6.getText());
					}
					// Checking for Charisma
					if (Ability1.getSelectedToggle().equals(Charisma1)) {
						abilities[5] = Integer.parseInt(abilityTF1.getText());
					} else if (Ability2.getSelectedToggle().equals(Charisma2)) {
						abilities[5] = Integer.parseInt(abilityTF2.getText());
					} else if (Ability3.getSelectedToggle().equals(Charisma3)) {
						abilities[5] = Integer.parseInt(abilityTF3.getText());
					} else if (Ability4.getSelectedToggle().equals(Charisma4)) {
						abilities[5] = Integer.parseInt(abilityTF4.getText());
					} else if (Ability5.getSelectedToggle().equals(Charisma5)) {
						abilities[5] = Integer.parseInt(abilityTF5.getText());
					} else if (Ability6.getSelectedToggle().equals(Charisma6)) {
						abilities[5] = Integer.parseInt(abilityTF6.getText());
					}

					newChar.setAbilities(abilities);
					// newChar.printAbilities();
					submitAbilities.setDisable(true);
					rollAbilitiesBUT.setDisable(true);
					raceTab.setDisable(false);

					Strength1.setDisable(true);
					Strength2.setDisable(true);
					Strength3.setDisable(true);
					Strength4.setDisable(true);
					Strength5.setDisable(true);
					Strength6.setDisable(true);

					Dexterity1.setDisable(true);
					Dexterity2.setDisable(true);
					Dexterity3.setDisable(true);
					Dexterity4.setDisable(true);
					Dexterity5.setDisable(true);
					Dexterity6.setDisable(true);

					Constitution1.setDisable(true);
					Constitution2.setDisable(true);
					Constitution3.setDisable(true);
					Constitution4.setDisable(true);
					Constitution5.setDisable(true);
					Constitution6.setDisable(true);

					Wisdom1.setDisable(true);
					Wisdom2.setDisable(true);
					Wisdom3.setDisable(true);
					Wisdom4.setDisable(true);
					Wisdom5.setDisable(true);
					Wisdom6.setDisable(true);

					Intelligence1.setDisable(true);
					Intelligence2.setDisable(true);
					Intelligence3.setDisable(true);
					Intelligence4.setDisable(true);
					Intelligence5.setDisable(true);
					Intelligence6.setDisable(true);

					Charisma1.setDisable(true);
					Charisma2.setDisable(true);
					Charisma3.setDisable(true);
					Charisma4.setDisable(true);
					Charisma5.setDisable(true);
					Charisma6.setDisable(true);

				}
			}
		}

	}

	public void submitRace() {
		// System.out.println(race.getSelectedToggle());
		if (race.getSelectedToggle() == null) {
			Alert error = new Alert(AlertType.ERROR);
			error.setHeaderText("Need to choose a Race");
			error.setContentText("You must select a race to continue on");
			error.showAndWait();
		} else {
			Alert confirmRace = new Alert(AlertType.CONFIRMATION);
			confirmRace.setHeaderText("Confirm Race");
			confirmRace.setContentText("Are you sure you want this race?" + "\nYou can't change afterwards.");
			Optional<ButtonType> result = confirmRace.showAndWait();
			if (result.get() == ButtonType.OK) {
				RadioButton chk = (RadioButton) race.getSelectedToggle();
				String name = chk.getText().replaceAll("\\s", "");
				System.out.println(name);
				for (int i = 0; i < races.size(); i++) {
					if (name.equals(races.get(i).getRace())) {
						races.get(i).setChosen(true);
						newChar.setRace(races.get(i).getRace());
						newChar.setSpeed(races.get(i).getSpeed());
						newChar.addAbilities(races.get(i).getAbilities());
						newChar.addFeatures(races.get(i).getFeatures());
						newChar.addProficiencies(races.get(i).getProficiencies());
					}
				}

				// Enable and Disable
				submitRace.setDisable(true);
				classTab.setDisable(false);

				HillDwarf.setDisable(true);
				MountainDwarf.setDisable(true);
				HighElf.setDisable(true);
				WoodElf.setDisable(true);
				DarkElf.setDisable(true);
				LightfootHalfling.setDisable(true);
				StoutHalfling.setDisable(true);
				ForestGnome.setDisable(true);
				RockGnome.setDisable(true);
				DeepGnome.setDisable(true);
				Human.setDisable(true);
				Dragonborn.setDisable(true);
				HalfElf.setDisable(true);
				HalfOrc.setDisable(true);
				Tiefling.setDisable(true);
				Aarakocra.setDisable(true);
				Goliath.setDisable(true);
				EarthGenasi.setDisable(true);
				WaterGenasi.setDisable(true);
				FireGenasi.setDisable(true);
				AirGenasi.setDisable(true);
			}
		}
	}

	public void hoverRace() {
		if (raceInfoTA.getText() != "" || raceInfoTA.getText() == null) {
			raceInfoTA.setText("");
		}
		RadioButton chk = (RadioButton) race.getSelectedToggle();
		String line = null;

		String filename = chk.getText();
		filename = filename.replaceAll("\\s", "");

		// System.out.println(filename);
		if (filename.contains("Genasi")) {
			try {
				FileReader fr = new FileReader("Genasi.txt");
				BufferedReader br = new BufferedReader(fr);
				while (((line = br.readLine()) != null)) {
					raceInfoTA.appendText(line);
					raceInfoTA.appendText("\n");
				}
				br.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				Alert error = new Alert(AlertType.ERROR);
				error.setContentText("Cannot find Genasi.txt");
				error.showAndWait();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				Alert error = new Alert(AlertType.ERROR);
				error.setContentText("Cannot read Genasi.txt");
				error.showAndWait();
				// e.printStackTrace();
			}
		}
		if (filename.contains("Dwarf")) {
			try {
				FileReader fr = new FileReader("Dwarf.txt");
				BufferedReader br = new BufferedReader(fr);
				while (((line = br.readLine()) != null)) {
					raceInfoTA.appendText(line);
					raceInfoTA.appendText("\n");
				}
				br.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				Alert error = new Alert(AlertType.ERROR);
				error.setContentText("Cannot find Dwarf.txt");
				error.showAndWait();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				Alert error = new Alert(AlertType.ERROR);
				error.setContentText("Cannot read Dwarf.txt");
				error.showAndWait();
				// e.printStackTrace();
			}
		}
		if (filename.contains("Elf") && !(filename.equals("Half-Elf"))) {
			try {
				FileReader fr = new FileReader("Elf.txt");
				BufferedReader br = new BufferedReader(fr);
				while (((line = br.readLine()) != null)) {
					raceInfoTA.appendText(line);
					raceInfoTA.appendText("\n");
				}
				br.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				Alert error = new Alert(AlertType.ERROR);
				error.setContentText("Cannot find Elf.txt");
				error.showAndWait();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				Alert error = new Alert(AlertType.ERROR);
				error.setContentText("Cannot read Elf.txt");
				error.showAndWait();
				// e.printStackTrace();
			}
		}
		if (filename.contains("Gnome")) {
			try {
				FileReader fr = new FileReader("Gnome.txt");
				BufferedReader br = new BufferedReader(fr);
				while (((line = br.readLine()) != null)) {
					raceInfoTA.appendText(line);
					raceInfoTA.appendText("\n");
				}
				br.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				Alert error = new Alert(AlertType.ERROR);
				error.setContentText("Cannot find Gnome.txt");
				error.showAndWait();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				Alert error = new Alert(AlertType.ERROR);
				error.setContentText("Cannot read Gnome.txt");
				error.showAndWait();
				// e.printStackTrace();
			}
		}
		if (filename.contains("Halfling")) {
			try {
				FileReader fr = new FileReader("Halfling.txt");
				BufferedReader br = new BufferedReader(fr);
				while (((line = br.readLine()) != null)) {
					raceInfoTA.appendText(line);
					raceInfoTA.appendText("\n");
				}
				br.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				Alert error = new Alert(AlertType.ERROR);
				error.setContentText("Cannot find Halfling.txt");
				error.showAndWait();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				Alert error = new Alert(AlertType.ERROR);
				error.setContentText("Cannot read Halfling.txt");
				error.showAndWait();
				// e.printStackTrace();
			}
		}
		for (int i = 0; i < races.size(); i++) {
			if (filename.equals(races.get(i).getRace())) {
				raceInfoTA.appendText(races.get(i).getInfo());
			}
		}

	}

	public void hoverClass() {
		RadioButton chk = (RadioButton) Class.getSelectedToggle();
		if (classInfoTA.getText() != "" || classInfoTA.getText() != null) {
			classInfoTA.setText("");
		}
		for (int i = 0; i < classes.size(); i++) {
			if ((classes.get(i).getName()).equals(chk.getText())) {

				classInfoTA.setText(classes.get(i).getInfo());
			}
		}
	}

	public void submitClass() {
		int level = 0;
		// System.out.println("Submit Class Activated");

		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Confirmation Dialog");
		alert.setHeaderText("Done chosing class?");
		alert.setContentText("Are you ok with this? \nYou won't be able to change this one accepted.");

		Optional<ButtonType> res = alert.showAndWait();
		if (res.get() == ButtonType.OK) {
			// ... user chose OK

			TextInputDialog dialog = new TextInputDialog("1-20");
			dialog.setTitle("Level Input Dialog");
			dialog.setHeaderText("Level");
			dialog.setContentText("Enter the desired level 1-20:");

			// Traditional way to get the response value.
			Optional<String> result = dialog.showAndWait();
			if (result.isPresent()) {
				level = Integer.parseInt(result.get());
				
			} else {
				level= 1;
				
			}
			RadioButton chk = (RadioButton) Class.getSelectedToggle();
			for (int i = 0; i < classes.size(); i++) {
				if (classes.get(i).getName().equals(chk.getText())) {
					classes.get(i).determineFeatures(level);
					newChar.setLevel(level);
					newChar.addClass(classes.get(i).getName());
					newChar.addEquipment(classes.get(i).getEquipment());
					newChar.addFeatures(classes.get(i).getFeatures());
					newChar.addProficiencies(classes.get(i).getProficiencies());
				}
			}
			backgroundTab.setDisable(false);
			submitClass.setDisable(true);

			Barbarian.setDisable(true);
			Bard.setDisable(true);
			Cleric.setDisable(true);
			Druid.setDisable(true);
			Fighter.setDisable(true);
			Monk.setDisable(true);
			Paladin.setDisable(true);
			Ranger.setDisable(true);
			Rogue.setDisable(true);
			Sorcerer.setDisable(true);
			Warlock.setDisable(true);
			Wizard.setDisable(true);
		}
		System.out.println("Equipment:");
		//newChar.printEquipment();
		System.out.println("\nFeatures:");
		//newChar.printFeatures();
		System.out.println("\nProficiencies:");
		//newChar.printProficiencies();

		// Disabling and Enabling

	}

	public void hoverBackground() {
		RadioButton chk = (RadioButton) background.getSelectedToggle();
		if (BackgroundInfo.getText() != "" || BackgroundInfo.getText() != null) {
			BackgroundInfo.setText("");
		}
		for (int i = 0; i < bg.size(); i++) {
			if (bg.get(i).getName().equals(chk.getId())) {
				bg.get(i).determinePersonalityTrait();
				bg.get(i).determineBond();
				bg.get(i).determineFlaw();
				bg.get(i).determineIdeal();
				PersonalityTraits.setText(bg.get(i).getPersonalityTrait());
				Ideals.setText(bg.get(i).getIdeal());
				Bonds.setText(bg.get(i).getBond());
				Flaws.setText(bg.get(i).getFlaw());
				BackgroundInfo.setText(bg.get(i).getInfo());
			}
		}
	}

	public void submitBackground() {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Confirmation Dialog");
		alert.setHeaderText("Done chosing background?");
		alert.setContentText("Are you ok with this? \nYou won't be able to change this one accepted.");

		Optional<ButtonType> res = alert.showAndWait();
		if (res.get() == ButtonType.OK) {
			RadioButton chk = (RadioButton) background.getSelectedToggle();
			for (int i = 0; i < bg.size(); i++) {
				if (bg.get(i).getName().equals(chk.getId())) {
					newChar.setPersonalityTrait(bg.get(i).getPersonalityTrait());
					newChar.setIdeal(bg.get(i).getIdeal());
					newChar.setBond(bg.get(i).getBond());
					newChar.setFlaw(bg.get(i).getFlaw());
					newChar.setBackground(bg.get(i).getName());
					newChar.addEquipment(bg.get(i).getEquipment());
					newChar.addFeatures(bg.get(i).getFeatures());
					newChar.addProficiencies(bg.get(i).getProficiency());
				}
			}
			submitBackground.setDisable(true);
			equipmentTab.setDisable(false);
		}
	}

	public void submitEquipment() {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Confirmation Dialog");
		alert.setHeaderText("Done chosing equipment?");
		alert.setContentText("Are you ok with this? \nYou won't be able to change this one accepted.");

		Optional<ButtonType> res = alert.showAndWait();
		if (res.get() == ButtonType.OK) {
			int cop = 0, sil = 0, ele = 0, gol = 0, pla = 0;
			if (!copper.getText().isEmpty()) {
				cop = Integer.parseInt(copper.getText().trim());
			}
			if (!silver.getText().isEmpty()) {
				sil = Integer.parseInt(silver.getText().trim());
			}
			if (!electrum.getText().isEmpty()) {
				ele = Integer.parseInt(electrum.getText().trim());
			}
			if (!gold.getText().isEmpty()) {
				gol = Integer.parseInt(gold.getText().trim());
			}
			if (!platinum.getText().isEmpty()) {
				pla = Integer.parseInt(platinum.getText().trim());
			}
			
			int moneyNeeded = 0;
			
			//System.out.println();
			cop += (pla * 1000) + (gol * 100) + (ele * 50) + (sil * 10);
			System.out.println(cop);

			ArrayList<String> selectedItems = new ArrayList<>();
//			for (int i = 0; i < view.getTargetItems().size(); i++) {
//				selectedItems.add(view.getTargetItems().get(i));
//			}

			for (int i = 0; i < selectedItems.size(); i++) {
				for (String name : items.keySet()) {
					String key = name.toString().trim().toLowerCase();
					if (selectedItems.get(i).toLowerCase().equals(key)) {
						moneyNeeded += items.get(name).intValue();
					}
				}
			}
			System.out.println(moneyNeeded);
			if (!(moneyNeeded <= cop)) {
				Alert error = new Alert(AlertType.ERROR);
				error.setHeaderText("Money Error");
				error.setTitle("Error");
				error.setContentText("Sorry, but you don't have enough money for the items selected");
				error.showAndWait();
			} else {
				cop -= moneyNeeded;
				pla = cop / 1000;
				cop -= pla*1000;
				gol = cop / 100;
				cop -= gol*100;
				sil = cop / 10;
				cop -= sil*10;
				submitEquipment.setDisable(true);
				int money[] = new int[5];
				money[0] = cop;
				money[1] = sil;
				money[2] = ele;
				money[3] = gol;
				money[4] = pla;
				copper.setText(Integer.toString(cop));
				silver.setText(Integer.toString(sil));
				electrum.setText(Integer.toString(ele));
				gold.setText(Integer.toString(gol));
				platinum.setText(Integer.toString(pla));
				
				copper.setDisable(true);
				silver.setDisable(true);
				electrum.setDisable(true);
				gold.setDisable(true);
				platinum.setDisable(true);
				
				newChar.setMoney(money);
				newChar.addEquipment(selectedItems);
//				view.setDisable(true);
				completeTab.setDisable(false);
			}
		}
	}
	
	public void printCharacter(){
		newChar.printCharacter();
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
		Strength1.setToggleGroup(Ability1);
		Strength2.setToggleGroup(Ability2);
		Strength3.setToggleGroup(Ability3);
		Strength4.setToggleGroup(Ability4);
		Strength5.setToggleGroup(Ability5);
		Strength6.setToggleGroup(Ability6);
		Dexterity1.setToggleGroup(Ability1);
		Dexterity2.setToggleGroup(Ability2);
		Dexterity3.setToggleGroup(Ability3);
		Dexterity4.setToggleGroup(Ability4);
		Dexterity5.setToggleGroup(Ability5);
		Dexterity6.setToggleGroup(Ability6);
		Constitution1.setToggleGroup(Ability1);
		Constitution2.setToggleGroup(Ability2);
		Constitution3.setToggleGroup(Ability3);
		Constitution4.setToggleGroup(Ability4);
		Constitution5.setToggleGroup(Ability5);
		Constitution6.setToggleGroup(Ability6);
		Intelligence1.setToggleGroup(Ability1);
		Intelligence2.setToggleGroup(Ability2);
		Intelligence3.setToggleGroup(Ability3);
		Intelligence4.setToggleGroup(Ability4);
		Intelligence5.setToggleGroup(Ability5);
		Intelligence6.setToggleGroup(Ability6);
		Wisdom1.setToggleGroup(Ability1);
		Wisdom2.setToggleGroup(Ability2);
		Wisdom3.setToggleGroup(Ability3);
		Wisdom4.setToggleGroup(Ability4);
		Wisdom5.setToggleGroup(Ability5);
		Wisdom6.setToggleGroup(Ability6);
		Charisma1.setToggleGroup(Ability1);
		Charisma2.setToggleGroup(Ability2);
		Charisma3.setToggleGroup(Ability3);
		Charisma4.setToggleGroup(Ability4);
		Charisma5.setToggleGroup(Ability5);
		Charisma6.setToggleGroup(Ability6);
		HillDwarf.setToggleGroup(race);
		MountainDwarf.setToggleGroup(race);
		HighElf.setToggleGroup(race);
		WoodElf.setToggleGroup(race);
		DarkElf.setToggleGroup(race);
		LightfootHalfling.setToggleGroup(race);
		StoutHalfling.setToggleGroup(race);
		ForestGnome.setToggleGroup(race);
		RockGnome.setToggleGroup(race);
		DeepGnome.setToggleGroup(race);
		Human.setToggleGroup(race);
		Dragonborn.setToggleGroup(race);
		HalfElf.setToggleGroup(race);
		HalfOrc.setToggleGroup(race);
		Tiefling.setToggleGroup(race);
		Aarakocra.setToggleGroup(race);
		Goliath.setToggleGroup(race);
		EarthGenasi.setToggleGroup(race);
		WaterGenasi.setToggleGroup(race);
		AirGenasi.setToggleGroup(race);
		FireGenasi.setToggleGroup(race);
		races.add(new Aarakocra());
		races.add(new AirGenasi());
		races.add(new DarkElf());
		races.add(new DeepGnome());
		races.add(new Dragonborn());
		races.add(new EarthGenasi());
		races.add(new FireGenasi());
		races.add(new ForestGnome());
		races.add(new Goliath());
		races.add(new HalfElf());
		races.add(new HalfOrc());
		races.add(new HighElf());
		races.add(new HillDwarf());
		races.add(new Human());
		races.add(new LightfootHalfling());
		races.add(new MountainDwarf());
		races.add(new RockGnome());
		races.add(new StoutHalfling());
		races.add(new Tiefling());
		races.add(new WaterGenasi());
		races.add(new WoodElf());
		Barbarian.setToggleGroup(Class);
		Bard.setToggleGroup(Class);
		Cleric.setToggleGroup(Class);
		Druid.setToggleGroup(Class);
		Fighter.setToggleGroup(Class);
		Monk.setToggleGroup(Class);
		Paladin.setToggleGroup(Class);
		Ranger.setToggleGroup(Class);
		Rogue.setToggleGroup(Class);
		Sorcerer.setToggleGroup(Class);
		Warlock.setToggleGroup(Class);
		Wizard.setToggleGroup(Class);
		classes.add(new Barbarian());
		classes.add(new Bard());
		classes.add(new Cleric());
		classes.add(new Druid());
		classes.add(new Fighter());
		classes.add(new Monk());
		classes.add(new Paladin());
		classes.add(new Ranger());
		classes.add(new Rogue());
		classes.add(new Sorcerer());
		classes.add(new Warlock());
		classes.add(new Wizard());
		multiClass.setDisable(true);
		Acolyte.setToggleGroup(background);
		Charlatan.setToggleGroup(background);
		Criminal.setToggleGroup(background);
		Entertainer.setToggleGroup(background);
		FolkHero.setToggleGroup(background);
		GuildArtisan.setToggleGroup(background);
		Hermit.setToggleGroup(background);
		Noble.setToggleGroup(background);
		Outlander.setToggleGroup(background);
		Sage.setToggleGroup(background);
		Sailor.setToggleGroup(background);
		Soldier.setToggleGroup(background);
		Urchin.setToggleGroup(background);
		bg.add(new Acolyte());
		bg.add(new Charlatan());
		bg.add(new Criminal());
		bg.add(new Entertainer());
		bg.add(new FolkHero());
		bg.add(new GuildArtisan());
		bg.add(new Hermit());
		bg.add(new Noble());
		bg.add(new Outlander());
		bg.add(new Sage());
		bg.add(new Sailor());
		bg.add(new Soldier());
		bg.add(new Urchin());

//		view.setPrefSize(equipmentPane.getPrefWidth(), equipmentPane.getPrefHeight());
//		equipmentPane.getChildren().add(view);
//
//		Collections.sort(sourceItems);
//		view.getSourceItems().addAll(sourceItems);
	}

	private ArrayList<String> getSourceItems() {
		ArrayList<String> ob = new ArrayList<>();
		// String info = "";
		String line = "";
		try {
			FileReader fr = new FileReader("Equipment.txt");
			BufferedReader br = new BufferedReader(fr);
			while ((line = br.readLine()) != null) {
				String[] temp = line.split(":");
				ob.add(temp[0]);
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ob;
	}

	private HashMap<String, Integer> getItems() {
		HashMap<String, Integer> hm = new HashMap<>();
		String line = "";
		try {
			FileReader fr = new FileReader("Equipment.txt");
			BufferedReader br = new BufferedReader(fr);
			while ((line = br.readLine()) != null) {
				String[] temp = line.split(":");
				hm.put(temp[0], Integer.parseInt(temp[1].trim()));
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hm;
	}
}
