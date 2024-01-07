package messages;

public class AlreadyRegisteredUserException extends Exception{
    public AlreadyRegisteredUserException(String user ){
        super("user already exists "+user);
    }
}
