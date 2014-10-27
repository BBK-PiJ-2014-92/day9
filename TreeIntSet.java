public class TreeIntSet implements IntSet {
	private int value;
	private TreeIntSet left;
	private TreeIntSet right;

	public TreeIntSet(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}

	public void add(int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
				right = new TreeIntSet(newNumber);
			} else {
				right.add(newNumber);
			}
		} else if (newNumber < this.value) {
			if (left == null) {
				left = new TreeIntSet(newNumber);
			} else {
				left.add(newNumber);
			}
		}
	}

	public boolean contains(int existNumber) {
		if (existNumber == this.value) {
			return true;
		} else if (existNumber > this.value) {
			if (right == null) {
				return false;
			} else {
				return right.contains(existNumber);
			}
		} else {
			if (left == null) {
				return false;
			} else {
				return left.contains(existNumber);
			}
		}
	}

	public boolean containsVerbose(int existNumber) {
		if (existNumber == this.value) {
			System.out.println(this.value);
			return true;
		} else if (existNumber > this.value) {
			if (right == null) {
				System.out.println(this.value);
				return false;
			} else {
				System.out.println(this.value);
				return right.containsVerbose(existNumber);
			}
		} else {
			if (left == null) {
				System.out.println(this.value);
				return false;
			} else {
				System.out.println(this.value);
				return left.containsVerbose(existNumber);
			}
		}
	}

	public String toString() {
		String result = "" + this.value;
		if (left == null && right == null) {
			return result;
		}else if (left == null && right != null) {
			result += ", " + right.toString();
			return result;
		}else if (left != null && right == null) {
			result += ", " + left.toString();
			return result;
		}else {
			result += ", " + left.toString() + ", " + right.toString();
			return result;
		}
	}
}