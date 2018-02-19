import java.util.Arrays;

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
	    

		@Override
		public char charAt(int index) {
			// TODO Auto-generated method stub
			return value[index];
		}

		@Override
		public CharSequence subSequence(int arg0, int arg1) {
			// TODO Auto-generated method stub
			return null;
		}



}
	
