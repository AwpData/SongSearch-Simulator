public class Range {
	private int min;
	private int max;

	public static Range parse(String s) { // Parse a string of the form "<min>/<max>" or "<value>" and create a Range representing those values
		Range range = new Range();
		if (!s.contains("/")) {
			range.min = Integer.valueOf(s);
			range.max = range.min;
		} else {
			range.min = Integer.valueOf(s.substring(0, s.indexOf("/")));
			range.max = Integer.valueOf(s.substring((s.indexOf("/") + 1), s.length()));
		}
		if (range.min > range.max) {
			int temp = range.max;
			range.max = range.min;
			range.min = temp;
		}
		return range;
	}

	public boolean contains(int n) { // Returns true if the given value is in this range, and false otherwise.
		if (n >= this.getMin() && n <= this.getMax()) {
			if (n == this.getMin()) {
				System.out.println(n + " is equal to " + this.getMin());
				return true;
			}
			if (n == this.getMax()) {
				System.out.println(n + " is equal to " + this.getMax());
				return true;
			} else {
				System.out.println(n + " is between " + this.getMin() + " and " + this.getMax());
				return true;
			}
		} else {
			System.out.println(n + " is not between " + this.getMin() + " and " + this.getMax());
			return false;
		}
	}

	public int getMin() { // Return the minimum value in this range.
		return min;
	}

	public int getMax() { // Return the maximum value in this range.
		return max;
	}
}
