package com.map;

import java.util.HashSet;

/**
 * @author hp
 * in custom hashset class we need to implement hashcode and equals method 
 without this we cant achieve hashset functionality it will allow duplicate  it will not through any exception.  this 
 is happen because it wil call object class equals method that is ment of ref comparison not for content
 * after implementing hashcode and equals method it will not alow duplicates
 * in hashset duplicate elements are allowed
 * not maintain any order
 * 
 * 
 *
 */
class rat{
	private int no;
	private String color;
	public rat(int no, String color) {
		super();
		this.no = no;
		this.color = color;
	}
	@Override
	public String toString() {
		return "rat [no=" + no + ", color=" + color + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + no;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		rat other = (rat) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (no != other.no)
			return false;
		return true;
	}
	
	
}
public class CustomHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	HashSet<rat> hs = new HashSet<>();
	hs.add(new rat(12, "White"));
	hs.add(new rat(12, "White"));
	hs.add(new rat(13, "Black"));
	hs.add(new rat(14, "White"));
	hs.add(null);
System.out.print(hs);
	}

}
