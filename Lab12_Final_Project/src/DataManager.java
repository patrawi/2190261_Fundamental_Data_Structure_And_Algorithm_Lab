import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
public class DataManager {
	private String fileLocal = "";
	Hashtable<String, Hashtable<String,Integer>> StateData = new Hashtable<String, Hashtable<String, Integer>>();
	Hashtable<String,Hashtable<String,Integer>> CountryData = new Hashtable<String, Hashtable<String, Integer>>();
	String[] states;
	String[] dates; 
	ArrayList<String> countries = new ArrayList<String>();
	
	public DataManager(String fileLocation) throws IOException {
		this.setFileLocation(fileLocation);
		try {
			BufferedReader bfReader = new BufferedReader(new FileReader(fileLocation));
			dates = bfReader.readLine().strip().substring(39).split(",");
			String line;

			while(( line = bfReader.readLine()) != null) {
				String[] tokens = line.strip().split(",");
				String country = tokens[1];
				String state = tokens[0];
				
				this.StateData.put(state, new Hashtable<String, Integer>());
				for(int i = 4; i < tokens.length; i++) {
					this.StateData.get(state).put(dates[i-4], Integer.parseInt(tokens[i]));
					
					
				}
				
				if(countries.contains(country) == false) {
					countries.add(country);
					this.CountryData.put(country, new Hashtable<String, Integer>());
					for(int i = 4; i < tokens.length; i++) {
						
						this.CountryData.get(country).put(dates[i-4], Integer.parseInt(tokens[i]));
						
					}
				} else {
						for(int i = 4; i < tokens.length; i++) {
							int temp = this.CountryData.get(country).get(dates[i-4]);
							this.CountryData.get(country).put(dates[i-4], (temp + Integer.parseInt(tokens[i])));
						}
					}
					
				}
					
				
			
			bfReader.close();
			System.out.println(StateData);
			System.out.println(CountryData);
		} catch (FileNotFoundException ex) {
			System.out.println("File Not Found");
			fileLocation = "";
		}
		
	}
	public int getData(String state,String country, String date) {
		if(state == "") {

			return (int) this.CountryData.get(country).get(date);
		}
		System.out.println(this.StateData.get(state).get(date));
		return (int) this.StateData.get(state).get(date);
	}
	
	
	public String getFileLocation() {
		return fileLocal;
	}
	public void setFileLocation(String fileLocation) {
		this.fileLocal = fileLocation;
	}
}
