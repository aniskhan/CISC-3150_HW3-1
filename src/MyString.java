import java.util.Arrays;
import java.lang.IndexOutOfBoundsException;

public final class MyString
	implements java.io.Serializable, CharSequence {

	private static final long serialVersionUID = 1L;
		/** The value is used for character storage. */
	    private char value[];

	    public MyString(char value[]) {
	        this.value = Arrays.copyOf(value, value.length);
	    }
	    
	    public int length() {
	        return value.length;
	    }
	    
		public char charAt(int index) {
			if (index <0 || index > value.length) {
				throw new IndexOutOfBoundsException();
			}
			return value[index];
		}
		
		public MyString substring(int begin, int end) {
			if (begin < 0 || end > value.length || end < begin) {
				throw new IndexOutOfBoundsException();
			}
			char[] subMyString = new char [end-begin];
			int n = 0; // new array has zero index!
			for (int i = begin; i < end; i++) {
		        subMyString[n] = value[i];
		        n++;
			}
			return new MyString(subMyString);
		}
		
	    public String toString() {
	    	//modified from http://javadevnotes.com/java-array-to-string
	    	StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < value.length; i++) {
	           char item = value[i];
	           sb.append(item);
	        }
	        return sb.toString();	
	    }
	    
	    public MyString toUpperCase() {
	    	char[] upperMyString = new char [value.length];
	    	this.value = Arrays.copyOf(value, value.length);
	    	for (int i = 0; i < value.length; i++) {
	    		upperMyString[i] = Character.toUpperCase(value[i]);
	    	}
	    	return new MyString(upperMyString);
	    }
	    public MyString toLowerCase() {
	    	char[] lowerMyString = new char [value.length];
	    	this.value = Arrays.copyOf(value, value.length);
	    	for (int i = 0; i < value.length; i++) {
	    		lowerMyString[i] = Character.toLowerCase(value[i]);
	    	}
	    	return new MyString(lowerMyString);
	    }
	    
		@Override
		public CharSequence subSequence(int arg0, int arg1) {
			// TODO Auto-generated method stub
			return null;
		}



}
	
