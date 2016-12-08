package events;

public class FsTransferAbortEvent extends java.util.EventObject {
    private static final long serialVersionUID = 1L;

    private final int progress;

    public FsTransferAbortEvent(Object source, int progress) {
        super(source);
        this.progress = progress;
    }

    public int getProgress() {
        return progress;
    }
}
