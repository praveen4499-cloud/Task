package com.vasypro.ThirdExercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("/home/vastpro/model/Demomodel/Demo11/sam1child.txt");
			BufferedReader br = new BufferedReader(fr);

			try (FileWriter fw = new FileWriter("/home/vastpro/model/Demomodel/Demo11/sam2child.txt")) {
				String s = null;
				while ((s = br.readLine()) != null) {
					if (s.contains("warm") || s.contains("error") || s.contains("fatel")) {
						fw.write(s);
						System.out.println("done");
					} else {
						System.out.println("not done");
					}
				}

			}
		} catch (FileNotFoundException f) {
			f.printStackTrace();
		} catch (IOException a) {
			a.printStackTrace();

		}

	}

}
