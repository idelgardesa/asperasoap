package com.avioon;


import events.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class TransferHandler {

    protected String sourceFilename;
    protected String sourcePath;
    protected String destinationFilename;
    protected String destinationPath;
    protected boolean overwrite;
    protected boolean deleteSource;

    private final List _listeners = new ArrayList();
    private boolean abort = false;

    public void doAction() throws IOException {

    }

    public void tearDown() throws IOException {

    }

    public synchronized void addEventListener(TransferListener listener) {
        _listeners.add(listener);
    }

    public synchronized void removeEventListener(TransferListener listener) {
        _listeners.remove(listener);
    }

    protected synchronized void updateStatus(int progress) {
        FsTransferEvent event = new FsTransferEvent(this, progress);
        for (Object _listener : _listeners) {
            ((TransferListener) _listener).onUpdateStatus(event);
        }
    }

    protected synchronized void success(int progress) {
        FsTransferSuccessEvent event = new FsTransferSuccessEvent(this, progress);
        for (Object _listener : _listeners) {
            ((TransferListener) _listener).onSuccess(event);
        }
    }

    protected synchronized void abort(int progress) {
        FsTransferAbortEvent event = new FsTransferAbortEvent(this, progress);
        for (Object _listener : _listeners) {
            ((TransferListener) _listener).onAbort(event);
        }
    }

    protected synchronized void executionResult(String result) {
        FsExecutionResultEvent event = new FsExecutionResultEvent(this, result);
        for (Object _listener : _listeners) {
            ((TransferListener) _listener).onExecutionResult(event);
        }
    }

    protected synchronized void info(String messageFormat, Object... messageParameters) {
        String message = String.format(messageFormat, messageParameters);
        FsInfoMessageEvent event = new FsInfoMessageEvent(this, message);
        for (Object _listener : _listeners) {
            ((TransferListener) _listener).onInfoMessage(event);
        }
    }

    protected synchronized void debug(String messageFormat, Object... messageParameters) {
        String message = String.format(messageFormat, messageParameters);
        FsDebugMessageEvent event = new FsDebugMessageEvent(this, message);
        for (Object _listener : _listeners) {
            ((TransferListener) _listener).onDebugMessage(event);
        }
    }

    protected synchronized void warn(String messageFormat, Object... messageParameters) {
        String message = String.format(messageFormat, messageParameters);
        FsWarnMessageEvent event = new FsWarnMessageEvent(this, message);
        for (Object _listener : _listeners) {
            ((TransferListener) _listener).onWarnMessage(event);
        }
    }

    protected synchronized void error(String messageFormat, Object... messageParameters) {
        error(null, messageFormat, messageParameters);
    }

    protected synchronized void error(Throwable cause, String messageFormat, Object... messageParameters) {
        String message = String.format(messageFormat, messageParameters);
        FsErrorMessageEvent event = new FsErrorMessageEvent(this, message);
        event.setCause(cause);
        for (Object _listener : _listeners) {
            ((TransferListener) _listener).onErrorMessage(event);
        }
    }

    public boolean isAbort() {
        return abort;
    }

    public void setAbort(boolean abort) {
        this.abort = abort;
    }

    @Override
    public String toString() {
        return  String.format("sourceFilename='%s' sourcePath='%s' destinationFilename='%s' " +
                "destinationPath='%s' overwrite='%s' deleteSource='%s'",
                sourceFilename, sourcePath, destinationFilename, destinationPath, overwrite, deleteSource);
    }
}
