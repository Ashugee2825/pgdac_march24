

package exceptionhandling;

class MarksException extends Exception {
    public MarksException(String message) {
        super(message);
    }
}

public class MarksCheck {
    public static void main(String[] args) {
        int internalMarks = 45;
        int externalMarks = 70;
        
        try {
            checkMarks(internalMarks, externalMarks);
        } catch (MarksException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
    
    public static void checkMarks(int internalMarks, int externalMarks) throws MarksException {
        if (internalMarks > 40) {
            throw new MarksException("Internal marks exceed");
        }
        if (externalMarks > 60) {
            throw new MarksException("External marks exceed");
        }
    }
}
