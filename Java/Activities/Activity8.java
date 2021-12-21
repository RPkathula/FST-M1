package activities;

class CustomException extends Exception {
    private String message = null;

    public CustomException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

public class Activity8 {
    public static void main(String[] a){
        try {
            Activity8.exceptionTest("Will print to console");
            Activity8.exceptionTest(null); 
        } catch(CustomException mae) {
            System.out.println("Message in Inside catch block is  " + mae.getMessage());
        }
    }

    static void exceptionTest(String str) throws CustomException {
        if(str == null) {
            throw new CustomException("\"Custom Exception message\"");
        } else {
            System.out.println(str);
        }
    }
}	