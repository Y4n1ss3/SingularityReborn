package com.topjohnwu.superuser.internal;

import com.topjohnwu.superuser.Shell;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
class ResultImpl extends Shell.Result {
    static ResultImpl INSTANCE = new ResultImpl();
    static ResultImpl SHELL_ERR = new ResultImpl();
    int code = -1;
    List<String> err;
    List<String> out;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$callback$0(Shell.ResultCallback resultCallback) {
        resultCallback.onResult(this);
    }

    public void callback(Executor executor, final Shell.ResultCallback resultCallback) {
        if (resultCallback != null) {
            if (executor == null) {
                resultCallback.onResult(this);
            } else {
                executor.execute(new Runnable() { // from class: com.topjohnwu.superuser.internal.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ResultImpl.this.lambda$callback$0(resultCallback);
                    }
                });
            }
        }
    }

    @Override // com.topjohnwu.superuser.Shell.Result
    public int getCode() {
        return this.code;
    }

    @Override // com.topjohnwu.superuser.Shell.Result
    public List<String> getErr() {
        List<String> list = this.err;
        return list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // com.topjohnwu.superuser.Shell.Result
    public List<String> getOut() {
        List<String> list = this.out;
        return list == null ? Collections.EMPTY_LIST : list;
    }
}
