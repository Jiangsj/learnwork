package com.seven;

public class Pair {
	private String from,to;

	public Pair(String from, String to) {
		super();
		this.from = from;
		this.to = to;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Pair pair=(Pair)obj;
		return from.equals(pair.from)&&to.equals(pair.to);
	}
}
