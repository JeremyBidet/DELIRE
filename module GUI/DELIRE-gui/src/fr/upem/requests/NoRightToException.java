package fr.upem.requests;

public class NoRightToException extends Exception {

    public NoRightToException(){
        super();
    }

    public NoRightToException(String message){
        super(message);
    }

    public NoRightToException(Throwable cause){
        super(cause);
    }

    public NoRightToException(String message, Throwable cause){
        super(message, cause);
    }
}
