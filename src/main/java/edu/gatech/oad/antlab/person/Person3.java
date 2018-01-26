package edu.gatech.oad.antlab.person;
/**
 *  A simple class for person 3
 *  returns their name and a
 *  nickname
 *
 *  @author  Jackson Cook
 *  @version 1.1
 */
public class Person3 {
   /** Holds the persons real name */
	private String name;

	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	public Person3(String pname){
	  name = pname;
	}

	/**
	 * Return a string rep of this object
	 * with a nickname
	 *
	 * @return the string representing the
	 *         object
	 */
	public String toString(String input) {
	  return name + ": The Bird Man";
	}
}
