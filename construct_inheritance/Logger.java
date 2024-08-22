package construct_inheritance;


	public class Logger {
	    // Private static instance variable
	    private static Logger instance;
	    
	    // Private constructor to prevent instantiation from outside
	    private Logger() {
	        // Exists only to prevent instantiation.
	    }
	    
	    // Static method to get the instance of Logger
	    public static Logger getInstance() {
	        // Lazy initialization: create the instance only when it's needed for the first time
	        if(instance == null) {
	            instance = new Logger();
	        }
	        return instance;
	    }
	    
	    // Method to display a message
	    public void log(String message)
	    {
	        System.out.println(message);
	    }
	}


