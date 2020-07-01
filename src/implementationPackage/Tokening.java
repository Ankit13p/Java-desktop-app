package implementationPackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import guiPackage.ViewFrame1;

public class Tokening {
	
	JTable table;

	public Tokening(ArrayList<String> dataArraylist) throws FileNotFoundException, IOException
	{
		
		table = ViewFrame1.getTable();
		for(String line: dataArraylist)
		{
				StringTokenizer tokenizer = new StringTokenizer(line, ","); 
				String year = tokenizer.nextToken();
				String birth_death = tokenizer.nextToken();
				String region = tokenizer.nextToken();
				String count = tokenizer.nextToken();
				
				Object[] row = { year, birth_death, region, count};
				
				DefaultTableModel model = (DefaultTableModel) this.table.getModel();
				
				model.addRow(row);
		}
	}
	
}
