import java.util.Random;
public class minHeapTest {
	
	public static void main(String[] args) throws Exception {
		int repeat = 2;
		System.out.printf("size \t time(ns) \n");
		
		for (int n = 100; n <= 1000000; n *= 100) {      // shell, heap, merge, quick sort
			int[] d = new int[n];
            for (int i = 0; i < n; i++) d[i] = i;
    	    Random rnd = new Random(1234567);
       	    for (int i = d.length - 1; i > 0; i--) swap(d, i, rnd.nextInt(i));
       	    long sum = 0;
	        long min = 0;
	        long time = 0;
	        for (int k = 0; k < repeat; k++) {
	            int[] t = (int[])d.clone();
	            Heap x = new Heap();
	            long start = System.nanoTime();
	            
	            testAdd(t, x);
	            testPop(t, x);
	            
	            time = System.nanoTime()- start;
	            sum += time;
	            if (min == 0 || time < min) min = time;
	
	        }
	        System.out.printf("%d \t %d \n", n, min);
		}
		System.out.println("Finished");
	}
	public static void testAdd(int[] t, Heap x) {
		for (int i=0;i < t.length;i++) {
        	x.add(t[i]);
        }
	}
	
	public static void testPop(int[] t, Heap x) throws Exception {
		for (int i=0;i < t.length;i++) {
        	x.pop();
        }
	}
	
	private static void swap(int[] d, int i, int j) {
	    int t = d[i]; d[i] = d[j]; d[j] = t;
	}
}


