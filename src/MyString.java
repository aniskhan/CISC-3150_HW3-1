import java.io.ObjectStreamField;

public final class MyString
	implements java.io.Serializable, Comparable<String>, CharSequence {
	    /** The value is used for character storage. */
	    private final char value[];

	    /** Cache the hash code for the string */
	    private int hash; // Default to 0

	    /** use serialVersionUID from JDK 1.0.2 for interoperability */
	    private static final long serialVersionUID = -6849794470754667710L;

	    /**
	     * Class String is special cased within the Serialization Stream Protocol.
	     *
	     * A String instance is written into an ObjectOutputStream according to
	     * <a href="{@docRoot}/../platform/serialization/spec/output.html">
	     * Object Serialization Specification, Section 6.2, "Stream Elements"</a>
	     */
	    private static final ObjectStreamField[] serialPersistentFields =
	        new ObjectStreamField[0];

	    /**
	     * Initializes a newly created {@code String} object so that it represents
	     * an empty character sequence.  Note that use of this constructor is
	     * unnecessary since Strings are immutable.
	     */
	    public MyString() {
	        this.value = "".value;
	    }

	    /**
	     * Initializes a newly created {@code String} object so that it represents
	     * the same sequence of characters as the argument; in other words, the
	     * newly created string is a copy of the argument string. Unless an
	     * explicit copy of {@code original} is needed, use of this constructor is
	     * unnecessary since Strings are immutable.
	     *
	     * @param  original
	     *         A {@code String}
	     * @return 
	     */
	    public void myString(MyString original) {
	        this.value = original.value;
	        this.hash = original.hash;
	    }

		@Override
		public char charAt(int arg0) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int length() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public CharSequence subSequence(int arg0, int arg1) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int compareTo(String arg0) {
			// TODO Auto-generated method stub
			return 0;
		}

}
	
