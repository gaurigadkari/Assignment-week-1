import java.util.ArrayList;

public class PascalTriangle {
	public ArrayList<ArrayList<Integer>> generate(int numRows) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (numRows <= 0)
			return result;
	 
		ArrayList<Integer> previous = new ArrayList<Integer>();
		previous.add(1);
		result.add(previous);
	 
		for (int i = 2; i <= numRows; i++) {
			ArrayList<Integer> current = new ArrayList<Integer>();
	 
			current.add(1); 
			for (int j = 0; j < previous.size() - 1; j++) {
				current.add(previous.get(j) + previous.get(j + 1));
			}
			current.add(1);
	 
			result.add(current);
			previous = current;
		}
	 
		return result;
	}
}
