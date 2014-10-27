public class IntegerTreeNodeTest {

	public static void main (String[] args) {
		IntegerTreeNode tn = new IntegerTreeNode(5);
		tn.add(6);
		tn.add(9);
		tn.add(4);
		tn.add(1);
		tn.add(3);
		tn.add(10);
		tn.add(2);
		System.out.println(tn.contains(2));
		System.out.println(tn.contains(6));
		System.out.println(tn.contains(4));
		System.out.println(tn.contains(5));
		System.out.println(tn.contains(0));
		System.out.println(tn.contains(10));
		System.out.println(tn.getMax());
		System.out.println(tn.getMin());
	}
}