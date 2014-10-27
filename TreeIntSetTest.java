public class TreeIntSetTest {
	public static void main(String[] args) {
		TreeIntSet ts = new TreeIntSet(5);
		ts.add(3);
		ts.add(6);
		ts.add(9);
		ts.add(5);
		ts.add(1);
		ts.add(2);
		System.out.println(ts.contains(3));
		System.out.println(ts.contains(6));
		System.out.println(ts.contains(9));
		System.out.println(ts.contains(5));
		System.out.println(ts.contains(1));
		System.out.println(ts.contains(2));
		System.out.println(ts.contains(10));

		System.out.println(ts.containsVerbose(3));
		System.out.println(ts.containsVerbose(6));
		System.out.println(ts.containsVerbose(9));
		System.out.println(ts.containsVerbose(5));
		System.out.println(ts.containsVerbose(1));
		System.out.println(ts.containsVerbose(2));
		System.out.println(ts.containsVerbose(10));

		System.out.println(ts.toString());
	}
}