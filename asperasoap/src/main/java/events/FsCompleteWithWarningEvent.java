package events;

public class FsCompleteWithWarningEvent extends java.util.EventObject {

    private static final long serialVersionUID = 1L;

    private final String message;

    public FsCompleteWithWarningEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
