import java.util.ArrayList;
import java.util.Collections;

public class WaveArray {
	public ArrayList<Integer> wave(ArrayList<Integer> a) {
	    int n = a.size();
	    Collections.sort(a);
	    for (int i=0; i<n-1; i += 2)
            swap(a, i, i+1);
            
            return a;
	}
	
	// A utility method to swap two numbers.
    void swap(ArrayList<Integer> arr, int a, int b)
    {
        int temp = arr.get(a);
        arr.set(a,arr.get(b));
        arr.set(b,temp);
    }
 
}

