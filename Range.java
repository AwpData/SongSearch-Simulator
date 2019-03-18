public class Range {
	private int min;
	private int max;

	public static Range parse(String s) {
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

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}
}
