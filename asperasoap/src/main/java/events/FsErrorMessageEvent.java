package events;

public class FsErrorMessageEvent extends java.util.EventObject {

    private static final long serialVersionUID = 1L;

    private final String message;

    private Throwable cause;

    public FsErrorMessageEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public Throwable getCause() {
        return cause;
    }

    public void setCause(Throwable cause) {
        this.cause = cause;
    }
}
