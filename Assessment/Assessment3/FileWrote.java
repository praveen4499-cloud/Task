package com.vasypro.ThirdExercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrote {
	public static void main(String[] args) {
		try {

			File fold = new File("Demo11");
			if (!fold.exists())
				fold.mkdir();
			FileWriter fw = new FileWriter("Demo11/sam1child.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("fatel\n");
			bw.write("warm\n");
			bw.write("error");
			bw.close();
			FileReader fr = new FileReader("Demo11/sam1child.txt");
			BufferedReader br = new BufferedReader(fr);
			String s = null;
			while ((s = br.readLine()) != null) {

				System.out.println(s);
			}

		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}