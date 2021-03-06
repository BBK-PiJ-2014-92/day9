public class IntegerTreeNode {
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;

	public IntegerTreeNode(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}

	public void add(int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
				right = new IntegerTreeNode(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} else {
				left.add(newNumber);
			}
		}
	}

	public boolean contains(int n) {
		if (n == this.value) {
			return true;
		} else if (n > this.value) {
			if (right == null) {
				return false;
			} else {
				return right.contains(n);
			}
		} else {
			if (left == null) {
				return false;
			} else {
				return left.contains(n);
			}
		}
	}

	public int getMax() {
		int max = this.value;
		if (right == null) {
			return max;
		}else {
			max = right.getMax();
			return max;
		}
	}

	public int getMin() {
		int min = this.value;
		if (left == null) {
			return min;
		} else {
			min = left.getMin();
			return min;
		}
	}

	public String toString() {
		String result = "[" + this.value;
		if (left == null && right == null) {
			result += " L[] R[]]";
			return result;
		}else if (left == null && right != null) {
			result += " L[] R" + right.toString() + "]";
			return result;
		}else if (left != null && right == null) {
			result += " L" + left.toString() + "]" + " R[]]";
			return result;
		}else {
			result += " L" + left.toString() + "]" + " R" + right.toString() + "]";
			return result;
		}
	}

	public String simpletoString() {
		String result = "[" + this.value;
		if (left == null && right == null) {
			return result;
		}else if (left == null && right != null) {
			result += " " + right.simpletoString() + "]";
			return result;
		}else if (left != null && right == null) {
			result += " " + left.simpletoString() + "]";
			return result;
		}else {
			result += " " + left.simpletoString() + "]" + " " + right.simpletoString() + "]";
			return result;
		}
	}

	public int depth() {
		int leftDepth = 0;
		int rightDepth = 0;
		if (left == null && right == null) {
			return 0;
		}else if (left != null && right == null) {
			return leftDepth += 1 + left.depth();
		}else if (left == null && right != null) {
			return rightDepth += 1 + right.depth();
		}else {
			leftDepth += 1 + left.depth();
			rightDepth += 1 + right.depth();
			return max(leftDepth, rightDepth);
		}
	}

	public int max(int one, int two) {
		if (one > two) {
			return one;
		}else {
			return two;
		}
	}
}