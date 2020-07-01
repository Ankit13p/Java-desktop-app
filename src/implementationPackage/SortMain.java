	package implementationPackage;
	
	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
import java.util.ArrayList;
	import java.util.Collections;
	
	public class SortMain {
		static ArrayList<NzSocietyData> sdata;
		public static ArrayList<NzSocietyData> getSdata() {
			return sdata;
		}
	
		public static void setSdata(ArrayList<NzSocietyData> sdata) {
			SortMain.sdata = sdata;
		}
	
		//http://www.thejavageek.com/2013/06/17/sorting-user-defined-objects-part-2/
		public static void main(String[] args) throws NumberFormatException, IOException  {
			//BirthDeathData bdd = new BirthDeathData(year, count, birthdeath, region)
			//sdata =birthSort();
				/*for(int i=0;i<sdata.size();i++) {
					System.out.println(sdata.get(i));
				}*/		
	
		}
	
		
	
		
			public static ArrayList<NzSocietyData> birthSort()
					throws FileNotFoundException, IOException, NumberFormatException {
			File file= new File("data//record.csv");
			ArrayList<NzSocietyData>sdata = new ArrayList<NzSocietyData>();
			FileReader fr = new FileReader(file);
			BufferedReader br =  new BufferedReader(fr);
			String line;
			
			 while ((line = br.readLine()) != null) {
		           String[] row = line.split(",");
		         
				 NzSocietyData nzd = new NzSocietyData(Integer.parseInt(row[0]), row[1], row[2], Integer.parseInt(row[3]));
				 sdata.add(nzd);
			    }
			 	br.close();
				fr.close();
				Collections.sort(sdata, new SortByBirthDeath());
			return sdata;
			}
			
			public static ArrayList<NzSocietyData> regionSort()
					throws FileNotFoundException, IOException, NumberFormatException {
				File file= new File("data//record.csv");
				ArrayList<NzSocietyData>sdata = new ArrayList<NzSocietyData>();
				FileReader fr = new FileReader(file);
				BufferedReader br =  new BufferedReader(fr);
				String line;
				
				 while ((line = br.readLine()) != null) {
			           String[] row = line.split(",");
			         
					 NzSocietyData nzd = new NzSocietyData(Integer.parseInt(row[0]), row[1], row[2], Integer.parseInt(row[3]));
					 sdata.add(nzd);
				    }
				 	br.close();
					fr.close();
					Collections.sort(sdata, new SortByRegion());
				return sdata;
			}
			
			
			public static ArrayList<NzSocietyData> yearSort()
						throws FileNotFoundException, IOException, NumberFormatException {
				File file= new File("data//record.csv");
				ArrayList<NzSocietyData>sdata = new ArrayList<NzSocietyData>();
				FileReader fr = new FileReader(file);
				BufferedReader br =  new BufferedReader(fr);
				String line;
				
				 while ((line = br.readLine()) != null) {
			           String[] row = line.split(",");
			          
					 NzSocietyData nzd = new NzSocietyData(Integer.parseInt(row[0]), row[1], row[2], Integer.parseInt(row[3]));
					 sdata.add(nzd);
				    }
				 	br.close();
					fr.close();
					Collections.sort(sdata, new SortByYear());
				return sdata;
				}
	
		}
		
	
