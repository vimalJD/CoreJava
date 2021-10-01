package collection.compare;

public class SBComparator implements java.util.Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub

		StringBuffer sb1 = (StringBuffer) o1;
		StringBuffer sb2 = (StringBuffer) o2;

		String s1 = sb1.toString();
		String s2 = sb2.toString();

		return s2.compareTo(s1);
	}

}
