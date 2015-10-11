package com.eight.copy;

public class Pair {
private  String from,to;

public Pair(String from, String to) {
	super();
	this.from = from;
	this.to = to;
}

@Override
	public boolean equals(Object obj) {
		Pair pair = (Pair)obj;
		
		return from.equals(pair.from) &&to.equals(pair.to);
	}
@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}
}
