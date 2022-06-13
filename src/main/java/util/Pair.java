package util;

public class Pair<F, S> {

	F first;
	S second;

	public Pair(final F first, final S second) {
		this.first = first;
		this.second = second;
	}

	public F getFirst() {
		return first;
	}

	public S getSecond() {
		return second;
	}
}
