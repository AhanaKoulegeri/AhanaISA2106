package Program;

public class TeachersRBCA22106 {
	    protected String type;

	    // Constructor
	    public TeachersRBCA22106 (String type) {
	        this.type = type;
	    }

	    // Method to print what the teacher teaches
	    public void teaches() {
	        System.out.println("The teacher is teaching " + type);
	    }
	}

	// Subclass
	class TeacherTeaches extends TeachersRBCA22106 {
	    private String name;

	    // Constructor
	    public TeacherTeaches(String type, String name) {
	        super(type);
	        this.name = name;
	    }

	    // Method to print the subject
	    public void subjects() {
	        System.out.println("The teacher " + name + " is teaching " + type);
	    }
	}

	