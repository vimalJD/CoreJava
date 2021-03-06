package collection.compare;

import java.util.Comparator;

public class StringComparator implements Comparator {

	@Override
	public int compare(Object a, Object b) {

		String aStr, bStr;

		aStr = (String) a;
		bStr = (String) b;

		// Reverse the comparison
		return bStr.compareTo(aStr);
	}

}
