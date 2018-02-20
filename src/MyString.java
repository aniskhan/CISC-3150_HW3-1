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
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public CharSequence subSequence(int arg0, int arg1) {
			// TODO Auto-generated method stub
			return null;
		}



}
	
