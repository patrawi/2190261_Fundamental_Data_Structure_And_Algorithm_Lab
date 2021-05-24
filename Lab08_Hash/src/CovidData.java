import java.io.File;
import java.io.FileNotFoundException;
import java.util.Hashtable;
import java.util.Scanner;

public class CovidData {
	Hashtable<String,Integer> data;
	public CovidData(String filename) {
		data = new Hashtable<String,Integer>();
		try {
			Scanner in = new Scanner(new File(filename));
			// Add your code here 
			while(in.hasNext()) {
				String[] arr = in.nextLine().split(",");
				String date = arr[0];
				int cases = Integer.parseInt(arr[1]);
				
				this.data.put(date, cases);
			}
		
			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public int find(String d) {
		// Add your code here 
		
		if(this.data.get(d) != null) {
			return (int) this.data.get(d);
		}
		
		
		return -1;
	}
}
