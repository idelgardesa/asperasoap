package events;

public class FsTransferSuccessEvent extends java.util.EventObject {
    private static final long serialVersionUID = 1L;

    private final int progress;

    public FsTransferSuccessEvent(Object source, int progress) {
        super(source);
        this.progress = progress;
    }

    public int getProgress() {
        return progress;
    }
}
