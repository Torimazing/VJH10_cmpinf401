
public class Counters {
	private int count;
	public void addCount() {
		count = count++;
	}
	public void reset() {
		count = 0;
	}
	public int getCount() {
		return count;
	}
}
