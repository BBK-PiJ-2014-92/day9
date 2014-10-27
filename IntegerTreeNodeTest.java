public class IntegerTreeNodeTest {

	public static void main (String[] args) {
		IntegerTreeNode tn = new IntegerTreeNode(6);
		tn.add(5);
		tn.add(9);
		tn.add(3);
		tn.add(8);
		tn.add(11);
		tn.add(12);
		System.out.println(tn.toString());
		System.out.println(tn.simpletoString());
	}
}