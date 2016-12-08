package events;

public class FsExecutionResultEvent extends java.util.EventObject {
    private static final long serialVersionUID = 1L;

    private final String result;

    public FsExecutionResultEvent(Object source, String result) {
        super(source);
        this.result = result;
    }

    public String getResult() {
        return result;
    }
}
