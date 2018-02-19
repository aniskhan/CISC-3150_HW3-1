/*Create your own version of the String class. Call it MyString. This class 
should be immutable. Make sure to encapsulate your data properly. Write your
own code. Don't turn this into a wrapper class for the String class.
Provide an implementation for the following methods:

public MyString(char[] chars);
public char charAt(int index);
public int length();
public MyString substring(int begin, int end);
public MyString toLowerCase();
public MyString toUpperCase();
public int compareTo(MyString s);
public MyString getMyString();
public String toString();	
public static MyString valueOf(int i);


Do not use any function from the String class. The only time you're 
allowed to use the String class is in the toString() method. Even then, 
you may only use the String's constructor, but not the methods.

Make sure to provide a driver class, too, and show the output.
*/


public class Main {

	public static void main(String[] args) {
		char data[] = {'a', 'b', 'c', 'd','e'};
		MyString someStr = new MyString(data);
		System.out.println(someStr.length());
		System.out.println(someStr.charAt(2));
	}

}
