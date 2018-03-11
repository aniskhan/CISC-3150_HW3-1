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
		char data[] = {'a', 'b', 'c', 'd', '1'};
		char data2[] = {'a', 'b', 'c', 'd', '1'};
		MyString someStr = new MyString(data);
		MyString someStr2 = new MyString(data2);
		System.out.println(someStr.length());
		System.out.println(someStr.charAt(2));
		System.out.println(someStr.toString());
		System.out.println(someStr.substring(2, 4));
		System.out.println(someStr.substring(1, 3).toUpperCase());
		System.out.println(someStr.toUpperCase());
		System.out.println(someStr.toLowerCase());
		System.out.println(someStr.compareTo(someStr2));
		System.out.println(someStr.getMyString());
	}

}
