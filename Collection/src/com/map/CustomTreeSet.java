package com.map;

import java.util.TreeSet;

class car implements Comparable<car> {
	private int id;
	private String name;

	public car(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(car o) {
		if(id>o.id) {
			return 1;
		}else if (id<o.id) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "car [id=" + id + ", name=" + name + "]";
	}

}

/**
 * @author hp
 *
 *in order to use custom tree set we need to implement either comapareble or compatator. if we dont implement  at run time it will give cast  exception 
 * because elements are inserted according to some sorting order to comapre element we need comapareble or compatator
 * Null insertion is not posible.
 * Contain uniuqe element.
 * maintain acending order.
 * 

 */
public class CustomTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<car> ts = new TreeSet<>();

		ts.add(new car(12, "RED"));
		ts.add(new car(12, "RED"));
		//	ts.add(null);
		ts.add(new car(13, "RED"));
		ts.add(new car(14, "Balck"));
		System.out.println(ts);
	}

}
