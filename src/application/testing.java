package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class testing {
	public static void main(String[] args) {
		String line = "";
		HashMap<String, Integer> temp = new HashMap<>();
		try {
			FileReader fr = new FileReader("equipmentTest.txt");
			BufferedReader br = new BufferedReader(fr);
			while ((line = br.readLine()) != null) {
				String[] t = line.split(":");
				temp.put(t[0], Integer.parseInt(t[1]));
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (String name : temp.keySet()) {

			String key = name.toString();
			String value = temp.get(name).toString();
			System.out.println(key + " " + value);

		}
	}
}
