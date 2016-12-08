package com.avioon;

import events.*;

public interface TransferListener {

    void onUpdateStatus(FsTransferEvent e);

    void onSuccess(FsTransferSuccessEvent e);

    void onAbort(FsTransferAbortEvent e);

    void onInfoMessage(FsInfoMessageEvent e);

    void onDebugMessage(FsDebugMessageEvent e);

    void onWarnMessage(FsWarnMessageEvent e);

    void onErrorMessage(FsErrorMessageEvent e);

    void onExecutionResult(FsExecutionResultEvent e);
}
