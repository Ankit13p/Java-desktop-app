package codePackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Read {
	public ArrayList<String> sdata;
	public static void main(String[] args) throws IOException, FileNotFoundException {
		Read rd = new Read();
		rd.readData();
		rd.getSdata();
	}

	public ArrayList<String> getSdata() {
		return sdata;
	}

	public void setSdata(ArrayList<String> sdata) {
		this.sdata = sdata;
	}

	public static void displayArraylist(Read rd) {
		for(int i=0;i<rd.getSdata().size();i++)
		System.out.println(rd.getSdata().get(i));
	}

	public void readData() throws FileNotFoundException, IOException {
		File file= new File("data//record.csv");
		sdata = new ArrayList<String>();
		FileReader fr = new FileReader(file);
		BufferedReader br =  new BufferedReader(fr);
		String line;
		while ((line = br.readLine()) != null) {
		    sdata.add(line);
		   line.split(",");
		}
		br.close();
		fr.close();
		
	}
}


