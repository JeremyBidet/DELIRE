package fr.upem.requests;

public class NoRightTo extends Exception {

    public NoRightTo(){
        super();
    }

    public NoRightTo(String message){
        super(message);
    }

    public NoRightTo(Throwable cause){
        super(cause);
    }

    public NoRightTo(String message, Throwable cause){
        super(message, cause);
    }
}
