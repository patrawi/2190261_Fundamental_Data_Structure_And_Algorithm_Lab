import java.io.IOException;

public class TestSpeed {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataManager dm = new DataManager("../Last_Labm1/covid19.csv"); // Load everything from the file. 
		// All data should be ready at this point.

		long startTime = System.nanoTime();
		for(int i=0;i<100;i++) { // i will be changed to 100000 later.
			//dm.getData("","Algeria","3/21/20");
			//System.out.println(dm.getData("","Algeria","3/21/20"));
			//;
			//System.out.println(dm.getData("","China","3/20/20"));
			System.out.println(dm.getData("","Algeria","3/21/20"));
			 // Countries and States are just an example.
			       // They will be randomly choose while the program is being evaluated.
			//dm.getData("New South Wales", "Australia", "1/26/20");
			
		}
		System.out.println((System.nanoTime()-startTime)/(1));
	}

}
